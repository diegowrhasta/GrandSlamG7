<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Registrar Partido
</title>
</head>
<body>
<h2>
Partido a registrar:
</h2>
<html:form action="/registrar">
Partido ID:
<html:text property="partido_id" />
<br>
Modalidad:
<html:select property="modalidad_id">
<html:options collection="modalidades" property="modalidad_id" labelProperty="nombre" />
</html:select>
<br>
Fecha:
<html:text property="fecha" />
<br>
Torneo:
<html:select property="torneo_id">
<html:options collection="bulk" property="torneo_id" labelProperty="grand_slam" />
</html:select>
<br>
Etapa:
<html:select property="etapa_id">
<html:options collection="etapas" property="etapa_id" labelProperty="nombre" />
</html:select>
<br>
Equipo Local ID:
<html:select property="equipo_local_id">
<html:options collection="equipos" property="equipo_id" labelProperty="equipo_id" />
</html:select>
<br>
Equipo Visitante ID:
<html:select property="equipo_visitante_id">
<html:options collection="equipos" property="equipo_id" labelProperty="equipo_id" />
</html:select>
<html:submit />
</html:form>
<h2>
Leyenda de Equipos:
</h2>
<table class="lista" border=1 width="25%" height="25%">
<tr>
<td>
<center>Equipo_ID</center>
</td>
<td>
<center>Jugador 1</center>
</td>
<td>
<center>Jugador 2</center>
</td>
</tr>
<logic:iterate id="tabla" indexId="index" name="legend" property="tabla">
<tr>
<td>
<bean:write name="tabla" property="equipo_id" />
</td>
<td>
<bean:write name="tabla" property="jugador_1" />
</td>
<td>
<bean:write name="tabla" property="jugador_2" />
</td>
</tr>
</logic:iterate>
</table>
</body>
</html>
