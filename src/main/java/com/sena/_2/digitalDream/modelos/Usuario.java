package com.sena._2.digitalDream.modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int idUsuario;

    @Column(name = "prim_nombre", nullable = false, length = 50)
    private String Prim_nombre;

    @Column(name = "seg_nombre", length = 50)
    private String Seg_nombre;

    @Column(name = "prim_apellido", nullable = false, length = 30)
    private String Prim_apellido;

    @Column(name = "seg_apellido", length = 30)
    private String Seg_apellido;

    @Column(nullable = false, length = 250)
    private String password;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;

    @Column(name = "foto_usuario", length = 255,nullable = true)
    private String fotoUsuario;

    @Column(name = "token_recuperacion", length = 100)
    private String tokenRecuperacion;

    // Getters
    public int getIdUsuario() {
        return idUsuario;
    }

    public String getPrim_nombre() {
        return Prim_nombre;
    }

    public String getSeg_nombre() {
        return Seg_nombre;
    }

    public String getPrim_apellido() {
        return Prim_apellido;
    }

    public String getSeg_apellido() {
        return Seg_apellido;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Rol getRol() {
        return rol;
    }

    public String getFotoUsuario() {
        return fotoUsuario;
    }

    public String getTokenRecuperacion() {
        return tokenRecuperacion;
    }

    // Setters
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setPrim_nombre(String prim_nombre) {
        Prim_nombre = prim_nombre;
    }

    public void setSeg_nombre(String seg_nombre) {
        Seg_nombre = seg_nombre;
    }

    public void setPrim_apellido(String prim_apellido) {
        Prim_apellido = prim_apellido;
    }

    public void setSeg_apellido(String seg_apellido) {
        Seg_apellido = seg_apellido;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public void setFotoUsuario(String fotoUsuario) {
        this.fotoUsuario = fotoUsuario;
    }

    public void setTokenRecuperacion(String tokenRecuperacion) {
        this.tokenRecuperacion = tokenRecuperacion;
    }
}
