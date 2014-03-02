<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="art-shapes">
    <h1 class="art-headline" data-left="50%">
        <c:choose>
            <c:when test="${sessionScope.login ne null}">
                <a href="#" style="font-size: 14px;">${sessionScope.login.id}</a> | 
                <a href="logout.html" style="font-size: 14px;">Logout</a>
            </c:when>
            <c:otherwise>
                <a href="login.html" style="font-size: 14px;">Login</a> | 
                <a href="signup.html" style="font-size: 14px;">Sign up</a>
            </c:otherwise>
        </c:choose>
    </h1>
</div>