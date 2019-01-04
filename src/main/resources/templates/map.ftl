<!DOCTYPE HTML>
<html>
<link rel="stylesheet" type="text/css" href="/static/css/map.css"/>
<script type="text/javascript" src="/static/jquery/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
    $(function () {
        $(document).on("click", "#showTasks", function () {
            var height = $(".m_l_map_main").height()
            $(".m_l_map_main").css("height",(height+155))
            $("#tasks").show();
            $("#acdiv").html("<input style='width: 100%;height: 100%;' id='hideTasks' type='button' value='隐藏'>");
        });
        $(document).on("click", "#hideTasks", "", function () {
            var height = $(".m_l_map_main").height()
            $(".m_l_map_main").css("height",(height-155))
            $("#tasks").hide();
            $("#acdiv").html("<input style='width: 100%;height: 100%;' id='showTasks' type='button' value='显示'>");
        });
        $(document).on("click", "#addRow", function () {
            var height = $(".m_l_map_main").height()
            $(".m_l_map_main").css("height",(height+155))
            var rowTotal = $("#testTable").find("tr").length;
            var mode_tr = $("#testTable tbody tr:nth-child(" + (rowTotal) + ")").clone();
            $("#testTable tbody").append(mode_tr);
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
            var rowTotal = $("#testTable").find("tr").length;
            var tdSeq = $(this).parent().parent().parent().find("td").index($(this).parent().parent()[0]);
            var trSeq = $(this).parent().parent().parent().parent().find("tr").index($(this).parent().parent().parent()[0]);
            $("#testTable tr:eq(" + (trSeq + 1) + ")").remove()
            if (trSeq + 2 == rowTotal) {
                $(this).parent().html("<input style='width: 100%;height: 100%;' id='addRow' type='button' value='新增'>")
            }
        });

        $(document).on("click", "#addCol", "", function () {
            var width = $(".m_l_map_main").width()
            $(".m_l_map_main").css("width",(width+265))
            var tdSeq = $(this).parent().parent().find("td").index($(this).parent()[0]);
            $("#testTable tr:first").each(function () {
                var td = $("<td  style='width:100px;height:50px;'><input id='delCol' type='button' value='删除列'/></td>");
                $("td:eq(" + (tdSeq - 1) + ")", this).after(td)
            })
            $("#testTable tr:not(:first)").each(function (index) {
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
            $("#testTable tr").each(function () {
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
</script>
<head>
    <title>map</title>
</head>
<body>
<div id="header">
    <div id="h_left">
        <div class="h_left_index">
            <a href="/">首页</a>
            <a href="">绘图</a>
        </div>
        <div class="h_left_name">
            <input type="text" value="未命名文件">
        </div>
        <div class="h_left_menu">
            <div class="h_left_menu_l">
                <input class="h_left_button" type="submit" value="保存">
            </div>
            <div class="h_left_menu_r">
                <input class="h_left_button" type="submit" value="下载">
                <input class="h_left_button" type="submit" value="分享">
            </div>
        </div>
    </div>
    <div id="h_right">
        <span class="h_right_span">
            <input type="button" class="h_right_button" value="pokid">
        </span>
    </div>
</div>
<div id="middle">
    <div class="m_l">
        <div class="m_l_map">
            <div class="m_l_map_main">
                <div class="m_l_map_top">
                    <#--横向箭头长度修改此处-->
                    <div class="m_l_map_t_line">
                        <hr class="m_l_map_t_hr"/>
                    </div>
                    <div class="m_l_map_t_arrow">
                        <div class="arrow1"></div>
                    </div>
                </div>
                <div class="m_l_map_left">
                    <#--纵向箭头长度修改此处-->
                    <div class="m_l_map_l_line">
                        <hr class="m_l_map_l_hr"/>
                    </div>
                    <div class="m_l_map_l_arrow">
                        <div class="arrow2"></div>
                    </div>
                </div>
                <div class="m_l_map_inner">
                    <table id="testTable">
                        <tr style="text-align: center;">
                            <td style="width:150px;height: 60px;"></td>
                            <td style="height: 60px;"></td>
                            <td style="height: 60px;">
                                <input id="addCol" type="button" value="新增列"/>
                            </td>
                        </tr>
                        <tr style="text-align: center;">
                            <td style="height: 60px;">users</td>
                            <td style="height: 60px;">
                                <div style="width: 80%;height: 30px;margin: auto;padding-top: 10px;overflow-y: auto;overflow-x: auto;" contenteditable="true">
                                    添加用户
                                </div>
                            </td>
                            <td style="height: 60px"></td>
                        </tr>
                        <tr style="text-align: center;">
                            <td style="display:table;position: relative;">
                                <div style="display: table-cell;vertical-align: middle">
                                    activities
                                </div>
                                <div id="acdiv"
                                     style="display:table-cell;width:50px;height:50px;position:absolute;top: 82%;left: 36%;">
                                    <input style="width: 100%;height: 100%;" id="hideTasks" type="button"
                                           value="隐藏">
                                </div>
                            </td>
                            <td style="position: relative;">
                                <div style="background: dodgerblue;position:absolute;bottom:10px;top: 10px;;left:0px;right:0px;overflow-y: auto;overflow-x: auto;">
                                    <div style="position:relative;margin-top: 10px;">
                                        <textarea style="width: 80%" rows="2"></textarea>
                                        <div style="position:absolute;right: 18px;top: -3px;">
                                            <input class="delItem" style="border:0;width: 15px;height: 15px;" type="button" onclick="" value="x">
                                        </div>
                                    </div>
                                    <div style="position:relative;margin-top: 10px;">
                                        <input class="addItem" type="button" value="添加">
                                    </div>
                                </div>
                            </td>
                            <td></td>
                        </tr>
                        <tr id="tasks" style="text-align: center">
                            <td style="width:150px;">tasks</td>
                            <td style="position:relative;">
                                <div style="position:absolute;background: gold;bottom:10px;top: 10px;left:0px;right:0px;overflow-y: auto;overflow-x: auto;">
                                    <div style="position:relative;margin-top: 10px;">
                                        <textarea style="width: 80%" rows="2"></textarea>
                                        <div style="position:absolute;right: 18px;top: -3px;">
                                            <input class="delItem" style="border:0;width: 15px;height: 15px;" type="button" onclick="" value="x">
                                        </div>
                                    </div>
                                    <div style="position:relative;margin-top: 10px;">
                                        <input class="addItem" type="button" value="添加">
                                    </div>
                                </div>
                            </td>
                            <td>
                            </td>
                        </tr>
                        <tr style="text-align: center;">
                            <td style="display:table;position: relative;">
                                <div style="display: table-cell;vertical-align: middle;">
                                    release1
                                </div>
                                <div id="rediv"
                                     style="display:table-cell;width:50px;height:50px;position:absolute;top: 82%;left: 36%;">
                                    <input id="addRow" style="width: 100%;height: 100%;" type="button" value="新增">
                                    <#--<input id="delRow" style="display:none;width: 100%;height: 100%;" type="button" value="删除">-->
                                </div>
                            </td>
                            <td style="position: relative">
                                <div style="position:absolute;background: chocolate;bottom:10px;top: 10px;left:0px;right:0px;overflow-y: auto;overflow-x: auto;">
                                    <div style="position:relative;margin-top: 10px;">
                                        <textarea style="width: 80%" rows="2"></textarea>
                                        <div style="position:absolute;right: 18px;top: -3px;">
                                            <input class="delItem" style="border:0;width: 15px;height: 15px;" type="button" onclick="" value="x">
                                        </div>
                                    </div>
                                    <div style="position:relative;margin-top: 10px;">
                                        <input class="addItem" type="button" value="添加">
                                    </div>
                                </div>
                            </td>
                            <td></td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <div class="m_r">
        <div class="m_r_title">
            <div class="m_r_title_my">
                <div>我的</div>
            </div>
            <div class="m_r_title_team">
                <div>团队</div>
            </div>
        </div>
        <div style="width: 100%;height: 90%;text-align: center;">
            <div class="mywork_div">
                <a class="mywork_title">我的作品</a>
                <ul class="mywork" style="display: none;padding-right: 25%;margin-top: 0px;">
                    <li><a>作品1</a></li>
                    <li><a>作品2</a></li>
                    <li><a>作品3</a></li>
                </ul>
            </div>
        </div>

    </div>
</div>

</body>
</html>
