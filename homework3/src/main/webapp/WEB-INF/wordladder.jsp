<%--
  Created by IntelliJ IDEA.
  User: 联想
  Date: 2018/4/19
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix ="c"%>
<%@ page import="org.slf4j.*"%>
<html>
<head>
    <title>WordLadder</title>
</head>
<body>
<%
  Logger logger = LoggerFactory.getLogger(this.getClass());
%>
<c:if test="${us.check(us.email,us.password)=='0'}">
  <%
    logger.info("用户输入密码错误");
  %>
  <h3>输入的密码不正确</h3>
  <a href = "login"><input type="submit" value="重新登录" /></a>
</c:if>
<c:if test="${us.check(us.email,us.password)=='1'}">
  <%
    logger.info("用户忘记邮箱");
  %>
  <h3>输入的邮箱不正确</h3>
  <a href = "login"><input type="submit" value="重新登录" /></a>
</c:if>
<c:if test="${us.check(us.email,us.password)=='2'}">
  <%
    logger.info("用户成功登录");
  %>
  <form action="<%=request.getContextPath()%>/result" method="post">
    <div class="1">
      <label class="t">word1 ：</label>
      <input id="word1" value="" name="word1" type="text"/>
    </div>
    <div class="2">
      <label class="t">word2 ：</label>
      <input id="word2" value="" name="word2" type="text"/>
    </div>
    <div class="3">
      <label class="t">filename : </label>
      <input id="filename" value="" name="filename" type="text"/>
    </div>
    <a href="result"><input type="submit" value="查询"/></a>
    <input name="email" value="${us.email}" hidden/>
  </form>
</c:if>
</body>
</html>
