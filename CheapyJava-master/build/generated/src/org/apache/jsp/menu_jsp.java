package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import models.Mensaje;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/parts/navbar.jsp", out, false);
      out.write("\n");
      out.write("<head>        \n");
      out.write("\t<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"https://e-cdns-files.dzcdn.net/cache/images/common/favicon/favicon.8a0b99d601c22e9d77e0e74eaa1da941.ico\">\n");
      out.write("\n");
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
      out.write("            a{\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            a:active{\n");
      out.write("                color: white;\n");
      out.write("                text-decoration:none;\n");
      out.write("            }\n");
      out.write("            a:visited {\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\t\n");
      out.write("            a:hover{\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("                    \n");
      out.write("                    \n");
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
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    \n");
      out.write("    <!-- Start Table -->\n");
      out.write("    <div class=\"row table-padding\">\n");
      out.write("        <table class=\"table\">\n");
      out.write("            <thead class=\"thead-dark\">\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"col\">#</th>\n");
      out.write("                    <th scope=\"col\">");
      out.print(Mensaje.getMensajes().get("Song"));
      out.write("</th>\n");
      out.write("                    <th scope=\"col\">");
      out.print(Mensaje.getMensajes().get("Artist"));
      out.write("</th>\n");
      out.write("                    <th scope=\"col\">");
      out.print(Mensaje.getMensajes().get("Album"));
      out.write("</th>\n");
      out.write("                    <th scope=\"col\">Action</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"row\">id</th>\n");
      out.write("                    <td> SONG 1 </td>\n");
      out.write("                    <td> ARTIST 1</td>\n");
      out.write("                    <td>ALBUM 1</td>\n");
      out.write("                    <td>\n");
      out.write("                        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\" method=\"POST\">\n");
      out.write("                            <input type=\"hidden\" name=\"d--elete\" value=\"id\"/>\n");
      out.write("                            <button class=\"btn btn-danger btn-rounded btn-sm my-0\" type=\"submit\">\n");
      out.write("                                <i class=\"fa fa-times\"></i>\n");
      out.write("                            </button>\n");
      out.write("                        </form>                  \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Table -->\n");
      out.write("    <!-- Searchbar -->\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-3\"></div>\n");
      out.write("        <div class=\"col-6\">\n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\" method=\"POST\">\n");
      out.write("                <div class=\"input-group center-item\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"txtSearch\" name=\"txtSearch\" placeholder=\"Busqueda\"/>\n");
      out.write("                    <div class=\"input-group-append\">\n");
      out.write("                        <button class=\"btn btn-outline-secondary\" type=\"submit\" id=\"searchButton\" onclick=\"app.search()\">\n");
      out.write("                            <i class=\"fas fa-search\"></i>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Searchbar -->\n");
      out.write("    \n");
      out.write("    <!-- Start Table -->\n");
      out.write("    <br>\n");
      out.write("    <h3 class=\"text-center\"> Resultados: </h3>\n");
      out.write("    <div class=\"row table-padding\">\n");
      out.write("        <table class=\"table\">\n");
      out.write("            <thead class=\"thead-dark\">\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"col\">#</th>\n");
      out.write("                    <th scope=\"col\">");
      out.print(Mensaje.getMensajes().get("Song"));
      out.write("</th>\n");
      out.write("                    <th scope=\"col\">");
      out.print(Mensaje.getMensajes().get("Artist"));
      out.write("</th>\n");
      out.write("                    <th scope=\"col\">");
      out.print(Mensaje.getMensajes().get("Album"));
      out.write("</th>\n");
      out.write("                    <th scope=\"col\">Action</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"row\">id</th>\n");
      out.write("                    <td> SONG 1 </td>\n");
      out.write("                    <td> ARTIST 1</td>\n");
      out.write("                    <td>ALBUM 1</td>\n");
      out.write("                    <td>\n");
      out.write("                        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\" method=\"POST\">\n");
      out.write("                            <input type=\"hidden\" name=\"add\" value=\"id\"/>\n");
      out.write("                            <button class=\"btn btn-success btn-rounded btn-sm my-0\" type=\"submit\">\n");
      out.write("                                <i class=\"fa fa-check\"></i>\n");
      out.write("                            </button>\n");
      out.write("                        </form>                  \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Table -->\n");
      out.write("</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/parts/footer.jsp", out, false);
      out.write('\n');
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
}
