<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <title>struts</title>
    <style>
        input{
            margin: 5px;
            padding: 5px;
        }
    </style>
</head>
<body>
    <h3>abcd</h3>
    <a href="test">t1</a>
    <a href="test.action">t2</a>
    <a href="test.do">t3</a>

<hr>
<s:iterator begin="1" end="10" step="1" var="i">
    <s:property/><br>
</s:iterator>
<hr>
    <form action="login.action" method="post">
        账号：<input type="text" name="account" ><br>
        密码：<input type="password" name="pass" ><br>
        <input type="submit" value="登录">
    </form>

</body>
</html>
