﻿<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="../css/public.css">
</head>
<body>
<table border="0" width="100%" cellspacing="0">
  <tr>
    <td background="../images/topBarBg.gif" height="23"><strong>
    <div class="searchfontlist"> &nbsp; 系统管理∶查看用户</div>
    </strong></td>
  </tr>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="0" bordercolor="#6490C2">
  <tr>`
    <td width="25" height="24" background="../images/tab/firstLeftSel.gif">&nbsp;</td>
    <td width="100" background="../images/tab/middleSel.gif"><div align="center"><span class="tabTitleSel">请填写内容</span></div></td>
    <td width="50" background="../images/tab/lastRightSel.gif">&nbsp;</td>
    <td background="../images/tab/bg.gif">&nbsp;</td>
  </tr>
</table>
<form   action="updateuser" method="post">
  <table class="maintable" width="100%" border="0" cellspacing="0">
    <tr>
      <td width="12">&nbsp;</td>
      <td width="128"><div align="right">用户名：</div></td>
      <td width="638" height="24">${users.useraccessname}<input type="hidden" name="users.userid" value="${users.userid}"></td>
    </tr>
    <tr>
      <td width="12">&nbsp;</td>
      <td width="128"><div align="right">用户密码：</div></td>
      <td height="24"><input type="password" name="users.useraccesspassword" value="${users.useraccesspassword}" /></td>
    </tr>
	    <tr>
      <td width="12">&nbsp;</td>
      <td width="128"><div align="right">姓名：</div></td>
      <td height="24"><input type="text" name="users.username" value="${users.username}"/> </td>

    <tr>
      <td width="12">&nbsp;</td>
      <td width="128"><div align="right">角色：</div></td>
      <td height="24">
        <c:forEach items="${rolesList}" var="role">
          <input
             name="users.roles.roleid" value="${role.roleid}" type="checkbox"
             <c:forEach items="${users.roles}" var="ro">
               <c:if test="${ro.roleid == role.roleid}">checked</c:if>
             </c:forEach>
          />${role.rolename}
        </c:forEach>
      </td>
    </tr>
  </table>
  <table align="right" width="100%">
    <tr>
      <td height="30" width="41"></td>
      <td width="85"><input type="submit" name="Submit" value="保存"></td>
      <td width="94"><div align="center">
          <label>          </label>
        </div></td>
      <td width="65">&nbsp;</td>
      <td width="475"></td>
    </tr>
    <tr>
      <td height="30" colspan="5" background="../images/tab/bg.gif"></td>
    </tr>
  </table>
</form>
</body>
</html>
