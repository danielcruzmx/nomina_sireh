package _web_2d_inf._jsp._comun;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _vaadin extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _vaadin page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${application}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${parameters}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[2]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setCode("iframe.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
          if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_3.doCatch(th);
        } finally {
          __jsp_taghandler_3.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write(__oracle_jsp_text[3]);

    }
    catch (Throwable e) {
      if (!(e instanceof javax.servlet.jsp.SkipPageException)){
        try {
          if (out != null) out.clear();
        }
        catch (Exception clearException) {
        }
        pageContext.handlePageException(e);
      }
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext, true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static final char __oracle_jsp_text[][]=new char[4][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n\r\n<table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\r\n  <tr>\r\n    <td valign=\"middle\" align=\"center\">    \r\n      <iframe id=\"fraFSNVaadin\" src=\"../fsnVAADIN/".toCharArray();
    __oracle_jsp_text[2] = 
    "\"\r\n              scrolling=\"no\" marginwidth=\"0\" marginheight=\"0\" frameborder=\"0\" \r\n              vspace=\"0\" hspace=\"0\" style=\"overflow:visible; width:1px; height:1px; display:block\"></iframe>\r\n    </td>\r\n  </tr>\r\n</table>\r\n\r\n<script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[3] = 
    "\"></script>\r\n<script type=\"text/javascript\">\r\n    window.parent.resizeIframe(\"450\",\"1024\");\r\n</script>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
