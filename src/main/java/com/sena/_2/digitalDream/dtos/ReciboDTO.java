package com.sena._2.digitalDream.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Getter
@Setter
public class ReciboDTO {

    @NotNull(message = "El ID del usuario no puede estar vacío")
    private Integer idUsuario;

    @NotNull(message = "El tipo de pago no puede estar vacío")
    private Integer tipoPago;

    @Pattern(regexp = "\\d{16}", message = "El número de tarjeta debe tener exactamente 16 dígitos")
    @Size(min = 16, max = 16, message = "El número de tarjeta debe tener 16 dígitos")
    private String numeroTarjeta;

    // Constructor vacío
    public ReciboDTO() {}

    // Constructor con parámetros
    public ReciboDTO(Integer idUsuario, Integer tipoPago, String numeroTarjeta) {
        this.idUsuario = idUsuario;
        this.tipoPago = tipoPago;
        this.numeroTarjeta = numeroTarjeta;
    }

    // Getters y Setters
    public Integer getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Integer idUsuario) { this.idUsuario = idUsuario; }

    public Integer getTipoPago() { return tipoPago; }
    public void setTipoPago(Integer tipoPago) { this.tipoPago = tipoPago; }

    public String getNumeroTarjeta() { return numeroTarjeta; }
    public void setNumeroTarjeta(String numeroTarjeta) { this.numeroTarjeta = numeroTarjeta; }

}
