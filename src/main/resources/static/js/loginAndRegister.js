$(function () {
    transformState(flag);
    $(document).on("click", ".main_center_title_login div", function () {
        flag = "login";
        transformState(flag)
        // window.location.href = changeURLArg(window.location.href, 'flag', "login")
    });
    $(document).on("click", ".main_center_title_register div", function () {
        flag = "register";
        transformState(flag)
        // window.location.href = changeURLArg(window.location.href, 'flag', "register")
    });

})

function transformState(flag) {
    if (flag == "login") {
        $("#register").css("display", "none")
        $("#login").css("display", "block")
        validateForm("loginForm")
    } else {
        $("#register").css("display", "block")
        $("#login").css("display", "none")
        validateForm("registerForm")
    }
}

//校验表单
function validateForm(formID) {
    var url = "login"
    if (formID == "registerForm")
        url = "register"
    $.validator.addMethod("regrex", function (value, element, params) {
        var regrex = params;
        return this.optional(element) || (regrex.test(value));
    }, "*输入格式错误");
    var validator = $("#" + formID).validate({
        //验证成功异步提交表单
        submitHandler: function (form) {
            var data = $("#" + formID).serialize()
            ajaxSubmitForm(data, url);
        },
        onfocusout: function (element) {
            clearErrorsOnFousout()
            //失去焦点不对空值校验
            $(element).rules("add", {
                required: false
            });
            $(element).valid();
            $(element).rules("add", {
                required: true
            });
        },
        errorPlacement: function (error, element) {
            //前端错误显示前先清除后端传来的错误，防止错误叠加
            $(element).next().text("")
            error.appendTo(element.next());
        },
        rules: {
            nickname: {
                required: true,
                rangelength:[5,15],
                regrex: /^[a-zA-Z0-9]+$/
            },
            email: {
                required: true,
                email:true
            },
            password: {
                required: true,
                rangelength:[6,16],
                regrex: /^[a-zA-Z0-9]+$/
            },
        },
        messages: {
            nickname: {
                required: "*请输入昵称",
                rangelength: "*昵称长度为5-15位",
                regrex: "*昵称由数字、字母或下画线组成"
            },
            password: {
                required: "*请输入密码",
                rangelength: "*密码长度为6-16位",
                regrex: "*密码由数字、字母或下画线组成"
            },
            // confirm_password: {
            //     required: "请输入密码",
            //     minlength: "密码长度不能小于 5 个字母",
            //     equalTo: "两次密码输入不一致"
            // },
            email: {
                required: "*请输入邮箱",
                email: "*请输入正确的邮箱"
            },
        },
    });
    validator.resetForm()
}

function ajaxSubmitForm(data, url) {
    $.ajax({
        url: url,
        type: 'post',
        dataType: "json",
        data: data,
        beforeSend: function () {
            //防止重复提交
            $("#registerButton").attr('disabled', true);
            $("#loginButton").attr('disabled', true);
            // $("#loginButton").text('提交中...');
        },
        complete: function () {
            $("#registerButton").removeAttr('disabled');
            $("#loginButton").removeAttr('disabled');
        },
        success: function (result) {
            var errors = JSON.stringify(result)
            //清楚之前后端校验错误但本次检验正确的错误提示
            clearAllErrors()
            if (result.state == "success") {
                window.location.href = "/"
            } else {
                for (var key in result) {
                    var inputID = "#" + url + "_" + key + "_error";
                    $(inputID).text(result[key])
                }
            }
        },
        //失败回调函数
        error: function (err) {
            console.error(err);
            // alert("登陆失败")
        }
    });
}

//后端校验错误清空
function clearAllErrors() {
        $("#login_email_error").text("");
        $("#login_password_error").text("");
        $("#register_nickname_error").text("");
}
//输入框无值并且失去焦点时情况
function clearErrorsOnFousout() {
    if($("#main_center_bottom_input_mail").text()==""){
        $("#login_email_error").text("");
        $("#register_email_error").text("");
    }
    if($("#main_center_bottom_input_nickname").text()==""){
        $("#login_nickname_error").text("");
        $("#register_nickname_error").text("");
    }
    if($("#main_center_bottom_input_password").text()==""){
        $("#login_password_error").text("");
        $("#register_password_error").text("");
    }

}

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

// 昵称validate
// $(document).ready(function(){
//     $("#main_center_bottom_input_nickname").focus(function(){
//         $("#main_center_bottom_input_nickname").attr({
//             "placeholder" : "请输入昵称"
//         });
//     });
//     $("#main_center_bottom_input_nickname").blur(function() {
//         var nicknamereg =  /^[a-zA-Z]([-_a-zA-Z0-9]{5,19})+$/;
//         var nickname = $('#main_center_bottom_input_nickname').val();
//         if(nicknamereg.test(nickname)){
//             $("#input_nickname_warm").html(""); //符合要求则为空
//         }
//         else{
//             $("#input_nickname_warm").html("*必填，6至20位，以字母开头，字母，数字，减号，下划线");
//         }
//
//     });
// });
// email validate
// $(document).ready(function(){
//     $("#main_center_bottom_input_mail").focus(function(){
//         $("#main_center_bottom_input_mail").attr({
//             "placeholder" : "请输入邮箱"
//         });
//     });
//     $("#main_center_bottom_input_mail").blur(function() {
//         var emailreg =  /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
//         var email = $('#main_center_bottom_input_mail').val();
//         if(emailreg.test(email)){
//             $("#input_email_warm").html(""); //符合要求则为空
//         }
//         else{
//             $("#input_email_warm").html("*必填，邮箱格式不符合要求");
//         }
//
//     });
// });

//password validate  只有注册的时候才需要这样验证正则
// $(document).ready(function(){
//     $("#main_center_bottom_input_password").focus(function(){
//         $("#main_center_bottom_input_password").attr({
//             "placeholder" : "请输入密码"
//         });
//     });
//     $("#main_center_bottom_input_password").blur(function() {
//         var passwordreg =  /^(\w){6,20}$/;
//         var password = $('#main_center_bottom_input_password').val();
//         if(passwordreg.test(password)){
//             $("#input_password_warm").html(""); //符合要求则为空
//         }
//         else{
//             $("#input_password_warm").html("*必填，6-20位，包含字母、数字、下划线");
//         }
//
//     });
// });
