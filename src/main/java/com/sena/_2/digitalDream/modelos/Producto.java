package com.sena._2.digitalDream.modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "productos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private int idProducto;

    @Column(name = "nom_producto", nullable = false, length = 255)
    private String nomProducto;

    @ManyToOne
    @JoinColumn(name = "id_marca")
    private Marca marca;

    @Column(nullable = false)
    private Integer precio;

    @Column(nullable = false)
    private Short cantidad;

    @Column(nullable = false, length = 10)
    private String estado;

    @Column(nullable = false, length = 250)
    private String detalles;

    @Column(name = "foto_producto", length = 255)
    private String fotoProducto;

    // Getters
    public int getIdProducto() {
        return idProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public Marca getMarca() {
        return marca;
    }

    public Integer getPrecio() {
        return precio;
    }

    public Short getCantidad() {
        return cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public String getDetalles() {
        return detalles;
    }

    public String getFotoProducto() {
        return fotoProducto;
    }

    // Setters
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setCantidad(Short cantidad) {
        this.cantidad = cantidad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public void setFotoProducto(String fotoProducto) {
        this.fotoProducto = fotoProducto;
    }
}
