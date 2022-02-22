package Modelo;

/**
 *
 * @author braul
 */
public class Hora {
        private String horaEntrada;
    private String horaSalida;
    private String horaEntradaS;
    private String horaSalidaS;
    private String horaEntradaD;
    private String horaSalidaD;
    
    //constructor

    public Hora(String horaEntrada, String horaSalida, String horaEntradaS, String horaSalidaS, String horaEntradaD, String horaSalidaD) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.horaEntradaS = horaEntradaS;
        this.horaSalidaS = horaSalidaS;
        this.horaEntradaD = horaEntradaD;
        this.horaSalidaD = horaSalidaD;
    }
    
    //getter

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public String getHoraEntradaS() {
        return horaEntradaS;
    }

    public String getHoraSalidaS() {
        return horaSalidaS;
    }

    public String getHoraEntradaD() {
        return horaEntradaD;
    }

    public String getHoraSalidaD() {
        return horaSalidaD;
    }
    
    //setter

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setHoraEntradaS(String horaEntradaS) {
        this.horaEntradaS = horaEntradaS;
    }

    public void setHoraSalidaS(String horaSalidaS) {
        this.horaSalidaS = horaSalidaS;
    }

    public void setHoraEntradaD(String horaEntradaD) {
        this.horaEntradaD = horaEntradaD;
    }

    public void setHoraSalidaD(String horaSalidaD) {
        this.horaSalidaD = horaSalidaD;
    }

    @Override
    public String toString() {
        return "Horario: Lunes a viernes: " + getHoraEntrada() + " - " + getHoraSalida() + ", Sabado: " + getHoraEntradaS() + " - " + getHoraSalidaS() + ", Domingo: " + getHoraEntradaD() + " - " + getHoraSalidaD();
    }
    
}
