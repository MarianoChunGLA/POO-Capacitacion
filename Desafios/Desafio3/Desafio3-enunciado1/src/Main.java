public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido! Presione Inicio para comenzar la devolución");

        Sistema sistema = new Sistema();

        // Inicios Erroneos
        System.out.println("------------------");
        System.out.println("Inicio erroneo 1: presionado boton recibo sin haber presionado boton inicio");
        System.out.println("------------------");

        sistema.botonRecibo();

        System.out.println("Inicio erroneo 2: devolver un elemento sin presionar boton inicio");
        sistema.devolverElemento(new Lata());

        // Inicio Correcto
        System.out.println("------------------");
        System.out.println("Cliente 1");
        System.out.println("------------------");

        sistema.botonInicio();

        sistema.devolverElemento(new Lata());
        sistema.devolverElemento(new Envase());

        System.out.println("------------------");
        System.out.println("Status intermedio");
        System.out.println("------------------");

        System.out.println("Valor total devuelto: " + sistema.getValorTotalDevuelto());
        System.out.println("Cantidad de elementos depositados: " + sistema.getTotalElemsDepositadosCliente());

        sistema.devolverElemento(new Botella());
        sistema.devolverElemento(new Lata());

        System.out.println("------------------");
        System.out.println("Status final y detalle recibo");
        System.out.println("------------------");

        sistema.botonRecibo();

        System.out.println("------------------");
        System.out.println("Cliente 2");
        System.out.println("------------------");

        Sistema sistema1 = new Sistema();

        sistema1.botonInicio();

        sistema1.devolverElemento(new Lata());
        sistema1.devolverElemento(new Lata());

        System.out.println("------------------");
        System.out.println("Status final y detalle recibo");
        System.out.println("------------------");

        sistema1.botonRecibo();

        System.out.println("------------------");
        System.out.println("Status definitivo del dia de elementos devueltos");
        System.out.println("------------------");

        System.out.println("Se devolvieron " + Sistema.getTotalDiarioElemsDepositados() + " elementos");

    }
}