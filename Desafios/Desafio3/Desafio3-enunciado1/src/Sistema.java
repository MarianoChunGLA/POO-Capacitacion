public class Sistema {

    private static int totalDiarioElemsDepositados;
    private int totalElemsDepositadosCliente;
    private boolean enProcesoDeDevolucion;
    private double valorTotalDevuelto;


    public Sistema() {
        this.totalElemsDepositadosCliente = 0;
        this.enProcesoDeDevolucion = false;
        this.valorTotalDevuelto = 0;
    }

    private void incrementarDepositosDiarios() {
        totalDiarioElemsDepositados++;
    }

    private void incrementarDepositosCliente() {
        totalElemsDepositadosCliente++;
    }

    public void botonInicio() {
        if(enProcesoDeDevolucion) {
            System.out.println("Ya se esta en proceso de devolver los elementos!");
        } else {
            enProcesoDeDevolucion = true;
            System.out.println("Proceso de devolución iniciado!");
        }
    }

    public Recibo botonRecibo() {
        if(enProcesoDeDevolucion) {
            enProcesoDeDevolucion = false;
            Recibo recibo = new Recibo();
            recibo.setTotalElementosDepositados(totalElemsDepositadosCliente);
            recibo.setValorTotal(valorTotalDevuelto);

            System.out.println("El valor total devuelto fue de " + recibo.getValorTotal() + "\ny se devolvieron " + recibo.getTotalElementosDepositados() + " elementos");
            return recibo;

        }

        System.out.println("No se puede generar el recibo, primero presione el Boton Inicio e ingrese productos para su devolución");
        return null;
    }

    public void devolverElemento(Elemento elemento) {
        if(enProcesoDeDevolucion) {
            incrementarDepositosDiarios();
            incrementarDepositosCliente();

            System.out.println("Se devolvio un elemento de tipo: " + elemento.getTipoElemento());
            valorTotalDevuelto += elemento.getValorDevolucion();
        } else {
            System.out.println("Error: Presione boton Inicio para comenzar a devolver elementos");
        }
    }

    public static int getTotalDiarioElemsDepositados() {
        return totalDiarioElemsDepositados;
    }

    public int getTotalElemsDepositadosCliente() {
        return totalElemsDepositadosCliente;
    }

    public double getValorTotalDevuelto() {
        return valorTotalDevuelto;
    }
}
