<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
¡Bienvenido!
</title>
</head>
<body>
<h2>
¡Bienvenido de vuelta, <%=session.getAttribute("nombre")%>!
</h2>
<html:form action="/successAction">
<html:submit property="boton" value="REGISTRAR" />
<html:submit property="boton" value="VISUALIZAR" />
<html:submit property="boton" value="SALIR" />
</html:form>
<footer>
  <p>Programado por: Diego Balderrama</p>
  <p>Contacto: <a href="mailto:balderrama.quino.diego@gmail.com">
  balderrama.quino.diego@gmail.com</a>.</p>
  <p>Son las: <%= new java.util.Date() %></p>
</footer> 
</body>
</html>
