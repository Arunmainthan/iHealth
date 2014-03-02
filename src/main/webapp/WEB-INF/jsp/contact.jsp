<%-- 
    Document   : contact
    Created on : Mar 1, 2014, 4:05:01 PM
    Author     : Gaiyya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html dir="ltr" lang="en-US"><head><!-- Created by Artisteer v4.0.0.58475 -->
        <meta charset="utf-8">
        <title>Contacts</title>
        <meta name="viewport" content="initial-scale = 1.0, maximum-scale = 1.0, user-scalable = no, width = device-width">

        <!--[if lt IE 9]><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
        <link rel="stylesheet" href="css/style.css" media="screen">
        <link rel="stylesheet" href="css/bootstrap.css" media="screen">
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

        </style></head>
    <body>
        <div id="art-main">
            <div class="art-sheet clearfix">
                <header class="art-header clearfix">
                    <%@include file="abstract/header.jsp" %>
                </header>
                <nav class="art-nav clearfix">
                    <jsp:include page="abstract/menu.jsp">
                        <jsp:param name="page" value="contact"/>
                    </jsp:include>
                </nav>
                <div class="art-layout-wrapper clearfix">
                    <div class="art-content-layout">
                        <div class="art-content-layout-row">
                            <div class="art-layout-cell art-content clearfix"><article class="art-post art-article">
                                    <h2 class="art-postheader">Contact Us</h2>

                                    <div class="art-postcontent art-postcontent-0 clearfix"><div class="art-content-layout">
                                            <div class="art-content-layout-row">
                                                <div class="art-layout-cell layout-item-0" style="width: 100%" >
                                                    <p><img width="269" height="269" alt="" src="images/005-2.png" style="float:left;margin-right:10px;" /></p>
                                                    <h2 class="art-postheader">Contact Us</h2>
                                                    <p></p>

                                                    <p></p>

                                                    <p style="font-weight:bold;">Our Address</p>

                                                    <p>586 Main Ave, Building 42<br />
                                                        Main City, Country 12345-6789</p>

                                                    <p>T: (555) 123 - 4567<br />
                                                        F: (555) 523 - 4567</p>

                                                    <p>W: <a href="#">http://www.domain.com<br /></a>E: <a href="#">email@domain.com</a></p>
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