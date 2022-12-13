<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Respuesta</title>
</head>
<body>

	acceder a la definicion del javabean en su ambito para coger la solucion
	recojo la respuesta del usuario

	${ requestScope.definicion.solucion == param.respuesta}
	
	tendremos que pasar todas las letras a mayusculas si en la base de datos esta en mayusculas
	<fn:toUpperCase()>
	
</body>
</html>