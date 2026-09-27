package gestioninventario;

public class MainInventario {

    public static void main(String[] args) {

        Producto productoUno = new Producto();
        productoUno.codigo = "P-001";
        productoUno.nombre = "Teclado mecánico";
        productoUno.precio = 45000.0;
        productoUno.stock = 12;

        productoUno.mostrarFicha();
        productoUno.venderUnidades(3);
        productoUno.venderUnidades(50);
        productoUno.reponerStock(20);
        productoUno.actualizarPrecio(39900.0);

        Producto copia = productoUno;
        copia.stock = 29;

        System.out.println("Stock de productoUno tras modificar copia: " + productoUno.stock + " (mismo objeto en el Heap)");

        Producto productoDos = new Producto();
        productoDos.codigo = "P-002";
        productoDos.nombre = "Mouse inalámbrico";
        productoDos.precio = 18500.0;
        productoDos.stock = 15;

        Producto productoTres = new Producto();
        productoTres.codigo = "P-003";
        productoTres.nombre = "Auriculares";
        productoTres.precio = 32000.0;
        productoTres.stock = 8;

        productoDos.venderUnidades(-2);
        productoTres.reponerStock(0);
        productoDos.venderUnidades(5);
        productoTres.reponerStock(4);
    }
}