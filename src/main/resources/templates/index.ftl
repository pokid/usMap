<!DOCTYPE HTML>
<html>
<link rel="stylesheet" type="text/css" href="/static/css/index.css" />
<script type="text/javascript" src="/static/js/test.js">
</script>
<script type="text/javascript">
    // window.onload = function(){
    //     attackEnemy()
    // }
</script>
<head>
    <title>index</title>
</head>
<body>
<div id="header">
    <div id="h_left">
        <span class = "h_left_l">
            <img src="/static/images/test.jpg" style="height:70px;width:70px;">
        </span>
        <div class = "h_left_r">
            <a href="/">usMap</a>
        </div>

    </div>
    <div id="h_right">
        <span class="h_right_span">
            <input type="button" class="h_right_button"  value="登录" onclick="window.location.href='toLoginAndRegister?flag=login'">
            <input type="button" class="h_right_button" value="注册" onclick="window.location.href='toLoginAndRegister?flag=register'">
        </span>

    </div>
</div>
<div id="middle">
    <div class="m_left">
        <span class = "m_left_span">
            <img src="/static/images/test.jpg" style="height:400px;width:600px;">
        </span>
    </div>
    <div class="m_right">
        <span class = "m_right_span">
            <a style="text-decoration:none" href="/toMap"> 开启你的地图之旅吧！</a>
        </span>
    </div>
</div>
</body>
</html>
