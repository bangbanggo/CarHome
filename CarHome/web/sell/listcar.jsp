<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="../css/public.css">
<script language="javascript" type="text/javascript" src="../js/birthday.js"></script>
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
		<div align="center">汽车信息</div>
		</td>
		<td width="50" background="../images/tab/lastRightSel.gif">&nbsp;</td>
		<td background="../images/tab/bg.gif">&nbsp;</td>
	</tr>
</table>
<form action="carDetail" method="post">
<table class="maintable" border="0" width="100%" cellspacing="0">
  <tr>
    <td height="27" class="searchfontlist"  ><div align="right">汽车属性：:</div></td>
    <td colspan="2"  align="center">
		<table width="100%">
			<tr>
				<td>汽车名称<input type="text" name="car.carname"></td>
				<td> 汽车型号<input type="text" name="car.carmodel"></td>
			</tr>
			<tr>
				<td>汽车颜色<input type="text" name="car.carcolor"></td>
				<td>
					仓库名：
					<select name="car.warehouseid">
						<option value="-1">请选择</option>
						<c:forEach items="${warehouseList}" var="warehouse">
							<option value="${warehouse.warehouseid}">${warehouse.warehousename}</option>
						</c:forEach>
					</select> 　　</td>
			</tr>
		</table>
	</td>
    <td>　
      <div align="center"></div>
      <div align="center"></div>
      　 
    </td>
  </tr>
	<tr>
		<td width="22%" height="40" class="searchfontlist">
	  <div align="right">生产日期：:</div>	  </td>
		<td width="22%"><label>
		  <input type="text" name="mailingTime2" id="mailingTime2" onClick="show_cele_date(this,'','',this)">
	  </label></td>
		<td width="35%">
	      <div align="center">入库日期：
	        <label>
	        <input type="text" name="mailingTime" id="mailingTime" onClick="show_cele_date(this,'','',this)">
	        </label>
      　　</div></td>
		<td width="21%">　
		  <label>
		  <input type="submit" name="Submit" value="查询">
		  </label>
		  <div align="center"></div>
		  <div align="center"></div>      </td>
	</tr>
</table>
</form>
<form action="preChange" method="post">
<table class="tablelistcontent" width="100%" border="1" cellspacing="1">
	<tr>
		<th width="45"><label>
		  <input type="checkbox" name="checkbox2" value="checkbox">
      </label></th>
		<th width="67">汽车编号</th>
		<th width="74">汽车名称</th>
		<th width="75">汽车型号</th>
		<th width="59">汽车颜色</th>
		<th width="60">发动机号</th>
		<th width="68">生产地</th>
		<th width="87"><div align="center">生产日期</div></th>
		<th width="87">入库日期</th>
		<th width="79">车辆流向</th>
		<th width="61">汽车描述</th>
		<th width="68">所属仓库</th>
	</tr>
	<c:forEach items="${carsList}" var="car">
	<tr class=Off onMouseOut="this.className='Off'"
		onMouseOver="this.className='Up'">
	  <td height="24"><div align="center">
	    <input type="radio" name="choice" value="${car.carid}/${car.warehouseid}"/>
	    </div></td>
	  <td><div align="center">${car.carid}</div></td>
	  <td><div align="center">${car.carname}</div></td>
	  <td><div align="center">${car.carmodel}</div></td>
	  <td><div align="center">${car.carcolor}</div></td>
	  <td><div align="center">${car.carmobile}</div></td>
	  <td><div align="center">${car.carfrom}</div></td>
	  <td><div align="center">${car.carcreatedate}</div></td>
	  <td><div align="center">${car.carindate}</div></td>
	  <td><div align="center">${car.carto}</div></td>
	  <td><div align="center">${car.cardescription}</div></td>
	  <td><div align="center">${car.warehousename}</div></td>
	  </tr>
	</c:forEach>
</table>
<table width="100%">
	<tr>
		<td height="40" align="center" valign="middle">
		<div align="left">
		  <label></label>
		  <input type="submit" name="Submit3" value="汽车移库">
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
