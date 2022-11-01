package Ejercicios_Ciclos;

import javax.swing.JOptionPane;

/*
 *  Ejercicio 20: Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
 */

public class Ejercicio20 {
    public static void main(String[] args) {
        float sueldoMax=0,sueldoActual,sueldoPasado=0;
        int sueldos;

        sueldos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos sueldos desea introducir?"));

        for(int i=1;i<=sueldos;i++){
            sueldoActual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo "+i));

            
            if(sueldoActual>=sueldoPasado){
                if(sueldoMax>sueldoActual){
                    sueldoMax = sueldoMax;
                }
                else if(sueldoMax < sueldoActual){
                    sueldoMax = sueldoActual;
                }
                
            }
            else if(sueldoActual<sueldoPasado){
                if(sueldoMax>sueldoActual){
                    sueldoMax = sueldoMax;
                }
                else if(sueldoMax < sueldoActual){
                    sueldoMax = sueldoActual;
                }
            }
            sueldoPasado = sueldoActual;
        }

        JOptionPane.showMessageDialog(null,"El sueldo máximo registrado es: "+sueldoMax);
        
    }
}
