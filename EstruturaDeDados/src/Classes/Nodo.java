/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Estudante.Estudante;

/**
 *
 * @author Denner Ramiro Ribeiro
 */
public class Nodo {

    private long chave;
    private Estudante valor;
    private Nodo prox;
    private Nodo ant;

    public Nodo(long chave, Estudante valor) {
        this.chave = chave;
        this.valor = valor;
        this.prox = null;
        this.ant = null;
    }

    public void setProx(Nodo prox) {
        this.prox = prox;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public void setInfo(long chave, Estudante valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public Nodo getProx() {
        return prox;
    }

    public Nodo getAnt() {
        return ant;
    }

    public String toString() {
        return null;
    }

}
