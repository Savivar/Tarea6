/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6;

/**
 *
 * @author savil
 */
class Facturar   {
    private static final int LIMITE_PARA_HACER_DESCUENTO = 3;
    private static final double DESCUENTO_BASICO = 0.95;
    private static final double DESCUENTO_BASICO1 = DESCUENTO_BASICO;
    private static final double DESCUENTO_PRIME = 0.8;
    
    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        if (numProductos > LIMITE_PARA_HACER_DESCUENTO) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            total = precioProducto * DESCUENTO_PRIME;
            mostrarTotal(total);
        } else {
            total = precioProducto * DESCUENTO_BASICO1;
            mostrarTotal(total);
        }

    }

    private void mostrarTotal(double Total) {
        MostrarTotal(Total);
    }

    private void MostrarTotal(double Total) {
        System.out.println("El total a pagar es:" + Total);
        System.out.println("Enviado");
    }
}
