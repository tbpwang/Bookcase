<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/7/13
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Register Page</title>
  </head>
  <body>
  <h1>用户注册</h1>
  <br>
  <form action="/user/create" method="post">
    <input type="text" name="username" placeholder="USERNAME" value="tester"><br>
    <input type="password" name="password" placeholder="PASSWORD" value="test"><br>
    <br>
    <input type="submit" value="用户注册">
  </form>
  </body>
</html>
