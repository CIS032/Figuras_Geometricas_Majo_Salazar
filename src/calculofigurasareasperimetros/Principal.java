/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculofigurasareasperimetros;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Principal {

    
    public static void main(String[] args) {
       
        double sumaPerimetros = 0;
        double sumaAreas = 0;
        String menu = 
                "Seleccione una opcion:"
                + "\n1. Rectangulo. "
                + "\n2. Triangulo."
                + "\n3. Circulo."
                + "\n4. Sumar Areas y Perimetros."
                + "\n5. Salir.";
        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione una opcion del menu" + menu));
            switch (opcion) {
                case 1:
                    Rectangulo rectangulo = new Rectangulo(4, 6);
                    double area = rectangulo.area();
                    double perimetro = rectangulo.perimetro();
                    JOptionPane.showMessageDialog(null, "El area del rectangulo es:" + area + "\n y su perimetro es: " + perimetro);
                    sumaAreas += area;
                    sumaPerimetros += perimetro;
                    break;
                case 2:
                    Triangulo triangulo = new Triangulo(4, 6);
                    double area1 = triangulo.area();
                    double perimetro1 = triangulo.perimetro();
                    JOptionPane.showMessageDialog(null, "El area del triangulo es:" + area1 + "\n y su perimetro es: " + perimetro1);
                    sumaAreas += area1;
                    sumaPerimetros += perimetro1;
                    break;
                case 3:
                    Circulo circulo = new Circulo(4);
                    double area2 = circulo.area();
                    double perimetro2 = circulo.perimetro();
                    JOptionPane.showMessageDialog(null, "El area del circulo es:" + area2 + "\n y su perimetro es:" + perimetro2);
                    sumaAreas += area2;
                    sumaPerimetros += perimetro2;
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "La suma de las areas y perimetros de las figuras son:\n" + "AreaS: " + sumaAreas + "\nPerimetroS: " + sumaPerimetros, "AREAS Y PERIMETROS TOTALES DE LAS FIGURAS", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");

            }

        } while (opcion != 4);

    }
}

        
    
    

