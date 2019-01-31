<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>adminQuery</title>
    <meta name="viewport" content="height=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/welcome.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/adminstyle.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
    <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>

    <style type="text/css">
        body {
            background: #eee;
            background-image: url(${pageContext.request.contextPath}/resources/images/admin_bg.png);
            background-position: initial;
            background-repeat: initial;
            background-position: initial;
            background-repeat: initial;
            margin: 0px;
            padding: 0px;
        }
        .query-notice {
            margin-left: 10%;
        }
    </style>
    <script type="text/javascript">
        $(function () {
            $("#btn-order").click(function () {
                var optionsDate = $("#activity-date").val().replace(/-/g, "");
                var optionsPlace = $("#activity-place").val();
                //alert(optionsPlace)
                $("#query-content").html('<h1>'+optionsDate+'</h1>'+'<p>'+optionsPlace+'</p>');
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
        <div class="active-title">
            <label class="la1">羽毛球预约活动系统发布</label><br>
        </div>
        <br>
        <span class="query-notice"> </span><br/><br/>
        <div class="user-login">
            活动时间：<input type="date" id="activity-date" style="width: 40%"/>
        </div>
        <div class="user-login">
            活动地点：<input type="text" id="activity-place" style="width: 40%"/>
        </div>

        <div class="order-btn">
            <input type="button" id="btn-order" class="btn btn-success" style="width: 80%" value="添加">
        </div>
        <div id="query-content">

        </div>

    </div>
</form>
</body>
</html>
