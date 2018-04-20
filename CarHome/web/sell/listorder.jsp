<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>销售管理</title>
		  <script language="javascript" type="text/javascript" src="../js/birthday.js"></script>
<link type="text/css" rel="stylesheet" href="../css/public.css">
	<script src="../js/jquery.min.js" type="text/javascript"></script>
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_jumpMenu(targ,selObj,restore){ //v3.0
  eval(targ+".location='"+selObj.options[selObj.selectedIndex].value+"'");
  if (restore) selObj.selectedIndex=0;
}
//-->
</script>
</head>
<script language="javascript" type="text/javascript">
        var popUp; 
		function openwin(idname)
		{
			popUp = window.open('date.html?formname=form1&id=' + idname,
			'ѡ������',
			'height=180, width=200,left=300,top=150, toolbar=no, menubar=no, scrollbars=no, resizable=no, location=no, status=no');
		}

		function SetDate(id,newDate)
		{
			
			popUp.close();
			form1.elements[id].value = newDate;
		}
</script>
<body>
<table class="maintable" border="0" width="100%" cellspacing="0">
	<tr>
		<td background="../images/topBarBg.gif">销售管理</td>
		<td width="20" height="23" background="../images/topBarBg.gif">
		<div align="right"><a href="#"><img
			src="../images/iHelp.gif" width="16" height="16" border="0"></a></div>
		</td>
	</tr>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="0"
	bordercolor="#6490C2">
	<tr>
		<td width="25" height="24" background="../images/tab/firstLeftSel.gif">&nbsp;</td>
		<td width="100" background="../images/tab/middleSel.gif">
		<div align="center">销售信息</div>
		</td>
		<td width="50" background="../images/tab/lastRightSel.gif">&nbsp;</td>
		<td background="../images/tab/bg.gif">&nbsp;</td>
	</tr>
</table>
<form action="order_list" method="post">
<table class="maintable" border="0" width="100%" cellspacing="0">
	<tr>
		<td width="22%" height="48" class="searchfontlist">
		<div align="right">
		  <label>
		  <select name="select" onchange="chang_input_name(this)">
		    <option value="-1">请选择</option>
			<option value="order.orderid">订单号</option>
		    <option value="order.orderclientid">客户号</option>
		    <option value="order.ordercarid">车编号</option>
		    <option value="order.car.carname">车名称</option>
		    <option value="order.ordercreatedate">销售时间</option>
	      </select>
			  <script type="text/javascript">
					function chang_input_name(thisfiled){
						document.getElementById("area").name=thisfiled.value;
					}
			  </script>
		  </label>
		  ：</div>		</td>
		<td width="19%">
		<div align="left">
		  <input type='text' name='-1' id="area"/>
		</div>		</td>
		<td width="5%">&nbsp;</td>
	  <td width="54%"><label>　　
          <input type="submit" name="Submit3" value="查询" />
</label></td>
	</tr>
</table>
<p>&nbsp;</p>
</form>
<form action="order_delete" method="post">
<table class="tablelistcontent" width="100%" border="1" cellspacing="1">
	<tr>
		<th width="50"><label>
		  <input type="checkbox" name="checkbox2" value="checkbox">
	    </label></th>
		<th width="87">订单号</th>
		<th width="79">客户号</th>
		<th width="72">车编号</th>
		<th width="66">车名称</th>
		<th width="66"> 成交价</th>
		<th width="77">车类型</th>
		<th width="96">车流向</th>
		<th width="90">销售日期</th>
		<th width="69">销售状态</th>
	</tr>
	<c:forEach items="${ordersList}" var="orders">
	<tr class=Off onMouseOut="this.className='Off'"
		onMouseOver="this.className='Up'">
	  <td height="24"><div align="center">
	    <input type="checkbox" name="ordersList.orderid" value="${orders.orderid}">
	    </div></td>
	  <td><div align="center">${orders.orderid}</div></td>
	  <td><div align="center">${orders.orderclientid}</div></td>
	  <td><div align="center">${orders.ordercarid}</div></td>
	  <td><div align="center">${orders.car.carname}</div></td>
	  <td><div align="center">${orders.orderprice}</div></td>
	  <td><div align="center">${orders.car.carmodel}</div></td>
	  <td><div align="center">${orders.car.carto}</div></td>
	  <td><div align="center">${orders.ordercreatedate}</div></td>
	  <td><div align="center">${orders.orderstatus}</div></td>
	</tr>
	</c:forEach>

</table>
<table width="100%">
	<tr>
		<td height="40" align="center" valign="middle">
		<div align="left">
		  <label></label> 
		  
          <input type="submit" name="Submit"
			value="删除">
		</div>
		<div align="center"></div>
		<div align="center"></div>		</td>
		<td width="20">
		<div align="center"></div>		</td>
		<td width="20">
		<div align="center"><a href="listResume.do?page=1"><img
			src="../images/report/firstPage.gif" width="17" height="11"
			border="0"></a></div>		</td>
		<td width="20">
		<div align="center">
		  <c:if test="${showPage <= 1 }"></c:if>
		  <img
			src="../images/report/prePage.gif" width="14" height="11" border="0"></div>		</td>
		<td width="20">
		<div align="center">
		  <c:if test="${showPage >= pageSum }"></c:if>
		  <img
			src="../images/report/nextPage.gif" width="14" height="11" border="0"></div>		</td>
		<td width="20">
		<div align="center"><a href="listResume.do?page=${pageSum}"><img
			src="../images/report/endPage.gif" width="17" height="11" border="0"></div>		</td>
		<td width="40">
		<div align="left"><a href="#">页次</a></div>		</td>
		<td width="40">
		<div align="left"></div>		</td>
		<td width="40">
		<div align="right">转至</div>		</td>
		<td width="35" align="center"><input class="inputcontent"
			name="go" type="textfield" size="5"></td>
		<td width="80" align="center"><input type="image" name="Submit2" src="../images/report/go.gif"></td>
		<td width="6"></td>
	</tr>
</table>
</form>
</body>
</html>
