package Ejercicios_Ciclos;

import javax.swing.JOptionPane;

/*
 *  Ejercicio 22: Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso
 */

public class Ejercicio22 {
    public static void main(String[] args) {
        float numero;
        boolean haySUS = false;

        for(int i=1;i<=5;i++){
            numero = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificación "+i));
            
            if(numero<=5){
                haySUS = true;
            }
            else if(numero>5 && numero<=10){
                
            }
            else{
                System.out.println("Ese no es un valor válido, por lo que se tomará como cero");
                
            }
        }
        if (haySUS == true){
            System.out.println("Se encontró al menos un suspenso");
        }
        else{
            System.out.println("No se encontró ningún suspenso");
        }
        


    }
}
