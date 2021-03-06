package gob.shcp.sireh.model.expediente.gestion.documentos;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.util.FileContent;
import gob.shcp.jcr.node.FsnResource;

import java.util.Date;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ExpedienteCartillaMilitarDTO extends FsnResource implements Model {
    
    public static String NODE_TYPE = "fsn:expedienteSirehResource";
    public static final String PROPERTY_RFC_META = "fsn:rfc_meta";
    public static final String PROPERTY_DOC_META = "fsn:doc_meta";
    
    // Datos del Empleado
    private String rfcEmpleadoBusqueda;
    private String nombreEmpleadoCompleto;
    
    // Filtros
    private String numCartilla;
    private String fecLiberacion;
    private Integer cmiSecuencia;
    private String idDocto;
    private Integer idExpRechazo;
    private String cmiDoctoRef;
    private String idStatus;
    private String usuario;
    private Date fecModifico;
    private Integer rechazo;
    
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
    private boolean rolAutorizar;
    private boolean rolRegistrar;
    private boolean rolRechazar;
    private String[] docGrupo;
    
    private Integer totalRegistrados;
    private Integer totalRechazados;
    // JCR
    public ExpedienteCartillaMilitarDTO() {
        super(NODE_TYPE);
        setVersionable(true);
    }
    public ExpedienteCartillaMilitarDTO(Map properties) {
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
    
    public void setNumCartilla(String numCartilla) {
        this.numCartilla = numCartilla;
    }

    public String getNumCartilla() {
        return numCartilla;
    }

    public void setFecLiberacion(String fecLiberacion) {
        this.fecLiberacion = fecLiberacion;
    }

    public String getFecLiberacion() {
        return fecLiberacion;
    }

    public void setRfcEmpleadoBusqueda(String rfcEmpleadoBusqueda) {
        this.rfcEmpleadoBusqueda = rfcEmpleadoBusqueda;
    }

    public String getRfcEmpleadoBusqueda() {
        return rfcEmpleadoBusqueda;
    }

    public void setRollback(boolean rollback) {
        this.rollback = rollback;
    }

    public boolean isRollback() {
        return rollback;
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

    public void setCmiSecuencia(Integer cmiSecuencia) {
        this.cmiSecuencia = cmiSecuencia;
    }

    public Integer getCmiSecuencia(Integer cmiSecuencia) {
        return cmiSecuencia;
    }

    public void setIdDocto(String idDocto) {
        this.idDocto = idDocto;
    }

    public String getIdDocto() {
        return idDocto;
    }

    public void setCmiDoctoRef(String cmiDoctoRef) {
        this.cmiDoctoRef = cmiDoctoRef;
    }

    public String getCmiDoctoRef() {
        return cmiDoctoRef;
    }

    public void setIdStatus(String idStatus) {
        this.idStatus = idStatus;
    }

    public String getIdStatus() {
        return idStatus;
    }

    public void setIdExpRechazo(Integer idExpRechazo) {
        this.idExpRechazo = idExpRechazo;
    }

    public Integer getIdExpRechazo() {
        return idExpRechazo;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setFecModifico(Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    public Date getFecModifico() {
        return fecModifico;
    }

    // Validaciones
    @ValidationMethod(forProperty = "numCartilla", errorCode = "not.null")
    public boolean validateNumCartillaRequired() {
        if (this.isRegistrar()) {
            return (this.getNumCartilla() != null && this.getNumCartilla().length() > 0);
        }
        return true;
    }

    @ValidationMethod(forProperty = "fecLiberacion", errorCode = "not.null")
    public boolean validateFecLiberacionRequiered() {
//        if (this.isRegistrar()) {
//            return (this.getFecLiberacion() != null && this.getFecLiberacion().length() > 0);
//        }
        return true;
    }

    @ValidationMethod(forProperty = "documentoSoporte", errorCode = "not.null")
    public boolean validateDocumentoSoporteRequired() {
        if (this.isRegistrar()) {
            return (this.getDocumentoSoporte() != null && this.getDocumentoSoporte().getSize() > 0);
        }
        return true;
    }

    @ValidationMethod(forProperty = "documentoSoporte", errorCode = "not.pdf")
    public boolean validateDocumentoSoportePdf() {
        if (this.isRegistrar()) {
            return (this.getDocumentoSoporte() != null && this.getDocumentoSoporte().getSize() > 0 && FilenameUtils.getExtension(this.getDocumentoSoporte().getOriginalFilename()).equals("pdf"));
        }
        return true;
    }

   
    @ValidationMethod(forProperty = "idExpRechazo", errorCode = "not.null")
    public boolean validateEstatusRechazo() {
        if (this.isRechazar()) {
            return this.getIdExpRechazo() != null;
        }
        return true;
    }

    public void setTotalRegistrados(Integer totalRegistrados) {
        this.totalRegistrados = totalRegistrados;
    }

    public Integer getTotalRegistrados() {
        return totalRegistrados;
    }

    public void setTotalRechazados(Integer totalRechazados) {
        this.totalRechazados = totalRechazados;
    }

    public Integer getTotalRechazados() {
        return totalRechazados;
    }

    public void setRolAutorizar(boolean rolAutorizar) {
        this.rolAutorizar = rolAutorizar;
    }

    public boolean isRolAutorizar() {
        return rolAutorizar;
    }

    public void setRolRegistrar(boolean rolRegistrar) {
        this.rolRegistrar = rolRegistrar;
    }

    public boolean isRolRegistrar() {
        return rolRegistrar;
    }

    public void setRolRechazar(boolean rolRechazar) {
        this.rolRechazar = rolRechazar;
    }

    public boolean isRolRechazar() {
        return rolRechazar;
    }
}
