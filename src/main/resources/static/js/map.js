$(function () {
    $(document).on("click", "#showTasks", function () {
        var height = $(".m_l_map_main").height()
        $(".m_l_map_main").css("height",(height+155))
        $("#tasks").show();
        $("#ac_td1_div").html("<input style='width: 100%;height: 100%;' id='hideTasks' type='button' value='隐藏'>");
    });
    $(document).on("click", "#hideTasks", function () {
        var height = $(".m_l_map_main").height()
        $(".m_l_map_main").css("height",(height-155))
        $("#tasks").hide();
        $("#ac_td1_div").html("<input style='width: 100%;height: 100%;' id='showTasks' type='button' value='显示'>");
    });
    $(document).on("click", "#addRow", function () {
        var height = $(".m_l_map_main").height()
        $(".m_l_map_main").css("height",(height+155))
        var rowTotal = $("#map_table").find("tr").length;
        var mode_tr = $("#map_table tbody tr:nth-child(" + (rowTotal) + ")").clone();
        $("#map_table tbody").append(mode_tr);
        var tds = $(this).parent().parent().parent().next().children()
        for (var i = 1; i < tds.length-1; i++) {
            var tddiv = "<div style=\"position:absolute;background: chocolate;bottom:5px;top: 5px;left:0px;right:0px;overflow-y: auto;overflow-x: auto;\"><div style=\"position:relative;margin-top: 10px;\">" +
                "<textarea style=\"width: 80%\" rows=\"2\"></textarea><div style=\"position:absolute;right: 18px;top: -3px;\">" +
                "<input class=\"delItem\" style=\"border:0;width: 15px;height: 15px;\" type=\"button\" value=\"x\"></div></div>" +
                "<div style=\"position:relative;margin-top: 10px;\"><input class=\"addItem\" type=\"button\" value=\"添加\"></div></div></td>"
            $(tds[i]).html($(tddiv))
        }
        $($(this).parent().parent().parent().next().find("div")[0]).text("release" + (rowTotal - 3) + "")
        $(this).parent().html("<input style='width: 100%;height: 100%;' id='delRow' type='button' value='删除'>")
    });
    $(document).on("click", "#delRow", function () {
        var height = $(".m_l_map_main").height()
        $(".m_l_map_main").css("height",(height-155))
        var rowTotal = $("#map_table").find("tr").length;
        var tdSeq = $(this).parent().parent().parent().find("td").index($(this).parent().parent()[0]);
        var trSeq = $(this).parent().parent().parent().parent().find("tr").index($(this).parent().parent().parent()[0]);
        $("#map_table tr:eq(" + (trSeq + 1) + ")").remove()
        if (trSeq + 2 == rowTotal) {
            $(this).parent().html("<input style='width: 100%;height: 100%;' id='addRow' type='button' value='新增'>")
        }
    });

    $(document).on("click", "#addCol", "", function () {
        var width = $(".m_l_map_main").width()
        $(".m_l_map_main").css("width",(width+265))
        var tdSeq = $(this).parent().parent().find("td").index($(this).parent()[0]);
        $("#map_table tr:first").each(function () {
            var td = $("<td  style='width:100px;height:50px;'><input id='delCol' type='button' value='删除列'/></td>");
            $("td:eq(" + (tdSeq - 1) + ")", this).after(td)
        })
        $("#map_table tr:not(:first)").each(function (index) {
            if(index == 0){
                var td0 = "<td style=\"height: 60px;\"><div style=\"width: 80%;height: 30px;margin: auto;padding-top: 10px;overflow-y: auto;overflow-x: auto;\" contenteditable=\"true\">添加用户</div></td>";
                $("td:eq(" + (tdSeq - 1) + ")", this).after(td0)
            }else if(index == 1) {
                var td1 = "<td style=\"position: relative\">\n" +
                    "<div style=\"position:absolute;;background: dodgerblue;bottom:10px;top: 10px;left:0px;right:0px;overflow-y: auto;overflow-x: auto;\"><div style=\"position:relative;margin-top: 10px;\">" +
                    "<textarea style=\"width: 80%\" rows=\"2\"></textarea><div style=\"position:absolute;right: 18px;top: -3px;\">" +
                    "<input class=\"delItem\" style=\"border:0;width: 15px;height: 15px;\" type=\"button\" value=\"x\"></div></div>" +
                    "<div style=\"position:relative;margin-top: 10px;\"><input class=\"addItem\" type=\"button\" value=\"添加\"></div></div></td>"
                $("td:eq(" + (tdSeq - 1) + ")", this).after(td1)
            }else if(index == 2) {
                var td2 = "<td style=\"position: relative;\">\n" +
                    "<div style=\"position:absolute;background: gold;bottom:10px;top: 10px;left:0px;right:0px;overflow-y: auto;overflow-x: auto;\"><div style=\"position:relative;margin-top: 10px;\">" +
                    "<textarea style=\"width: 80%\" rows=\"2\"></textarea><div style=\"position:absolute;right: 18px;top: -3px;\">" +
                    "<input class=\"delItem\" style=\"border:0;width: 15px;height: 15px;\" type=\"button\" value=\"x\"></div></div>" +
                    "<div style=\"position:relative;margin-top: 10px;\"><input class=\"addItem\" type=\"button\" value=\"添加\"></div></div></td>"
                $("td:eq(" + (tdSeq - 1) + ")", this).after(td2)
            }else {
                var td = "<td style=\"position: relative;\">\n" +
                    "<div style=\"position:absolute;background: chocolate;bottom:10px;top: 10px;left:0px;right:0px;overflow-y: auto;overflow-x: auto;\"><div style=\"position:relative;margin-top: 10px;\">" +
                    "<textarea style=\"width: 80%\" rows=\"2\"></textarea><div style=\"position:absolute;right: 18px;top: -3px;\">" +
                    "<input class=\"delItem\" style=\"border:0;width: 15px;height: 15px;\" type=\"button\" value=\"x\"></div></div>" +
                    "<div style=\"position:relative;margin-top: 10px;\"><input class=\"addItem\" type=\"button\" value=\"添加\"></div></div></td>"
                $("td:eq(" + (tdSeq - 1) + ")", this).after(td)
            }
        })
    });
    $(document).on("click", "#delCol", "", function () {
        var width = $(".m_l_map_main").width()
        $(".m_l_map_main").css("width",(width-265))
        var tdSeq = $(this).parent().parent().find("td").index($(this).parent()[0]);
        var trSeq = $(this).parent().parent().parent().find("tr").index($(this).parent().parent()[0]);
        $("#map_table tr").each(function () {
            $(this).find("td").eq(tdSeq).remove()
        })
    });
    $(document).on("click", ".addItem", "", function () {
        var itemdiv = "<div style=\"position:relative;margin-top: 10px;\"><textarea style=\"width: 80%\" rows=\"2\"></textarea>" +
            "<div style=\"position:absolute;right: 18px;top: -3px;\"><input class='delItem' style=\"border:0;width: 15px;height: 15px;\" type=\"button\" value=\"x\"></div></div>";
        $(this).parent().before(itemdiv)
    });
    $(document).on("click", ".delItem", "", function () {
        $(this).parent().parent().remove()
    });
    $(document).on("click", ".mywork_title", "", function () {
        $('.mywork').toggle();
    })
})
