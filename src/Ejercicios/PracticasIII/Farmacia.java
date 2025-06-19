package Ejercicios.PracticasIII;

public class Farmacia {
    public static void vender(Producto p, Cliente c, FormaDePago f){
        float precioFinal = f.calcularPrecio(p.getPrecio());

        System.out.println("El cliente: " + c.getNombre() +
                " compro el producto " + p.getDescripcion() +
                " al precio $" + precioFinal);
    }
}
