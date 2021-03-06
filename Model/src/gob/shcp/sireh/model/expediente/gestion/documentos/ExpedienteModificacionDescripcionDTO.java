package gob.shcp.sireh.model.expediente.gestion.documentos;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.util.FileContent;
import gob.shcp.jcr.node.FsnResource;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ExpedienteModificacionDescripcionDTO  extends FsnResource implements java.io.Serializable, Model {

    public static String NODE_TYPE = "fsn:expedienteSirehResource";
    public static final String PROPERTY_RFC_META = "fsn:rfc_meta";
    public static final String PROPERTY_DOC_META = "fsn:doc_meta";

    // Datos del Empleado
    private String rfcEmpleadoBusqueda;
    private String nombreEmpleadoCompleto;
    private String idTipoDoctoBusqueda;
    
    // Documento Soporte
    private FileContent documentoSoporte;
    private boolean rollback;

    // Configuracion inicial
    private String beanName;

    // Navegacion
    private String urlOrigen;
    private String urlDestino;

    // Control
    private boolean cancel;
    private boolean muestraRegistros;
    private boolean clean;
    private boolean autorizar;
    private boolean rechazar;
    private boolean registrar;
    
    // Busqueda
    private String[] docGrupo;
    
    // Edicion
    private String auxDocto;
    private String auxDescripcionDocto;
    private String auxdsdDescripDocto;
    private Integer auxAnioDocto;
    private String auxEstadoDocto;
    private Integer idDocto;
    
    private List<String> DOCUMENTOS_SIN_CAPTURA = Arrays.asList("SOEMP", "CURRV", "CERME", "IDOFI", "DCLFD", "MBPDV", "CNISF", "CILAB", "SOCEM", "ABMIS", 
                                                                "CIFON", "INSAR", "AHOSO", "CSGMM", "SEGUR", "OFIDO", "CONNO", "ACSPF", "PSPAS", "DOSPF", 
                                                                "COSER", "HUSER", "CONES", "ACTAD", "RNOIC", "AEOIC", "ACTAT", "MEDDI", "CONHE", "CAISS", 
                                                                "DEMAN", "LAUEJ", "BECAS", "ACDEF", "OFIRE", "OFISU", "ACUBA", "DMINC", "DESBE", "LICIS");
    private String hiddenIdDocto;
    
    // JCR
    public ExpedienteModificacionDescripcionDTO() {
        super(NODE_TYPE);
        setVersionable(true);
    }

    public ExpedienteModificacionDescripcionDTO(Map properties) {
        super(properties, NODE_TYPE);
        setVersionable(true);
    }

    public void setRfcMeta(String rfcMeta) {
        this.getProperties().put(PROPERTY_RFC_META, rfcMeta);
    }

    public String getRfcMeta() {
        return (String)this.getProperties().get(PROPERTY_RFC_META);
    }

    public void setDocMeta(String docMeta) {
        this.getProperties().put(PROPERTY_DOC_META, docMeta);
    }

    public String getDocMeta() {
        return (String)this.getProperties().get(PROPERTY_DOC_META);
    }

    public void setDescripcion(String descripcion) {
        super.getProperties().put(PROPERTY_DESCRIPTION, descripcion);
    }

    public String getDescripcion() {
        return (String)super.getProperties().get(PROPERTY_DESCRIPTION);
    }

    // Metodos de acceso
    public void setRfcEmpleadoBusqueda(String rfcEmpleadoBusqueda) {
        this.rfcEmpleadoBusqueda = rfcEmpleadoBusqueda;
    }

    public String getRfcEmpleadoBusqueda() {
        return rfcEmpleadoBusqueda;
    }

    public void setNombreEmpleadoCompleto(String nombreEmpleadoCompleto) {
        this.nombreEmpleadoCompleto = nombreEmpleadoCompleto;
    }

    public String getNombreEmpleadoCompleto() {
        return nombreEmpleadoCompleto;
    }

    public void setDocumentoSoporte(FileContent documentoSoporte) {
        this.documentoSoporte = documentoSoporte;
    }

    public FileContent getDocumentoSoporte() {
        return documentoSoporte;
    }

    public void setRollback(boolean rollback) {
        this.rollback = rollback;
    }

    public boolean isRollback() {
        return rollback;
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

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public boolean isClean() {
        return clean;
    }

    public void setAutorizar(boolean autorizar) {
        this.autorizar = autorizar;
    }

    public boolean isAutorizar() {
        return autorizar;
    }

    public void setRechazar(boolean rechazar) {
        this.rechazar = rechazar;
    }

    public boolean isRechazar() {
        return rechazar;
    }

    public void setRegistrar(boolean registrar) {
        this.registrar = registrar;
    }

    public boolean isRegistrar() {
        return registrar;
    }

    public void setDocGrupo(String[] docGrupo) {
        this.docGrupo = docGrupo;
    }

    public String[] getDocGrupo() {
        return docGrupo;
    }
    
    public void setIdTipoDoctoBusqueda(String idTipoDoctoBusqueda) {
        this.idTipoDoctoBusqueda = idTipoDoctoBusqueda;
    }

    public String getIdTipoDoctoBusqueda() {
        return idTipoDoctoBusqueda;
    }
    
    public void setAuxDocto(String auxDocto) {
        this.auxDocto = auxDocto;
    }

    public String getAuxDocto() {
        return auxDocto;
    }

    public void setAuxDescripcionDocto(String auxDescripcionDocto) {
        this.auxDescripcionDocto = auxDescripcionDocto;
    }

    public String getAuxDescripcionDocto() {
        return auxDescripcionDocto;
    }

    public void setAuxAnioDocto(Integer auxAnioDocto) {
        this.auxAnioDocto = auxAnioDocto;
    }

    public Integer getAuxAnioDocto() {
        return auxAnioDocto;
    }

    public void setAuxEstadoDocto(String auxEstadoDocto) {
        this.auxEstadoDocto = auxEstadoDocto;
    }

    public String getAuxEstadoDocto() {
        return auxEstadoDocto;
    }

    public void setAuxdsdDescripDocto(String auxdsdDescripDocto) {
        this.auxdsdDescripDocto = auxdsdDescripDocto;
    }

    public String getAuxdsdDescripDocto() {
        return auxdsdDescripDocto;
    }
    
    public void setHiddenIdDocto(String hiddenIdDocto) {
        this.hiddenIdDocto = hiddenIdDocto;
    }

    public String getHiddenIdDocto() {
        return hiddenIdDocto;
    }
    
    @ValidationMethod(forProperty = "auxDescripcionDocto", errorCode = "not.null")
    public boolean validateDescipcionDocumentoRequiered() {
        if (this.isRegistrar()) {
            if (this.getHiddenIdDocto() == null || this.getHiddenIdDocto().length() == 0) {
                return false;
            }
            
            // Documento sin captura de datos
            if(this.DOCUMENTOS_SIN_CAPTURA.contains(this.getHiddenIdDocto().split(",")[0] ) ) {
                return (this.getAuxDescripcionDocto() != null &&  !this.getAuxDescripcionDocto().equals(""));
            }
            //Documentos con captura de datos
            else if(! this.DOCUMENTOS_SIN_CAPTURA.contains(this.getHiddenIdDocto().split(",")[0] ) ){
                return true;
            }
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "auxdsdDescripDocto", errorCode = "not.null")
    public boolean validateAuxdsdDescripDoctoRequiered() {
        if (this.isRegistrar()) {
            if (this.getHiddenIdDocto() == null || this.getHiddenIdDocto().length() == 0) {
                return false;
            }
            
            if (this.DOCUMENTOS_SIN_CAPTURA.contains(this.getHiddenIdDocto().split(",")[0] ) ) {
                return (this.getAuxdsdDescripDocto() != null &&  !this.getAuxdsdDescripDocto().equals(""));
            }
            else if(! this.DOCUMENTOS_SIN_CAPTURA.contains(this.getHiddenIdDocto().split(",")[0] ) ){
                return true;
            }
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "hiddenIdDocto", errorCode = "not.null")
    public boolean validateIdDocumentoRequiered() {
        if (this.isRegistrar()) {
            if (this.getHiddenIdDocto() == null || this.getHiddenIdDocto().length() == 0) {
                return false;
            }
        }
        return true;
    }

    public void setIdDocto(Integer idDocto) {
        this.idDocto = idDocto;
    }

    public Integer getIdDocto() {
        return idDocto;
    }
}
