<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculatrice</title>
</head>
<body>
 	<form method="post" action="bonjour">
 		<input type="text" name="nombre1" required>
 		<select name="opera">
 			<option value="+">+</option>
 			<option value="-">-</option>
 			<option value="*">*</option>
 			<option value="/">/</option>	
 		</select>
 		<input type="text" name="nombre2" required>
 		<input type="submit">
 	</form>
 	<p><c:out value="${form.resultat}" /></p>
</body>
</html>