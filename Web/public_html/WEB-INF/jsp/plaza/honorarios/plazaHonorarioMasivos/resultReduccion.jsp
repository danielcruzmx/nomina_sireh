<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="reduccionContratoMasivaDTO">
    <h1><spring:message code="sireh.label.plaza.masivas.honorarios.reduccion.titulo"/></h1>  
    <p>&nbsp;</p>
    <table width="80%">
         <tr>   
            <td class="label"><spring:message code="sireh.label.plaza.masivas.honorarios.prorroga.archivo.procesados"></spring:message></td>
            <td><fsn:link action="plazaHonorarioMasiva/downloadFile" parameters="nombreArchivoErrores=${reduccionContratoMasivaDTO.nombreArchivoResultados}" progressIcon="false" >
                  <c:out value="${reduccionContratoMasivaDTO.nombreArchivoResultados}" />
                </fsn:link></td>            
        </tr>        

    </table>
</html:form>