package gob.shcp.sireh.model.nomina.calculo;

import gob.shcp.fsn.model.Model;

public class AltasYBajasDTO implements java.io.Serializable, Model {

    // Datos 
    private Integer ciclo;
    private String tipoNomIni;
    private String gpoPagoIni;
    private String numCompIni;
    private String tipoNomFin;
    private String gpoPagoFin;
    private String numCompFin;
    private Integer qnaIni;
    private Integer qnaFin;
    private String idNomina;
    private Integer quincenaAnterior;
    private Integer quincenaReferencia;
    private Integer existeQuincenaAnterior;
    private Integer existeQuincenaReferencia;
    private Integer comprobante;
    private String empleado;
    private String puestoFuncional;
    private String curp;
    private String cveBanco;
    private String plaza;
    private String nivelHerramienta;
    private String imssIssste;
    private String unidadFisica;
    private String pcp;
    private String zonaPagadora;
    private String numPension;
    private String regcontFecPago;
    private String leyendaCancelado;
    private Integer hpFolio;
    private Integer hpDifFolio;
    private Double hpNetoPago;
    private Double deducciones;
    private Double percepciones;
    private String nomIni;
    private String nomFin;
    
    // Configuracion inicial
    private String seccion;
    private String beanName;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    private boolean muestraRegistros; 
    private boolean cancel;

    public void setIdNomina(String idNomina) {
        this.idNomina = idNomina;
    }

    public String getIdNomina() {
        return idNomina;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setUrlOrigen(String urlOrigen) {
        this.urlOrigen = urlOrigen;
    }

    public String getUrlOrigen() {
        return urlOrigen;
    }

    public void setUrlDestino(String urlDestino) {
        this.urlDestino = urlDestino;
    }

    public String getUrlDestino() {
        return urlDestino;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setQnaIni(Integer qnaIni) {
        this.qnaIni = qnaIni;
    }

    public Integer getQnaIni() {
        return qnaIni;
    }

    public void setQnaFin(Integer qnaFin) {
        this.qnaFin = qnaFin;
    }

    public Integer getQnaFin() {
        return qnaFin;
    }

    public void setQuincenaAnterior(Integer quincenaAnterior) {
        this.quincenaAnterior = quincenaAnterior;
    }

    public Integer getQuincenaAnterior() {
        return quincenaAnterior;
    }

    public void setQuincenaReferencia(Integer quincenaReferencia) {
        this.quincenaReferencia = quincenaReferencia;
    }

    public Integer getQuincenaReferencia() {
        return quincenaReferencia;
    }

    public void setExisteQuincenaAnterior(Integer existeQuincenaAnterior) {
        this.existeQuincenaAnterior = existeQuincenaAnterior;
    }

    public Integer getExisteQuincenaAnterior() {
        return existeQuincenaAnterior;
    }

    public void setExisteQuincenaReferencia(Integer existeQuincenaReferencia) {
        this.existeQuincenaReferencia = existeQuincenaReferencia;
    }

    public Integer getExisteQuincenaReferencia() {
        return existeQuincenaReferencia;
    }

    public void setComprobante(Integer comprobante) {
        this.comprobante = comprobante;
    }

    public Integer getComprobante() {
        return comprobante;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setPuestoFuncional(String puestoFuncional) {
        this.puestoFuncional = puestoFuncional;
    }

    public String getPuestoFuncional() {
        return puestoFuncional;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setCveBanco(String cveBanco) {
        this.cveBanco = cveBanco;
    }

    public String getCveBanco() {
        return cveBanco;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setNivelHerramienta(String nivelHerramienta) {
        this.nivelHerramienta = nivelHerramienta;
    }

    public String getNivelHerramienta() {
        return nivelHerramienta;
    }

    public void setImssIssste(String imssIssste) {
        this.imssIssste = imssIssste;
    }

    public String getImssIssste() {
        return imssIssste;
    }

    public void setUnidadFisica(String unidadFisica) {
        this.unidadFisica = unidadFisica;
    }

    public String getUnidadFisica() {
        return unidadFisica;
    }

    public void setPcp(String pcp) {
        this.pcp = pcp;
    }

    public String getPcp() {
        return pcp;
    }

    public void setZonaPagadora(String zonaPagadora) {
        this.zonaPagadora = zonaPagadora;
    }

    public String getZonaPagadora() {
        return zonaPagadora;
    }

    public void setNumPension(String numPension) {
        this.numPension = numPension;
    }

    public String getNumPension() {
        return numPension;
    }

    public void setRegcontFecPago(String regcontFecPago) {
        this.regcontFecPago = regcontFecPago;
    }

    public String getRegcontFecPago() {
        return regcontFecPago;
    }

    public void setLeyendaCancelado(String leyendaCancelado) {
        this.leyendaCancelado = leyendaCancelado;
    }

    public String getLeyendaCancelado() {
        return leyendaCancelado;
    }

    public void setHpFolio(Integer hpFolio) {
        this.hpFolio = hpFolio;
    }

    public Integer getHpFolio() {
        return hpFolio;
    }

    public void setHpDifFolio(Integer hpDifFolio) {
        this.hpDifFolio = hpDifFolio;
    }

    public Integer getHpDifFolio() {
        return hpDifFolio;
    }

    public void setHpNetoPago(Double hpNetoPago) {
        this.hpNetoPago = hpNetoPago;
    }

    public Double getHpNetoPago() {
        return hpNetoPago;
    }

    public void setDeducciones(Double deducciones) {
        this.deducciones = deducciones;
    }

    public Double getDeducciones() {
        return deducciones;
    }

    public void setPercepciones(Double percepciones) {
        this.percepciones = percepciones;
    }

    public Double getPercepciones() {
        return percepciones;
    }

    public void setNomIni(String nomIni) {
        this.nomIni = nomIni;
    }

    public String getNomIni() {
        return nomIni;
    }

    public void setNomFin(String nomFin) {
        this.nomFin = nomFin;
    }

    public String getNomFin() {
        return nomFin;
    }

    public void setTipoNomIni(String tipoNomIni) {
        this.tipoNomIni = tipoNomIni;
    }

    public String getTipoNomIni() {
        return tipoNomIni;
    }

    public void setGpoPagoIni(String gpoPagoIni) {
        this.gpoPagoIni = gpoPagoIni;
    }

    public String getGpoPagoIni() {
        return gpoPagoIni;
    }

    public void setTipoNomFin(String tipoNomFin) {
        this.tipoNomFin = tipoNomFin;
    }

    public String getTipoNomFin() {
        return tipoNomFin;
    }

    public void setGpoPagoFin(String gpoPagoFin) {
        this.gpoPagoFin = gpoPagoFin;
    }

    public String getGpoPagoFin() {
        return gpoPagoFin;
    }

    public void setNumCompIni(String numCompIni) {
        this.numCompIni = numCompIni;
    }

    public String getNumCompIni() {
        return numCompIni;
    }

    public void setNumCompFin(String numCompFin) {
        this.numCompFin = numCompFin;
    }

    public String getNumCompFin() {
        return numCompFin;
    }
}
