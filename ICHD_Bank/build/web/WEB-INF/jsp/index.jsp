<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type"  content="text/html; charset=UTF-8">
            <title> Welcome to e-Banking System :: </title>
    </head>

    <body leftmargin="0" topmargin="00" marginwidth="0" marginheight="0">
        <table width="775" height="330" border="0" align="center" cellpadding="0" cellspacing="0">
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
                    <table width="567" border="0" align="center" cellpadding="0" cellspacing="8">
                        <tr>
                            <td>
                                <div align="right" style="color:#003366; font-family: Verdana; font-size-adjust: 2">
                                    <a href ="index.htm">
                                        Home
                                    </a>
                                     <a href ="loginView.htm">
                                        Login
                                    </a>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <table width="567" border="0" align="center" cellpadding="0" cellspacing="0">
                                    <tr>
                                        <td>
                                            <div align="justify" style="color:#003366; font-size-adjust: 2; font-family: Verdana">
                                                <br /><br />
                                                <strong>Welcome to ICHD Bank, the e-Banking System !!</strong><br /><br />
                                                        ICHD Bank was one of the first few private sector banks to receive approval from the Federal Reserve of US to set up a banking facility in 1986. The bank was incorporated in January 1986 as ICHD Bank with its registered office in Los Angeles, California, US. The corporate office of the bank is in Houstan, Texas, US. ICHD Bank commenced operations as a commercial bank in January, 1986.<br /><br />
                                                        The objective of the bank is to build sound relations with us customers, both individual and corporate, To achieve its objective, the bank maintains the highest level of ethical standards professional integrity, corporate governance, and regulatory compliance, ICHD Bank's business philosophy is based on the following two core values: <br/> - Customer Relationship <br/> - Service Excellence <br /><br />
                                                        ICHD Bank operates in a highly automated environment in terms of information technology and communication systems. All the branches of the bank have Automated Teller Machines (ATMs) to allow customers to have an easy access to their money.<br /><br />
                                                <strong>Retail Banking Services !!<br /></strong><br />
                                                        ICHD Bank provides retail banking services to its customers giving the ma one-stop platform for all their banking requirements. The bank also has a wide array of retail loan products including auto loans, loans against marketable securities, personal loans, and home loans.<br /><br />
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
    <%@include file="footer.jsp"%>
    </body>
</html>
