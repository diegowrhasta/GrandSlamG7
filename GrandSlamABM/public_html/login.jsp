<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html align="center">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
GrandSlamG7
</title>
<link rel="stylesheet" href="css/estilos.css" type="text/css"/>
</head>
<body>
<h2 align ="center">
Login Grand Slam WebPage
</h2>
<html:errors />
<html:form action="/login">
<table width="350" height="100" align="center" class="boxdetail">
<tr>
<td colspan="2" align="center" class="boxhead"><bean:message key="userid.prompt" /></td>
<td colspan="2" align="center" class="boxhead"><html:text property="userid" /></td>
</tr>
<tr>
<td colspan="2" align="center" class="boxhead"><bean:message key="password.prompt" /></td>
<td colspan="2" align="center" class="boxhead"><html:password property="password" /></td>
</tr>
</table>
<html:submit/>
</html:form>
</body>
</html>
