package org.apache.jsp.parts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import models.Mensaje;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"https://e-cdns-files.dzcdn.net/cache/images/common/favicon/favicon.8a0b99d601c22e9d77e0e74eaa1da941.ico\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cheapify</title>\n");
      out.write("       \n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                font-family: monospace;\n");
      out.write("            }\n");
      out.write("            img.centro{\n");
      out.write("                display: block;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                margin-left: 40%;\n");
      out.write("                margin-right: auto;\n");
      out.write("            }\n");
      out.write("            .btn{\n");
      out.write("                background-color: black;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                .pull-right{\n");
      out.write("                    margin-top: 0px;\n");
      out.write("                    margin-right: 9%;\n");
      out.write("                }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- INICIO NAVBAR -->\n");
      out.write("        <nav class=\"navbar navbar-dark bg-dark\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Cheapyfy</a>\n");
      out.write("            <div>\n");
      out.write("                <!--<a class=\"btn btn-success\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/register\">Register</a>-->\n");
      out.write("                <a class=\"btn btn-success\" href=\"index.jsp\">Inicio</a>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    <a href=\"index.jsp\"><img class=\"centro\" src=\"image/logo Cheapify2.png\" style=\"width:20%; height:auto; object-fit:cover;\" alt=\"Zoof\"></a>\n");
      out.write("    <div class=\"container text-center\" style=\"width:100%; font-family: monospace; margin-top: 10px;\">\n");
      out.write("        <h1><b>");
      out.print(Mensaje.getMensajes().get("Indexwelcome"));
      out.write("</b></h1>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"text-center\" >\n");
      out.write("        <form method=\"GET\" action=\"./Index\">\n");
      out.write("                <div class=\"btn-group\">\n");
      out.write("                    \n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary btn-lg\" name =\"accion\" value=\"Registrar\">Registrar</button>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary btn-lg\" name =\"accion\" value=\"Iniciar sesion\">Iniciar sesion</button>\n");
      out.write("                    <button onclick=\"myFunction()\" type=\"submit\" class=\"btn btn-primary btn-lg\" name =\"accion\" value=\"ficticios\">Datos ficticios</button>\n");
      out.write("                    \n");
      out.write("                    <script>\n");
      out.write("                        function myFunction() {\n");
      out.write("                            alert('Se han creado datos ficticios');\n");
      out.write("                        }\n");
      out.write("                    </script>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("                \n");
      out.write("        <!-- END NAVBAR -->\n");
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
