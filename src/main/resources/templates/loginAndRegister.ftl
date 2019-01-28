<!DOCTYPE HTML>
<html>
<head>
    <title>loginAndRegister</title>
    <link rel="stylesheet" href="${request.getContextPath()}/static/css/loginAndRegister.css" type="text/css"/>
    <script type="text/javascript" src="/static/js/jquery/jquery-3.0.0.min.js"></script>
    <script type="text/javascript" src="/static/js/jquery/jquery.validate.min.js"></script>
    <script type="text/javascript" src="/static/js/jquery/jquery.metadata.js"></script>
    <script type="text/javascript" src="/static/js/jquery/messages_zh.min.js"></script>
    <script type="text/javascript" src="/static/js/loginAndRegister.js"></script>
    <script type="text/javascript">
        var flag = "${flag}";
    </script>
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
        <div>
        </div>

        <div id="login" class="main_center_bottom" style="display: block">
            <form action="login" method="post" id="loginForm">
                <div style="position: relative;">
                <input type="text" id="main_center_bottom_input_mail" class="main_center_bottom_input required" placeholder="邮箱" name="email">
                <span id="input_email_warm" class="errorspan"></span>
                </div>

                <div style="position: relative;">
                <input type="password" id="main_center_bottom_input_password" class="main_center_bottom_input" placeholder="密码" name="password">
                <span id="input_password_warm" class="errorspan"></span>
                </div>
                <input type="submit" id="main_center_bottom_input_button" class="main_center_bottom_button" value="登录">
            </form>
        </div>

        <div id="register" class="main_center_bottom" style="display: none">
            <form action="register" method="post" id="registerForm">
                <div style="position: relative;">
                    <input type="text" id="main_center_bottom_input_mail" class="main_center_bottom_input required" placeholder="邮箱" name="email">
                    <span id="input_email_warm" class="errorspan"></span>
                </div>

                <div style="position: relative;">
                    <input type="text" id="main_center_bottom_input_nickname" class="main_center_bottom_input required" placeholder="昵称" name="nickname">
                    <span id="input_nickname_warm" class="errorspan"></span>
                </div>

                <div style="position: relative;">
                    <input type="password" id="main_center_bottom_input_password" class="main_center_bottom_input" placeholder="密码" name="password">
                    <span id="input_password_warm" class="errorspan"></span>
                </div>
                <input type="submit" id="main_center_bottom_input_button" class="main_center_bottom_button" value="注册">
            </form>
        </div>

    </div>

</div>

<div id="footer">
</div>

</body>
</html>
