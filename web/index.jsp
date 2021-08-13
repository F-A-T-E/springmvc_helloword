<%--
  Created by IntelliJ IDEA.
  User: lpf18
  Date: 2021/8/9
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <%
    pageContext.setAttribute("ctp",request.getContextPath());
  %>
  <body>
  $END$
  <form action="${ctp}/hello/hello" method="post">
    <input type="text" name="username"><br/>
    <input type="submit" value="提交">
  </form>
  </body>
</html>
