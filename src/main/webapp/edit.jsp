<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/7/13
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Edit Page</title>
    <style>
        #welcome{
            font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
            text-align: right
        }
    </style>
</head>
<body>
<c:if test="${sessionScope.user.username eq null}">
    <c:redirect url="/index.jsp"/>
</c:if>
<h1>文章编辑</h1>
<div id="welcome">
    欢迎用户：${sessionScope.user.username}
    <hr>
    <a href="/user/logout">注销</a>
    <hr>
</div>
<div>
    <h3>编辑书目</h3>
    <form action="/book/update" method="post">
        <input type="hidden" name="id" value="${sessionScope.book.id}"><br>
        书名：<input type="text" name="title" placeholder="TITLE" value="${sessionScope.book.title}"><br>
        作者：<input type="text" name="author" placeholder="AUTHOR" value="${sessionScope.book.author}"><br>
        日期：<input type="text" name="printDate" placeholder="PRINTDATE" value="${sessionScope.book.printDate}"><br>
        价格：<input type="text" name="price" placeholder="PRICE" value="${sessionScope.book.price}"><br>
        数量：<input type="text" name="amount" placeholder="AMOUNT" value="${sessionScope.book.amount}"><br>
        <hr>
        <input type="submit" value="保存">
    </form>
</div>
</body>
</html>
