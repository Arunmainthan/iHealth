<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html dir="ltr" lang="en-US"><head><!-- Created by Artisteer v4.0.0.58475 -->
        <meta charset="utf-8">
        <title>News</title>
        <meta name="viewport" content="initial-scale = 1.0, maximum-scale = 1.0, user-scalable = no, width = device-width">

        <!--[if lt IE 9]><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
        <link rel="stylesheet" href="css/style.css" media="screen">
        <link rel="stylesheet" href="css/bootstrap.css" media="screen">
        <link rel="stylesheet" href="css/bootstrap.min.css" media="screen">
        <!--[if lte IE 7]><link rel="stylesheet" href="style.ie7.css" media="screen" /><![endif]-->
        <link rel="stylesheet" href="css/style.responsive.css" media="all">


        <script src="js/jquery.js"></script>
        <script src="js/script.js"></script>
        <script src="js/script.responsive.js"></script>
        <meta name="description" content="Description">
        <meta name="keywords" content="Keywords">


        <style>.art-content .art-postcontent-0 .layout-item-0 { padding-right: 10px;padding-left: 10px;  }
            .ie7 .post .layout-cell {border:none !important; padding:0 !important; }
            .ie6 .post .layout-cell {border:none !important; padding:0 !important; }

        </style>

        <script src="https://www.google.com/jsapi"></script>
        <script type="text/javascript">
      
            // This code generates a "Raw Searcher" to handle search queries. The Raw 
            // Searcher requires you to handle and draw the search results manually.
            google.load('search', '1');

            var newsSearch;
           
            window.fbAsyncInit = function()
            {
                FB.init({
                    appId  : '${initParam.FBID}',
                    status : true, // check login status
                    cookie : true, // enable cookies to allow the server to access the session
                    xfbml  : true , // parse XFBML
                    oauth : true // Enable oauth authentication
                });
                
                FB.Event.subscribe('auth.authResponseChange', function(response) {
                    if (response.status === 'connected') {
                        console.log('Logged in');
                    } else {
                        FB.login();
                    }
                });
                
            };
            function post_on_wall(contents)
            {
                FB.login(function(){
                    FB.api('/me/feed', 'post', {message: contents});
                }, {scope: 'publish_actions'});

            }
            function searchComplete() {
                (function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0];if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src="https://platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);}}(document,"script","twitter-wjs"));
                
                (function(d, s, id) {
                    var js, fjs = d.getElementsByTagName(s)[0];
                    if (d.getElementById(id)) return;
                    js = d.createElement(s); js.id = id;
                    js.src = "//connect.facebook.net/en_US/all.js#xfbml=1";
                    fjs.parentNode.insertBefore(js, fjs);
                }(document, 'script', 'facebook-jssdk'));
                // Check that we got results
                document.getElementById('news_itm').innerHTML = '';
                if (newsSearch.results && newsSearch.results.length > 0) {
                    $.get("count.html", {c:newsSearch.results.length})
                    for (var i = 0; i < newsSearch.results.length; i++) {
                        var news_title = newsSearch.results[i].titleNoFormatting;
                        var news_content = newsSearch.results[i].content;
                        var news_url = newsSearch.results[i].unescapedUrl;
                        var news_publisher = newsSearch.results[i].publisher;
                        var news_pub_date = newsSearch.results[i].publishedDate;
                        
                        var newshot = "'"+news_content+"'";
                        
                        
                        var cont = '<div class="alert alert-dismissable alert-warning" style="background-color: #ebebeb;color:#000;">'
                            +'<h4 style="color: #246994">'+news_title+'</h4> : <small style="color: #0C0E13;">'+news_pub_date+'</small> : Published by '+news_publisher
                            +'<p style="color: #0C0E13;">'+news_content+'</p>'
                            +'<br/><button style="color:#000;" onclick="post_on_wall('+newshot+');">Post on FB</button><br/><a href="https://twitter.com/share?text='+news_content.substring(0, 136)+'...." class="twitter-share-button"  data-via="" data-lang="en">Tweet</a></div>'
                            +'';
                        document.getElementById('news_itm').innerHTML  += cont;
                        $.get("savenews.html", { t:news_title, c:news_content, d:news_pub_date, u:news_url })
                    }
                }
            }

            function onLoad() {
                // Create a News Search instance.
                newsSearch = new google.search.NewsSearch();
  
                // Set searchComplete as the callback function when a search is 
                // complete.  The newsSearch object will have results in it.
                newsSearch.setSearchCompleteCallback(this, searchComplete, null);

                // Specify search quer(ies)
                newsSearch.execute('Health');

                // Include the required Google branding
                google.search.Search.getBranding('branding');
                
            }
            // Set a callback to call your code when the page loads
            
            google.setOnLoadCallback(onLoad);
        </script>
    </head>
    <body>
        <div id="art-main">
            <div class="art-sheet clearfix">
                <header class="art-header clearfix">
                    <%@include file="abstract/header.jsp" %>
                </header>
                <nav class="art-nav clearfix">
                    <jsp:include page="abstract/menu.jsp">
                        <jsp:param name="page" value="news"/>
                    </jsp:include>
                </nav>
                <div class="art-layout-wrapper clearfix">
                    <div class="art-content-layout">
                        <div class="art-content-layout-row">
                            <div class="art-layout-cell art-content clearfix"><article class="art-post art-article">

                                    <div class="art-postcontent art-postcontent-0 clearfix"><div class="art-content-layout">
                                            <div class="art-content-layout-row">
                                                <div class="art-layout-cell layout-item-0" style="width: 100%" >
                                                    <h2 class="art-postheader">News Feeds</h2>
                                                    <div id="news_itm">
                                                    </div>
                                                    <div id="fb-root"></div>
                                                    <script>(function(d, s, id) {
                                                        var js, fjs = d.getElementsByTagName(s)[0];
                                                        if (d.getElementById(id)) return;
                                                        js = d.createElement(s); js.id = id;
                                                        js.src = "//connect.facebook.net/en_US/all.js#xfbml=1";
                                                        fjs.parentNode.insertBefore(js, fjs);
                                                    }(document, 'script', 'facebook-jssdk'));</script>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                </article></div>
                        </div>
                    </div>
                </div>
            </div>
            <footer class="art-footer clearfix">
                <%@include file="abstract/footer.jsp" %>
            </footer>

        </div>


    </body>
</html>