package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/jsp/menu.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\"  content=\"text/html; charset=UTF-8\">\r\n");
      out.write("            <title> Welcome to e-Banking System :: </title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body leftmargin=\"0\" topmargin=\"00\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("        <table width=\"775\" height=\"330\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td height=\"30\" colspan=\"2\">\r\n");
      out.write("                    <img src=\"images/BANNER.jpg\" width=\"775\" height=\"144\">\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"102\" valign=\"top\">\r\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLUC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://\"www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Welcome to e-Banking System :: </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table widtg=\"178\" borrder=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td><img src=\"images/ACCOUNT_TRANSFER.jpg\" width=\"178\" height=\"85\" border=\"0\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"10\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><img src=\"images/INTEREST_RATE.png\" width=\"178\" height=\"85\" border=\"0\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"10\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><img src=\"images/EXCHANGE_RATES.jpg\" width=\"178\" height=\"85\" border=\"0\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"10\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><img src=\"images/MOBILE_BANKING.jpg\" width=\"178\" height=\"85\" border=\"0\"></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("                <td width=\"601\" valign=\"top\">\r\n");
      out.write("                    <table width=\"567\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"8\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <div align=\"right\" style=\"color:#003366; font-family: Verdana; font-size-adjust: 2\">\r\n");
      out.write("                                    <a href =\"index.htm\">\r\n");
      out.write("                                        Home\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                     <a href =\"loginView.htm\">\r\n");
      out.write("                                        Login\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <table width=\"567\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td>\r\n");
      out.write("                                            <div align=\"justify\" style=\"color:#003366; font-size-adjust: 2; font-family: Verdana\">\r\n");
      out.write("                                                <br /><br />\r\n");
      out.write("                                                <strong>Welcome to ICHD Bank, the e-Banking System !!</strong><br /><br />\r\n");
      out.write("                                                        ICHD Bank was one of the first few private sector banks to receive approval from the Federal Reserve of US to set up a banking facility in 1986. The bank was incorporated in January 1986 as ICHD Bank with its registered office in Los Angeles, California, US. The corporate office of the bank is in Houstan, Texas, US. ICHD Bank commenced operations as a commercial bank in January, 1986.<br /><br />\r\n");
      out.write("                                                        The objective of the bank is to build sound relations with us customers, both individual and corporate, To achieve its objective, the bank maintains the highest level of ethical standards professional integrity, corporate governance, and regulatory compliance, ICHD Bank's business philosophy is based on the following two core values: <br/> - Customer Relationship <br/> - Service Excellence <br /><br />\r\n");
      out.write("                                                        ICHD Bank operates in a highly automated environment in terms of information technology and communication systems. All the branches of the bank have Automated Teller Machines (ATMs) to allow customers to have an easy access to their money.<br /><br />\r\n");
      out.write("                                                <strong>Retail Banking Services !!<br /></strong><br />\r\n");
      out.write("                                                        ICHD Bank provides retail banking services to its customers giving the ma one-stop platform for all their banking requirements. The bank also has a wide array of retail loan products including auto loans, loans against marketable securities, personal loans, and home loans.<br /><br />\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Welcome to e-Banking System :: </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table width=\"775\" border=\"0\" align=\"center\" cellpadding=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"799\" bgcolor=\"#124272\">\n");
      out.write("                    <center>\n");
      out.write("                        <p style=\"color:#FFFFFF; font-size-adjust:2; font-family:Verdana, Arial, Helvetica, sans-serif\">\n");
      out.write("                            Copyright & copy; 2006-2015 ICHD Bank !!\n");
      out.write("                        </p>\n");
      out.write("                    </center>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
