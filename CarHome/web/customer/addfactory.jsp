﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="../css/public.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>


	<body>
		
		<table
			border="0"
			width="100%"
			cellspacing="0">
			<tr>
				<td
					background="../images/topBarBg.gif"
					height="23">
					<strong>
						<div class="searchfontlist">

							系统管理∶修改用户
						</div> </strong>
				</td>
			</tr>
		</table>
		<table
			width="100%"
			border="0"
			cellpadding="0"
			cellspacing="0"
			bordercolor="#6490C2">
			<tr>
				<td
					width="25"
					height="24"
					background="../images/tab/firstLeftSel.gif">&nbsp;
					
				</td>
				<td
					width="100"
					background="../images/tab/middleSel.gif">
					<div align="center">
						<span class="tabTitleSel">请填写内容</span>
					</div>
				</td>
				<td
					width="50"
					background="../images/tab/lastRightSel.gif">&nbsp;
					
				</td>
				<td background="../images/tab/bg.gif">&nbsp;
					
				</td>
			</tr>
		</table>
		<form
			action="/customer/factory_add"
			method="post">
			<table
				class="maintable"
				width="100%"
				border="0"
				cellspacing="0">
				<tr>
					<td width="104">
						<div align="right">厂商编号：						</div>					</td>
				  <td
						width="201"
						height="24">
						<input
							name="factory.factoryno"
							type="text"
							class="inputcontent"
							size="20"
							readonly="true"></td>
					<td width="473">
															</td>
				</tr>
				<tr>
					<td width="104">
						<div align="right">
							厂商名：						</div>					</td>
				  <td height="24">
						<input
							name="factory.factoryname"
							type="text"
							class="inputcontent"
							size="20"
							maxlength="16" /></td>
					<td height="24">
													</td>
				</tr>
			
				<tr>
					<td width="104">
						<div align="right">
							厂商联系人：										</td>
				  <td height="24">
						<input
							name="factory.factorylinkman"
							type="text"
							class="inputcontent"
							size="20"
							maxlength="16" /></td>
					<td height="24">
													</td>
				</tr>
				
				
				<tr>
					<td width="104">
						<div align="right">
							厂商联系电话：						</div>					</td>
				  <td height="24">
						<input
							name="factory.factorylinktel"
							type="text"
							class="inputcontent"
							size="20"
							maxlength="16" /></td>
					<td height="24">
						
				
				<tr>
					<td width="104">
						<div align="right">
							厂商邮编：						</div>					</td>
				  <td height="24">
						<input
							name="factory.factorymailcode"
							type="text"
							class="inputcontent"
							id="text"
							size="20"
							maxlength="16" /></td>
					<td height="24">
															</td>
				</tr>
				
				<tr>
					<td width="104">
						<div align="right">
				  厂商地址：						</div>					</td>
				  <td height="24"><input
							name="factory.factoryaddress"
							type="text"
							class="inputcontent"
							size="20"></td>
					<td height="24">
														</td>
				</tr>
			</table>
			<table
				align="right"
				width="100%">
				<tr>
					<td
						height="30"
						width="70"></td>
					<td width="65">
						<input
							type="submit"
							name="Submit"
							value="确定">
					</td>
					<td width="96">
						<div align="center">
							<label>
								<input
									type="button"
									name="Submit"
									value="返回"
									>
							</label>
						</div>
					</td>
					<td width="60">&nbsp;
						
				  </td>
					<td width="486"></td>
				</tr>
				<tr>
					<td
						height="30"
						colspan="5"
						background="../images/tab/bg.gif"></td>
				</tr>
			</table>
			
		</form>
	</body>
</html>
