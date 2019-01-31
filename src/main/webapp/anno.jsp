<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>just a text</title>
</head>
<body>

    <a href="anno/testRequestParam?name=hahaha">RequestParam</a><br/><br/>

    <form action="anno/testRequestBody" method="post">
        用户名：<input type="text" name="uname" /><br/>
        用户年龄:<input type="text" name="uage"/> <br/>

        <input type="submit" value="提交"><br/><br/>
    </form>

    <a href="anno/testPathVariable/10">testPathVariable</a><br/><br/>

    <a href="anno/testCookieValue">cookieValue</a>

    <form action="anno/testModelAttribute" method="post">
        用户名：<input type="text" name="uname" /><br/>
        用户年龄:<input type="text" name="age"/> <br/>

        <input type="submit" value="提交"><br/><br/>
    </form>

    <a href="anno/testSessionAttritubes">setCookieValue</a><br/><br/>
    <a href="anno/getSessionAttritubes">getCookieValue</a><br/><br/>
    <a href="anno/delSessionAttritubes">delSessionAttritubes</a>

</body>
</html>
