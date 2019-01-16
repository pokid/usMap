<!DOCTYPE HTML>
<html>
<link rel="stylesheet" href="static/css/loginAndRegister.css" type="text/css"/>
<script type="text/javascript" src="/static/jquery/jquery-3.0.0.min.js"></script>
<script type="text/javascript" src="/static/js/loginAndRegister.js"></script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script>
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
            <#--${kk!""}-->
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
        <div>
        </div>

        <div class="main_center_bottom">
            <form action="" method="post" id="lAndrForm">
                <input type="text" id="main_center_bottom_input_mail" class="main_center_bottom_input" placeholder="邮箱" name="email">
                <span id="input_email_warm" style="color: red; font-size: small"></span>

                <input type="text" id="main_center_bottom_input_nickname" class="main_center_bottom_input" placeholder="昵称" name="nickname">
                <span id="input_nickname_warm" style="color: red; font-size: small""></span>

                <input type="password" id="main_center_bottom_input_password" class="main_center_bottom_input" placeholder="密码" name="password">
                <span id="input_password_warm" style="color: red ;font-size: small""></span>

                <input type="button"id="main_center_bottom_input_button" class="main_center_bottom_button" value="登录" onclick="submitForm()">
            </form>
        </div>


    </div>

</div>

<div id="footer">
</div>

</body>
</html>
