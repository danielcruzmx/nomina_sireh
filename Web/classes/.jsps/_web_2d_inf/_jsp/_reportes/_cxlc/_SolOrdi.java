package _web_2d_inf._jsp._reportes._cxlc;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _SolOrdi extends com.orionserver.http.OrionHttpJspPage {


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
    _SolOrdi page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("reportesCxlcDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[4]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setPath("uniCicloRequired");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
                  if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_2.doCatch(th);
                } finally {
                  __jsp_taghandler_2.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
              }
              out.write(__oracle_jsp_text[5]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setPath("complementoRequired");
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
              out.write(__oracle_jsp_text[6]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setPath("tipoNominaRequired");
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
              out.write(__oracle_jsp_text[7]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setPath("clcRequired");
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
              out.write(__oracle_jsp_text[8]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setPath("qnaCapturaRequired");
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
              out.write(__oracle_jsp_text[9]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setCode("sireh.label.cxlc.reportes.titulo.link");
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
              out.write(__oracle_jsp_text[10]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setCode("sireh.label.cxlc.reportes.seccion.titulo.link");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                  if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_8.doCatch(th);
                } finally {
                  __jsp_taghandler_8.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
              }
              out.write(__oracle_jsp_text[11]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setCode("sireh.label.cxlc.reportes.sufucuencia.detalle.titulo.link");
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
              out.write(__oracle_jsp_text[12]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setCode("sireh.label.cxlc.reportes.ordinaria.detalle.titulo.link");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                  if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_10.doCatch(th);
                } finally {
                  __jsp_taghandler_10.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
              }
              out.write(__oracle_jsp_text[13]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setVar("content0");
                __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_11,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[14]);
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                        __jsp_taghandler_12.setCode("sireh.label.reportes.ciclo");
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
                      out.write(__oracle_jsp_text[15]);
                      {
                        _oracle._jsp._tag._option_tag __jsp_taghandler_13=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                        __jsp_taghandler_13.setParent(__jsp_taghandler_11);
                        __jsp_taghandler_13.setJspContext(pageContext);
                        __jsp_taghandler_13.setKey("0");
                        __jsp_taghandler_13.setValue("selectList.nonValue");
                        __jsp_taghandler_13.doTag();
                        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
                      }
                      out.write(__oracle_jsp_text[16]);
                      {
                        _oracle._jsp._tag._selectList_tag __jsp_taghandler_14=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                        __jsp_taghandler_14.setParent(__jsp_taghandler_11);
                        __jsp_taghandler_14.setJspContext(pageContext);
                        __jsp_taghandler_14.setBeanName("tcUnidadCicloReportes");
                        __jsp_taghandler_14.setPath("uniCiclo");
                        __jsp_taghandler_14.doTag();
                        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
                      }
                      out.write(__oracle_jsp_text[17]);
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_15.setParent(__jsp_taghandler_11);
                        __jsp_taghandler_15.setCode("sireh.label.reportes.tipoNomina");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                          if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_15.doCatch(th);
                        } finally {
                          __jsp_taghandler_15.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,3);
                      }
                      out.write(__oracle_jsp_text[18]);
                      {
                        _oracle._jsp._tag._option_tag __jsp_taghandler_16=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                        __jsp_taghandler_16.setParent(__jsp_taghandler_11);
                        __jsp_taghandler_16.setJspContext(pageContext);
                        __jsp_taghandler_16.setKey("0");
                        __jsp_taghandler_16.setValue("selectList.nonValue");
                        __jsp_taghandler_16.doTag();
                        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
                      }
                      out.write(__oracle_jsp_text[19]);
                      {
                        _oracle._jsp._tag._selectList_tag __jsp_taghandler_17=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                        __jsp_taghandler_17.setParent(__jsp_taghandler_11);
                        __jsp_taghandler_17.setJspContext(pageContext);
                        __jsp_taghandler_17.setBeanName("tcTipoNominaReportes");
                        __jsp_taghandler_17.setPath("tipoNomina");
                        __jsp_taghandler_17.doTag();
                        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
                      }
                      out.write(__oracle_jsp_text[20]);
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_18.setParent(__jsp_taghandler_11);
                        __jsp_taghandler_18.setCode("sireh.label.reportes.complemento");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                          if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_18.doCatch(th);
                        } finally {
                          __jsp_taghandler_18.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,3);
                      }
                      out.write(__oracle_jsp_text[21]);
                      {
                        _oracle._jsp._tag._input_tag __jsp_taghandler_19=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                        __jsp_taghandler_19.setParent(__jsp_taghandler_11);
                        __jsp_taghandler_19.setJspContext(pageContext);
                        __jsp_taghandler_19.setPath("complemento");
                        __jsp_taghandler_19.setMaxlength("5");
                        __jsp_taghandler_19.setSize("6");
                        __jsp_taghandler_19.doTag();
                        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
                      }
                      out.write(__oracle_jsp_text[22]);
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_20.setParent(__jsp_taghandler_11);
                        __jsp_taghandler_20.setCode("sireh.label.reportes.quincena");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                          if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_20.doCatch(th);
                        } finally {
                          __jsp_taghandler_20.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,3);
                      }
                      out.write(__oracle_jsp_text[23]);
                      {
                        _oracle._jsp._tag._input_tag __jsp_taghandler_21=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                        __jsp_taghandler_21.setParent(__jsp_taghandler_11);
                        __jsp_taghandler_21.setJspContext(pageContext);
                        __jsp_taghandler_21.setPath("qnaCaptura");
                        __jsp_taghandler_21.setMaxlength("5");
                        __jsp_taghandler_21.setSize("6");
                        __jsp_taghandler_21.doTag();
                        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
                      }
                      out.write(__oracle_jsp_text[24]);
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_22=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_22.setParent(__jsp_taghandler_11);
                        __jsp_taghandler_22.setCode("sireh.label.reportes.clc");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                          if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_22.doCatch(th);
                        } finally {
                          __jsp_taghandler_22.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,3);
                      }
                      out.write(__oracle_jsp_text[25]);
                      {
                        _oracle._jsp._tag._input_tag __jsp_taghandler_23=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                        __jsp_taghandler_23.setParent(__jsp_taghandler_11);
                        __jsp_taghandler_23.setJspContext(pageContext);
                        __jsp_taghandler_23.setPath("clc");
                        __jsp_taghandler_23.setMaxlength("5");
                        __jsp_taghandler_23.setSize("6");
                        __jsp_taghandler_23.doTag();
                        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
                      }
                      out.write(__oracle_jsp_text[26]);
                    } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
              }
              out.write(__oracle_jsp_text[27]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_24=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setJspContext(pageContext);
                __jsp_taghandler_24.setSection("init");
                __jsp_taghandler_24.setType("tab");
                __jsp_taghandler_24.setTabHeight("20");
                __jsp_taghandler_24.setDisplayTime("3");
                __jsp_taghandler_24.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
              }
              out.write(__oracle_jsp_text[28]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_25=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setJspContext(pageContext);
                __jsp_taghandler_25.setTitle("Datos Requeridos");
                __jsp_taghandler_25.setName("divContent0");
                __jsp_taghandler_25.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content0}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_25.setSelected("true");
                __jsp_taghandler_25.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
              }
              out.write(__oracle_jsp_text[29]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_26=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setJspContext(pageContext);
                __jsp_taghandler_26.setTitle("Datos Adicionales");
                __jsp_taghandler_26.setName("divContent1");
                __jsp_taghandler_26.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content1}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_26.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
              }
              out.write(__oracle_jsp_text[30]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_27=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setJspContext(pageContext);
                __jsp_taghandler_27.setSection("final");
                __jsp_taghandler_27.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
              }
              out.write(__oracle_jsp_text[31]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_28=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setCode("sireh.form.required.fields");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                  if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_28.doCatch(th);
                } finally {
                  __jsp_taghandler_28.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,2);
              }
              out.write(__oracle_jsp_text[32]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_29=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setJspContext(pageContext);
                __jsp_taghandler_29.setPath("muestraReporte");
                __jsp_taghandler_29.setAction("reporteCxlc/SolOrdi.do");
                __jsp_taghandler_29.setValue("submit.accept");
                __jsp_taghandler_29.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
              }
              out.write(__oracle_jsp_text[33]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_30=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setJspContext(pageContext);
                __jsp_taghandler_30.setPath("cancel");
                __jsp_taghandler_30.setAction("reporteCxlc/SolOrdi.do");
                __jsp_taghandler_30.setValue("submit.cancel");
                __jsp_taghandler_30.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
              }
              out.write(__oracle_jsp_text[34]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${ (reportesCxlcDTO.uniCiclo!='0')  &&  (reportesCxlcDTO.clc!=null) &&  (reportesCxlcDTO.complemento!=null)  &&  (reportesCxlcDTO.qnaCaptura!=null) &&  (reportesCxlcDTO.tipoNomina!='0')}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[35]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_32=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_32.setJspContext(pageContext);
                      __jsp_taghandler_32.setName("PAR_CICLO");
                      __jsp_taghandler_32.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesCxlcDTO.uniCiclo}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_32.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
                    }
                    out.write(__oracle_jsp_text[36]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_33=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_33.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_33.setJspContext(pageContext);
                      __jsp_taghandler_33.setName("PAR_COMPLEMENTO");
                      __jsp_taghandler_33.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesCxlcDTO.complemento}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_33.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
                    }
                    out.write(__oracle_jsp_text[37]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_34=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_34.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_34.setJspContext(pageContext);
                      __jsp_taghandler_34.setName("PAR_CLC");
                      __jsp_taghandler_34.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesCxlcDTO.clc}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_34.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
                    }
                    out.write(__oracle_jsp_text[38]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_35=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_35.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_35.setJspContext(pageContext);
                      __jsp_taghandler_35.setName("PAR_QNA");
                      __jsp_taghandler_35.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesCxlcDTO.qnaCaptura}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_35.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_35, pageContext);
                    }
                    out.write(__oracle_jsp_text[39]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_36=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_36.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_36.setJspContext(pageContext);
                      __jsp_taghandler_36.setName("PAR_TIPO_NOMINA");
                      __jsp_taghandler_36.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesCxlcDTO.tipoNomina}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_36.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_36, pageContext);
                    }
                    out.write(__oracle_jsp_text[40]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_37=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_37.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_37.setJspContext(pageContext);
                      __jsp_taghandler_37.setProvider("jasper");
                      __jsp_taghandler_37.setViewUri("/cxlc/SolOrdi");
                      __jsp_taghandler_37.setImagesUri("/images/reports");
                      __jsp_taghandler_37.setFormat("pdf");
                      __jsp_taghandler_37.setFileName("SolOrdi");
                      __jsp_taghandler_37.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_37.setWidth("1060");
                      __jsp_taghandler_37.setHeight("350");
                      __jsp_taghandler_37.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_37, pageContext);
                    }
                    out.write(__oracle_jsp_text[41]);
                  } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,2);
              }
              out.write(__oracle_jsp_text[42]);
            } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_1.doCatch(th);
        } finally {
          __jsp_taghandler_1.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
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
  private static final char __oracle_jsp_text[][]=new char[43][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n\r\n<style type=\"text/css\">\r\n.anchoTextarea {\r\n    width: 600px;\r\n}\r\n</style>\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    \r\n    <h1>\r\n        <strong>\r\n            ".toCharArray();
    __oracle_jsp_text[10] = 
    " &#45; \r\n            ".toCharArray();
    __oracle_jsp_text[11] = 
    " &#45; \r\n            ".toCharArray();
    __oracle_jsp_text[12] = 
    " &#45; \r\n            ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n        </strong>\r\n    </h1>\r\n    <p>&nbsp;</p>\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n        <div align=\"center\">\r\n            <table>\r\n                <tr>\r\n                    <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[15] = 
    "</td>\r\n                    <td align=\"left\">\r\n                        ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                    </td>\r\n                </tr>        \r\n                <tr>\r\n                    <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[18] = 
    "</td>\r\n                    <td align=\"left\">\r\n                        ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                    </td>\r\n                </tr>\r\n               <tr>\r\n                    <td  align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                    <td align=\"left\">".toCharArray();
    __oracle_jsp_text[22] = 
    "</td>\r\n                </tr>\r\n                <tr>\r\n                    <td  align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[23] = 
    "</td>\r\n                    <td align=\"left\">".toCharArray();
    __oracle_jsp_text[24] = 
    "</td>\r\n                </tr>\r\n                <tr>\r\n                    <td  align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[25] = 
    "</td>\r\n                    <td align=\"left\">".toCharArray();
    __oracle_jsp_text[26] = 
    "</td>\r\n                </tr>\r\n            </table>\r\n        </div>\r\n    ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n        \r\n    ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n        \r\n    <table>\r\n        <tr>\r\n            <td colspan=\"2\" align=\"left\" height=\"20px\" valign=\"middle\">".toCharArray();
    __oracle_jsp_text[32] = 
    "</td>\r\n        </tr>\r\n        <tr>\r\n            <td align=\"right\">\r\n                ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n            </td>\r\n            <td align=\"left\">\r\n                    ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td colspan=\"2\" height=\"20px\">&nbsp;</td>\r\n        </tr>\r\n    </table>\r\n        \r\n    ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n        <table>\r\n            <tr>\r\n                <th align=\"left\"></th>\r\n            </tr>\r\n            <tr>\r\n                <td align=\"left\">\r\n                    ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                    \r\n                    ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n    \r\n    <p>&nbsp;</p>\r\n    <div align=\"center\"></div>\r\n    \r\n    <p>&nbsp;</p>\r\n    <div align=\"center\"></div>\r\n    \r\n    <p>&nbsp;</p>\r\n    <div align=\"center\"></div>\r\n    \r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
