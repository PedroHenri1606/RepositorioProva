package main;

public class Sala {
    private long id;
    private int cadeiras;
    private int cadeirasUsadas;
    private boolean ativa;


    public Sala() {
    }

    public Sala(long id, int cadeiras, boolean ativa) {
        this.id = id;
        this.cadeiras = cadeiras;
        this.ativa = ativa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCadeiras() {
        return cadeiras;
    }

    public void setCadeiras(int cadeiras) {
        this.cadeiras = cadeiras;
    }

    public int getCadeirasUsadas() {
        return cadeirasUsadas;
    }

    public void setCadeirasUsadas(int cadeirasUsadas) {
        this.cadeirasUsadas = cadeirasUsadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "id=" + id +
                ", cadeiras=" + cadeiras +
                ", cadeirasUsadas=" + cadeirasUsadas +
                ", ativa=" + ativa +
                '}';
    }
}
