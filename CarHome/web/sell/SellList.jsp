﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
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
	<form action="SellDel.do" method=post>
		<table
			class="maintable"
			border="0"
			width="100%"
			cellspacing="0">
			<tr>
				<td background="../images/topBarBg.gif">
					订单列表
				</td>
				<td
					width="20"
					height="23"
					background="images/topBarBg.gif">
					<div align="right">
						<a href="#"><img
								src="images/iHelp.gif"
								width="16"
								height="16"
								border="0">
						</a>
					</div>
				</td>
			</tr>
		</table>


        <p>
          <label>　　　<br>
          　　　　
          <select name="select">
            <option>订单号</option>
            <option>客户号</option>
            <option>车名称</option>
            <option>车类型</option>
          </select>
          ：          </label>
          <label>
          <input type="text" name="textfield">
          </label>
      　　　销售时间：
      <label>
      <input type="text" name="mailingTime" id="mailingTime" onClick="show_cele_date(this,'','',this)">
      </label>
      　　　
      <label>
      <input type="button" name="Submit" value="查询">
      </label>
      </p>
        <label></label>
        <p>
          <label></label></p>
        <p>&nbsp;</p>
        <table
				class="tablelistcontent"
				width="100%"
				border="1"
				cellspacing="1">
				
				<tr>
					<th width="29">
						<input
							type="checkbox"
							name="all"
							id="all"
							onClick="checkAll()">
					</th>
					<th width="203">
						订单号
					</th>
					<th width="236">
						客户号
					</th>
					<th width="224">
						车名称
					</th>
					<th width="195">
						车类型
					</th>
					<th width="196">
						销售时间
					</th>
					<th width="195">
						状态
					</th>
				</tr>

			

					<tr
						class=Off
						onMouseOut="this.className='Off'"
						onMouseOver="this.className='Up'">
						<td height="24">
							<div align="center">
								<input
									type="checkbox"
									name="del"
									value="">
							</div>
						</td>
						<td>
							<div align="center">
								1
							</div>
						</td>
						<td>
							<div align="center">
								1
							</div>
						</td>
						<td>
							<div align="center">
								法拉利
							</div>
						</td>
						<td>
							<div align="center">
								XX001
							</div>
						</td>
						<td>
							<div align="center">
								2008-08-08
							</div>
						</td>
						<td>
							<div align="center">
								<a href="">售出</a>
							</div>
						</td>
					</tr>





					<tr
						class=Off
						onMouseOut="this.className='Off'"
						onMouseOver="this.className='Up'">
						<td height="24">
							<div align="center">
								<input
									type="checkbox"
									name="del"
									value="">
							</div>
						</td>
						<td>
							<div align="center">
								2
							</div>
						</td>
						<td>
							<div align="center">
								2
							</div>
						</td>
						<td>
							<div align="center">
								宝马
							</div>
						</td>
						<td>
							<div align="center">
								bmw
							</div>
						</td>
						<td>
							<div align="center">
								2008-08-08
							</div>
						</td>
						<td>
							<div align="center">
								<a href="">售出</a>
							</div>
						</td>
					</tr>
				

	  </table>
	        <p>
	          <input name="submit" type="submit" value="删除">
      </p>
	        <p>&nbsp;        </p>
	</form>
	</body>
</html>
