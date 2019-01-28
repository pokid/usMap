$(function () {
    if (flag == "login") {
        $("#register").css("display", "none")
        $("#login").css("display", "block")
        validateForm("loginForm")
    } else {
        $("#register").css("display", "block")
        $("#login").css("display", "none")
        validateForm("registerForm")
    }

    $(".main_center_title_login div").click(function () {
        window.location.href = changeURLArg(window.location.href, 'flag', "login")

    });
    $(".main_center_title_register div").click(function () {
        window.location.href = changeURLArg(window.location.href, 'flag', "register")

    });

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

//校验表单
function validateForm(formID){
    $.validator.addMethod("regrex",function(value,element,params){
        var regrex = params;
        return this.optional(element)||(regrex.test(value));
    },"*输入格式错误");
    $("#"+formID).validate({
        onfocusout: function(element) { $(element).valid(); },
        errorPlacement:function(error,element){
            error.appendTo(element.next());
        },
        rules:{
            nickname:{
                required:true,
                rangelength:[5,15],
                regrex: /^\w{5,15}$/
            },
            email:{
                required:true,
                email:true
            },
            password:{
                required:true,
                rangelength:[6,16],
                regrex: /^\w{6,16}$/
            },
        },
        messages: {
            nickname: {
                required: "*请输入用户名",
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
        }
    });

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
