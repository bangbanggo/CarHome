<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page
        language="java"
        contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>


<html>
<head>
    <meta
            http-equiv="Content-Type"
            content="text/html; charset=UTF-8"/>

    <link
            type="text/css"
            rel="stylesheet"
            href="../css/public.css"/>
</head>
<script src="../js/jquery.min.js"></script>
<script
        language="javascript"
        type="text/javascript">
    var popUp;

    function openwin(idname) {
        popUp = window.open('date.html?formname=form1&id=' + idname,
            '选择日期',
            'height=180, width=200,left=300,top=150, toolbar=no, menubar=no, scrollbars=no, resizable=no, location=no, status=no');
    }

    function SetDate(id, newDate) {

        popUp.close();
        form1.elements[id].value = newDate;
    }

    function deletepur() {
        document.getElementById("purform").submit();
    }


</script>
<body>
<table
        class="maintable"
        border="0"
        width="100%"
        cellspacing="0">
    <tr>
        <td background="../images/topBarBg.gif">
            系统管理：权限管理
        </td>
        <td
                width="20"
                height="23"
                background="../images/topBarBg.gif">
            <div align="right">
                <a href="#"><img
                        src="../images/iHelp.gif"
                        width="16"
                        height="16"
                        border="0">
                </a>
            </div>
        </td>
    </tr>
</table>

<form name="pur"
      action="/system/deletepur"
      method="post"
      id="purform"
>

    <table
            class="tablelistcontent"
            width="100%"
            border="1"
            cellspacing="1">
        <tr>
            <th width="27">
                <input
                        type="checkbox"
                        name="checkbox"
                        value="checkbox"
                        id="All"
                >
            </th>
            <th>
                权限编号
            </th>
            <th>
                权限级别
            </th>
            <th width="521">
                权限
            </th>
            <th>
                修改
            </th>
        </tr>
        <c:forEach items="${authorityList}" var="auth">
            <tr
                    class=Off
                    onMouseOut="this.className='Off'"
                    onMouseOver="this.className='Up'">
                <td height="24">
                    <div align="center">
                        <input
                                name="ids"
                                type="checkbox"
                                id="dels"
                                value="${auth.authorityid}"
                        />
                    </div>
                </td>
                <td>
                    <div align="center">
                            ${auth.authorityid}
                    </div>
                </td>
                <td height="24">
                    <div align="center">
                        <c:if test="${auth.authoritylevel == 1}">
                            一级权限
                        </c:if>
                        <c:if test="${auth.authoritylevel == 2}">
                            二级权限
                        </c:if>
                    </div>
                </td>
                <td>
                    <div align="center">
                            ${auth.authorityname}
                    </div>
                </td>

                <td>
                    <div align="left">
                    </div>
                    <div align="center">
                        <a href="editpur?id=${auth.authorityid}">
                            <img
                                    src="../images/edit.gif"
                                    width="16"
                                    height="19"
                                    border="0"/>
                        </a>
                    </div>
                    <div align="center"></div>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
<form action="system/addpur" method="post">
    <table width="100%">
        <tr>
            <td
                    height="40"
                    width="28">
                <div align="left"></div>
            </td>
            <td width="591">
                <div align="left">
                    <input
                            type="button"
                            onclick="deletepur()"
                            value="删除"/>
                </div>
            </td>
            <td width="51">
                <div align="left">
                    <p>
                        添加权限
                    </p>
                </div>
            </td>

            <td width="168">
                <div align="left">
                    <input type="text" name="authority.authorityname" id="cc"/>
                    <select name="authority.authoritylevel" onchange="showmenu(this)">
                        <option value="1">一级菜单</option>
                        <option value="2">二级菜单</option>
                    </select>
                    <label id="level1">
                        <br/>
                        Parent:
                        <select name="authority.authorityparentid">
                            <option value="0">默认</option>
                        </select>
                    </label>
                    <br/>
                    Action:<input name='authority.authorityaction' value='#'/>
                </div>
            </td>
            <td width="42">
                <div align="left">
                    <input
                            type="submit"
                            value="添加"/>
                </div>
            </td>

        </tr>
    </table>
</form>

</body>
<script type="text/javascript">
    function showmenu(thisform) {
        if (thisform.value == 2) {
            $.ajax({
                url: "/sell/query_json_getMenu",
                success: function (result) {
                    var data = JSON.parse(result);
                    var html = "<br/>Parent:<select name='authority.authorityparentid'>";
                    for (var i = 0; i < data.length; i++) {
                        html += "<option value='" + data[i].authorityid + "'>" + data[i].authorityname + "</option>";
                    }
                    html += "</select> ";
                    $("#level1").html(html);
                }
            });
        } else {
            var html = "<br/>Parent:<select name='authority.authorityparentid'>";
            html += "<option value='0'>" + "默认一级" + "</option>";
            html += "</select> ";
            $("#level1").html(html);
        }
    }
</script>
</html>
