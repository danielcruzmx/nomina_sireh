<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="plazaEventualMasivaDTO">
    <h1><spring:message code="sireh.label.plaza.masivas.eventuales.bajas.titulo"/></h1>  
    <p>&nbsp;</p>
    <table width="80%">
         <tr>   
            <td class="label"><spring:message code="sireh.label.plaza.masivas.eventuales.bajas.archivo.procesados"></spring:message></td>
            <td><fsn:link action="plazaEventualMasiva/downloadFile" parameters="nombreArchivoErrores=${plazaEventualMasivaDTO.nombreArchivoResultados}" progressIcon="false" >
                  <c:out value="${plazaEventualMasivaDTO.nombreArchivoResultados}" />
                </fsn:link></td>            
        </tr>        

    </table>
</html:form>