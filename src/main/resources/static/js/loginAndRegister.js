$(function () {
    if (flag == "login"){
        $("#main_center_bottom_input_mail").hide()
        $(".main_center_title_register div").css("border-bottom","none")
        $(".main_center_title_login div").css("border-bottom","solid 3px #666666")
    }else {
        $("#main_center_bottom_input_mail").show()
        $(".main_center_title_login div").css("border-bottom","none")
        $(".main_center_title_register div").css("border-bottom","solid 3px #666666")
    }
})
$(function(){
    $(".main_center_title_login div").click(function(){
        $(".main_center_title_login div").css("border-bottom","solid 3px #666666")
        $(".main_center_title_register div").css("border-bottom","none")
        $("#main_center_bottom_input_button").val("登录")
        $("#main_center_bottom_input_mail").hide()
    });
});
$(function(){
    $(".main_center_title_register div").click(function(){
        $(".main_center_title_register div").css("border-bottom","solid 3px #666666")
        $(".main_center_title_login div").css("border-bottom",'none')
        $("#main_center_bottom_input_button").val("注册")
        $("#main_center_bottom_input_mail").show()
    });
});