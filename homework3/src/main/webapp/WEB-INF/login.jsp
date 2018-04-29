<%--
  Created by IntelliJ IDEA.
  User: 联想
  Date: 2018/4/18
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.slf4j.*"%>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="<%=request.getContextPath()%>/Main" method="post">
      <h2>欢迎登录WordLadder</h2>
      <div class="1">
        <label class="t">邮　箱：</label>
        <input value="" name="email" type="text"/>
      </div>
      <div class="2">
        <label class="t">密　码：</label>
        <input value="" name="password" type="text"/>
      </div>
      <div class="2">
        <label class="t"></label>
        <input type="submit" value="进入" id="login"/>
      </div>
    </form>
</body>
</html>
