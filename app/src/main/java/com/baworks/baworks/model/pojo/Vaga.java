package com.baworks.baworks.model.pojo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by daniel on 8/12/17.
 */

public class Vaga implements Serializable {

    private String titulo;
    private String descricao;
    private ArrayList<String> caracteristicas = new ArrayList<>();

    public Vaga() {
    }

    public Vaga(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Vaga(String titulo, String descricao, ArrayList<String> caracteristicas) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.caracteristicas = caracteristicas;
    }

    public ArrayList<String> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<String> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}