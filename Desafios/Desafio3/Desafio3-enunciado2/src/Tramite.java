import java.util.Date;

public class Tramite {
    private int nroTramite;
    private Date fechaInicio;


    public Tramite(int nroTramite) {
        this.nroTramite = nroTramite;
        this.fechaInicio = new Date();
    }

    public int getNroTramite() {
        return nroTramite;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }
}
