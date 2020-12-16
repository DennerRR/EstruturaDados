package Classes;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import Estudante.Estudante;

public class Vetor<Chave, Valor> implements Map<Chave, Valor> {

    private int numElementos = 100000;
    private Estudante[] vetorEstudante = new Estudante[numElementos];

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        if (this.vetorEstudante == null){
            return true;
        }
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Valor get(Object key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Valor put(Chave key, Valor value) {
        // TODO Auto-generated method stub
        for (int i = 0; i < vetorEstudante.length; i++) {
            Estudante e = new Estudante();
            vetorEstudante[i] = e;
            System.out.println(vetorEstudante[i].toString());
        }
        return null;
    }

    @Override
    public Valor remove(Object key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void putAll(Map<? extends Chave, ? extends Valor> m) {
        // TODO Auto-generated method stub

    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

    @Override
    public Set<Chave> keySet() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<Valor> values() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Set<Entry<Chave, Valor>> entrySet() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
