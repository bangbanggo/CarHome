<%--
  Created by IntelliJ IDEA.
  User: gwb10
  Date: 2018/4/16
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="css/public.css" rel="stylesheet" type="text/css" />
    <script language="javascript">
        var showFlag=1;

        //显示/隐藏顶部及nav.
        function showHideHdNav()
        {
            var topFrameset=top.document.getElementById("top");
            if(showFlag==1)//当前显示,隐藏
            {
                top.splitor.splitor.showHide(0);
                topFrameset.rows="0,*,0";
                showFlag=0;
            }
            else
            {
                top.splitor.splitor.showHide(1);
                topFrameset.rows="101,*,23";
                showFlag=1;
            }
        }
    </script>
    <title></title>
</head>
<body>
<div class="topBar">
    <table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0" >
        <tr>
            <td><span id="otherTools">
        <table width="100%" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td width="100%"></td>
            <td width="20"><img class="pointer" src="images/iCollapseAll.gif" width="16" height="16" hspace="5" align="middle" alt="折叠" title="折叠" /></td>
            <td width="20"><img class="pointer" src="images/iRefresh.gif" width="16" height="16" hspace="5" align="middle" alt="刷新" title="刷新" />
            <td>
          </tr>
        </table>
        </span> </td>
            <td width="20"><img class="pointer" src="images/iShowHide.gif" width="16" height="16" hspace="5" align="middle" alt="隐藏/显示" title="隐藏/显示" onClick="javascript:showHideHdNav();" /></td>
        </tr>
    </table>
</div>
</body>
</html>

