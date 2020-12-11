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
public class Mapa implements IMapa {

    private Nodo inicio;
    private Nodo fim;

    public Mapa() {
        inicio = null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contemChave(long chave) {
        return false;
    }

    @Override
    public boolean contemValor(Estudante valor) {
        return false;
    }

    @Override
    public Estudante get(long key) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Estudante put(long key, Estudante value) {
        Nodo aux = new Nodo(key, value);
        if (inicio == null) {
            fim = aux;
            fim = aux;
        } else {
            fim.setNext(aux);
            aux.setPrevious(fim);
            this.fim = aux;
        }
        return value;
    }

}
