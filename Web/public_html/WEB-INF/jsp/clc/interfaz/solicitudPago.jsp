<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
.anchoTextarea {
    width: 350px;
}
</style>

<script type="text/javascript">
    function formato_numero(numero, decimales, separador_decimal, separador_miles){
         numero=parseFloat(numero);
         if(isNaN(numero)){
             return "";
         }
    
         if(decimales!==undefined){
             // Redondeamos
             //numero=numero.toFixed(decimales);
             numero=(Math.round(numero * 100) / 100).toFixed(decimales);
         }
    
         // Convertimos el punto en separador_decimal
         numero=numero.toString().replace(".", separador_decimal!==undefined ? separador_decimal : ",");
    
         if(separador_miles){
             // Añadimos los separadores de miles
             var miles=new RegExp("(-?[0-9]+)([0-9]{3})");
             while(miles.test(numero)) {
                 numero=numero.replace(miles, "$1" + separador_miles + "$2");
             }
         }
         return numero;
    }
</script>
<html:form modelAttribute="solicitudPagoDTO">
    
    <h1><spring:message code="sireh.label.clc.titulo.link"/> - 
    <spring:message code="sireh.label.clc.interfaz.titulo.link"/> - 
    <spring:message code="sireh.label.clc.interfaz.solicitudPago.titulo"/></h1>
    <p>&nbsp;</p>
    
    <html:hidden path="fileName"/>
    <html:hidden path="csvFileName"/>
    <html:hidden path="csvFilePath"/>
    <html:hidden path="zipFileName"/>
    <html:hidden path="zipFilePath"/>
    
    <c:set var="content1">
        <table align="center" width="60%">
            <tr valign="top">
                <td>
                    <fieldset>
                        <legend style="font-size:1.3em">
                            <strong>&nbsp;&nbsp; Seleccione el beneficiario &nbsp;&nbsp;</strong>
                        </legend>
                        <table>
                            <tr>
                                <td width="150px" align="right" class="label">* <spring:message code="sireh.label.clc.interfaz.solicitudPago.cabecera.beneficiario"/></td>
                                <td width="450px" align="left">
                                    <fsn:helpRoutine path="idBeneSicop"  
                                                     maxlength="20" 
                                                     size="20" 
                                                     disabled="true" 
                                                     beanName="solPagoBeneficiariosPopUp"  
                                                     width="800" 
                                                     height="400"  
                                                     fieldMapping="idBeneSicop, bsCtaBancaria, bsTipoMoneda, bsLeyenda, bsTipoPago, bsTipoNom" 
                                                     title="Seleccione el Beneficiario" 
                                                     leftPosition="17"
                                                     topPosition="20"
                                                     onClose="clearData()"/>
                                </td>
                            </tr>
                            <tr>
                                <td width="150px" align="right" class="label"><spring:message code="sireh.label.clc.interfaz.solicitudPago.cabecera.bsCtaBancaria"/></td>
                                <td width="450px" align="left">
                                    <fsn:input path="bsCtaBancaria" readonly="true" size="20" uppercase="true"/>
                                </td>
                            </tr>
                            <tr>
                                <td width="150px" align="right" class="label"><spring:message code="sireh.label.clc.interfaz.solicitudPago.cabecera.bsTipoMoneda"/></td>
                                <td width="450px" align="left">
                                    <fsn:input path="bsTipoMoneda" readonly="true" size="20" uppercase="true"/>
                                </td>
                            </tr>
                            <tr>
                                <td width="150px" align="right" class="label"><spring:message code="sireh.label.clc.interfaz.solicitudPago.cabecera.bsLeyenda"/></td>
                                <td width="450px" align="left">
                                    <fsn:input path="bsLeyenda" readonly="true" size="20" uppercase="true"/>
                                </td>
                            </tr>
                            <tr>
                                <td width="150px" align="right" class="label"><spring:message code="sireh.label.clc.interfaz.solicitudPago.cabecera.bsTipoPago"/></td>
                                <td width="450px" align="left">
                                    <fsn:input path="bsTipoPago" readonly="true" size="20" uppercase="true"/>
                                </td>
                            </tr>
                            <tr>
                                <td width="150px" align="right" class="label"> * <spring:message code="sireh.label.clc.interfaz.solicitudPago.cabecera.concepto"/></td>
                                <td width="450px" align="left">
                                    <html:hidden path="bsTipoNom"/>
                                    <html:hidden path="idTipoNominaTodas"/>
                                    <fsn:textarea path="concepto" rows="3" cols="70" css="anchoTextarea"/>
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                </td>
            </tr>
        </table>
    </c:set>
    
    <c:set var="content2">
        <table align="center" width="60%">
            <tr valign="top">
                <td>
                    <fieldset>
                        <legend style="font-size:1.3em">
                            <strong>&nbsp;&nbsp; Seleccione la(s) cuenta(s) clc &nbsp;&nbsp;</strong>
                        </legend>
                        <table>
                            <tr>
                                <td width="150px" align="right" class="label">* <spring:message code="sireh.label.clc.interfaz.solicitudPago.cuentas.cxlcCiclo"/></td>
                                <td width="450px" align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tdCxlcCicloSolCompClc" 
                                                    path="cxlcCiclo"
                                                    style="width: 106px;"
                                                    onchange="deleteOptions()"/>
                                </td>
                            </tr>
                            <tr>
                                <td width="150px" align="right" class="label">* <spring:message code="sireh.label.clc.interfaz.solicitudPago.cuentas.cxlcQnaPago"/></td>
                                <td width="450px" align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tdCxlcQnaPagoSolCompClc" 
                                                    path="cxlcQnaPagoMultiple"
                                                    progress="true"
                                                    parentPath="cxlcCiclo"
                                                    style="width: 106px;"
                                                    onchange="deleteOptions()"
                                                    multiple="true"/>
                                </td>
                            </tr>
                            <tr>
                                <td width="150px" align="right" class="label"><spring:message code="sireh.label.clc.interfaz.solicitudPago.cuentas.idTipoNomina"/></td>
                                <td width="450px" align="left">
                                    <html:select path="idTipoNomina" cssStyle="width: 106px;">
                                        <html:option value="" label="SELECCIONE..."/>
                                    </html:select>
                                </td>
                            </tr>
                        </table>
			<table width="100%">
                            <tr align="center">
                                <td>
                                    <fsn:submit value="submit.search" 
                                                path="buscaCxlc" 
                                                action="clcInterfazSICOP/buscaCxlcSolicitudPago.do"
                                                progressBar="true"/> &nbsp; 
                                    <fsn:submit value="submit.clean" 
                                                path="cancelBuscaCxlc" 
                                                action="clcInterfazSICOP/buscaCxlcSolicitudPago.do"
                                                progressBar="true"/>
                                </td>
                            </tr>
                        </table>
                        <div id="displayTagDiv" style="width:800px;height:300px;overflow:auto;">
                            <c:choose>
                                <c:when test="${solicitudPagoDTO.buscaCxlc}">                                    
                                    <fsn:filter property="C.CXLC_CICLO" condition="=" path="cxlcCiclo"/>
                                    <fsn:filter property="C.CXLC_QNA_PAGO" condition="IN" path="quincenasList"/>
                                    <fsn:filter property="C.ID_TIPO_NOMINA" condition="=" path="idTipoNomina"/>
                                    <c:if test="${not empty solicitudCompromisoDTO.idTipoNominaList}">
                                        <!--fsn:filter property="TN.ID_TIPO_NOMINA" condition="in" path="idTipoNominaList"-->
                                    </c:if>

                                    <table align="center" width="100%">
                                        <tr>
                                            <td height="20px"> &nbsp; </td>
                                        </tr>
                                        <tr>
                                            <td align="right" height="10px" valign="middle">
                                                <b>Seleccione una opci&oacute;n:</b><br/>
                                                <a href="javascript:checkAll()">+ Seleccionar Todos</a><br/>
                                                <a href="javascript:uncheckAll()">- Ninguno</a>
                                            </td>
                                        </tr>
                                    </table>
                                    <fsn:pagedList beanName="busquedaClcSolicitudPago" 
                                                   checkbox="true" 
                                                   chkProperty="cxlcGrupo" 
                                                   baseUrl="solicitudPago"
                                                   appendFilters="false">
                                        <div id="displayTagDiv" style="width:800px;height:300px;overflow:auto;">                                                      
                                            <display:table name="busquedaClcSolicitudPago" 
                                                           class="displaytag" 
                                                           pagesize="500" 
                                                           decorator="checkboxTableDecorator" 
                                                           export="true" 
                                                           id="row" 
                                                           requestURI="${requestURI}" 
                                                           sort="list">
                                                                                        
                                                <%--display:column titleKey="sireh.label.clc.interfaz.solicitudPago.cuentas.cxlcGrupo" 
                                                                style="text-align: center" 
                                                                property="checkbox" 
                                                                media="html"--%>
                                                <display:column titleKey="sireh.label.clc.interfaz.solicitudPago.cuentas.cxlcGrupo" 
                                                                style="text-align: center;">
                                                    <input name="cxlcGrupo" 
                                                           class="boxCxlc"
                                                           type="checkbox" 
                                                           value="<c:out value="${row.cxlc}"/>|<c:out value="${row.secCompromiso}"/>"/>
                                                </display:column>
                                                
                                                <display:column titleKey="sireh.label.clc.interfaz.solicitudPago.cuentas.cxlc" 
                                                                property="cxlc" 
                                                                sortable="true"/>
                                                <display:column titleKey="sireh.label.clc.interfaz.solicitudPago.cuentas.cxlcCiclo" 
                                                                property="cxlcCiclo" 
                                                                sortable="true"/>
                                                <display:column titleKey="sireh.label.clc.interfaz.solicitudPago.cuentas.cxlcQnaPago" 
                                                                property="cxlcQnaPago" 
                                                                sortable="true"/>
                                                <display:column titleKey="sireh.label.clc.interfaz.solicitudPago.cuentas.idTipoNomina" 
                                                                property="idTipoNomina" 
                                                                sortable="true"/>
                                                <display:column titleKey="sireh.label.clc.interfaz.solicitudPago.cuentas.cxlcComplemento" 
                                                                property="cxlcComplemento" 
                                                                sortable="true"/>
                                                <display:column titleKey="sireh.label.clc.interfaz.solicitudPago.cuentas.secCompromiso" 
                                                                property="secCompromiso" 
                                                                sortable="true"/>
                                                <display:column titleKey="sireh.label.clc.interfaz.solicitudCompromiso.cuentas.cxlcMonto" 
                                                                sortable="true"
                                                                style="text-align:right">
                                                    <div id="monto"><c:out value="${row.cxlcMonto}"/></div>
                                                </display:column>
                                                                                        
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
                                    <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                                </c:otherwise>
                            </c:choose>
                        </div>
                        <table align="center" width="100%">
                            <tr>
                                <td align="left" height="10px" valign="middle"> &nbsp; </td>
                            </tr>
                            <tr valign="top">
                                <td align="right">
                                    <span id="montoTotal" style="font-size:2em">Total CXLC: $ 0.00</span>
                                </td>
                            </tr>
                            <tr>
                                <td height="20px"> &nbsp; </td>
                            </tr>
                        </table>
                    </fieldset>
                </td>
            </tr>
        </table>
    </c:set>
    
    <c:set var="content3">
        <table align="center" width="60%">
            <tr valign="top">
                <td>
                    <fieldset>
                        <legend style="font-size:1.3em">
                            <strong>&nbsp;&nbsp; Ingrese los rangos de fechas &nbsp;&nbsp;</strong>
                        </legend>
                        <table>
                            <tr>
                                <td width="150px" align="right" class="label">* <spring:message code="sireh.label.clc.interfaz.solicitudPago.otros.fechaExp"/></td>
                                <td width="450px" align="left">
                                    <fsn:calendar path="fechaExp" size="10"/>
                                </td>
                            </tr>
                            <tr>
                                <td width="150px" align="right" class="label">* <spring:message code="sireh.label.clc.interfaz.solicitudPago.otros.fechaApli"/></td>
                                <td width="450px" align="left">
                                    <fsn:calendar path="fechaApli" size="10"/>
                                </td>
                            </tr>
                            <tr>
                                <td width="150px" align="right" class="label">* <spring:message code="sireh.label.clc.interfaz.solicitudPago.otros.fechaComp"/></td>
                                <td width="450px" align="left">
                                    <fsn:calendar path="fechaComp" size="10"/>
                                </td>
                            </tr>
                            <tr>
                                <td width="150px" align="right" class="label">* <spring:message code="sireh.label.clc.interfaz.solicitudPago.otros.doctoRef"/></td>
                                <td width="450px" align="left">
                                    <fsn:textarea path="doctoRef" rows="3" cols="70" css="anchoTextarea"/>
                                </td>
                            </tr>
                            <tr>
                                <td width="150px" align="right" class="label">* <spring:message code="sireh.label.clc.interfaz.solicitudPago.otros.mes"/></td>
                                <td width="450px" align="left">
                                    <html:select path="mes">
                                        <html:option value="0" label="SELECCIONE..."/>
                                        <option value="1">enero</option>
                                        <option value="2">febrero</option>
                                        <option value="3">marzo</option>
                                        <option value="4">abril</option>
                                        <option value="5">mayo</option>
                                        <option value="6">junio</option>
                                        <option value="7">julio</option>
                                        <option value="8">agosto</option>
                                        <option value="9">septiembre</option>
                                        <option value="10">octubre</option>
                                        <option value="11">noviembre</option>
                                        <option value="12">diciembre</option>
                                    </html:select>
                                </td>
                            </tr>
                            <tr>
                                <td width="150px" align="right" class="label"><spring:message code="sireh.label.clc.interfaz.solicitudPago.otros.qnaPago"/></td>
                                <td width="450px" align="left">
                                    <html:select path="qnaPago">
                                        <html:option value="0" label="SELECCIONE..."/>
                                        <option value="01">01</option>
                                        <option value="02">02</option>
                                        <option value="03">03</option>
                                        <option value="04">04</option>
                                        <option value="05">05</option>
                                        <option value="06">06</option>
                                        <option value="07">07</option>
                                        <option value="08">08</option>
                                        <option value="09">09</option>
                                        <option value="10">10</option>
                                        <option value="11">11</option>
                                        <option value="12">12</option>
                                        <option value="13">13</option>
                                        <option value="14">14</option>
                                        <option value="15">15</option>
                                        <option value="16">16</option>
                                        <option value="17">17</option>
                                        <option value="18">18</option>
                                        <option value="19">19</option>
                                        <option value="20">20</option>
                                        <option value="21">21</option>
                                        <option value="22">22</option>
                                        <option value="23">23</option>
                                        <option value="24">24</option>
                                    </html:select>
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                </td>
            </tr>
        </table>
    </c:set>
    
    <c:set var="content4">
        <table align="center" width="60%">
            <tr valign="top">
                <td>
                    <fieldset>
                        <legend style="font-size:1.3em">
                            <strong>&nbsp;&nbsp; Ingrese el tipo de cambio &nbsp;&nbsp;</strong>
                        </legend>
                        <table>
                            <tr>
                                <td width="150px" align="right" class="label"><spring:message code="sireh.label.clc.interfaz.solicitudPago.consejerias.tipoCambio"/></td>
                                <td width="450px" align="left">
                                    <fsn:input path="tipoCambio" size="20"/>
                                </td>
                            </tr>
                            <tr>
                                <td width="150px" align="right" class="label"><spring:message code="sireh.label.clc.interfaz.solicitudPago.consejerias.referencia"/></td>
                                <td width="450px" align="left">
                                    <fsn:textarea path="referencia" rows="3" cols="70" css="anchoTextarea"/>
                                </td>
                            </tr>
                            <tr>
                                <td width="150px" align="right" class="label"><spring:message code="sireh.label.clc.interfaz.solicitudPago.consejerias.fechaRef"/></td>
                                <td width="450px" align="left">
                                    <fsn:calendar path="fechaRef" size="10"/>
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                </td>
            </tr>
        </table>
    </c:set>
    
    <fsn:container section="init" type="tab" displayTime="3" tabHeight="25"/>
        <fsn:container name="divContent1" content="${content1}" title="Paso 1 - Cabecera" selected="true" />
        <fsn:container name="divContent2" content="${content2}" title="Paso 2 - Datos cuenta cxlc" />
        <fsn:container name="divContent3" content="${content3}" title="Paso 3 - Fechas" />
        <fsn:container name="divContent4" content="${content4}" title="Paso 4 - Consejerias" />
    <fsn:container section="final"/>

    <table align="left" width="100%">
        <tr>
            <td align="left" height="20px" valign="middle">
                <strong>
                    <spring:message code="sireh.form.required.fields"/>
                </strong>
            </td>
        </tr>
        <tr>
            <td align="center">
                <fsn:submit value="submit.generate.manual" 
                            action="clcInterfazSICOP/genSolPagoManual.do"
                            alertCode="confirm.clc.interfaz.solicitudPago"
                            progressBar="true"/> &nbsp; 
                
                <fsn:submit value="submit.cancel" 
                            action="clcInterfazSICOP/solicitudPago.do"
                            progressBar="true"/> &nbsp; 
                            
                <c:if test="${solicitudPagoDTO.csvFileName ne null and solicitudPagoDTO.csvFileName ne ''}">
                    <script type="text/javascript">
                        $j("#10003").prop("disabled",true);
                    </script>
                    <fsn:submit value="submit.download" 
                                action="clcInterfazSICOP/downloadZipFilePago.do" 
                                progressIcon="false"/>
                </c:if>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        $j(document).ready(function(){  
            $j("input[name=cxlcGrupo]").click(function() {
                var pivot = $j(this).val();
                var temp = pivot.split("|");
                
                if($j(this).is(':checked')) {
                    allChecked(temp[0], temp[1]);
                } else {
                    allUnChecked(temp[0], temp[1]);
                }  
            });
        });
        
        function allChecked(clc, secCompromiso) {
            var cxlcGrupo = window.document.getElementsByName('cxlcGrupo');
            
            for(var i = 0; i < cxlcGrupo.length; i++) {
                var pivot = cxlcGrupo[i].value;
                var temp = pivot.split("|");
                
                if (temp[1] == secCompromiso) {
                    cxlcGrupo[i].checked = true;
                }
            }
        }
        
        function allUnChecked(clc, secCompromiso) {        
            var cxlcGrupo = window.document.getElementsByName('cxlcGrupo');
            
            for(var i = 0; i < cxlcGrupo.length; i++) {
                var pivot = cxlcGrupo[i].value;
                var temp = pivot.split("|");
                
                if (temp[1] == secCompromiso) {
                    cxlcGrupo[i].checked = false;
                }
            }
        }
        
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
            clearData();
        });
        
        $j('#concepto').keypress(function (e) {
            var regex = new RegExp("^[A-Z0-9a-z\u00D1\u00F1\\s]*$");
            var str = String.fromCharCode(!e.charCode ? e.which : e.charCode);
            if (regex.test(str)) {
                return true;
            }
            e.preventDefault();
            return false;
        });
        
        $j('#doctoRef').keypress(function (e) {
            var regex2 = new RegExp("^[A-Z0-9a-z\u00D1\u00F1\\s]*$");
            var str2 = String.fromCharCode(!e.charCode ? e.which : e.charCode);
            if (regex2.test(str2)) {
                return true;
            }
            e.preventDefault();
            return false;
        });
        
        $j('#referencia').keypress(function (e) {
            var regex3 = new RegExp("^[A-Z0-9a-z\u00D1\u00F1\\s]*$");
            var str3 = String.fromCharCode(!e.charCode ? e.which : e.charCode);
            if (regex3.test(str3)) {
                return true;
            }
            e.preventDefault();
            return false;
        });
        
        $j(document).ready(function() {
            $j("#tipoCambio").keypress(function(event) { 
                return isNumber(event); 
            });
        });
        
        // THE SCRIPT THAT CHECKS IF THE KEY PRESSED IS A NUMERIC OR DECIMAL VALUE.
        function isNumber(evt) {
            var charCode = (evt.which) ? evt.which : event.keyCode
            if (charCode != 45 && (charCode != 46 || $(this).val().indexOf('.') != -1) && (charCode < 48 || charCode > 57)) {
                return false;
            }
            return true;
        }
        
        function clearData() {
            var bsTipoMoneda = $j("#bsTipoMoneda").val();
            if (bsTipoMoneda == "MXN") {
                $j("#tipoCambio").prop("disabled",true);
                $j("#referencia").prop("disabled",true);               
                $j("#text_fechaRef").prop("disabled",true);
                $j("#button_fechaRef").prop("disabled",true);
            }
            if (bsTipoMoneda == "USD") {
                $j("#tipoCambio").prop("disabled",false);
                $j("#referencia").prop("disabled",false);
                $j("#text_fechaRef").prop("disabled",false);
                $j("#button_fechaRef").prop("disabled",false);
            }
            $j("#tipoCambio").val('0.00');
            $j("#referencia").val('');
            $j("#text_fechaRef").val('');
            
            deleteOptions();
        }
        
        function deleteOptions() {            
            var bsTipoNom = $j("#bsTipoNom").val();
            
            //Nominas validas
            if (bsTipoNom == "''") {
                bsTipoNom = $j("#idTipoNominaTodas").val();
            }
            var nominas = bsTipoNom.split(","); 
            var nominaSeleccionada = '<c:out value="${solicitudPagoDTO.idTipoNomina}" />';
            
            if (nominas.length >= 1) {
                $j("#idTipoNomina").find('option').remove().end();
                $j("#idTipoNomina").append('<option value="">SELECCIONE...</option>');
                
                for (var i = 0; i < nominas.length; i++) {
                    var nom = nominas[i].replace(/'/g,"");
                    if (nom == nominaSeleccionada) {
                        $j("#idTipoNomina").append('<option value="' + nom + '" selected>' + nom + '</option>');
                    } else {
                        $j("#idTipoNomina").append('<option value="' + nom + '">' + nom + '</option>');
                    }
                }
            }
        }
    </script>
    
    <script type="text/javascript">        
        function currentTab(currentDiv) {            
            if (currentDiv == 'divContent1') {
                // Tab1
                $j("#divContent1-header").addClass("header_highlight");
                $j("#divContent1-header").addClass("tabSeleccionada");
                $j("#divContent1-header").removeClass("tabNoSeleccionada");
                $j("#divContent1-header").css('background', '#808080');
                
                $j("#divContent2-header").removeClass("header_highlight");
                $j("#divContent2-header").addClass("tabNoSeleccionada");
                $j("#divContent2-header").removeClass("tabSeleccionada");
                $j("#divContent2-header").css('background', '#F6F6F6');
                
                $j("#divContent3-header").removeClass("header_highlight");
                $j("#divContent3-header").addClass("tabNoSeleccionada");
                $j("#divContent3-header").removeClass("tabSeleccionada");
                $j("#divContent3-header").css('background', '#F6F6F6');
                
                $j("#divContent4-header").removeClass("header_highlight");
                $j("#divContent4-header").addClass("tabNoSeleccionada");
                $j("#divContent4-header").removeClass("tabSeleccionada");
                $j("#divContent4-header").css('background', '#F6F6F6');
            } else if (currentDiv == 'divContent2') {
                // Tab2
                $j("#divContent1-header").removeClass("header_highlight");
                $j("#divContent1-header").addClass("tabNoSeleccionada");
                $j("#divContent1-header").removeClass("tabSeleccionada");
                $j("#divContent1-header").css('background', '#F6F6F6');
                
                $j("#divContent2-header").addClass("header_highlight");
                $j("#divContent2-header").addClass("tabSeleccionada");
                $j("#divContent2-header").removeClass("tabNoSeleccionada");
                $j("#divContent2-header").css('background', '#808080');
                
                $j("#divContent3-header").removeClass("header_highlight");
                $j("#divContent3-header").addClass("tabNoSeleccionada");
                $j("#divContent3-header").removeClass("tabSeleccionada");
                $j("#divContent3-header").css('background', '#F6F6F6');
                
                $j("#divContent4-header").removeClass("header_highlight");
                $j("#divContent4-header").addClass("tabNoSeleccionada");
                $j("#divContent4-header").removeClass("tabSeleccionada");
                $j("#divContent4-header").css('background', '#F6F6F6');
            } else if (currentDiv == 'divContent3') {
                // Tab3
                $j("#divContent1-header").removeClass("header_highlight");
                $j("#divContent1-header").addClass("tabNoSeleccionada");
                $j("#divContent1-header").removeClass("tabSeleccionada");
                $j("#divContent1-header").css('background', '#F6F6F6');
                
                $j("#divContent2-header").removeClass("header_highlight");
                $j("#divContent2-header").addClass("tabNoSeleccionada");
                $j("#divContent2-header").removeClass("tabSeleccionada");
                $j("#divContent2-header").css('background', '#F6F6F6');
                
                $j("#divContent3-header").addClass("header_highlight");
                $j("#divContent3-header").addClass("tabSeleccionada");
                $j("#divContent3-header").removeClass("tabNoSeleccionada");
                $j("#divContent3-header").css('background', '#808080');
                
                $j("#divContent4-header").removeClass("header_highlight");
                $j("#divContent4-header").addClass("tabNoSeleccionada");
                $j("#divContent4-header").removeClass("tabSeleccionada");
                $j("#divContent4-header").css('background', '#F6F6F6');
            } else {
                // Tab4
                $j("#divContent1-header").removeClass("header_highlight");
                $j("#divContent1-header").addClass("tabNoSeleccionada");
                $j("#divContent1-header").removeClass("tabSeleccionada");
                $j("#divContent1-header").css('background', '#F6F6F6');
                
                $j("#divContent2-header").removeClass("header_highlight");
                $j("#divContent2-header").addClass("tabNoSeleccionada");
                $j("#divContent2-header").removeClass("tabSeleccionada");
                $j("#divContent2-header").css('background', '#F6F6F6');
                
                $j("#divContent3-header").removeClass("header_highlight");
                $j("#divContent3-header").addClass("tabNoSeleccionada");
                $j("#divContent3-header").removeClass("tabSeleccionada");
                $j("#divContent3-header").css('background', '#F6F6F6');
                
                $j("#divContent4-header").addClass("header_highlight");
                $j("#divContent4-header").addClass("tabSeleccionada");
                $j("#divContent4-header").removeClass("tabNoSeleccionada");
                $j("#divContent4-header").css('background', '#808080');
            }
        }
    </script>
    <style type="text/css">        
        .tabSeleccionada a:active {
            color: #fff;
            text-decoration: none;
        }
        .tabNoSeleccionada a:active {
            color: #000;
            text-decoration: none;
        }
        
        .tabSeleccionada a:hover {
            color: #fff;
            text-decoration: none;
        }
        .tabNoSeleccionada a:hover {
            color: #000;
            text-decoration: none;
        }
        
        .tabSeleccionada a:visited {
            color: #fff;
            text-decoration: none;
        }
        .tabNoSeleccionada a:visited {
            color: #000;
            text-decoration: none;
        }
    </style>
    <c:if test="${solicitudPagoDTO.buscaCxlc}">
        <script type="text/javascript">
            $j(function(){
                currentTab('divContent2');
                
                $j("#divContent1-content").css('height','');
                $j("#divContent2-content").css('height','Opx');
                $j("#divContent3-content").css('height','');
                $j("#divContent4-content").css('height','');
                
                var containerDisplayTime = "3";
                window.onload = new Accordian('fsn-container', containerDisplayTime, 'header_highlight');
            });
        </script>
    </c:if>
    
    <script type="text/javascript">
        function checkAll() {
            var checkboxes = new Array();
            checkboxes = document.getElementsByName('cxlcGrupo');
        
            for (var i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {
                    checkboxes[i].setAttribute('checked', true);
                }
            }
            // Monto
            getTotal();
        }
        
        function uncheckAll() {
            var checkboxes = new Array();
            checkboxes = document.getElementsByName('cxlcGrupo');
        
            for (var i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {
                    checkboxes[i].removeAttribute('checked');
                }
            }
            // Monto
            $j("#montoTotal").text("Total CXLC: $ 0.00");
        }
        
        function getTotal() {
            var total = 0;
            
            $j('.boxCxlc:checked').each(function(){
                // Monto
                var auxMonto = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                auxMonto = auxMonto.replace("$ ", "");
                auxMonto = auxMonto.replace(/,/g, "");
                total+=parseFloat(auxMonto);
            });
            // Monto
            $j("#montoTotal").text("Total CXLC: $ " + parseFloat(Math.round(total * 100) / 100).toFixed(2)).digits();
        }
        
        $j('.boxCxlc').change(function(){
            var total = 0;
            
            $j('.boxCxlc:checked').each(function(){
                // Monto
                var auxMonto = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                auxMonto = auxMonto.replace("$ ", "");
                auxMonto = auxMonto.replace(/,/g, "");
                total+=parseFloat(auxMonto);
            });
            // Monto
            $j("#montoTotal").text("Total CXLC: $ " + parseFloat(Math.round(total * 100) / 100).toFixed(2)).digits();
        });
        
        $j.fn.digits = function(){ 
            return this.each(function(){ 
                $j(this).text($j(this).text().replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,")); 
            });
        }
    </script>
    
    <script type="text/javascript">
        divs = document.getElementsByTagName('div');
        for (i = 0; i < divs.length; i++) {
            if (divs[i].id == 'monto') {
                divs[i].innerHTML = formato_numero(divs[i].innerHTML,2,'.',',');
            }
        }
    </script>
</html:form>