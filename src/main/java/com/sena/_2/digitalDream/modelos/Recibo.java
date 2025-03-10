package com.sena._2.digitalDream.modelos;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "recibo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Recibo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recibo")
    private int idRecibo;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column(name = "valor_total", nullable = false)
    private int valorTotal;

    @Column(name = "tipo_pago", nullable = false)
    private int tipoPago;

    @Column(name = "numero_tarjeta", length = 20)
    private String numeroTarjeta;

    @Column(name = "fecha_compra", nullable = false)
    private LocalDateTime fechaCompra = LocalDateTime.now();

    // Getters
    public int getIdRecibo() {
        return idRecibo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public int getTipoPago() {
        return tipoPago;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }

    // Setters
    public void setIdRecibo(int idRecibo) {
        this.idRecibo = idRecibo;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public void setFechaCompra(LocalDateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}
