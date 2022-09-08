package campeonato;

import java.time.LocalDate;

public class Partida {

    private String mandante;
    private Integer placarMandante;
    private Integer plcarVisitante;
    private String visitante;

    private LocalDate dataPartida;

    public String getMandante() {
        return mandante;
    }

    public void setMandante(String mandante) {
        this.mandante = mandante;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }

    public Integer getPlacarMandante() {
        return placarMandante;
    }

    public void setPlacarMandante(Integer placarMandante) {
        this.placarMandante = placarMandante;
    }

    public Integer getPlcarVisitante() {
        return plcarVisitante;
    }

    public void setPlcarVisitante(Integer plcarVisitante) {
        this.plcarVisitante = plcarVisitante;
    }


}


