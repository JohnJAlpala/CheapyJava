package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import models.Mensaje;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/parts/navbar.jsp", out, false);
      out.write("\n");
      out.write("<!-- INICIO BODY -->\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-4\"> </div>\n");
      out.write("        <div class=\"col-4\">\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <div class=\"card center-item\">\n");
      out.write("                <div class=\"card-header\">\n");
      out.write("                    ");
      out.print(Mensaje.getMensajes().get("LogIn"));
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"action\">\n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"loginInputEmail\">");
      out.print(Mensaje.getMensajes().get("EMAIL"));
      out.write("</label>\n");
      out.write("                                <input id=\"loginInputEmail\" class=\"form-control\" type=\"email\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"loginInputPassword\">");
      out.print(Mensaje.getMensajes().get("Password"));
      out.write("</label>\n");
      out.write("                                <input id=\"loginInputPassword\" class=\"form-control\" type=\"password\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"text-right\">\n");
      out.write("                                <a href=\"menu.jsp\"><button type=\"submit\" class=\"btn btn-primary\">");
      out.print(Mensaje.getMensajes().get("LogIn"));
      out.write("</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                                <p >");
      out.print(Mensaje.getMensajes().get("LoginQuestion"));
      out.write("<a href=\"register.jsp\">");
      out.print(Mensaje.getMensajes().get("Registration"));
      out.write(" </a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-4\"></div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- FIN CONTAINER -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/parts/footer.jsp", out, false);
      out.write('\n');
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginAdmin != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <div class=\"alert alert-warning center-item\" style=\"text-align: center\">\n");
        out.write("                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginAdmin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                </div>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
