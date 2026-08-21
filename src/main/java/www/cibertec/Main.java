package www.cibertec;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //variables
        String cliente = "Miroslava";
        int codigoProducto = 1;
        double precioProducto = 100.0;
        boolean clienteFrecuente = true;
        double subtotal = 0.0;

        //Calculo de producto
        switch(codigoProducto){
            case 1:
                subtotal = precioProducto * 1;
                break;
            case 2:
                subtotal = precioProducto * 2;
                break;
            case 3:
                subtotal = precioProducto * 3;
                break;
            default:
                System.out.println("Código de producto invalido");
                return;
        }
        //Metodo del calculo de descuento
        double descuento = calcularDescuento(subtotal);
        double totalFinal = subtotal - descuento;

        //Metodo para imprimir boleta
        imprimirBoleta(cliente, clienteFrecuente, subtotal, descuento, totalFinal);

    }

    //calcular descuento
    public static double calcularDescuento(double monto){
        if(monto >=300.0){
            return monto*0.30;
        }else if(monto >=200.0){
            return monto*0.20;
        }else{
            return 0.0;
        }
    }
    public static void imprimirBoleta(String cliente, boolean clienteFrecuente, double subtotal, double descuento, double totalFinal){
        System.out.println("RESUMEN DE COMPRA");
        System.out.println("Cliente: " + cliente);
        System.out.println("Cliente Frecuente: " + clienteFrecuente);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total Final: " + totalFinal);

        System.out.println("Pago en 3 cuotas");
        for (int i = 1; i <= 3; i++) {
            double cuota = totalFinal / 3;
            System.out.println("Cuota " + i + ": " + cuota);
        }
    }


}