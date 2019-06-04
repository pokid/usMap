$(function () {
    $(document).on("click", "#my", function () {
        transformState("my")
    });
    $(document).on("click", "#team", function () {
        transformState("team")
    });

    $(document).on("click", ".addUser", "", function () {
        var itemdiv = "<div style=\"position:relative;margin-top: 8px;\"><input style=\"width: 95%\" placeholder=\"邮箱\">" +
            "<div style=\"position:absolute;right: 3px;top: -1px\"><input class='delUser' style=\"border:0;width: 18px;height: 18px;\" type=\"button\" value=\"x\"></div></div>";
        $(this).parent().before(itemdiv)
    });

    $(document).on("click", ".delUser", "", function () {
        $(this).parent().parent().remove()
    });

    $(document).on("click", ".myteam_title", "", function () {
        $('.myteam').toggle();
    });

    $(document).on("click", ".belongteam_title", "", function () {
        $('.belongteam').toggle();
    })
})

function transformState(flag) {
    if (flag == "my") {
        $("#teamdiv").css("display", "none")
        $(".mydiv").css("display", "block")
        $(".m_r_title_my div").css("border-bottom", "solid 3px #666666")
        $(".m_r_title_team div").css("border-bottom", "none")
    } else {
        $(".mydiv").css("display", "none")
        $("#teamdiv").css("display", "block")
        $(".m_r_title_my div").css("border-bottom", "none")
        $(".m_r_title_team div").css("border-bottom", "solid 3px #666666")
    }
}