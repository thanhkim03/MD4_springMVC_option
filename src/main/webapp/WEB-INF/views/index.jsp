<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/30/2022
  Time: 3:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>chọn nhân bánh trung thu</h2>
<form method="post" action="/save">
    <h4>đỗ xanh</h4>
    <input type="checkbox" name="n" value="do xanh">
    <h4>thập cẩm</h4>
    <input type="checkbox" name="n" value="thap cam">
    <h4>lạc</h4>
    <input type="checkbox" name="n" value="lac">
    <h4>trứng muối</h4>
    <input type="checkbox" name="n" value="trung muoi"><br>
    <input type="submit" value="save">
</form>
</body>
</html>
