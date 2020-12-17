package Classes;

import Estudante.Estudante;

/**
 *
 * @author Denner Ramiro Ribeiro
 */
public class NoArvore {

    private Object chave;
    private Object info;
    private NoArvore dir;
    private NoArvore esq;

    public NoArvore(Object chave, Object info) {
        this.chave = chave;
        this.info = info;
        this.esq = null;
        this.dir = null;
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

    public NoArvore getDir() {
        return dir;
    }

    public void setDir(NoArvore dir) {
        this.dir = dir;
    }

    public NoArvore getEsq() {
        return esq;
    }

    public void setEsq(NoArvore esq) {
        this.esq = esq;
    }

    
}
