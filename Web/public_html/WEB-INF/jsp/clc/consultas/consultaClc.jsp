<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form  modelAttribute="consultaRegistroClcDTO">

    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <%-- Titulo --%> 
    <h1><spring:message code="sireh.label.clc.titulo.link"/> - 
    <spring:message code="sireh.label.clc.consulta.generica.Consulta"/>
    <c:out value="${consultaRegistroClcDTO.seccion}"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="50%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%">
                        <%-- Filtros --%> 
                        <c:if test="${consultaRegistroClcDTO.registroCLC || consultaRegistroClcDTO.casosImpuestos}">
                            <tr align="left">
                                <td align="right" class="label"><spring:message code="sireh.label.clc.herramientas.busqueda.ciclo"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tdCxlcCicloBusquedaImpuestos" 
                                                    path="Histo_ciclo"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                        </c:if>
                        <c:if test="${consultaRegistroClcDTO.registroCLC || consultaRegistroClcDTO.casosImpuestos}">
                            <tr align="left">
                                <td align="right" class="label">* Mes</td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="consultaMesImpNom" 
                                                    path="mesQna"
                                                    uppercase="false"/>
                                </td>
                            </tr>
                        </c:if>
                    </table>
                </fieldset>
            </td>
        </tr>
        <%-- Botones --%> 
        <tr align="center">
            <td>
                <fsn:submit value="submit.search" 
                            path="muestraRegistros" 
                            action="clcConsultas/${consultaRegistroClcDTO.urlOrigen}"
                            progressBar="true"/> &nbsp; 
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="clcConsultas/${consultaRegistroClcDTO.urlOrigen}"
                            progressBar="true"/>
            </td>
        </tr>
    </table>
    
    <%-- Condicion Existen registros --%> 
    <c:choose>
        <c:when test="${consultaRegistroClcDTO.muestraRegistros}">
            <%-- Filtros --%> 
            <fsn:filter property="H2NC_CICLO" condition="=" path="Histo_ciclo"/>
            <fsn:filter property="H2NC_MES" condition="=" path="mesQna"/>
            
            <%-- Grid --%> 
            <fsn:pagedList beanName="${consultaRegistroClcDTO.beanName}" 
                           baseUrl="${consultaRegistroClcDTO.urlOrigen}" 
                           appendFilters="false">
                <div id="displayTagDiv">
                    <display:table name="${consultaRegistroClcDTO.beanName}" 
                                   class="displaytag"
                                   requestURI="${requestURI}" 
                                   pagesize="10" 
                                   export="true" 
                                   id="row"
                                   sort="list">
                        <%-- Columnas --%>         
                        <display:column titleKey="sireh.label.clc.consulta.generica.cxlcCiclo" 
                                        property="h2ncCiclo" 
                                        sortable="true" style="text-align: center"/>
                        <display:column titleKey="sireh.label.clc.consulta.generica.cxlcEdo" 
                                        property="idEdo" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.consulta.generica.cxlcCasos" 
                                        property="h2ncCasos" 
                                        sortable="true" style="text-align: center"/>
                        <display:column titleKey="sireh.label.clc.consulta.generica.cxlcMonto" 
                                        property="h2ncMonto" 
                                        sortable="true"/> 
                        <%-- Paginador --%> 
                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                        <display:setProperty name="export.pdf" value="true"/>
                        <display:setProperty name="basic.msg.empty_list">
                            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                        </display:setProperty>
                    </display:table>
                </div>
            </fsn:pagedList>
        </c:when>
        <c:otherwise>
            <%-- No existen registros --%> 
            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
        </c:otherwise>
    </c:choose>
    
    <script type="text/javascript">
        /*$j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });*/
    </script>
</html:form>