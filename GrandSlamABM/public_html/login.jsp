<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
GrandSlamG7
</title>
</head>
<body>
<h2>
Página de Ingreso
</h2>
<html:errors />
<html:form action="/login">
<table border =0>
<tr>
<td><bean:message key="userid.prompt" /></td>
<td><html:text property="userid" /></td>
</tr>
<tr>
<td><bean:message key="password.prompt" /></td>
<td><html:password property="password" /></td>
</tr>
</table>
<html:submit />
</html:form>
</body>
</html>
