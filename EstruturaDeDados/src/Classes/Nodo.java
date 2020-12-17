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

    private Object chave;
    private Object info;
    
    private Nodo prox;
    private Nodo ant;

    public Nodo(Object chave, Object info) {
        this.chave = chave;
        this.info = info;
        this.prox = null;
        this.ant = null;
    }

  

    public Object getChave() {
        return chave;
    }

    public void setChave(Object chave) {
        this.chave = chave;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Nodo getProx() {
        return prox;
    }

    public void setProx(Nodo prox) {
        this.prox = prox;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

   

    public String toString() {
        return null;
    }

}
