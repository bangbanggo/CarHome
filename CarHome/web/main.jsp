<%--
  Created by IntelliJ IDEA.
  User: gwb10
  Date: 2018/4/16
  Time: 18:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="css/public.css" rel="stylesheet" type="text/css" />
    <title>汽车销售管理系统</title>
</head>
<frameset id="top" rows="101,*,23" border="0" frameborder="0">
    <frame name="header" frameborder="0" src="header.jsp" noresize="noresize" scrolling="no" marginheight="0" marginwidth="0" />
    <frameset id="middle" cols="190,7,*" border="0" frameborder="0">
        <frameset rows="23,*" border="0" frameborder="0">
            <frame name="modNavTop" frameborder="0" src="modNavTop.jsp" noresize="noresize" scrolling="no" marginheight="0" marginwidth="0" />
            <frame name="modNav" frameborder="0" src="menu" noresize="noresize" scrolling="auto" marginheight="0" marginwidth="0" />
        </frameset>
        <frame name="splitor" frameborder="0" src="splitor.jsp" noresize="noresize" scrolling="no" marginheight="0" marginwidth="0" />
        <frame name="workspace" frameborder="0" src="welcome.jsp" scrolling="yes" marginheight="0" marginwidth="0" />
    </frameset>
    <frame name="footer" frameborder="0" src="footer.jsp" noresize="noresize" scrolling="no" marginheight="0" marginwidth="0" />
</frameset>
<noframes></noframes>
</html>