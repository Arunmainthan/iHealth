<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<ul class="art-hmenu">
    <li><a href="index.html" <c:if test="${param.page == 'index'}">class="active"</c:if>>Home</a></li>
    <c:if test="${sessionScope['login'] ne null}"><li><a href="news.html" <c:if test="${param.page == 'news'}">class="active"</c:if>>News</a></li></c:if>
    <li><a href="contact.html" <c:if test="${param.page == 'contact'}">class="active"</c:if>>Contacts</a></li>
    <li><a href="about.html" <c:if test="${param.page == 'about'}">class="active"</c:if>>About Us</a></li>
</ul>