﻿<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
  <link type="text/css" rel="stylesheet" href="../css/public.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
</head>
<script type="text/javascript" >
  function checkUser() {
      
  }
</script>

<body>
<table border="0" width="100%" cellspacing="0">
  <tr>
    <td background="../images/topBarBg.gif" height="23">
    <div><strong>系统管理∶添加新用户</strong></div>
    </td>
  </tr>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="0" bordercolor="#6490C2">
  <tr>
    <td width="25" height="24" background="../images/tab/firstLeftSel.gif">&nbsp;</td>
    <td width="100" background="../images/tab/middleSel.gif"><div align="center"><span class="tabTitleSel">请填写内容</span></div></td>
    <td width="50" background="../images/tab/lastRightSel.gif">&nbsp;</td>
    <td background="../images/tab/bg.gif">&nbsp;</td>
  </tr>
</table>
<form action="adduser" method="post">
  <table class="maintable" width="100%" border="0" cellspacing="0">
    <tr>
      <td width="104"><div align="right">用户名：</div></td>
      <td width="201" height="24"><input name="users.useraccessname" type="text" class="inputcontent" id="username" size="20" onChange="checkUser()">        <span class="star">*</span></td>
    <td width="473"></td>
    </tr>
    <tr>
      <td width="104"><div align="right">用户密码：</div></td>
      <td height="24"><input name="users.useraccesspassword" type="password" class="inputcontent" id="password" size="20" maxlength="16" />
      <span class="star">*</span></td>
    <td height="24"></td>
    </tr>
    <tr>
      <td width="104"><div align="right">确认密码：</div></td>
      <td height="24"><input name="ensurePassword" type="password" class="inputcontent" id="ensurePassword" size="20" maxlength="16" />
        <span class="star">*</span></td>
    <td height="24"></td>
    </tr>
    <tr>
      <td width="104"><div align="right">姓名：</div></td>
      <td height="24"><input name="users.username" type="text" class="inputcontent" id="name" size="20">
	  <span class="star">*</span></td>
    <td height="24"></td>
    </tr>
    <tr>
      <td width="104"><div align="right">角色：</div></td>
      <td height="24" colspan="2">
        <c:forEach items="${rolesList}" var="role">
          <input type="checkbox" name="users.roles.roleid" value="${role.roleid}"/>${role.rolename}<br/>
        </c:forEach>
      </td>
    </tr>
  </table>
  <table align="right" width="100%">
    <tr>
      <td height="30" width="70"></td>
      <td width="65"><input type="submit" name="Submit" value="提交"></td>
      <td width="96"><div align="center">
          <label>
          <input type="button" name="Submit" value="返回" onClick="history.back()">
</label>
        </div></td>
      <td width="60">&nbsp;</td>
      <td width="486"></td>
    </tr>
    <tr>
      <td height="30" colspan="5" background="../images/tab/bg.gif"></td>
    </tr>
  </table>
</form>
</body>
</html>
