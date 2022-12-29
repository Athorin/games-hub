<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Pregunta</title>
</head>
<body>
	
	<sql:query var="numRegistros" dataSource="jdbc/BDCrucigramarius">
		SELECT * FROM definiciones ORDER BY rand() LIMIT 1;
	</sql:query>
	
	instanciar javabean
	<jsp:useBean id="definicion" scope="request"></jsp:useBean>
	
	invocar a respuesta, la otra pagina jsp cuando se le de a enviar
	<jsp:forward page="Respuesta.jsp">
		Modificar el ambito del javabean para que no sea de pagina solamente
		peticion vale con forward
		sesion con formulario		
		
		<input type="text" name="respuesta">
		<input type="submit">
	</jsp:forward>
	
	

</body>
</html>