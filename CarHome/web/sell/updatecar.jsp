<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
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
						<div class="searchfontlist">销售信息</div> 
					</strong>
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
						<span class="tabTitleSel">汽车移库</span></div>
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
			action="change"
			method="post"
			onSubmit="return subUser()">
			<table
				class="maintable"
				width="100%"
				border="0"
				cellspacing="0">
				<c:forEach items="${cars}" var="car">
				<tr>
					<td width="104" bgcolor="#6495ed">
						<div align="right">
							汽车编号：<input type="hidden" name="store.carid" value="${car.carid}"></div>					</td>
					<td
						width="201"
						height="24">${car.carid}
				    <span class="star">*</span>					</td>
					<td width="473">
															</td>
				</tr>
				<tr>
					<td width="104">
						<div align="right">
							汽车名称：						</div>					</td>
					<td height="24">${car.carname}
						<span class="star">*</span>					</td>
					<td height="24">
													</td>
				</tr>
				<tr>
					<td width="104">
						<div align="right">
							汽车型号：						</div>					</td>
					<td height="24">
						${car.carmodel}
				    <span class="star">*</span>					</td>
					<td height="24">
													</td>
				</tr>
				<tr>
					<td width="104">
						<div align="right">汽车颜色：						</div>					</td>
					<td height="24">
						${car.carcolor}
						<span class="star">*</span>					</td>
					<td height="24">
																</td>
				</tr>
				<tr>
					<td width="104">
						<div align="right">原仓库：						</div>					</td>
					<td height="24">
						<input type="hidden" name="store.prewarehouseid" value="${car.warehouseid}" />${car.warehousename}
						<span class="star">*</span>					</td>
					<td height="24">
																</td>
				</tr>
				</c:forEach>
				<tr>
					<td width="104">
						<div align="right">
							更换至仓库：						</div>					</td>
					<td
						height="24"
						colspan="2">
						<span class="star"> <select name="store.warehouseid">
						<option value="-1">请选择</option>
						<c:forEach items="${warehouseList}" var="warehouse">
							<option value="${warehouse.warehouseid}">${warehouse.warehousename}</option>
						</c:forEach>
					</select> 　　
								
							</select> *</span>					</td>
				</tr>
			</table>
			<table
				align="right"
				width="100%">
				<tr>
					<td
							height="30"
							width="70"></td>
					<td  colspan="4">移动数量：<input type="text" name="store.amount"/>辆</td>
				</tr>
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
