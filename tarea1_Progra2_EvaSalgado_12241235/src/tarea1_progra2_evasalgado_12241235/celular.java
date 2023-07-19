/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1_progra2_evasalgado_12241235;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author evaja
 */
public class celular {
    int indicecel; //indice de celular
    String marca;
    String modelo;
    Color color;
    Long precio;
    Date fechacreacion;
    Date fechaVenta;
    String operador;

    public celular(int indicecel, String marca, String modelo, Color color, long precio, Date fechacreacion, Date fechaVenta, String operador) {
        this.indicecel = indicecel;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.fechacreacion = fechacreacion;
        this.fechaVenta = fechaVenta;
        this.operador = operador;
    }

    public int getIndicecel() {
        return indicecel;
    }

    public void setIndicecel(int indicecel) {
        this.indicecel = indicecel;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    @Override
    public String toString() {
        return "Celular Numero: "+indicecel+": \n\n"+"Marca de celular: " + marca + "\nModelo de celular: " + modelo + "\nColor de celular: " + color + "\nPrecio de celular: Lps." + precio + "\nFecha de creacion: " + fechacreacion + "\nFecha de Venta: " + fechaVenta + "\nOperador que utiliza: " + operador +"\n";
    }

   
    
            
}
