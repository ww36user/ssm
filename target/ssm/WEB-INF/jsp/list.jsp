<%--
  Created by IntelliJ IDEA.
  User: nick
  Date: 2020-08-03
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>
${accountOne}
<c:forEach items="${accounts}" var="account">
    id=${account.id}},money=${account.money}},name=${account.name}} <br/>
</c:forEach>

</body>
</html>
