<%--
  Created by IntelliJ IDEA.
  User: 17734
  Date: 2017/10/20
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="S" uri="/struts-tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:if test="#rs!=0">${rs}</s:if>
<form action="hello" method="post">
    name:<input type="text" name="name">
    <input type="submit">
</form>
</body>
</html>
