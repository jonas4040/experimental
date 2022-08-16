<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<jsp:useBean id="Usuario" type="jonas4040.firstmvc.model.Usuario" scope="request"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sucesso</title>
<style type="text/css">
	h1{
		color:green;
	}
</style>
</head>
<body>
	<h1>Bem vindo</h1>
	<hr/>
	Seu nome: <strong>${Usuario.fullName}</strong><br/>
	Seu id: <strong>${Usuario.id}</strong><br/>
	Seu username: <strong>${Usuario.username}</strong><br/>
	Seu e-mail: <strong>${Usuario.email}</strong><br/>
</body>
</html>