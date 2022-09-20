package com.market.demo.persistence.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.market.demo.persistence.entity.Producto;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>{

    /*
    Query Nativo
    @Query(value = "select * from productos where id_categoria = ?", nativeQuery = true)
    List<Producto> findByIdCategoria(int idCategoria);  No es necesario nombrar el metodo así
    */
    
    //Query Method
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    //Query Method
    Optional <List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
    
    
}
