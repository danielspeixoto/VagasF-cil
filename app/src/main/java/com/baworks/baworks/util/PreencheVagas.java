package com.baworks.baworks.util;

import com.baworks.baworks.model.pojo.Vaga;

import java.util.ArrayList;

/**
 * Created by daniel on 8/12/17.
 */

public class PreencheVagas {

    public ArrayList<Vaga> vagas;

    public PreencheVagas() {
        vagas = new ArrayList<Vaga>();
        Vaga vaga = new Vaga();
        ArrayList<String> caracteristicas = new ArrayList<String>();

        caracteristicas.add("PHP");
        caracteristicas.add("Postgree");
        caracteristicas.add("Ensino superior completo");
        caracteristicas.add("Experiência");

        vaga.setTitulo("Desenvolvedor back-end");
        vaga.setDescricao("O candidato a essa vaga deve ter pel omenos o ensino superior completo e ter experiência com PHP.");
        vaga.setCaracteristicas(caracteristicas);

        vagas.add(vaga);




        vaga = new Vaga();
        caracteristicas = new ArrayList<String>();

        caracteristicas.add("Experiência");
        caracteristicas.add("HTML");
        caracteristicas.add("Criatividade");
        caracteristicas.add("CSS");

        vaga.setTitulo("Webdesigner");
        vaga.setDescricao("O candidato a essa vaga deve ter experiência com HTML, CSS e JavasCript.");
        vaga.setCaracteristicas(caracteristicas);

        vagas.add(vaga);




        vaga = new Vaga();
        caracteristicas = new ArrayList<String>();

        caracteristicas.add("Experiência");
        caracteristicas.add("HTML");
        caracteristicas.add("JavaScript");
        caracteristicas.add("Python");
        caracteristicas.add("CSS");

        vaga.setTitulo("Desenvolvedor web full-stack");
        vaga.setDescricao("O candidato a essa vaga deve ter experiência e pleno conhecimento das principais tecnologias do mercado.");
        vaga.setCaracteristicas(caracteristicas);

        vagas.add(vaga);




        vaga = new Vaga();
        caracteristicas = new ArrayList<String>();

        caracteristicas.add("Experiência");
        caracteristicas.add("CNH");
        caracteristicas.add("Ensino médio completo");

        vaga.setTitulo("Motorista");
        vaga.setDescricao("O candidato a essa vaga deve ter CNH, experiência e ter concluído pelomenos o ensino médio completo.");
        vaga.setCaracteristicas(caracteristicas);

        vagas.add(vaga);




        vaga = new Vaga();
        caracteristicas = new ArrayList<String>();

        caracteristicas.add("Pontualidade");
        caracteristicas.add("Mora no centro");

        vaga.setTitulo("Faxineira");
        vaga.setDescricao("O candidato a essa vaga deve ter CNH, experiência e ter concluído pelomenos o ensino médio.");
        vaga.setCaracteristicas(caracteristicas);

        vagas.add(vaga);





        vaga = new Vaga();
        caracteristicas = new ArrayList<String>();

        caracteristicas.add("Ensino superior completo");
        caracteristicas.add("Bilingue");

        vaga.setTitulo("Professor nível médio");
        vaga.setDescricao("O candidato a essa vaga deve ter o ensino superior completo e deve falar mais de um idioma.");
        vaga.setCaracteristicas(caracteristicas);

        vagas.add(vaga);
    }
}