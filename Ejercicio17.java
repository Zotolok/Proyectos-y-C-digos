package Ejercicios_Ciclos;

import javax.swing.JOptionPane;

/*
 *  Ejercicio 17: Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y cuántas facturas se emitieron de más de $600 
 */

public class Ejercicio17 {
    public static void main(String[] args) {
        int codigo,litros,litrosArticulo1=0,conteoMayor600=0;
        float precioLitro,importeFactura,facturacionTotal=0;

        for(int i=1;i<=5;i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Artículo N"+i+"\nDigite el código: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Artículo N"+i+"\nDigite la cantidad de litros: "));
            precioLitro = Float.parseFloat((JOptionPane.showInputDialog("Artículo N"+i+"\nDigite el precio por litro: ")));

            importeFactura = (float) litros * precioLitro; // Importe por factura
            facturacionTotal +=importeFactura; // Suma iterativa de las facturas

            if(codigo==1){
                litrosArticulo1 += litros;
            }
            if(importeFactura>600){
                conteoMayor600++;
            }
        }

        System.out.println("Resumen de ventas:");
        System.out.println("Facturación Total: "+facturacionTotal);
        System.out.println("Cantidad en litros vendidos del artículo 1: "+litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a $600: "+conteoMayor600);
    }
}
