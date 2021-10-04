package main;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private long id;
    private String nome;
    private boolean ativo;
    private List<Sala>Salas = new ArrayList<Sala>();

    public Cinema() {
    }

    public Cinema(long id, String nome, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.ativo = ativo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<Sala> getSalas() {
        return Salas;
    }

    public void setSalas(List<Sala> salas) {
        Salas = salas;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", ativo=" + ativo +
                ", Salas=" + Salas +
                '}';
    }
}
