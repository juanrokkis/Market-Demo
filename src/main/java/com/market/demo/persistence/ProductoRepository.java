package com.market.demo.persistence;

import java.util.List;
import java.util.Optional;

import com.market.demo.persistence.crud.ProductoCrudRepository;
import com.market.demo.persistence.entity.Producto;

public class ProductoRepository {
    
    private ProductoCrudRepository productoCrudRepository;

    //Query Method
    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    //Query Method
    public List<Producto> getByCategoria(int idCategoria){
        return (List<Producto>) productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    //Query Method
    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true); 
    }

}
