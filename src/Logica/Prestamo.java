/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author zerokull
 */
public class Prestamo {
    private String nombre;
    private double montoPrestamo, saldo, cuotaMensual;
    private int cuotasRestantes;

    public Prestamo(String name, double montoTotal, int cantCuotas) {
        nombre=name;
        montoPrestamo=montoTotal;
        saldo=montoTotal;
        cuotasRestantes=cantCuotas;
        cuotaMensual = montoTotal/cantCuotas;
    }
    
    public boolean pagarCuota(int cant){
        boolean pagado = false;
        if(cant<=cuotasRestantes){
            double montoAPagar = cant*cuotaMensual;
            saldo-=montoAPagar;
            cuotasRestantes-=cant;
            pagado = true;
        }
        return pagado;
    }
    
    public String pagarTodo(){
        String msj = "Se a pagado: "+cuotasRestantes+" con un valor de: "+(cuotasRestantes*cuotaMensual);
        cuotasRestantes=0;
        saldo=0;
        return msj;
    }
    
    public int getCuotas(){
        return cuotasRestantes;
    }
    
    public double getSaldo(){
        return saldo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nMonto: " + montoPrestamo + "\nSaldo: " + saldo;
    }
}
