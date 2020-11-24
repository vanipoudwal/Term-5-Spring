package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Welcome to e-Banking System :: </title>\n");
      out.write("    </head>\n");
      out.write("    <body leftmargin=\"0\" topmargin=\"100\" marginwidth=\"0\" marginheight=\"0\">\n");
      out.write("        <table width=\"775\" height=\"330\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"30\" colspan=\"2\">\n");
      out.write("                    <img src=\"images/BANNER.jpg\" width=\"775\" height=\"144\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"102\" valign=\"top\">\n");
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
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td width=\"601\" valign=\"top\">\n");
      out.write("                    <table width=\"596\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacig=\"8\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <div align=\"right\" style=\"color:#003366; font-size-adjust: 2; font-family: Verdana\">\n");
      out.write("                                    <font>\n");
      out.write("                                        <a href=\"FundTransfer.htm\">\n");
      out.write("                                            Transfer Fund\n");
      out.write("                                        </a>\n");
      out.write("                                            &nbsp; || &nbsp;&nbsp;\n");
      out.write("                                        <a href=\"index.htm\">\n");
      out.write("                                            LogOut\n");
      out.write("                                        </a>\n");
      out.write("                                    </font>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <table width=\"567\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div align=\"justify\" style=\"color:#003366; font-size-adjust: 2; font-family: Verdana\">\n");
      out.write("                                                <br/><br/>\n");
      out.write("                                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${HelloMeassage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div align=\"justify\" style=\"color:#003366; font-size-adjust: 2; font-family: Verdana\">\n");
      out.write("                                                <br/><br/>\n");
      out.write("                                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${AccountNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div align=\"justify\" style=\"color:#003366; font-size-adjust: 2; font-family: Verdana\">\n");
      out.write("                                                <br/><br/>\n");
      out.write("                                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${AccountBalance}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        ");
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
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
