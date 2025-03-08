package com.sena._2.digitalDream.dtos;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
public class PedidoDTO {

    private Integer idMarca;

    @NotBlank(message = "El nombre del pedido es obligatorio")
    @Size(max = 20, message = "El nombre del pedido no puede exceder los 20 caracteres")
    private String nomPedido;

    @NotNull(message = "La fecha de envío es obligatoria")
    @FutureOrPresent(message = "La fecha de envío debe ser hoy o en el futuro")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaEnvio;

    @NotNull(message = "La fecha de llegada es obligatoria")
    @FutureOrPresent(message = "La fecha de llegada debe ser hoy o en el futuro")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaLlegada;

    // Constructor vacío
    public PedidoDTO() {}

    // Constructor con parámetros
    public PedidoDTO(Integer idMarca, String nomPedido, Date fechaEnvio, Date fechaLlegada) {
        this.idMarca = idMarca;
        this.nomPedido = nomPedido;
        this.fechaEnvio = fechaEnvio;
        this.fechaLlegada = fechaLlegada;
    }

    // Getters y Setters
    public Integer getIdMarca() { return idMarca; }
    public void setIdMarca(Integer idMarca) { this.idMarca = idMarca; }

    public String getNomPedido() { return nomPedido; }
    public void setNomPedido(String nomPedido) { this.nomPedido = nomPedido; }

    public Date getFechaEnvio() { return fechaEnvio; }
    public void setFechaEnvio(Date fechaEnvio) { this.fechaEnvio = fechaEnvio; }

    public Date getFechaLlegada() { return fechaLlegada; }
    public void setFechaLlegada(Date fechaLlegada) { this.fechaLlegada = fechaLlegada; }


}

