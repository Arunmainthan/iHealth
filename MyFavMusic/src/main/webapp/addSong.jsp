<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<h1>Add Song</h1>
   <s:form action="addSong" method="post">
   		Song Name<s:textfield name="songTitle"/>
   		Rating<s:textfield name="rating"/>
   		Album ID<s:textfield name="albumID"/>
   		singerID<s:textfield name="singerID"/>
   		<s:submit value="submit"/>
   </s:form>
</body>
</html>