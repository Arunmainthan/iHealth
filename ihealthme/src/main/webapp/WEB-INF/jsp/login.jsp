<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html dir="ltr" lang="en-US"><head><!-- Created by Artisteer v4.0.0.58475 -->
        <meta charset="utf-8">
        <title>Login</title>
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
                    <jsp:include page="abstract/header.jsp" />
                </header>
                <nav class="art-nav clearfix">
                    <jsp:include page="abstract/menu.jsp">
                        <jsp:param name="page" value="index"/>
                    </jsp:include>
                </nav>
                <div class="art-layout-wrapper clearfix">
                    <div class="art-content-layout">
                        <div class="art-content-layout-row">
                            <div class="art-layout-cell art-content clearfix"><article class="art-post art-article">
                                    <div class="art-postcontent art-postcontent-0 clearfix"><div class="">
                                            <div class="">
                                                <div class="" style="width: 100%" >
                                                    <p><img width="269" height="269" alt="" src="images/005-2.png" style="float:left;margin-right:10px;" /></p>
                                                    <h2 class="art-postheader">Login</h2>
                                                    <form action="signin.html" method="POST" class="bs-example form-horizontal">
                                                        <fieldset>
                                                            <legend></legend>
                                                            <c:if test="${requestScope.fail ne null}">
                                                                <div class="alert alert-dismissable alert-danger">
                                                                    <button type="button" class="close" data-dismiss="alert">&times;</button>
                                                                    <strong>Error!</strong> ${requestScope.fail}
                                                                </div>
                                                            </c:if>
                                                            <div class="form-group">
                                                                <label for="inputEmail" class="col-lg-2 control-label">Email Address</label>
                                                                <div class="col-lg-10">
                                                                    <input type="text" class="form-control" id="inputEmail" name="em" placeholder="Email" style="width: 380px;">
                                                                </div>
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="inputPassword" class="col-lg-2 control-label">Password</label>
                                                                <div class="col-lg-10">
                                                                    <input type="password" class="form-control" id="inputPassword" name="pw" placeholder="Password" style="width: 380px;">
                                                                </div>
                                                            </div>
                                                            <div class="form-group">
                                                                <div class="col-lg-10 col-lg-offset-2">
                                                                    <button type="submit" class="btn btn-primary">Login</button>
                                                                </div>
                                                            </div>
                                                        </fieldset>
                                                    </form>
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