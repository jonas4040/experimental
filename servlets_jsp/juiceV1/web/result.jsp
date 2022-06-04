<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Selecione o suco</title>
		<style>
			.centered{text-align: center;}
		</style>
	</head>
	<body>
		<h1 class="centered">Dicas de sucos</h1>
		<%
			List styles = (List) request.getAttribute("styles");
			Iterator itr = styles.iterator();
			while(itr.hasNext()){
				out.print("<br> Que tal um "+itr.next()+"?");
			}
		%>
	</body>
</html>
