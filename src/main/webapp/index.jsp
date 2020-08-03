<%--
  Created by IntelliJ IDEA.
  User: nick
  Date: 2020-08-03
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<a href="account/queryAllAccount">查询所有</a>
<br/>
<form action="account/queryAccountById">
    查询一个用户：<input type="text" name="id" /><br/>
    <input type="submit" value="查询" />
</form>

<br/>
<form action="account/updateAccount">
    更新用户信息：<br/>
    id:<input type="text" name="id" /><br/>
    name:<input type="text" name="name" /><br/>
    money:<input type="text" name="money" /><br />
    <input type="submit" value="更新" />
</form>

<br/>
<form action="account/deleteAccountById" method="post">
    删除用户信息：<br/>
    id:<input type="text" name="id" /><br/>
    <input type="submit" value="删除" />
</form>
<br/>
<form action="account/addAccount">
    添加用户信息：<br/>
    name:<input type="text" name="name" /><br/>
    money:<input type="text" name="money" /><br />
    <input type="submit" value="添加" />
</form>


</body>
</html>
