package com.market.demo.persistence.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name = "compras")

public class Compra {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_compra")
    private Integer idCompra;

    @Column (name = "id_cliente")
    private String idCliente;
    
    private LocalDateTime fecha;

    @Column (name = "medio_Pago")
    private String medioPago;

    private String comentario;

    private String estado;

    //Relación compra y cliente

    @ManyToOne 
    @JoinColumn (name = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;

    //Relación compra y comprasProducto

    @OneToMany(mappedBy = "producto")
    private List <ComprasProducto> productos;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
