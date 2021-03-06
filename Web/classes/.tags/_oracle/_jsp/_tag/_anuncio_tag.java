package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import gob.shcp.fsn.control.view.util.TagUtils;
import org.springframework.util.ClassUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import gob.shcp.sireh.service.anuncio.AnuncioService;
import gob.shcp.sireh.model.TnAnuncioDTO;


public class _anuncio_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;

  public void setJspContext(JspContext ctx) 
  {
    super.setJspContext(ctx);
    java.util.ArrayList _nestedVars;
    java.util.ArrayList _atBeginVars;
    java.util.ArrayList _atEndVars;
    _atBeginVars = null;
    _atEndVars = null;
    _nestedVars = null;
    this.jspContext = new oracle.jsp.runtime.OracleJspContextWrapper(ctx, _atBeginVars, _atEndVars, _nestedVars, null);
  }

  public JspContext getJspContext() 
  {
    return this.jspContext;
  }


  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException { 
    PageContext pageContext = (PageContext) jspContext;
    try { 
        HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
        HttpServletResponse response = (HttpServletResponse) pageContext.getResponse();
        HttpSession session = pageContext.getSession();
        ServletContext application = pageContext.getServletContext();
        JspWriter out = jspContext.getOut();
        ServletConfig config = pageContext.getServletConfig();
        int __jsp_tag_starteval;
        javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);


        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        
        try {
            TnAnuncioDTO anuncio = ((AnuncioService)TagUtils.getService(pageContext, (Class)ClassUtils.forName("gob.shcp.sireh.service.anuncio.AnuncioService"))).getAnuncio();
            Log logger = LogFactory.getLog(getClass());
            
            if (anuncio != null) {
                String msg = anuncio.getMsgAnuncio();
                String titulo = anuncio.getTituloAnuncio();
        
        out.write("\n        <script type=\"text/javascript\">\n            //new Messi('");
        out.print( msg );
        out.write("', {title: '");
        out.print( titulo );
        out.write("', modal: true});\n            //$j.smkAlert({text:'");
        out.print( titulo );
        out.write(": ");
        out.print( msg );
        out.write("', type:'danger', time: 10, permanent: true});\n            $j.smkAlert({text:'");
        out.print( titulo );
        out.write("\\n<br> ");
        out.print( msg );
        out.write("', type:'danger', permanent: true});\n        </script>\n");
        
            } else {
                logger.debug("Error: No se pudo obtener el anuncio");
            }
        } catch (gob.shcp.fsn.service.ServiceException se) {
            TagUtils.saveError(pageContext, se);
        
        out.write("\n    ");
        {
          String __url=OracleJspRuntime.toStr("../layout/message.jsp");
          // Include 
          pageContext.include( __url,false);
          if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
        }

        out.write("\n");
        
        } catch(Exception e) {
            e.printStackTrace();
        }
        
      } catch( Throwable t ) {
        if (t instanceof javax.servlet.jsp.SkipPageException)
            throw (javax.servlet.jsp.SkipPageException) t;
        if (t instanceof IllegalStateException)
            throw (IllegalStateException) t;
        if (t instanceof java.io.IOException)
            throw (java.io.IOException) t;
        if (t instanceof javax.servlet.jsp.JspException)
            throw (javax.servlet.jsp.JspException) t;
        throw new javax.servlet.jsp.JspException(t);
      }
      finally {
        ((oracle.jsp.runtime.OracleJspContextWrapper) jspContext).syncVariableEndTagFile();
        OracleJspRuntime.releaseTagHandlers(pageContext);
      }
    }

    public TagInfo getTagInfo(TagLibraryInfo tlib)
    {
      if (tagInfo != null)
        return tagInfo;

      TagVariableInfo[] tagVariableInfos = new TagVariableInfo[0];
      TagAttributeInfo[] tagAttributeInfo = new TagAttributeInfo[0];
      tagInfo = new TagInfo("anuncio","_oracle._jsp._tag._anuncio_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
