<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html class="formulario">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title class="h1">
Lista de Partidos
</title>
<link rel="stylesheet" href="css/estilos.css" type="text/css"/>
</head>
<script language="JavaScript" src="jscript/valida.js"></script>
<script language="JavaScript" src="jscript/grandslam.js"></script>
<body>
<h2 align ="center">
Partidos encontradaos en la base de datos
</h2>
<table border=1 width="25%" height="25%" class="boxdetail">
<tr>
<td>
<center>Partido ID</center>
</td>
<td>
<center>MODALIDAD</center>
</td>
<td>
<center>GRAND SLAM</center>
</td>
<td>
<center>AÑO DEL TORNEO</center>
</td>
<td>
<center>ETAPA</center>
</td>
<td>
<center>ID EQUIPO LOCAL</center>
</td>
<td>
<center>ID EQUIPO VISITANTE</center>
</td>
</tr>
<logic:iterate id="tabla2" indexId="index" name="partidos" property="tabla2">
<tr>
<td>
<bean:write name="tabla2" property="partido_id" />
</td>
<td>
<bean:write name="tabla2" property="modalidad" />
</td>
<td>
<bean:write name="tabla2" property="grand_slam" />
</td>
<td>
<bean:write name="tabla2" property="anio_torneo" />
</td>
<td>
<bean:write name="tabla2" property="etapa" />
</td>
<td>
<bean:write name="tabla2" property="equipo_local_id" />
</td>
<td>
<bean:write name="tabla2" property="equipo_visitante_id" />
</td>
</tr>
</logic:iterate>
<html:form action="/visualizarAction">
<html:submit property="boton" value="VOLVER" />
<html:submit property="boton" value="SALIR" />
</html:form>
</table>
</body>
</html>
