package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/include/header.jsp");
    _jspx_dependants.add("/include/navbar.jsp");
    _jspx_dependants.add("/include/footer.jsp");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"admin/layout/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"admin/layout/css/all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"layout/css/owen.css\">\n");
      out.write("    <title>Movie</title>\n");
      out.write("</head>\n");
      out.write("<body>");
      out.write('\n');
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-dark\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"index.php\">????</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav m-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"index.php\">???????? <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\">???? ???</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\">???????</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\">??????</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\">????? ????</a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    <form action=\"\" class=\"form-inline my-2 my-lg-0\">\n");
      out.write("      <input class=\"form-control mr-sm-2\" name=\"search\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("      <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">???</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write('\n');
      out.write('\n');
      out.write("<footer>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"section col-4\">\n");
      out.write("            <h5>??????</h5>\n");
      out.write("            <hr>\n");
      out.write("            <ul>\n");
      out.write("                <li>???? ?????????</li>\n");
      out.write("                <li>????? ????????</li>\n");
      out.write("                <li>????? ????? ????? ????????</li>\n");
      out.write("                <li>????? ???????</li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"section col-4\">\n");
      out.write("            <h5>?????</h5>\n");
      out.write("            <hr>\n");
      out.write("            <ul>\n");
      out.write("                <li>????? ?????</li>\n");
      out.write("                <li>???? ??????? ???????</li>\n");
      out.write("                <li>?????? ?? ??? ??????</li>\n");
      out.write("                <li>?????? ?????</li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"section col-4\">\n");
      out.write("            <h5>?????????</h5>\n");
      out.write("            <hr>\n");
      out.write("            <ul>\n");
      out.write("                <li>blog</li>\n");
      out.write("                <li>instgram</li>\n");
      out.write("                <li>discord</li>\n");
      out.write("                <li>forum</li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"admin/layout/js/jquery.js\"></script>\n");
      out.write("<script src=\"admin/layout/js/all.min.js\"></script>\n");
      out.write("<script src=\"admin/layout/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("<script src=\"layout/js/owen.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
