package ej6;

public class Main {
    public static void main(String[] args) {
        // Cliente y Facturas
        Cliente cliente1 = new Cliente(123);
        Factura factura1 = new Factura("F001");
        Factura factura2 = new Factura("F002");

        cliente1.agregarFactura(factura1);
        cliente1.agregarFactura(factura2);

        System.out.println("El cliente " + cliente1.getClienteId() + " tiene las siguientes facturas:");
        for (Factura factura : cliente1.getFacturas()) {
            System.out.println("- " + factura.getNumero());
        }
        factura1.calcularImpuesto();

        // Empleado y Portátil
        Empleado empleado1 = new Empleado(30000.0);
        Portatil portatil1 = new Portatil("SN456789");

        empleado1.asignarPortatil(portatil1);

        System.out.println("El empleado con salario " + empleado1.getSalario() + " tiene asignado el portátil con serial: " + empleado1.getPortatilAsignado().getSerial());
        portatil1.ejecutarPrograma("Navegador Web");

        // Empresa y Webs (se mantienen similares)
        Empresa empresa1 = new Empresa("SuperTech");
        Web web1 = new Web("www.supertech.com");
        Web web2 = new Web("blog.supertech.com");

        empresa1.agregarWeb(web1);
        empresa1.agregarWeb(web2);

        System.out.println("La empresa " + empresa1.getNombreComercial() + " tiene las siguientes webs:");
        for (Web web : empresa1.getWebs()) {
            System.out.println("- " + web.getDominio());
        }
        web1.mostrarVisitas();
    }
}