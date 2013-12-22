<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<h1>Add Album</h1>
   <s:form action="addAlbum" method="post">
   		Album Name<s:textfield name="albumName"/>
   		<s:submit value="submit"/>
   </s:form>
</body>
</html>