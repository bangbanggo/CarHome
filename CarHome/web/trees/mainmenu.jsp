<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: gwb10
  Date: 2018/4/16
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title></title>
    <link href="../css/public.css" rel="stylesheet" type="text/css" />
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
</head>
<script language=javascript>
    NS4 = (document.layers) ? 1 : 0;
    IE4 = (document.all) ? 1 : 0;
    ver4 = (NS4 || IE4) ? 1 : 0;

    if (ver4) {
        with (document) {
            write("<STYLE TYPE='text/css'>");
            if (NS4) {
                write(".parent {position:absolute; visibility:visible background:red}");
                write(".child {position:absolute; visibility:hide }");
                write(".regular {position:absolute; visibility:visible}")
            }
            else {
                write(".child {display:none;text-align:left}")
            }
            write("</STYLE>");
        }
    }
</script>
<script language=javascript>

    function expandIt(el)
    {
        var whichEl = eval(el + "Child");
        var s1 = eval(el + "f");
//alert(whichEl);

        if (whichEl.style.display != "block")
        {
            whichEl.style.display = "block";
//alert(whichEl.style.pixelHeight);
//alert(whichEl.style.width);
            s1.innerHTML = "<img src='../images/iOpenFolder.gif'>"
        }
        else
        {
            whichEl.style.display = "none";
            s1.innerHTML = "<img src='../images/iGenericFolder.gif'>"
        }
//arrange()
// whichE1.pageY = 200;
    }
    function button_over(o)
    {
        o.style.background="#CCCCCC";
    }

    function button_out(o)
    {
        o.style.background="";
    }


</script>
<body>
<c:forEach items="${menu.subMenus}" var="submenu">
<div id="KB1Parent" class="parent">
    <table width="190"><tr><td width="16" id="KB1f"><img src="../images/iGenericFolder.gif" width="16" height="16"></td>
        <td width="162">
            <a href="#" onClick="expandIt('KB1'); return false">${submenu.authorityname}</a></td>
    </tr></table>
</div>
<div id="KB1Child" class="child">
    <table width="190" border=0 cellpadding="0" cellSpacing=0>
        <c:forEach items="${submenu.authorityList}" var="authority">
        <tr>
            <td width="8"><img src="../images/ftv2vertline.gif"></td>
            <td width="8"><img src="../images/ftv2node.gif" width="16" height="22"></td>
            <td width="16"><img src="../images/iGenericAttribute.gif" width="16" height="16"></td>
            <td width="158" onMouseover="button_over(this);" onMouseout="button_out(this);"><a href="${authority.authorityaction}" target="workspace">${authority.authorityname}</a></td>
        </tr>
        </c:forEach>
    </table>
</div>
</c:forEach>


<%--<div id="KB1Parent" class="parent">--%>
    <%--<table width="190"><tr><td width="16" id="KB1f"><img src="../images/iGenericFolder.gif" width="16" height="16"></td>--%>
        <%--<td width="162">--%>
            <%--<a href="#" onClick="expandIt('KB1'); return false">系统管理</a></td>--%>
    <%--</tr></table>--%>
<%--</div>--%>
<%--<div id="KB1Child" class="child">--%>
    <%--<table width="190" border=0 cellpadding="0" cellSpacing=0>--%>
        <%--<tr>--%>
            <%--<td width="8"><img src="../images/ftv2vertline.gif"></td>--%>
            <%--<td width="8"><img src="../images/ftv2node.gif" width="16" height="22"></td>--%>
            <%--<td width="16"><img src="../images/iGenericAttribute.gif" width="16" height="16"></td>--%>
            <%--<td width="158" onMouseover="button_over(this);" onMouseout="button_out(this);"><a href="/system/listuser" target="workspace">用户管理</a></td>--%>
        <%--</tr>--%>

        <%--<tr>--%>
            <%--<td><img src="../images/ftv2vertline.gif"></td>--%>
            <%--<td><img src="../images/ftv2node.gif" width="16" height="22"></td>--%>
            <%--<td><img src="../images/iGenericAttribute.gif" width="16" height="16"></td>--%>
            <%--<td onMouseover="button_over(this);" onMouseout="button_out(this);"><a href="/system/listrole" target="workspace">角色管理</a></td>--%>
        <%--</tr>--%>

        <%--<tr>--%>
            <%--<td><img src="../images/ftv2vertline.gif"></td>--%>
            <%--<td><img src="../images/ftv2node.gif" width="16" height="22"></td>--%>
            <%--<td><img src="../images/iGenericAttribute.gif" width="16" height="16"></td>--%>
            <%--<td onMouseover="button_over(this);" onMouseout="button_out(this);"><a href="/system/listpur" target="workspace">权限管理</a></td>--%>
        <%--</tr>--%>
    <%--</table>--%>
<%--</div>--%>






<%--<div id="KB4Parent" class="parent">--%>
    <%--<table width="190"><tr><td width="16" id="KB4f"><img src="../images/iGenericFolder.gif" width="16" height="16"></td>--%>
        <%--<td width="162">--%>
            <%--<a href="#" onClick="expandIt('KB4'); return false">仓库管理</a></td>--%>
    <%--</tr></table>--%>
<%--</div>--%>
<%--<div id="KB4Child" class="child">--%>
    <%--<table width="190" border=0 cellpadding="0" cellSpacing=0>--%>
        <%--<tr>--%>
            <%--<td width="8"><img src="../images/ftv2vertline.gif"></td>--%>
            <%--<td width="8"><img src="../images/ftv2node.gif" width="16" height="22"></td>--%>
            <%--<td width="16"><img src="../images/iGenericAttribute.gif" width="16" height="16"></td>--%>
            <%--<td width="158" onMouseover="button_over(this);" onMouseout="button_out(this);"><a href="/warehouse/listWarehouse" target="workspace">仓库信息</a></td>--%>
        <%--</tr>--%>

        <%--<tr>--%>
            <%--<td width="8"><img src="../images/ftv2vertline.gif"></td>--%>
            <%--<td width="8"><img src="../images/ftv2node.gif" width="16" height="22"></td>--%>
            <%--<td width="16"><img src="../images/iGenericAttribute.gif" width="16" height="16"></td>--%>
            <%--<td width="158" onMouseover="button_over(this);" onMouseout="button_out(this);"><a href="/warehouse/preAddCar" target="workspace">新车入库</a></td>--%>
        <%--</tr>--%>



        <%--<tr>--%>
            <%--<td width="8"><img src="../images/ftv2vertline.gif"></td>--%>
            <%--<td width="8"><img src="../images/ftv2node.gif" width="16" height="22"></td>--%>
            <%--<td width="16"><img src="../images/iGenericAttribute.gif" width="16" height="16"></td>--%>
            <%--<td width="158" onMouseover="button_over(this);" onMouseout="button_out(this);"><a href="/warehouse/listCars" target="workspace">库存管理</a></td>--%>
        <%--</tr>--%>


    <%--</table>--%>
<%--</div>--%>


<%--<div id="KB5Parent" class="parent">--%>
    <%--<table width="190"><tr><td width="16" id="KB5f"><img src="../images/iGenericFolder.gif" width="16" height="16"></td>--%>
        <%--<td width="162">--%>
            <%--<a href="#" onClick="expandIt('KB5'); return false">统计管理</a></td>--%>
    <%--</tr></table>--%>
<%--</div>--%>
<%--<div id="KB5Child" class="child">--%>
    <%--<table width="190" border=0 cellpadding="0" cellSpacing=0>--%>
        <%--<tr>--%>
            <%--<td width="8"><img src="../images/ftv2vertline.gif"></td>--%>
            <%--<td width="8"><img src="../images/ftv2node.gif" width="16" height="22"></td>--%>
            <%--<td width="16"><img src="../images/iGenericAttribute.gif" width="16" height="16"></td>--%>
            <%--<td width="158" onMouseover="button_over(this);" onMouseout="button_out(this);"><a href="../total/c.jsp" target="workspace">库存统计</a></td>--%>
        <%--</tr>--%>



        <%--<tr>--%>
            <%--<td width="8"><img src="../images/ftv2vertline.gif"></td>--%>
            <%--<td width="8"><img src="../images/ftv2node.gif" width="16" height="22"></td>--%>
            <%--<td width="16"><img src="../images/iGenericAttribute.gif" width="16" height="16"></td>--%>
            <%--<td width="158" onMouseover="button_over(this);" onMouseout="button_out(this);"><a href="../total/b.jsp" target="workspace">趋势分析</a></td>--%>
        <%--</tr>--%>

        <%--<tr>--%>
            <%--<td width="8"><img src="../images/ftv2vertline.gif"></td>--%>
            <%--<td width="8"><img src="../images/ftv2node.gif" width="16" height="22"></td>--%>
            <%--<td width="16"><img src="../images/iGenericAttribute.gif" width="16" height="16"></td>--%>
            <%--<td width="158" onMouseover="button_over(this);" onMouseout="button_out(this);"><a href="../total/a.jsp" target="workspace">客户统计</a></td>--%>
        <%--</tr>--%>
    <%--</table>--%>
<%--</div>--%>




<%--<div id="KB6Parent" class="parent">--%>
    <%--<table width="190"><tr><td width="16" id="KB6f"><img src="../images/iGenericFolder.gif" width="16" height="16"></td>--%>
        <%--<td width="162">--%>
            <%--<a href="#" onClick="expandIt('KB6'); return false">销售管理</a></td>--%>
    <%--</tr></table>--%>
<%--</div>--%>
<%--<div id="KB6Child" class="child">--%>
    <%--<table width="190" border=0 cellpadding="0" cellSpacing=0>--%>
        <%--<tr>--%>
            <%--<td width="8"><img src="../images/ftv2vertline.gif"></td>--%>
            <%--<td width="8"><img src="../images/ftv2node.gif" width="16" height="22"></td>--%>
            <%--<td width="16"><img src="../images/iGenericAttribute.gif" width="16" height="16"></td>--%>
            <%--<td width="158" onMouseover="button_over(this);" onMouseout="button_out(this);"><a href="/sell/carDetail" target="workspace">汽车详情</a></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td width="8"><img src="../images/ftv2vertline.gif"></td>--%>
            <%--<td width="8"><img src="../images/ftv2node.gif" width="16" height="22"></td>--%>
            <%--<td width="16"><img src="../images/iGenericAttribute.gif" width="16" height="16"></td>--%>
            <%--<td width="158" onMouseover="button_over(this);" onMouseout="button_out(this);"><a href="/sell/order_preadd" target="workspace">订单新增</a></td>--%>
        <%--</tr>--%>
        <%--&lt;%&ndash;<tr>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<td width="8">&ndash;%&gt;--%>
                <%--&lt;%&ndash;<img src="../images/ftv2vertline.gif">&ndash;%&gt;--%>
            <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<td width="8">&ndash;%&gt;--%>
                <%--&lt;%&ndash;<img&ndash;%&gt;--%>
                        <%--&lt;%&ndash;src="../images/ftv2node.gif"&ndash;%&gt;--%>
                        <%--&lt;%&ndash;width="16"&ndash;%&gt;--%>
                        <%--&lt;%&ndash;height="22">&ndash;%&gt;--%>
            <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<td width="16">&ndash;%&gt;--%>
                <%--&lt;%&ndash;<img&ndash;%&gt;--%>
                        <%--&lt;%&ndash;src="../images/iGenericAttribute.gif"&ndash;%&gt;--%>
                        <%--&lt;%&ndash;width="16"&ndash;%&gt;--%>
                        <%--&lt;%&ndash;height="16">&ndash;%&gt;--%>
            <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<td&ndash;%&gt;--%>
                    <%--&lt;%&ndash;width="158"&ndash;%&gt;--%>
                    <%--&lt;%&ndash;onMouseover="button_over(this);"&ndash;%&gt;--%>
                    <%--&lt;%&ndash;onMouseout="button_out(this);">&ndash;%&gt;--%>
                <%--&lt;%&ndash;<a&ndash;%&gt;--%>
                        <%--&lt;%&ndash;href="../sell/SellList.jsp"&ndash;%&gt;--%>
                        <%--&lt;%&ndash;target="workspace">订单列表</a>&ndash;%&gt;--%>
            <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
        <%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
        <%--<tr>--%>
            <%--<td width="8"><img src="../images/ftv2vertline.gif"></td>--%>
            <%--<td width="8"><img src="../images/ftv2node.gif" width="16" height="22"></td>--%>
            <%--<td width="16"><img src="../images/iGenericAttribute.gif" width="16" height="16"></td>--%>
            <%--<td width="158" onMouseover="button_over(this);" onMouseout="button_out(this);"><a href="/sell/order_list" target="workspace">销售信息</a></td>--%>
        <%--</tr>--%>

    <%--</table>--%>
<%--</div>--%>





<%--<div id="KB8Parent" class="parent">--%>
    <%--<table width="190"><tr><td width="16" id="KB8f"><img src="../images/iGenericFolder.gif" width="16" height="16"></td>--%>
        <%--<td width="162">--%>
            <%--<a href="#" onClick="expandIt('KB8'); return false">客户管理</a></td>--%>
    <%--</tr></table>--%>
<%--</div>--%>
<%--<div id="KB8Child" class="child">--%>
    <%--<table width="190" border=0 cellpadding="0" cellSpacing=0>--%>
        <%--<tr>--%>
            <%--<td><img src="../images/ftv2vertline.gif"></td>--%>
            <%--<td><img src="../images/ftv2node.gif" width="16" height="22"></td>--%>
            <%--<td><img src="../images/iGenericAttribute.gif" width="16" height="16"></td>--%>
            <%--<td onMouseover="button_over(this);" onMouseout="button_out(this);"><a href="/customer/factory_list" target="workspace">厂商信息</a></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td width="8"><img src="../images/ftv2vertline.gif"></td>--%>
            <%--<td width="8"><img src="../images/ftv2node.gif" width="16" height="22"></td>--%>
            <%--<td width="16"><img src="../images/iGenericAttribute.gif" width="16" height="16"></td>--%>
            <%--<td width="158" onMouseover="button_over(this);" onMouseout="button_out(this);"><a href="/customer/customer_list" target="workspace">客户信息</a></td>--%>
        <%--</tr>--%>

        <%--<tr>--%>
            <%--<td><img src="../images/ftv2vertline.gif"></td>--%>
            <%--<td><img src="../images/ftv2node.gif" width="16" height="22"></td>--%>
            <%--<td><img src="../images/iGenericAttribute.gif" width="16" height="16"></td>--%>
            <%--<td onMouseover="button_over(this);" onMouseout="button_out(this);"><a href="/customer/visit_list" target="workspace">回访信息</a></td>--%>
        <%--</tr>--%>

    <%--</table>--%>
<%--</div>--%>




<div id="KB9Parent" class="parent"> </div>
<div id="KB9Child" class="child"></div>



<div id="KB10Parent" class="parent"></div>
<div id="KB10Child" class="child"> </div>
<div id="KB11Parent" class="parent"> </div>
<div id="KB11Child" class="child"> </div>
</body>
</html>
