<%--
  Created by IntelliJ IDEA.
  User: laoduan
  Date: 2020/7/14
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>全局刷新版</title>
    <style>
      .body{
        display: flex;
      }
      .title{
        align-content: center;
      }
    </style>
  </head>
  <body>
    <div class="body">
      <div class="title">
        <h1>全局刷新BMI</h1>
        <form action="BMIservlet" method="get">
          姓名：       <input type="text" name="name"></br>
          体重(KG)：   <input type="text" name="weight"></br>
          身高(M)：    <input type="text" name="height"></br>
          <input type="submit" value="提交">
        </form>
      </div>
    </div>

  </body>
</html>
