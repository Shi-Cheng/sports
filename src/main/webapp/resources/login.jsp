<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>login</title>
    <meta name="viewport" content="height=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/welcome.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
    <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">

    <script type="text/javascript">
        $(function() {
            $("#btn-order").click(function () {
                alert("预约成功");
            })
        })
    </script>


</head>
<body>
<form>
    <div class="bar-top">
        <ul>
            <li><a href="index.jsp">首页</a></li>
            <li><a href="activeorder.jsp">预约</a></li>
            <li><a href="activityOptions.jsp">我的预约</a></li>
            <li><a href="login.jsp">登陆</a></li>
            <li><a href="adminLogin.jsp">管理员</a></li>
        </ul>
    </div>
    <div class="active-img">
        <img src="${pageContext.request.contextPath}/resources/images/2.png"/>
        <div class="active-title">
            <label class="la1">欢迎使用羽毛球预约系统</label><br>
        </div>
        <br>
        <div class="user-login">
            用户名：<input type="text" name="用户名" class="login-name" style="width: 40%" />
        </div>
        <div class="user-word">
            密 - 码：<input type="password" name="密码" class="login-word" style="width: 40%" />
        </div>
        <div class="switch" >
            记住密码: &nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" />
        </div>
        <div class="order-btn">
            <input type="button" id="btn-order" class="btn btn-success" style="width: 80%" value="登陆">
        </div>
        <div class="optionr-btn">
            <a href="#">忘记密码</a> <a href="register.jsp">注册</a>
        </div>
    </div>
</form>
</body>
</html>
