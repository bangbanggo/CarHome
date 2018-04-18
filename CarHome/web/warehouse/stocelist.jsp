<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="../css/public.css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_jumpMenu(targ,selObj,restore){ //v3.0
  eval(targ+".location='"+selObj.options[selObj.selectedIndex].value+"'");
  if (restore) selObj.selectedIndex=0;
}
//-->
</script>
<style type="text/css">
<!--
.style2 {
	font-size: 12px
}
-->
</style>
</head>
<body>
<table border="0" width="100%" cellspacing="0">
	<tr>
		<td background="../images/topBarBg.gif" height="23">仓库管理</td>
	</tr>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="0"
	bordercolor="#6490C2">
	<tr>
		<td width="25" height="24" background="../images/tab/firstLeftSel.gif">&nbsp;</td>
		<td width="100" background="../images/tab/middleSel.gif">
		<div align="center">仓库信息查看</div>
		</td>
		<td width="50" background="../images/tab/lastRightSel.gif">&nbsp;</td>
		<td background="../images/tab/bg.gif">&nbsp;</td>
	</tr>
</table>
<form name="form1" method="post" action="listCars">
  <label></label>
　　　　　仓库名：
<select name="warehouse.warehouseid">
	<option value="-1">请选择</option>
  <c:forEach items="${warehouseList}" var="warehouse">
	  <option value="${warehouse.warehouseid}">${warehouse.warehousename}</option>
  </c:forEach>
</select> 　　
汽车类型：
<label>
<select name="car.carname">
	<option value="-1">请选择</option>
  <c:forEach items="${names}" var="name" >
      <option value="${name}">${name}</option>
  </c:forEach>
</select>
</label> 　 
汽车型号：
<label>
<input type="text" name="car.carmodel">
</label>　　
<label>
<input type="submit" name="Submit" value="查询">
</label>
<p>&nbsp;</p>
</form>
<form name="list" action="addResume.do" method="post">
<table class="maintable" width="100%" border="0" cellspacing="0">
	<c:forEach items="${warehouseList}" var="warehouse">
	<tr>
		<td width="12%" height="27">
	  <div align="center">仓　　库：</div>		</td>
		<td width="13%"><div align="center">${warehouse.warehousename}</div></td>
		<td width="14%">&nbsp;</td>
		<td width="14%">&nbsp;</td>
		<td width="20%">
		  <div align="center">仓库存储量：</div></td>
		<td width="27%"><div align="center">${warehouse.warehousemaxstore}辆</div></td>
	</tr>
	<tr>
		<td colspan="6">
		<hr color="#99CCFF">		</td>
	</tr>
	<tr>
		<td height="23">
	  <div align="center">仓库地址：</div>		</td>
		<td colspan="5"><div align="center">${warehouse.warehouselocation}</div></td>
	</tr>
	<tr>
		<td colspan="6">
		<hr color="#99CCFF">		</td>
	</tr>
		<c:forEach items="${warehouse.cars}" var="car">
	<tr>
      <td><div align="center">汽车名称：</div></td>
	  <td><div align="center">${car.carname}</div></td>
	  <td><div align="center">型号：</div></td>
	  <td><div align="center">${car.carmodel}</div></td>
	  <td><div align="center">数　　量：</div></td>
	  <td><div align="center">${car.amount}辆</div></td>
    </tr>

	<tr>
		<td colspan="6">
		<hr color="#99CCFF">		</td>
	</tr>
		</c:forEach>
	</c:forEach>
</table>
<table align="center" width="100%">
	<tr>
		<td height="30">
		  <div align="center"></div></td>
	</tr>
	<tr>
		<td height="30" background="images/tab/bg.gif"></td>
	</tr>
</table>
</form>
</body>
</html>
