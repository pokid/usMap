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
        // $(".main_center_title_login div").css("border-bottom", "solid 3px #666666")
        // $(".main_center_title_register div").css("border-bottom", "none")
        // $("#main_center_bottom_input_button").val("登录")
        // $("#main_center_bottom_input_nickname").hide()
    });
    $(".main_center_title_register div").click(function () {
        window.location.href = changeURLArg(window.location.href, 'flag', "register")
        // $(".main_center_title_register div").css("border-bottom", "solid 3px #666666")
        // $(".main_center_title_login div").css("border-bottom", 'none')
        // $("#main_center_bottom_input_nickname").show()
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
