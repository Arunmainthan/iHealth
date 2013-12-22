<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<h1>My Music</h1>
   <s:a href="addAlbum.action">Add Album</s:a>
   <s:a href="addSong.action">Add Song</s:a>
	
	<table width="500px">
		<s:iterator value="allSongs">
			<tr>
				<td><s:property value="Title" /></td>
				<td><s:url value="album.action" var="albumURL">
						<s:param name="albumID">
							<s:property value="album.id" />
						</s:param>
					</s:url> 
					<s:a href="%{albumURL}">
						<s:property value="album.title" />
					</s:a></td>
			</tr>
		</s:iterator>

	</table>
</body>
</html>