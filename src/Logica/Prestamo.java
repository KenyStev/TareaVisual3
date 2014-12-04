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
}
