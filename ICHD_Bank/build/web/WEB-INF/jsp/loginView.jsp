<%-- 
    Document   : loginView
    Created on : 26 Jul, 2020, 12:36:38 PM
    Author     : Vani Poudwal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags"  prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to e-Banking :: </title>
    </head>
    <body leftmargin="0" topmargin="00" marginwidth="0" marginheight="0">
        <table width="775" height="330" border="0" align="centerr" cellpadding="0" cellspacing="0">
            <tr>
                <td height="30" colspan="2">
                    <img src="images/BANNER.jpg" width="775" height="144">
                </td>
            </tr>
            <tr>
                <td width="102" valign="top">
                    <%@include file="menu.jsp" %>
                </td>
                <td width="601" valign="top">
                    <table width="596" border="0" align="center" cellpadding="0" cellspacing="8">
                        <tr>
                            <td>
                                <div align="right" style="color:#003366; font-size-adjust:2; font-family: Verdana">
                                    <a href="index.htm">
                                        Home
                                    </a>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <table wodth="567" border="0" align="center" cellpadding="0" cellspacing="0">
                                    <tr>
                                        <td>
                                            <div align="justify" style="color:#003366; font-size-adjust:2; font-family: Verdana">
                                                <br/><br/>
                                                <spring:nestedPath path="CUSTOMER">
                                                    <form name="form1" method="post" action="">
                                                        <table width="312" border="0" align="center" cellpadding="5" cellspacing="0">
                                                            <tr bgcolor="#336699">
                                                                <td colspan="2" height="25" valign="top" align="center">
                                                                    <p style="color:white; font-size-adjust: 2; font-family: Verdana, Arial, Helvetica, sans-serif">
                                                                       Log In
                                                                    </p>
                                                                </td>
                                                            </tr>
                                                            <tr bgcolor="#F7F6F2">
                                                                <td width="139" height="35" valign="top">
                                                                    <p style="color:#336699; font-size-adjust: 2; font-family: Verdana, Arial, Helvetica, sans-serif">
                                                                        *User Name
                                                                    </p>
                                                                </td>
                                                                <td width="147" valign="top">
                                                                    <p>
                                                                        <spring:bind path="UserName">
                                                                            <input type="text" name="${status.expression}" value="${status.value}">
                                                                        </spring:bind>
                                                                    </p>
                                                                </td>
                                                            </tr>
                                                            <tr bgcolor="#F7F6F2">
                                                                <td height="36" valign="top">
                                                                    <p style="color:#336699; font-size-adjust: 2; font-family: Verdana, Arial, Helvetica, sans-serif">
                                                                        *PassWord
                                                                    </p>
                                                                </td>
                                                                <td valign="top">
                                                                    <p>
                                                                        <spring:bind path="Password">
                                                                            <input type="password" name="${status.expression}" value="${status.value}">
                                                                        </spring:bind>
                                                                    </p>
                                                                </td>
                                                            </tr>
                                                            <tr bgcolor="#F7F6F2">
                                                                <td></td>
                                                                <td>
                                                                    <input type="Submit" name="Submit" value="Login">
                                                                    <input type="Reset" name="Reset" value="Clear">
                                                                </td>
                                                            </tr>
                                                        </table>
                                                    </form>
                                                </spring:nestedPath>
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
