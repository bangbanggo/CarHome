﻿<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>客户管理</title>
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
		<td background="../images/topBarBg.gif">客户管理</td>
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
			<div align="center">客户回访信息</div>
		</td>
		<td width="50" background="../images/tab/lastRightSel.gif">&nbsp;</td>
		<td background="../images/tab/bg.gif">&nbsp;</td>
	</tr>
</table>
<form action="visit_list" method="post">
	<table class="maintable" border="0" width="100%" cellspacing="0">
		<tr>
			<td width="14%" height="31" class="searchfontlist">&nbsp;</td>
			<td width="30%">客户姓名：
				<label>
					<input type="text" name="feedback.client.clientname" />
				</label></td>
			<td width="6%" class="searchfontlist">&nbsp;</td>
			<td width="29%">回访时间：
				<label>

					<input type="text" name="feedback.feedbackdate" id="mailingTime" onClick="show_cele_date(this,'','',this)">
				</label></td>
			<td width="6%">&nbsp;</td>
			<td width="15%"><label>
				<input type="button" name="Submit2" value="查询">
			</label></td>
		</tr>
	</table>
</form>
<form action="visit_delete" method="post">
	<table class="tablelistcontent" width="100%" border="1" cellspacing="1">
		<tr>
			<th width="121">选择</th>
			<th width="183">客户姓名</th>
			<th width="210">回访时间</th>
			<th width="165">回访事件</th>
			<th width="208">回访记录</th>
		</tr>
		<c:forEach items="${feedbackList}" var="feedback">
		<tr class=Off onMouseOut="this.className='Off'"
			onMouseOver="this.className='Up'">
			<td height="24"><div align="center">
				<input type="checkbox" name="feedbackList.feedbackid"
					   value="${feedback.feedbackid}">
			</div></td>
			<td><div align="center">${feedback.client.clientname}</div></td>
			<td><div align="center">${feedback.feedbackdate}</div></td>
			<td><div align="center">${feedback.feedbackevent}</div></td>
			<td><div align="center">${feedback.feedbacklog}</div></td>
		</tr>
		</c:forEach>
	</table>
	<table width="100%">
		<tr>
			<td height="40">
				<div align="left">
					<input type="submit" name="Submit" value="删除记录"/>
					<input type="button" name="Submit" value="添加回访记录" onclick="window.location.href='visit_preadd'"/>
				</div>
				<div align="center"></div>
				<div align="center"></div>		</td>
			<td width="6"></td>
		</tr>
	</table>
</form>
</body>
</html>
