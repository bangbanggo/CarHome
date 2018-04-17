<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link type="text/css" rel="stylesheet" href="../css/public.css">
</head>
<script language="javascript" type="text/javascript">
        var popUp; 
		function openwin(idname)
		{
			popUp = window.open('date.html?formname=form1&id=' + idname,
			'选择日期',
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
    <td background="../images/topBarBg.gif">系统管理：用户管理</td>
    <td width="20" height="23" background="../images/topBarBg.gif"><div align="right"><a href="#"><img src="../images/iHelp.gif" width="16" height="16" border="0"></a></div></td>
  </tr>
</table>


  <form action="deleteuser" method="post">
    <table class="tablelistcontent" width="100%" border="1" cellspacing="1">
      <tr>
        <th width="29"><input type="checkbox" name="checkbox" id="all" value="checkbox" onClick="checkAll()"></th>
        <th width="203">姓名</th>
        <th width="236">角色</th>
        <th width="224">权限</th>
        <th width="195">编辑</th>
      </tr>
      <c:forEach items="${usersList}" var="user">
      <tr class=Off onMouseOut="this.className='Off'" onMouseOver="this.className='Up'">
        <td height="24"><div align="center">
            <input type="checkbox" name="ids" value="${user.userid}">
        </div></td>
        <td><div align="center"><a href="viewuser.jsp">${user.username}</a></div></td>
        <td><div align="center">
          <c:forEach items="${user.roles}" var="role">
            ${role.rolename}&nbsp;&nbsp;
          </c:forEach>
        </div></td>
        <td><div align="center">
          <c:forEach items="${user.authorities}" var="authority">
            ${authority.authorityname}&nbsp;&nbsp;&nbsp;
          </c:forEach>
        </div></td>
        <td><div align="center"><a href="edituser?id=${user.userid}"><img src="../images/edit.gif" width="16" height="19" border="0"></a></div>
            <div align="center"></div></td>
      </tr>
      </c:forEach>
    </table>
    <table width="100%">
    <tr>
      <td height="40" width="10"><div align="center"></div></td>
      <td width="50"><div align="center">
        <input type="submit" name="Submit" value="删除">
          </div></td>
      <td width="50"><div align="center">
        <input type="button" name="Submit" value="添加" onClick="window.location.href='preadduser'">
      </div></td>
      <td width="86"><div align="center">
      </div></td>
      <td width="69"><div align="center">
      </div></td>
      <td width="69"><div align="center">
      </div></td>
      <td width="69"><div align="center">
	  </div></td>
      <td width="17"><div align="center"></div></td>
      <td width="19"><div align="center"><a href="listrole.do?page=1"><img src="../images/report/firstPage.gif" width="17" height="11" border="0"></a></div></td>
      <td width="19"><div align="center"><img src="../images/report/prePage.gif" width="14" height="11" border="0"></div></td>
      <td width="19"><div align="center"><img src="../images/report/nextPage.gif" width="14" height="11" border="0"></div></td>
      <td width="19"><div align="center"><a href="listrole.do?page=${pageSum}"><img src="../images/report/endPage.gif" width="17" height="11" border="0"></a></div></td>
      <td width="37"><div align="left"><a href="#">页次</a>:</div></td>
      <td width="37">&nbsp;</td>
      <td width="36"><div align="right">转至</div></td>
      <td width="35" align="center"><input name="go" type="text" size="2"></td>
      <td width="84" align="center"><input type="image" name="Submit2" src="../images/report/go.gif"></td>
	  <td width="0"></td>
    </tr>
</table>
  </form>
</body>
</html>
