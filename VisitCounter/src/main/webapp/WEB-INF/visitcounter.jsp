<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Visit Counter</title>
	</head>
	<body>
		<p>You have visited <a href="https://youtu.be/dQw4w9WgXcQ" target="_blank">http://localhost:8080</a> <c:out value="${count}"></c:out> times.</p>
		<a href="/">Test another visit?</a>
		<form action="resetSession" method="post">
			<button type="submit">Reset Counter</button>
		</form>
	</body>
</html>