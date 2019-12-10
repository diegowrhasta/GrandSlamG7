<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
¡Bienvenido!
</title>
<link rel="stylesheet" href="css/estilos.css" type="text/css"/>
</head>
<body>
<h2  class="h1">
¡Bienvenido de vuelta, <%=session.getAttribute("nombre")%>!
</h2>
<html:form action="/successAction">
<html:submit property="boton" value="REGISTRAR" />
<html:submit property="boton" value="VISUALIZAR" />
<html:submit property="boton" value="SALIR" />
</html:form>
<footer class="message">
  <p>Jefe de Proyecto: Diego Balderrama</p>
  <p>Programado por: Diego Balderrama, Eric Vargas</p>
  <p>Diseñado por: Diego Pardo</p>
  <p>Contacto: <a href="mailto:balderrama.quino.diego@gmail.com">
  balderrama.quino.diego@gmail.com</a>.</p>
  <p colspan="1">          <a href="mailto:parduccinward@gmail.com">
  parduccinward@gmail.com</a>.</p>
  <p>Son las: <%= new java.util.Date() %></p>
</footer> 
</body>
</html>
