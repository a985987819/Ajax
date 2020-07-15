<%--
  Created by IntelliJ IDEA.
  User: laoduan
  Date: 2020/7/14
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>局部刷新-axjax</title>

      <script type="text/css">
          /*.BMI{*/
            /*display: none;*/
          /*}*/
      </script>

      <script type="text/javascript">


          //使用内存中的异步对象代替浏览器发起请求
          //异步对象是使用JS创建和管理的
          function doAjax() {
              //1. 创建异步对象

              var xmlHttp = new XMLHttpRequest();

              //2. 绑定事件

              xmlHttp.onreadystatechange = function (ev) {
                  // 处理服务器端返回的数据，更新当前页面
                  // alert("readyState属性值为---"+xmlHttp.readyState+"status---"+xmlHttp.status)
                  if(xmlHttp.readyState==4&&xmlHttp.status==200){
                      // alert(xmlHttp.responseText);
                      console.log(xmlHttp.responseText)

                      var data = xmlHttp.responseText

                      //更新DOM对象，更新页面数据


                      // document.getElementsByClassName("BMI").

                      document.getElementById("BMI").innerHTML=data;
                  }

              }

              //3. 初始请求数据


              //获取dom对象的Value值
              var name = document.getElementById("name").value;
              var w = document.getElementById("w").value;
              var h = document.getElementById("h").value;

              var param = "name="+name+"&w="+w+"&h="+h;

              // alert("param:        "+param);
              xmlHttp.open("get","BMIAjax?"+param,true);


              //4. 发起请求
              xmlHttp.send();
      }








      </script>
  </head>
  <body>
      <h1>局部刷新ajax计算BMI</h1>
      <div>
        姓名：<input type="text" id="name"/></br>
        体重(KG)：<input type="text" id="w"/></br>
        身高(M)：<input type="text" id="h"/></br>
<br>
          <div id="BMI">


          </div>
        <input type="button" value="计算BMI" onclick="doAjax()">
      </div>
  </body>
</html>
