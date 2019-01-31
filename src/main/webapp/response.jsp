<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2019/1/29
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>

    <script>
        $(function () {
            $("#btn").click(function () {
                // alert("测试成功");
                var uname = $(".uname").val();
                var upwd = $(".upassword").val();
                var timestamp=new Date().getTime();

                $.ajax({
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"'+uname+'","password":"'+upwd+'","status":"1"}',
                   // data:{username:uname, password:upwd,dateTime:timestamp},
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        //data 服务器端响应的json的数据，进行解析
                        alert(data.username);
                        alert(data.password);
                    }
                });
            });
        });
    </script>
</head>
<body>
    <a href="user/testSessionAttritubes">setCookieValue</a><br/><br/>
    <a href="user/getSessionAttritubes">getCookieValue</a><br/><br/>
    <a href="user/delSessionAttritubes">delSessionAttritubes</a><br/>
    <a href="user/testString">testString</a><br/>
    <a href="user/userString">userString</a><br/>
    <a href="user/testVoid">testVoid</a><br/>

    <form action="user/testModelAttribute" method="post">
        用户名：<input type="text" class="uname" name="uname" /><br/>
        密码:<input type="text" class="upassword" name="age"/> <br/>
        <input type="submit" value="提交"><br/><br/>
    </form>

    <button id="btn">button 提交</button>

    <a href="user/testUUID">testUUID</a><br/>

</body>
</html>
