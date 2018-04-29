<%--
  Created by IntelliJ IDEA.
  User: 联想
  Date: 2018/4/22
  Time: 23:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix ="c"%>
<html>
<head>
    <title>Result</title>
</head>
<body>
<div class="4">
  <h4>A ladder from word2 back to word1 : </h4>
  <p> ${wl.find_ladder(wl.filename,wl.word1,wl.word2)}</p>
</div>
<form action="<%=request.getContextPath()%>/Main" method="post">
  <input value="已登录" name="email" type="text" hidden/>
  <input value="正确" name="password" type="text" hidden/>
<div class="5">
  <a href="Main"><input type="submit" value="继续查询"/></a>
</div>
</form>
</body>
</html>
