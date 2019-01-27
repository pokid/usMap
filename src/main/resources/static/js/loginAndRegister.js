$(function () {
    if (flag == "login") {
        $("#main_center_bottom_input_nickname").hide()
        $(".main_center_title_register div").css("border-bottom", "none")
        $(".main_center_title_login div").css("border-bottom", "solid 3px #666666")
        $("#main_center_bottom_input_button").val("登录")

    } else {
        $("#main_center_bottom_input_nickname").show()
        $(".main_center_title_login div").css("border-bottom", "none")
        $(".main_center_title_register div").css("border-bottom", "solid 3px #666666")
        $("#main_center_bottom_input_button").val("注册")

    }

    $(".main_center_title_login div").click(function () {
        window.location.href = changeURLArg(window.location.href, 'flag', "login")

    });
    $(".main_center_title_register div").click(function () {
        window.location.href = changeURLArg(window.location.href, 'flag', "register")

    })
})
function changeURLArg(url, arg, arg_val) {
    var pattern = arg + '=([^&]*)';
    var replaceText = arg + '=' + arg_val;
    if (url.match(pattern)) {
        var tmp = '/(' + arg + '=)([^&]*)/gi';
        tmp = url.replace(eval(tmp), replaceText);
        return tmp;
    } else {
        if (url.match('[\?]')) {
            return url + '&' + replaceText;
        } else {
            return url + '?' + replaceText;
        }
    }
}

function submitForm() {
    var nickname=$('#main_center_bottom_input_nickname').val();
    var password=$('#main_center_bottom_input_password').val();
    var email=$('#main_center_bottom_input_mail').val();
    var nwarm=$('#input_nickname_warm').text();
    var ewarm=$('#input_email_warm').text();
    var pwarm=$('#input_password_warm').text();
    if(flag == "login"){
        if(password!=''&&email!=''){  //均为
            $("#lAndrForm").attr("action", "login");
        }


    }else{
        if(nwarm==""&&ewarm==""&&pwarm==""){
            alert(123)
            if(password!=''&&email!=''&&nickname!=""){
                alert(123456)
                $("#lAndrForm").attr("action", "register");
            }
        }

    }
    $("#lAndrForm").submit();
}

// 昵称validate
$(document).ready(function(){
    $("#main_center_bottom_input_nickname").focus(function(){
        $("#main_center_bottom_input_nickname").attr({
            "placeholder" : "请输入昵称"
        });
    });
    $("#main_center_bottom_input_nickname").blur(function() {
        var nicknamereg =  /^[a-zA-Z]([-_a-zA-Z0-9]{5,19})+$/;
        var nickname = $('#main_center_bottom_input_nickname').val();
        if(nicknamereg.test(nickname)){
            $("#input_nickname_warm").html(""); //符合要求则为空
        }
        else{
            $("#input_nickname_warm").html("*必填，6至20位，以字母开头，字母，数字，减号，下划线");
        }

    });
});
// email validate
$(document).ready(function(){
    $("#main_center_bottom_input_mail").focus(function(){
        $("#main_center_bottom_input_mail").attr({
            "placeholder" : "请输入邮箱"
        });
    });
    $("#main_center_bottom_input_mail").blur(function() {
        var emailreg =  /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
        var email = $('#main_center_bottom_input_mail').val();
        if(emailreg.test(email)){
            $("#input_email_warm").html(""); //符合要求则为空
        }
        else{
            $("#input_email_warm").html("*必填，邮箱格式不符合要求");
        }

    });
});

//password validate  只有注册的时候才需要这样验证正则
$(document).ready(function(){
    $("#main_center_bottom_input_password").focus(function(){
        $("#main_center_bottom_input_password").attr({
            "placeholder" : "请输入密码"
        });
    });
    $("#main_center_bottom_input_password").blur(function() {
        var passwordreg =  /^(\w){6,20}$/;
        var password = $('#main_center_bottom_input_password').val();
        if(passwordreg.test(password)){
            $("#input_password_warm").html(""); //符合要求则为空
        }
        else{
            $("#input_password_warm").html("*必填，6-20位，包含字母、数字、下划线");
        }

    });
});
