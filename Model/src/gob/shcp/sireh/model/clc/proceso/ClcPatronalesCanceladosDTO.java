package gob.shcp.sireh.model.clc.proceso;

import gob.shcp.fsn.model.Model;

import java.util.List;

public class ClcPatronalesCanceladosDTO implements java.io.Serializable, Model {
    
    // Filtros
    private String nominaOrigen;
     
    private Integer ciclo;
    private String quincena;
    private List<Integer> quincenasList;
    private String tipoNominaPatronales;
    private Integer complemento;
    private Integer clcCancelacion;
    
    private List<String> conceptoPagoList;
    private Integer estado;
    
    // Parametros de control
    private boolean busquedaClc;
    private boolean cancel;
    private boolean muestraRegistros;
    private boolean busquedaDisabled;
    
    // PagedList
    private List<String> guiasContablesList;
    private String cxlcCadena;
    private String[] folioGrupo;
    private String[] compensadaGrupo;
    private String[] trabajadorGrupo;
    private String[] compensadaGrupoArrayValores;
    private String[] trabajadorGrupoArrayValores;
    
    // Procesa
    private Integer qnaCancelacion;
    
    // Errores    
    private boolean muestraErrores;

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setQuincena(String quincena) {
        this.quincena = quincena;
    }

    public String getQuincena() {
        return quincena;
    }

    public void setQuincenasList(List<Integer> quincenasList) {
        this.quincenasList = quincenasList;
    }

    public List<Integer> getQuincenasList() {
        return quincenasList;
    }

    public void setTipoNominaPatronales(String tipoNominaPatronales) {
        this.tipoNominaPatronales = tipoNominaPatronales;
    }

    public String getTipoNominaPatronales() {
        return tipoNominaPatronales;
    }

    public void setBusquedaClc(boolean busquedaClc) {
        this.busquedaClc = busquedaClc;
    }

    public boolean isBusquedaClc() {
        return busquedaClc;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setGuiasContablesList(List<String> guiasContablesList) {
        this.guiasContablesList = guiasContablesList;
    }

    public List<String> getGuiasContablesList() {
        return guiasContablesList;
    }

    public void setCxlcCadena(String cxlcCadena) {
        this.cxlcCadena = cxlcCadena;
    }

    public String getCxlcCadena() {
        return cxlcCadena;
    }

    public void setCompensadaGrupo(String[] compensadaGrupo) {
        this.compensadaGrupo = compensadaGrupo;
    }

    public String[] getCompensadaGrupo() {
        return compensadaGrupo;
    }

    public void setTrabajadorGrupo(String[] trabajadorGrupo) {
        this.trabajadorGrupo = trabajadorGrupo;
    }

    public String[] getTrabajadorGrupo() {
        return trabajadorGrupo;
    }

    public void setQnaCancelacion(Integer qnaCancelacion) {
        this.qnaCancelacion = qnaCancelacion;
    }

    public Integer getQnaCancelacion() {
        return qnaCancelacion;
    }

    public void setComplemento(Integer complemento) {
        this.complemento = complemento;
    }

    public Integer getComplemento() {
        return complemento;
    }

    public void setClcCancelacion(Integer clcCancelacion) {
        this.clcCancelacion = clcCancelacion;
    }

    public Integer getClcCancelacion() {
        return clcCancelacion;
    }
    
    public void setFolioGrupo(String[] folioGrupo) {
        this.folioGrupo = folioGrupo;
    }

    public String[] getFolioGrupo() {
        return folioGrupo;
    }
    
    public void setCompensadaGrupoArrayValores(String[] compensadaGrupoArrayValores) {
        this.compensadaGrupoArrayValores = compensadaGrupoArrayValores;
    }

    public String[] getCompensadaGrupoArrayValores() {
        return compensadaGrupoArrayValores;
    }

    public void setTrabajadorGrupoArrayValores(String[] trabajadorGrupoArrayValores) {
        this.trabajadorGrupoArrayValores = trabajadorGrupoArrayValores;
    }

    public String[] getTrabajadorGrupoArrayValores() {
        return trabajadorGrupoArrayValores;
    }
    
    public void setMuestraErrores(boolean muestraErrores) {
        this.muestraErrores = muestraErrores;
    }

    public boolean isMuestraErrores() {
        return muestraErrores;
    }
    
    /* V A L I D A C I O N E S */

    /*@ValidationMethod(forProperty = "ciclo", errorCode = "error.generar.unselected")
    private boolean validateCiclo() {
        if (this.isBusquedaClc()) {
            return (this.getCiclo() != null && this.getCiclo() > 0);
        }
        return true;
    }

    @ValidationMethod(forProperty = "quincena", errorCode = "error.generar.unselected")
    private boolean validateQuincena() {
        if (this.isBusquedaClc()) {
            return (this.getQuincena() != null && !this.getQuincena().equals(""));
        }
        return true;
    }

    @ValidationMethod(forProperty = "tipoNominaPatronales", errorCode = "error.generar.unselected")
    private boolean validateTipoNominaPatronales() {
        if (this.isBusquedaClc()) {
            return (this.getTipoNominaPatronales() != null && !this.getTipoNominaPatronales().equals(""));
        }
        return true;
    }

    @ValidationMethod(forProperty = "complemento", errorCode = "error.generar.unselected")
    private boolean validateComplemento() {
        if (this.isBusquedaClc()) {
            return (this.getComplemento() != null);
        }
        return true;
    }

    @ValidationMethod(forProperty = "clc", errorCode = "error.generar.unselected")
    private boolean validateClc() {
        if (this.isBusquedaClc()) {
            return (this.getClc() != null && this.getClc() > 0);
        }
        return true;
    }*/
    
    public String getNominaOrigen() {
        return nominaOrigen;
    }

    public void setNominaOrigen(String nominaOrigen) {
        this.nominaOrigen = nominaOrigen;
    }
    
    public boolean isBusquedaDisabled() {
        return busquedaDisabled;
    }

    public void setBusquedaDisabled(boolean busquedaDisabled) {
        this.busquedaDisabled = busquedaDisabled;
    }

    public List<String> getConceptoPagoList() {
        return conceptoPagoList;
    }

    public void setConceptoPagoList(List<String> conceptoPagoList) {
        this.conceptoPagoList = conceptoPagoList;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
