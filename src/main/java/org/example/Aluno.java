package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public void pagarMensalidade() {
        System.out.println("Pagando a mensalidade do aluno " + this.nome);
        System.out.println();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
