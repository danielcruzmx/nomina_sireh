package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class CustomTnPlantillaPlazaEstructura extends TnPlantillaPlazaEstructura implements Domain, 
                                                                                            Serializable {
    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
