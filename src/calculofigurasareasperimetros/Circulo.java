/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculofigurasareasperimetros;

/**
 *
 * @author USUARIO
 */
public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;

    }

    public double area() {
        double area = Math.PI * radio;
        return area;
    }

    public double perimetro() {
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

}


