package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdExpExperienciaLaboral data.
 */
public class TdExpExperienciaLaboral implements Domain, Serializable {
    private TdExpExperienciaLaboralPK idComposite;
    private int idExpRechazo;
    private java.util.Date expFecFinal;
    private java.util.Date expFecInicial;
    private java.lang.String expOrganizacion;
    private java.util.Date fecModifico;
    private java.lang.String idActPrinc;
    private java.lang.String idNivelCargo;
    private java.lang.String idPais;
    private java.lang.String idStatus;
    private java.lang.String usuario;
    private java.lang.String expDoctoRef;
    private java.lang.String expSector;

    /**
     * Constructor for TdExpExperienciaLaboral class.
     */
    public TdExpExperienciaLaboral() {
    }

    /**
     * Constructor for TdExpExperienciaLaboral class.
     *
     * @param expSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param expFecFinal java.util.Date
     * @param expFecInicial java.util.Date
     * @param expOrganizacion java.lang.String
     * @param fecModifico java.util.Date
     * @param idActPrinc java.lang.String
     * @param idNivelCargo java.lang.String
     * @param idPais java.lang.String
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param expDoctoRef java.lang.String
     * @param expSector java.lang.String
     */
    public TdExpExperienciaLaboral(TdExpExperienciaLaboralPK idComposite, 
                                   int idExpRechazo, 
                                   java.util.Date expFecFinal, 
                                   java.util.Date expFecInicial, 
                                   java.lang.String expOrganizacion, 
                                   java.util.Date fecModifico, 
                                   java.lang.String idActPrinc, 
                                   java.lang.String idNivelCargo, 
                                   java.lang.String idPais, 
                                   java.lang.String idStatus, 
                                   java.lang.String usuario, 
                                   java.lang.String expDoctoRef, 
                                   java.lang.String expSector) {
        this.idComposite = idComposite;
        this.idExpRechazo = idExpRechazo;
        this.expFecFinal = expFecFinal;
        this.expFecInicial = expFecInicial;
        this.expOrganizacion = expOrganizacion;
        this.fecModifico = fecModifico;
        this.idActPrinc = idActPrinc;
        this.idNivelCargo = idNivelCargo;
        this.idPais = idPais;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.expDoctoRef = expDoctoRef;
        this.expSector = expSector;
    }

    /**
     * Get expSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getExpSecuencia() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getExpSecuencia();
    }

    /**
     * Get idDocto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdDocto() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdDocto();
    }

    /**
     * Get rfcEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcEmpleado() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getRfcEmpleado();
    }

    /**
     * Get idExpRechazo value.
     *
     * @return int
     */
    public int getIdExpRechazo() {
        return this.idExpRechazo;
    }

    /**
     * Get expFecFinal value.
     *
     * @return java.util.Date
     */
    public java.util.Date getExpFecFinal() {
        return this.expFecFinal;
    }

    /**
     * Get expFecInicial value.
     *
     * @return java.util.Date
     */
    public java.util.Date getExpFecInicial() {
        return this.expFecInicial;
    }

    /**
     * Get expOrganizacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getExpOrganizacion() {
        return this.expOrganizacion;
    }

    /**
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
    }

    /**
     * Get idActPrinc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdActPrinc() {
        return this.idActPrinc;
    }

    /**
     * Get idNivelCargo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNivelCargo() {
        return this.idNivelCargo;
    }

    /**
     * Get idPais value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPais() {
        return this.idPais;
    }

    /**
     * Get idStatus value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdStatus() {
        return this.idStatus;
    }

    /**
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
    }

    /**
     * Get expDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getExpDoctoRef() {
        return this.expDoctoRef;
    }

    /**
     * Get expSector value.
     *
     * @return java.lang.String
     */
    public java.lang.String getExpSector() {
        return this.expSector;
    }

    /**
     * Set expSecuencia value.
     *
     * @param expSecuencia java.lang.Integer
     */
    public void setExpSecuencia(java.lang.Integer expSecuencia) {
        if (idComposite == null) {
            idComposite = new TdExpExperienciaLaboralPK();
        }
        this.idComposite.setExpSecuencia(expSecuencia);
    }

    /**
     * Set idDocto value.
     *
     * @param idDocto java.lang.String
     */
    public void setIdDocto(java.lang.String idDocto) {
        if (idComposite == null) {
            idComposite = new TdExpExperienciaLaboralPK();
        }
        this.idComposite.setIdDocto(idDocto);
    }

    /**
     * Set rfcEmpleado value.
     *
     * @param rfcEmpleado java.lang.String
     */
    public void setRfcEmpleado(java.lang.String rfcEmpleado) {
        if (idComposite == null) {
            idComposite = new TdExpExperienciaLaboralPK();
        }
        this.idComposite.setRfcEmpleado(rfcEmpleado);
    }

    /**
     * Set idExpRechazo value.
     *
     * @param idExpRechazo int
     */
    public void setIdExpRechazo(int idExpRechazo) {
        this.idExpRechazo = idExpRechazo;
    }

    /**
     * Set expFecFinal value.
     *
     * @param expFecFinal java.util.Date
     */
    public void setExpFecFinal(java.util.Date expFecFinal) {
        this.expFecFinal = expFecFinal;
    }

    /**
     * Set expFecInicial value.
     *
     * @param expFecInicial java.util.Date
     */
    public void setExpFecInicial(java.util.Date expFecInicial) {
        this.expFecInicial = expFecInicial;
    }

    /**
     * Set expOrganizacion value.
     *
     * @param expOrganizacion java.lang.String
     */
    public void setExpOrganizacion(java.lang.String expOrganizacion) {
        this.expOrganizacion = expOrganizacion;
    }

    /**
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    /**
     * Set idActPrinc value.
     *
     * @param idActPrinc java.lang.String
     */
    public void setIdActPrinc(java.lang.String idActPrinc) {
        this.idActPrinc = idActPrinc;
    }

    /**
     * Set idNivelCargo value.
     *
     * @param idNivelCargo java.lang.String
     */
    public void setIdNivelCargo(java.lang.String idNivelCargo) {
        this.idNivelCargo = idNivelCargo;
    }

    /**
     * Set idPais value.
     *
     * @param idPais java.lang.String
     */
    public void setIdPais(java.lang.String idPais) {
        this.idPais = idPais;
    }

    /**
     * Set idStatus value.
     *
     * @param idStatus java.lang.String
     */
    public void setIdStatus(java.lang.String idStatus) {
        this.idStatus = idStatus;
    }

    /**
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    /**
     * Set expDoctoRef value.
     *
     * @param expDoctoRef java.lang.String
     */
    public void setExpDoctoRef(java.lang.String expDoctoRef) {
        this.expDoctoRef = expDoctoRef;
    }

    /**
     * Set expSector value.
     *
     * @param expSector java.lang.String
     */
    public void setExpSector(java.lang.String expSector) {
        this.expSector = expSector;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdExpExperienciaLaboralPK)idComposite;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idComposite;
    }
}
