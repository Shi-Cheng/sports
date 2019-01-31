<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>activeorder</title>
    <meta name="viewport" content="height=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/activeorder.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
    <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">

    <script type="text/javascript">
        $(function() {
            $("#btn-order").click(function () {
                alert("恭喜，预约成功");
                location.href='activityOptions.jsp';
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
        <img src="${pageContext.request.contextPath}/resources/images/1.png"/>
        <div class="active-title">
            <label class="la1">活动名称：高尔夫球赛</label><br>
            <label class="la2">活动主题：深化友谊，促进交流</label><br>
            <label class="la3">活动日期：2019-01-01</label>
        </div>
        <br>

        <div class="active-content">
            高尔夫运动具有浓烈的商务性质和绅士气质，能够完美地诠释本活动对象的不凡品质。参赛者在挥杆比赛激烈角逐中，深化友谊，
            促进交流，览尽XX 山迷人风光。凡是对高尔夫感兴趣的活动参与者特别是意向大客户都可以报名参加比赛，此次球赛意在为俱乐部成立和项目销售做好铺垫。高尔夫运动具有浓烈的商务性质和绅士气质，能够完美地诠释本活动对象的不凡品质。参赛者在挥杆比赛激烈角逐中，深化友谊，
            促进交流，览尽XX 山迷人风光。凡是对高尔夫感兴趣的活动参与者特别是意向大客户都可以报名参加比赛，此次球赛意在为俱乐部成立和项目销售做好铺垫。高尔夫运动具有浓烈的商务性质和绅士气质，能够完美地诠释本活动对象的不凡品质。参赛者在挥杆比赛激烈角逐中，深化友谊，
            促进交流，览尽XX 山迷人风光。凡是对高尔夫感兴趣的活动参与者特别是意向大客户都可以报名参加比赛，此次球赛意在为俱乐部成立和项目销售做好铺垫。
        </div>
        <div class="order-btn">
            <input type="button" id="btn-order" class="btn btn-success" style="width: 100%" value="一键预约">
        </div>
    </div>
</form>
</body>
</html>
