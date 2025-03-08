package com.sena._2.digitalDream.modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "marcas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marca")
    private Integer idMarca;

    @Column(nullable = false, length = 30)
    private String marca;

    @Column(nullable = false, length = 30)
    private String proveedor;

    // Getters y Setters
    public Integer getIdMarca() { return idMarca; }
    public void setIdMarca(Integer idMarca) { this.idMarca = idMarca; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getProveedor() { return proveedor; }
    public void setProveedor(String proveedor) { this.proveedor = proveedor; }

}
