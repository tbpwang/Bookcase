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
    <title>Home Page</title>
    <script>
        function del(){
            return confirm("确定删除，不可恢复");
        }
    </script>
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
<h1>文章主页</h1>
<div id="welcome">
    欢迎用户：${sessionScope.user.username}
    <hr>
    <a href="/user/logout">注销</a>
    <hr>
</div>
<div>
    <h3>录入新书</h3>
    <form action="/book/create" method="post">
        书名：<input type="text" name="title" placeholder="TITLE"><br>
        作者：<input type="text" name="author" placeholder="AUTHOR"><br>
        日期：<input type="text" name="printDate" placeholder="PRINTDATE"><br>
        价格：<input type="text" name="price" placeholder="PRICE"><br>
        数量：<input type="text" name="amount" placeholder="AMOUNT"><br>
        <hr>
        <input type="submit" value="录入"><br>
    </form>
</div>
<hr>
    <table border="1">
        <tr>
            <th>序号</th>
            <th>书名</th>
            <th>作者</th>
            <th>出版日期</th>
            <th>定价</th>
            <th>数量</th>
            <th colspan="2">操作</th>
        </tr>
        <c:forEach var="book" items="${sessionScope.books}" varStatus="vs">
            <tr>
                <td>${vs.count}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.printDate}</td>
                <td>${book.price}</td>
                <td>${book.amount}</td>
                <td><a href="/book/queryOne/${book.id}">编辑</a></td>
                <td><a href="/book/remove/${book.id}" onclick="return del()">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
