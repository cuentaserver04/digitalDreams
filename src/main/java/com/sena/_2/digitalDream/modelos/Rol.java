package com.sena._2.digitalDream.modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "rol")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private int idRol;

    @Column(name = "tipo_rol", nullable = false, length = 20)
    private String tipoRol;

    // Getters
    public int getIdRol() {
        return idRol;
    }

    public String getTipoRol() {
        return tipoRol;
    }

    // Setters
    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }
}

