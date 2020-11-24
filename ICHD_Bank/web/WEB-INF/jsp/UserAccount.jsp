<%-- 
    Document   : UserAccount
    Created on : 26 Jul, 2020, 12:37:37 PM
    Author     : Vani Poudwal
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Welcome to e-Banking System :: </title>
    </head>
    <body leftmargin="0" topmargin="100" marginwidth="0" marginheight="0">
        <table width="775" height="330" border="0" align="center" cellpadding="0" cellspacing="0">
            <tr>
                <td height="30" colspan="2">
                    <img src="images/BANNER.jpg" width="775" height="144">
                </td>
            </tr>
            <tr>
                <td width="102" valign="top">
                    <%@include file="menu.jsp"%>
                </td>
                <td width="601" valign="top">
                    <table width="596" border="0" align="center" cellpadding="0" cellspacig="8">
                        <tr>
                            <td>
                                <div align="right" style="color:#003366; font-size-adjust: 2; font-family: Verdana">
                                    <font>
                                        <a href="FundTransfer.htm">
                                            Transfer Fund
                                        </a>
                                            &nbsp; || &nbsp;&nbsp;
                                        <a href="index.htm">
                                            LogOut
                                        </a>
                                    </font>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <table width="567" border="0" align="center" cellpadding="0" cellspacing="0">
                                    <tr>
                                        <td>
                                            <div align="justify" style="color:#003366; font-size-adjust: 2; font-family: Verdana">
                                                <br/><br/>
                                                ${HelloMeassage}
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <div align="justify" style="color:#003366; font-size-adjust: 2; font-family: Verdana">
                                                <br/><br/>
                                                ${AccountNumber}
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <div align="justify" style="color:#003366; font-size-adjust: 2; font-family: Verdana">
                                                <br/><br/>
                                                ${AccountBalance}
                                            </div>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
        <%@include file="footer.jsp" %>
    </body>
</html>
