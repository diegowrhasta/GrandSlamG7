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
<html:text property="partido_id" />
<html:select property="modalidad_id">
<html:options collection="bulk" property="modalidad_id" labelProperty="modalidad" />
</html:select>
<html:select property="fecha">
<html:options collection="bulk" property="torneo_id" labelProperty="anio_torneo" />
</html:select>
<html:select property="etapa_id">
<html:options collection="bulk" property="etapa_id" labelProperty="etapa" />
</html:select>
<html:select property="equipo_local_id">
<html:options collection="bulk" property="equipo_local_id" labelProperty="equipo_local_id" />
</html:select>
<html:select property="equipo_visitante_id">
<html:options collection="bulk" property="equipo_visitante_id" labelProperty="equipo_visitante_id" />
</html:select>
</html:form>
<html:submit />
<h2>
Leyenda de Equipos:
</h2>
<table class="lista" border=1 width="25%" height="25%"><tr>
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
<center><html:text name="tabla" property="equipo_id" readonly="true" /></center>
</td>
<td>
<html:text name="tabla" property="jugador_1" readonly="true" />
</td>
<td>
<html:text name="tabla" property="jugador_2" readonly="true" />
</td>
</tr>
</logic:iterate>
</table>
</body>
</html>
