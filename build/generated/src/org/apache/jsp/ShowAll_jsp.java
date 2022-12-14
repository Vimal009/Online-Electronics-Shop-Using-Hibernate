package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ShowAll_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: lightgrey;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Show Student</title>\n");
      out.write("         <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $(\"#deleteAppliance\").hide();\n");
      out.write("                $(\"#updateAppliance\").hide();\n");
      out.write("            $(\"#update\").click(function(){\n");
      out.write("                $(\"#updateAppliance\").show();\n");
      out.write("                $(\"#deleteAppliance\").hide();\n");
      out.write("            });\n");
      out.write("            $(\"#delete\").click(function(){\n");
      out.write("                $(\"#deleteAppliance\").show();\n");
      out.write("                $(\"#updateAppliance\").hide();\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        All Appliances: <br> \n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <form action=\"ApplianceController\" method=\"POST\">\n");
      out.write("            Update: <input type=\"checkbox\" id=\"update\"> Delete: <input type=\"checkbox\" id=\"delete\" onclick=\"document.getElementById('code').disabled=this.checked;document.getElementById('nameupdate').disabled=this.checked;document.getElementById('typeupdate').disabled=this.checked;document.getElementById('companynameupdate').disabled=this.checked;document.getElementById('priceupdate').disabled=this.checked;document.getElementById('dpriceupdate').disabled=this.checked;document.getElementById('descriptionupdate').disabled=this.checked;document.getElementById('stockavailableupdate').disabled=this.checked;document.getElementById('manufactureridupdate').disabled=this.checked;\"><br><br>\n");
      out.write("            <select name=\"id\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <br>\n");
      out.write("            Update Productcode: <input id=\"productcode\" type=\"text\" name=\"productcode\"><br><br>\n");
      out.write("            Update Name: <input id=\"nameupdate\" type=\"text\" name=\"nameupdate\"><br><br>\n");
      out.write("            Update Type: <input id=\"typeupdate\" type=\"text\" name=\"typeupdate\"> <br><br>\n");
      out.write("            Update Companyname: <input id=\"companynameupdate\" type=\"text\" name=\"companynameupdate\"> <br><br>\n");
      out.write("            Update Price: <input id=\"priceupdate\" type=\"text\" name=\"priceupdate\"> <br><br>\n");
      out.write("            Update Dprice: <input id=\"dpriceupdate\" type=\"text\" name=\"dpriceupdate\"> <br><br>\n");
      out.write("            Update Description: <input id=\"descriptionupdate\" type=\"text\" name=\"descriptionupdate\"> <br><br>\n");
      out.write("            Update Stockavailable: <input id=\"stockavailableupdate\" type=\"text\" name=\"stockavailableupdate\"> <br><br>\n");
      out.write("            Update Manufacturerid: <input id=\"manufactureridupdate\" type=\"text\" name=\"manufactureridupdate\"> <br><br>\n");
      out.write("            <button type=\"submit\" id=\"updateStudent\" name=\"updateAppliance\"> Update</button> <br> <br>\n");
      out.write("            <button type=\"submit\" id=\"deleteStudent\" name=\"deleteAppliance\"> Delete </button>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("prt");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${applianceList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            Product ID: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prt.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <br>\n");
          out.write("            Product Code: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prt.productcode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <br>\n");
          out.write("            Product Name: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prt.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <br>\n");
          out.write("            Product Type: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prt.type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <br>\n");
          out.write("            Company Name: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prt.companyname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br>\n");
          out.write("            Product Price: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prt.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br>\n");
          out.write("            Product Dprice: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prt.dprice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <br>\n");
          out.write("            Product Description: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prt.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br>\n");
          out.write("            Stock available: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prt.stockavailable}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br>\n");
          out.write("            Manufacturer id: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prt.manufacturerid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <br>\n");
          out.write("            -------------------------------------<br>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${applianceList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("student");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${appliance.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${applance.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                 ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
