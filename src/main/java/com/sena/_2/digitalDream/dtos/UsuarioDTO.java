package com.sena._2.digitalDream.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class UsuarioDTO {

    @NotBlank(message = "El primer nombre es obligatorio")
    @Size(max = 50, message = "El primer nombre no puede exceder los 50 caracteres")
    private String prim_nombre;

    @Size(max = 50, message = "El segundo nombre no puede exceder los 50 caracteres")
    private String seg_nombre;

    @NotBlank(message = "El primer apellido es obligatorio")
    @Size(max = 30, message = "El primer apellido no puede exceder los 30 caracteres")
    private String prim_apellido;

    @Size(max = 30, message = "El segundo apellido no puede exceder los 30 caracteres")
    private String seg_apellido;

    @NotBlank(message = "El email es obligatorio")
    @Email(message = "Debe ingresar un email válido")
    @Size(max = 100, message = "El email no puede exceder los 100 caracteres")
    private String email;

    @NotBlank(message = "La contraseña es obligatoria")
    @Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres")
    private String password;

    @NotNull(message = "El rol es obligatorio")
    private Integer id_rol;

    private MultipartFile fotoUsuario;

    // Constructor vacío
    public UsuarioDTO() {}

    // Constructor con parámetros
    public UsuarioDTO(String prim_nombre, String seg_nombre, String prim_apellido, String seg_apellido, String email, String password, Integer id_rol, MultipartFile fotoUsuario) {
        this.prim_nombre = prim_nombre;
        this.seg_nombre = seg_nombre;
        this.prim_apellido = prim_apellido;
        this.seg_apellido = seg_apellido;
        this.email = email;
        this.password = password;
        this.id_rol = id_rol;
        this.fotoUsuario = fotoUsuario;
    }

    // Getters y Setters
    public String getPrim_nombre() { return prim_nombre; }
    public void setPrim_nombre(String prim_nombre) { this.prim_nombre = prim_nombre; }

    public String getSeg_nombre() { return seg_nombre; }
    public void setSeg_nombre(String seg_nombre) { this.seg_nombre = seg_nombre; }

    public String getPrim_apellido() { return prim_apellido; }
    public void setPrim_apellido(String prim_apellido) { this.prim_apellido = prim_apellido; }

    public String getSeg_apellido() { return seg_apellido; }
    public void setSeg_apellido(String seg_apellido) { this.seg_apellido = seg_apellido; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Integer getId_rol() { return id_rol; }
    public void setId_rol(Integer id_rol) { this.id_rol = id_rol; }

    public MultipartFile getFotoUsuario() { return fotoUsuario; }
    public void setFotoUsuario(MultipartFile fotoUsuario) { this.fotoUsuario = fotoUsuario; }

}
