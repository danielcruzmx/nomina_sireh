package _web_2d_inf._jsp._merito;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _ingresarArchivosDeCapacitacion extends com.orionserver.http.OrionHttpJspPage {


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
    _ingresarArchivosDeCapacitacion page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code var");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setCode("selectList.nonValue");
        __jsp_taghandler_1.setVar("nonValue");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_1.doCatch(th);
        } finally {
          __jsp_taghandler_1.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[5]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute method enctype");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setModelAttribute("notaDeMeritoDTO");
        __jsp_taghandler_2.setMethod("post");
        __jsp_taghandler_2.setEnctype("multipart/form-data");
        try {
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[6]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                __jsp_taghandler_3.setCode("sireh.label.merito.archivoCapacitacion.titulo");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                  if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_3.doCatch(th);
                } finally {
                  __jsp_taghandler_3.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
              }
              out.write(__oracle_jsp_text[7]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                __jsp_taghandler_4.setText("Notas de Merito");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                  if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_4.doCatch(th);
                } finally {
                  __jsp_taghandler_4.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
              }
              out.write(__oracle_jsp_text[8]);
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_5.setParent(__jsp_taghandler_2);
                __jsp_taghandler_5.setCode("capacitacion.jpg");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                  if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_5.doCatch(th);
                } finally {
                  __jsp_taghandler_5.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write(__oracle_jsp_text[9]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                __jsp_taghandler_6.setParent(__jsp_taghandler_2);
                __jsp_taghandler_6.setText("Capacitaci&oacute;n");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                  if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_6.doCatch(th);
                } finally {
                  __jsp_taghandler_6.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
              }
              out.write(__oracle_jsp_text[10]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_7.setParent(__jsp_taghandler_2);
                __jsp_taghandler_7.setCode("sireh.label.merito.numeroDocumento");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                  if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_7.doCatch(th);
                } finally {
                  __jsp_taghandler_7.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
              }
              out.write(__oracle_jsp_text[11]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_8=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_8.setParent(__jsp_taghandler_2);
                __jsp_taghandler_8.setJspContext(pageContext);
                __jsp_taghandler_8.setPath("tdNmhNumDocto");
                __jsp_taghandler_8.setMaxlength("12");
                __jsp_taghandler_8.setSize("15");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[12]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_9.setParent(__jsp_taghandler_2);
                __jsp_taghandler_9.setCode("sireh.label.merito.ciclo");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                  if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_9.doCatch(th);
                } finally {
                  __jsp_taghandler_9.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,2);
              }
              out.write(__oracle_jsp_text[13]);
              {
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path");
                __jsp_taghandler_10.setParent(__jsp_taghandler_2);
                __jsp_taghandler_10.setPath("tdNmhCiclo");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[14]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_11.setParent(__jsp_taghandler_10);
                        __jsp_taghandler_11.setValue("");
                        __jsp_taghandler_11.setLabel((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${nonValue}",java.lang.String.class, __ojsp_varRes,null));
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                          if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_11.doCatch(th);
                        } finally {
                          __jsp_taghandler_11.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,3);
                      }
                      out.write(__oracle_jsp_text[15]);
                      {
                        org.springframework.web.servlet.tags.form.OptionsTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.form.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionsTag.class,"org.springframework.web.servlet.tags.form.OptionsTag items itemValue itemLabel");
                        __jsp_taghandler_12.setParent(__jsp_taghandler_10);
                        __jsp_taghandler_12.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${notaDeMeritoDTO.cicloValores}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_taghandler_12.setItemValue("clave");
                        __jsp_taghandler_12.setItemLabel("valor");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                          if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_12.doCatch(th);
                        } finally {
                          __jsp_taghandler_12.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,3);
                      }
                      out.write(__oracle_jsp_text[16]);
                    } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_10.doCatch(th);
                } finally {
                  __jsp_taghandler_10.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
              }
              out.write(__oracle_jsp_text[17]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_13.setParent(__jsp_taghandler_2);
                __jsp_taghandler_13.setCode("sireh.label.merito.remesa");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                  if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_13.doCatch(th);
                } finally {
                  __jsp_taghandler_13.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,2);
              }
              out.write(__oracle_jsp_text[18]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_14=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_14.setParent(__jsp_taghandler_2);
                __jsp_taghandler_14.setJspContext(pageContext);
                __jsp_taghandler_14.setKey("0");
                __jsp_taghandler_14.setValue("selectList.nonValue");
                __jsp_taghandler_14.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
              }
              out.write(__oracle_jsp_text[19]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_15=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_15.setParent(__jsp_taghandler_2);
                __jsp_taghandler_15.setJspContext(pageContext);
                __jsp_taghandler_15.setBeanName("tcMaxRemesaCapacitacionPorCiclo");
                __jsp_taghandler_15.setPath("tdNmhOp");
                __jsp_taghandler_15.setParentPath("tdNmhCiclo");
                __jsp_taghandler_15.setProgress("true");
                __jsp_taghandler_15.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_16.setParent(__jsp_taghandler_2);
                __jsp_taghandler_16.setCode("sireh.label.merito.quincenaValidacion");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                  if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_16.doCatch(th);
                } finally {
                  __jsp_taghandler_16.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,2);
              }
              out.write(__oracle_jsp_text[21]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_17=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_17.setParent(__jsp_taghandler_2);
                __jsp_taghandler_17.setJspContext(pageContext);
                __jsp_taghandler_17.setKey("0");
                __jsp_taghandler_17.setValue("selectList.nonValue");
                __jsp_taghandler_17.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_18=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_2);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setBeanName("tcQuincenaValidacion");
                __jsp_taghandler_18.setPath("hpQnaPago");
                __jsp_taghandler_18.setParentPath("tdNmhCiclo");
                __jsp_taghandler_18.setProgress("true");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_19.setParent(__jsp_taghandler_2);
                __jsp_taghandler_19.setCode("sireh.label.merito.archivoAProcesar");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                  if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_19.doCatch(th);
                } finally {
                  __jsp_taghandler_19.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,2);
              }
              out.write(__oracle_jsp_text[24]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_20=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_20.setParent(__jsp_taghandler_2);
                __jsp_taghandler_20.setJspContext(pageContext);
                __jsp_taghandler_20.setAction((java.lang.String) ("notaDeMerito/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${notaDeMeritoDTO.urlDestino}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_20.setValue("submit.upload");
                __jsp_taghandler_20.setProgressBar("true");
                __jsp_taghandler_20.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
              }
              out.write(__oracle_jsp_text[25]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_21=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_21.setParent(__jsp_taghandler_2);
                __jsp_taghandler_21.setCode("sireh.form.required.fields");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                  if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_21.doCatch(th);
                } finally {
                  __jsp_taghandler_21.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,2);
              }
              out.write(__oracle_jsp_text[26]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_22=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_22.setParent(__jsp_taghandler_2);
                __jsp_taghandler_22.setPath("tdNmhCveCausal");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                  if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_22.doCatch(th);
                } finally {
                  __jsp_taghandler_22.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,2);
              }
              out.write(__oracle_jsp_text[27]);
            } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_2.doCatch(th);
        } finally {
          __jsp_taghandler_2.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }

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
  private static final char __oracle_jsp_text[][]=new char[28][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n<h1>".toCharArray();
    __oracle_jsp_text[7] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table align=\"center\" width=\"70%\" border=\"0\">\r\n        <tr>\r\n            <td align=\"center\">\r\n                <fieldset>\r\n                    <legend>\r\n                        <strong>".toCharArray();
    __oracle_jsp_text[8] = 
    "</strong>\r\n                        <img class=\"fotografia\" width=\"60\" src=\"".toCharArray();
    __oracle_jsp_text[9] = 
    "\" align=\"middle\"/>       \r\n                        <strong>".toCharArray();
    __oracle_jsp_text[10] = 
    "</strong>\r\n                    </legend>\r\n                    \r\n                    <table width=\"90%\" align=\"center\" border=\"0\">\r\n                        <tr align=\"left\">\r\n                            <td class=\"label\"> * ".toCharArray();
    __oracle_jsp_text[11] = 
    "</td>\r\n                            <td colspan=\"2\" align=\"left\">".toCharArray();
    __oracle_jsp_text[12] = 
    "</td>\r\n                        </tr>\r\n                        <tr>    \r\n                            <td class=\"label\"> * ".toCharArray();
    __oracle_jsp_text[13] = 
    "</td>\r\n                            <td colspan=\"2\" align=\"left\">".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                            </td>\r\n                          </tr>\r\n                              <tr>\r\n                            <td class=\"label\"> * ".toCharArray();
    __oracle_jsp_text[18] = 
    "</td>\r\n                            <td colspan=\"2\" align=\"left\">".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[20] = 
    "</td>\r\n                         </tr>\r\n                        <tr>   \r\n                            <td class=\"label\"> * ".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                            <td colspan=\"2\" align=\"left\">".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                            </td>            \r\n                        </tr>\r\n                         <tr>   \r\n                            <td class=\"label\" width=\"30%\"> * ".toCharArray();
    __oracle_jsp_text[24] = 
    "</td>\r\n                            <td width=\"35%\" align=\"left\"><input type=\"file\" name=\"file\" id=\"file\" /> </td>\r\n                            <td>".toCharArray();
    __oracle_jsp_text[25] = 
    "</td>\r\n                        </tr>\r\n                         <tr>\r\n                            <td align=\"left\" height=\"20px\" valign=\"middle\"><strong>".toCharArray();
    __oracle_jsp_text[26] = 
    "</strong></td>\r\n                        </tr>\r\n                    </table>\r\n                    \r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
