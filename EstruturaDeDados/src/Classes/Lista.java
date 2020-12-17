package Classes;

import Estudante.Estudante;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Denner Ramiro Ribeiro
 */
public class Lista<K, V> implements Map<K, V> {

    private Nodo inicio;
    private Nodo fim;
    private Nodo size = null;

    @Override
    public int size() {
         if(inicio == null){
             return 0;
         }else{
             size = inicio;
             int cont = 0;
             while(size != fim){
                 
                size =  size.getProx();
                cont += 1;
             }
             return cont;
         }
    }
//    private int size(Nodo atual) {
//        if (atual == null) {
//            return 0;
//        }
//        return size(atual.getEsq()) + 1 + size(atual.getDir());
//    }

    @Override
    public boolean isEmpty() {
        return inicio == null;
    }

    @Override
    public boolean containsKey(Object o) {
        Nodo aux = inicio;
        while (aux != null) {
            if (aux.getChave() == o) {
                return true;
            }
            aux = aux.getProx();
        }
        return false;
    }

    @Override
    public boolean containsValue(Object o) {
        Nodo aux = inicio;
        while (aux != null) {
            if (aux.getInfo() == o) {
                return true;
            }
            aux = aux.getProx();
        }
        return false;
    }

    @Override
    public V get(Object o) {
        Nodo aux = inicio;
        int cont = 0;
        while (aux != null) {
            if (cont == 0) {
                return (V) aux.getInfo();
            }
            aux = aux.getProx();
        }
        return null;
    }

    @Override
    public V put(K k, V v) {
        Nodo novo;
        novo = new Nodo(k, v);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
            return v;
        } else {
            return put(fim, novo);
        }
    }

    public V put(Nodo atual, Nodo novo) {

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            fim.setProx(novo);
            novo.setAnt(fim);
            fim = novo;
        }
        
        return null;
    }

    @Override
    public V remove(Object o) {
        Nodo aux = pesquisa(o);
        if (aux != null) {
            if (aux == inicio && aux == fim) { //unico nodo da lista
                inicio = null;
                fim = null;
            } else if (aux == inicio) {
                inicio.getProx().setAnt(null);
                inicio = inicio.getProx();
            } else if (aux == fim) {
                fim.getAnt().setProx(null);
                fim = fim.getAnt();
            } else {
                aux.getAnt().setProx(aux.getProx());
                aux.getProx().setAnt(aux.getAnt());
            }
            return (V) aux.getInfo();
        }
        return null;
    }

    public Nodo pesquisa(Object o) {
        Nodo aux = inicio;
        while (aux != null) {
            if (aux.getChave() == o) {
                return aux;
            }
            aux = aux.getProx();
        }
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<K> keySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<V> values() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insertionSort() {
        Nodo i = inicio;
        Nodo j;
        Object aux;
        Object auxInfo;
        if (inicio != null) {
            //System.out.println(toString());

            i = inicio.getProx();
            while (i != null) {
                j = i;
                while (j != inicio) {
                    //System.out.println("i = " + i.getChave() + " j = "+ j.getChave() + " j-1 = "+j.getAnt().getChave());

                    if ((int) j.getChave() < (int) j.getAnt().getChave()) {
                        aux =   j.getChave();
                        auxInfo = j.getInfo();
                        j.setChave(j.getAnt().getChave());
                        j.setInfo(j.getAnt().getInfo());
                        j.getAnt().setChave(aux);
                        j.getAnt().setInfo(auxInfo);
                    }
                    j = j.getAnt();
                }
                //System.out.println(toString());

                i = i.getProx();
            }
        }
    }

    public String toString() {
        Nodo aux = inicio;
        String s = "";
        while (aux != null) {
            //s += aux.getChave() + " ";
            s += aux.getInfo() + " ";
            

            aux = aux.getProx();
            
            
        }
        return s;
    }
}
