<!DOCTYPE HTML>
<html>
<link rel="stylesheet" href="static/css/loginAndRegister.css" type="text/css"/>
<script type="text/javascript" src="/static/jquery/jquery-3.0.0.min.js"></script>
<script type="text/javascript" src="/static/js/loginAndRegister.js"></script>
<script type="text/javascript">
    var flag = "${flag}"
</script>
<head>
    <title>loginAndRegister</title>
</head>
<body>
<div id="main">
    <div class="main_center">
        <div class="main_center_top">
            <span class="main_center_top_img">
                <img src="/static/images/test.jpg" style="height:70px;width:70px;">
            </span>
            <span class="main_center_top_name">
                <a href="/">usMap</a>
            </span>
        </div>
        <div class="main_center_title">
            <div class="main_center_title_login">
                <div>登录</div>
            </div>
            <div class="main_center_title_register">
                <div>注册</div>
            </div>
        </div>
        <div class="main_center_bottom">
            <input type="text" class="main_center_bottom_input" placeholder="昵称">
            <input type="password" class="main_center_bottom_input" placeholder="密码">
            <input type="text" id="main_center_bottom_input_mail" class="main_center_bottom_input" placeholder="邮箱">
            <input type="submit"id="main_center_bottom_input_button" class="main_center_bottom_button" value="登录">
        </div>
    </div>
</div>
<div id="footer">

</div>
</body>
</html>
