package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcTipoPlaza;


/**
 * Data access interface for TcTipoPlaza.
 */
public interface TcTipoPlazaDAO extends JdbcDataService {
    /**
     * Find TcTipoPlaza entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcTipoPlaza
     */
    @FindById(TcTipoPlaza.class)
    TcTipoPlaza getById(java.lang.String id);
    
    /**
     * Get all TcTipoPlaza entities limited by a maximum number of elements.
     *
     * @return Collection of TcTipoPlaza
     */
    @FindAll(TcTipoPlaza.class)
    List<TcTipoPlaza> findAll();
    
    /**
     * Make persistence of TcTipoPlaza entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcTipoPlaza
     */
    @Save
    void save(TcTipoPlaza entity);
    
    /**
     * Remove TcTipoPlaza entities.
     *
     * @param entity TcTipoPlaza
     */
    @Delete
    void delete(TcTipoPlaza entity);


    /**
     * Find the first TcTipoPlaza entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcTipoPlaza
     */
    @FindByCondition(value=TcTipoPlaza.class, condition="FEC_MODIFICO=?")
    TcTipoPlaza getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcTipoPlaza entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcTipoPlaza
     */
    @FindByCondition(value=TcTipoPlaza.class, condition="FEC_MODIFICO=?")
    List<TcTipoPlaza> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcTipoPlaza entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcTipoPlaza
     */
    @FindByCondition(value=TcTipoPlaza.class, condition="USUARIO=?")
    TcTipoPlaza getByUsuario(java.lang.String usuario);

    /**
     * Find all TcTipoPlaza entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcTipoPlaza
     */
    @FindByCondition(value=TcTipoPlaza.class, condition="USUARIO=?")
    List<TcTipoPlaza> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TcTipoPlaza entity that matches the condition 'where descTipoPlaza is equals to'.
     *
     * @param descTipoPlaza java.lang.String
     * @return TcTipoPlaza
     */
    @FindByCondition(value=TcTipoPlaza.class, condition="DESC_TIPO_PLAZA=?")
    TcTipoPlaza getByDescTipoPlaza(java.lang.String descTipoPlaza);

    /**
     * Find all TcTipoPlaza entities that matches the condition 'where descTipoPlaza is equals to'.
     *
     * @param descTipoPlaza java.lang.String
     * @return Collection of TcTipoPlaza
     */
    @FindByCondition(value=TcTipoPlaza.class, condition="DESC_TIPO_PLAZA=?")
    List<TcTipoPlaza> findByDescTipoPlaza(java.lang.String descTipoPlaza);
}