/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.61
 * Generated at: 2015-04-23 05:17:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>YoTub | Redefining YouTube</title>\r\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("<!-- <script src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script> -->\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"css/grayscale.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("    <!--<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>-->\r\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type= \"text/javascript\">\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("\tif (localStorage.chkbx && localStorage.chkbx != '' && localStorage.chkbx != null) {\r\n");
      out.write("\t\t$('#remember_me').attr('checked', 'checked');\r\n");
      out.write("        $('#inputEmail').val(localStorage.usrname);\r\n");
      out.write("        $('#inputPassword').val(localStorage.pass);\r\n");
      out.write("    } \r\n");
      out.write("\telse{\r\n");
      out.write("\t\t$('#remember_me').removeAttr('checked');\r\n");
      out.write("        $('#inputEmail').val('');\r\n");
      out.write("        $('#inputPassword').val('');\r\n");
      out.write("\t}\r\n");
      out.write("\t$('#remember_me').click(function() {\r\n");
      out.write("\t\t \r\n");
      out.write("\t\tif ($('#remember_me').is(':checked')) {\r\n");
      out.write("             // save username and password\r\n");
      out.write("             localStorage.usrname = $('#inputEmail').val();\r\n");
      out.write("             localStorage.pass = $('#inputPassword').val();\r\n");
      out.write("             localStorage.chkbx = $('#remember_me').val();\r\n");
      out.write("         } else {\r\n");
      out.write("             localStorage.usrname = '';\r\n");
      out.write("             localStorage.pass = '';\r\n");
      out.write("             localStorage.chkbx = '';\r\n");
      out.write("         }\r\n");
      out.write("     });\r\n");
      out.write("\t$('#login').click(function() {\r\n");
      out.write("\t\tif(($.trim($('#inputEmail').val()) != null && $.trim($('#inputEmail').val()) != \"\") && $.trim($('#inputPassword').val()) != null && $.trim($('#inputPassword').val()) != \"\")\r\n");
      out.write("\t\t{\t\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("            url : \"loginServlet\",\r\n");
      out.write("        \tdata : {\"userName\" : user=$('#inputEmail').val(),\"userPass\" : $('#inputPassword').val()},\r\n");
      out.write("            success : function (responseText) {\r\n");
      out.write("            \tconsole.log(\"hellololloo  \"+responseText);\r\n");
      out.write("            \t//document.location='welcome.jsp?user=satish';\r\n");
      out.write("            \t//alert(typeof responseText);\r\n");
      out.write("            \t//alert(responseText);\r\n");
      out.write("            \t//var message = responseText;\r\n");
      out.write("            \tif($.trim(responseText)==\"success\"){\r\n");
      out.write("            \t\tconsole.log(\"success\");\r\n");
      out.write("            \t\twindow.location='homepage.jsp';\r\n");
      out.write("            \t}            \t\r\n");
      out.write("            \telse if($.trim(responseText)==\"pass\"){\r\n");
      out.write("            \t\tconsole.log(\"else if\");\r\n");
      out.write("            \t\talert(\"Invalid Password\");\r\n");
      out.write("            \t\t//document.location='welcome.jsp?user=satish';\r\n");
      out.write("            \t}\r\n");
      out.write("            \telse{\r\n");
      out.write("            \t\tconsole.log(\"else\");\r\n");
      out.write("            \t\talert(\"Invalid username\");\r\n");
      out.write("            \t\t//document.location='welcome.jsp?user=satish';\r\n");
      out.write("            \t}\r\n");
      out.write("            }\r\n");
      out.write("        });}\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\talert(\"Enter Login detials\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<header class=\"intro\">\r\n");
      out.write("        <div class=\"intro-body\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-8\">\r\n");
      out.write("\t\t\t\t  <!--div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t  <h3 class=\"panel-title\">Panel title</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\tUsername:<input type=\"text\"/></br>\r\n");
      out.write("\t\t\t\t\t\tPassword:<input type=\"password\"/></br>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"https://www.google.com\" class=\"btn btn-danger\">Login</a>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t  </div>-->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"form-signin\" style=\"padding-left:500px\">\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr><td></td><td><p style=\"padding-left:70px\">Please Sign In</p></td><td></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("        \t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"email\" id=\"inputEmail\" style=\"width:150%\" class=\"form-control\" placeholder=\"Email address\" autofocus ></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr style=\"height:10px\"></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" id=\"inputPassword\" style=\"width:150%\" class=\"form-control\" placeholder=\"Password\"></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td><div class=\"checkbox\" style=\"text-align:left;padding-left:20px\"><input type=\"checkbox\" value=\"remember-me\" id=\"remember_me\"> Remember me</div></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t<td><div style=\"width:150%\"><input type=\"submit\" value=\"login\" id=\"login\" class=\"btn btn-small btn-primary btn-block\"/></div></td>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<tr style=\"height:10px\"></tr>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t<td><div style=\"text-align:left\"><a href=\"ForgotPassword.jsp?message=welcome\">Forgot Password</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("<!--\t<div class=\"panel panel-default\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("              <h3 class=\"panel-title\">Panel title</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("              \r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("      <form class=\"form-signin\">\r\n");
      out.write("        <h2 class=\"form-signin-heading\">Please sign in</h2>\r\n");
      out.write("        <label for=\"inputEmail\" class=\"sr-only\">Email address</label>\r\n");
      out.write("        <input type=\"email\" id=\"inputEmail\" class=\"form-control\" placeholder=\"Email address\" required autofocus>\r\n");
      out.write("        <label for=\"inputPassword\" class=\"sr-only\">Password</label>\r\n");
      out.write("        <input type=\"password\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" required>\r\n");
      out.write("        <div class=\"checkbox\">\r\n");
      out.write("          <label>\r\n");
      out.write("            <input type=\"checkbox\" value=\"remember-me\"> Remember me\r\n");
      out.write("          </label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Sign in</button>\r\n");
      out.write("      </form>\r\n");
      out.write("\r\n");
      out.write("    </div> \r\n");
      out.write("\t\r\n");
      out.write("    </div></div>\r\n");
      out.write("<form method=\"post\">  \r\n");
      out.write("        <fieldset style=\"width: 300px\">  \r\n");
      out.write("            <legend> Login to App </legend>  \r\n");
      out.write("            <table>  \r\n");
      out.write("                <tr>  \r\n");
      out.write("                    <td>User ID</td>  \r\n");
      out.write("                    <td><input type=\"text\" id=\"userName\" name=\"username\" required=\"required\" /></td>  \r\n");
      out.write("                </tr>  \r\n");
      out.write("                <tr>  \r\n");
      out.write("                    <td>Password</td>  \r\n");
      out.write("                    <td><input id =\"userPass\" type=\"password\" name=\"userpass\" required=\"required\" /></td>  \r\n");
      out.write("                </tr>\r\n");
      out.write("                  \r\n");
      out.write("                <tr>  \r\n");
      out.write("                    <td><input type=\"submit\" value=\"Login\" id=\"login\"/></td>  \r\n");
      out.write("                    <td><input type=\"checkbox\" value=\"Remember\" id=\"remember_me\">Remember Me</td>\r\n");
      out.write("                    <td><a href=\"ForgotPassword.jsp\">Forgot Password</a></td>\r\n");
      out.write("                </tr>  \r\n");
      out.write("            </table>  \r\n");
      out.write("        </fieldset>  \r\n");
      out.write("    </form>-->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}