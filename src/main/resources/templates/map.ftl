<!DOCTYPE HTML>
<html>
<link rel="stylesheet" type="text/css" href="/static/css/map.css"/>
<script type="text/javascript" src="/static/jquery/jquery-3.0.0.min.js"></script>
<script type="text/javascript" src="/static/js/map.js"></script>
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
                    <table id="map_table">
                        <tr id="map_table_tr_addCol">
                            <td></td>
                            <td></td>
                            <td>
                                <input id="addCol" type="button" value="新增列"/>
                            </td>
                        </tr>
                        <tr id="map_table_tr_users">
                            <td>users</td>
                            <td>
                                <div class="map_users_div" contenteditable="true">
                                    添加用户
                                </div>
                            </td>
                            <td></td>
                        </tr>
                        <tr>
                            <td class="tabledisplay">
                                <div class="tablecelldisplay">
                                    activities
                                </div>
                                <div id="ac_td1_div"
                                    <input id="hideTasks" type="button"
                                           value="隐藏">
                                </div>
                            </td>
                            <td class="relative">
                                <div id="ac_td2_div">
                                    <div class="ac_td2_div_div1">
                                        <textarea style="width: 80%" rows="2"></textarea>
                                        <div class="del_div">
                                            <input class="delItem" type="button" value="x">
                                        </div>
                                    </div>
                                    <div class="add_div">
                                        <input class="addItem" type="button" value="添加">
                                    </div>
                                </div>
                            </td>
                            <td></td>
                        </tr>
                        <tr id="tasks">
                            <td>tasks</td>
                            <td class="relative">
                                <div class="task_div">
                                    <div class="task_div_div1">
                                        <textarea style="width: 80%" rows="2"></textarea>
                                        <div class="del_div">
                                            <input class="delItem" type="button" value="x">
                                        </div>
                                    </div>
                                    <div class="add_div">
                                        <input class="addItem" type="button" value="添加">
                                    </div>
                                </div>
                            </td>
                            <td></td>
                        </tr>
                        <tr>
                            <td class="tabledisplay">
                                <div class="tablecelldisplay">
                                    release1
                                </div>
                                <div id="rediv">
                                    <input id="addRow" type="button" value="新增">
                                    <#--<input id="delRow" style="display:none;width: 100%;height: 100%;" type="button" value="删除">-->
                                </div>
                            </td>
                            <td class="relative">
                                <div class="re_td2_div">
                                    <div class="re_td2_div_div1">
                                        <textarea style="width: 80%" rows="2"></textarea>
                                        <div class="del_div">
                                            <input class="delItem" type="button" value="x">
                                        </div>
                                    </div>
                                    <div class="add_div">
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
