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

    private long key;
    private Estudante value;
    private Nodo next;
    private Nodo previous;

    public Nodo(long key, Estudante value) {
        this.key = key;
        this.value = value;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }

    public void setInfo(long key, Estudante value) {
        this.key = key;
        this.value = value;
    }

    public Nodo getNext() {
        return next;
    }

    public Nodo getPrevious() {
        return previous;
    }

}


