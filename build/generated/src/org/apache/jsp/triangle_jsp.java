package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import az.webapp.Triangel;

public final class triangle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            function  f(){\n");
      out.write("                alert(\"Cliekced....\");\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <button onclick=\"f()\" >Click me</button>\n");
      out.write("        \n");
      out.write("        ");

           Triangel  t=new Triangel();
        try{
            double a=Double.parseDouble(request.getParameter("a"));
            double b=Double.parseDouble(request.getParameter("b"));
            double c=Double.parseDouble(request.getParameter("c"));
            
           
            t.setA(a);
            t.setB(b);
            t.setC(c);
            
            out.print("<br>Area is  "+t.getArea());
            out.print("<br>Perimeter is  "+t.getPerimetr());
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
      out.write("\n");
      out.write("          <form action=\"\"  method=\"GET\" >\n");
      out.write("            A:<input type=\"number\" name=\"a\" value=\"");
 out.print(t.getA()); 
      out.write("\" ><br/>\n");
      out.write("            B:<input type=\"number\" name=\"b\" value=\"");
 out.print(t.getB()); 
      out.write("\" ><br/>\n");
      out.write("            C:<input type=\"number\" name=\"c\" value=\"");
 out.print(t.getC()); 
      out.write("\" ><br/>\n");
      out.write("            <input type=\"submit\" value=\"Calculate\">\n");
      out.write("            \n");
      out.write("        </form>\n");
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
