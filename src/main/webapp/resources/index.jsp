<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name=”viewport” content=”width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no”/>
    <title>index</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/detail.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.css">
    <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
    <script type="text/javascript">
        $(function() {
            $("#queryBtn").click(function(){
                //alert("this is queryButton")
                location.href='activeorder.jsp';
            });
            $("#orderBtn").click(function () {
                location.href='activityOptions.jsp';
            });
            $("#adminMan").click(function () {
                location.href='adminLogin.jsp';
            });
        });
    </script>

</head>
<body style="background: url('${pageContext.request.contextPath}/resources/images/bg1.png') no-repeat;">
<form>
    <div class="main-body">
        <div class="selections">
            <label >运动预约和查询</label>
        </div>
        <div class="query-body">
            <input type="button" id="queryBtn" class="btn btn-success" style="width: 30%; font-size: 3em"  value="活动预约">
        </div>
        <div class="order-body">
            <input type="button" id="orderBtn" class="btn btn-success" style="width: 30%; font-size: 3em"  value="我的预约">
        </div>
        <div class="admin-body">
            <input type="button" id="adminMan" class="btn btn-success" style="width: 30%; font-size: 3em"   value="管理员中心">
        </div>
    </div>
</form>
</body>
</html>
