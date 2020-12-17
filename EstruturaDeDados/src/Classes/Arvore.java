package Classes;

import Estudante.Estudante;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Denner Ramiro Ribeiro
 */
public class Arvore<K, V> implements Map<K, V> {

    private NoArvore raiz = null;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    private int size(NoArvore atual) {
        if (atual != null) {
            return size(atual.getEsq()) + 1 + size(atual.getDir());
        }
        return 0;
    }

    @Override
    public boolean isEmpty() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean containsKey(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsValue(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public V get(Object o) {
        if (raiz.getChave() == o) {
            return (V) raiz.getInfo();
        }
        NoArvore aux = raiz;
        while (aux != null) {
            if ((int) o < (int) aux.getChave()) {
                aux = aux.getEsq();
            } else if ((int) o > (int) aux.getChave()) {
                aux = aux.getDir();
            } else {
                return (V) aux.getChave();
            }
        }
        return null;
    }

    @Override
    public V put(K k, V v) {
        NoArvore novo;
        novo = new NoArvore(k, v);
        if (raiz == null) {
            raiz = novo;
            return v;
        } else {
            return put(raiz, novo);
        }
    }

    private V put(NoArvore atual, NoArvore novo) {
        if ((int) novo.getChave() != (int) atual.getChave()) {
            if ((int) atual.getChave() > (int) novo.getChave()) {
                if (atual.getEsq() == null) {
                    atual.setEsq(novo);
                    return (V) novo.getInfo();
                } else {
                    return put(atual.getEsq(), novo);
                }
            } else {
                if (atual.getDir() == null) {
                    atual.setDir(novo);
                    return (V) novo.getInfo();
                } else {
                    return put(atual.getDir(), novo);
                }
            }

        } else {
            return null;
        }
    }

    @Override
    public V remove(Object o) {
        NoArvore atual = raiz;
        NoArvore pai = raiz;
        return remove(atual, pai, (int) o);
    }

    public V remove(NoArvore atual, NoArvore pai, Object chave) {
        if (atual == null) {
            return null;
        } else {
            if ((int) atual.getChave() == (int)chave) {
                return removeEncontrado(atual, pai);
            } else {
                if ((int)chave < (int) atual.getChave()) {
                    return remove(atual.getEsq(), atual, chave);
                } else {
                    return remove(atual.getDir(), atual, chave);
                }
            }
        }

    }

    public V removeEncontrado(NoArvore atual, NoArvore pai) {
        if (atual.getEsq() == null && atual.getDir() == null) {
            return removeFolha(atual, pai);
        } else {
            if (atual.getEsq() == null || atual.getDir() == null) {
                return removeUmFilho(atual, pai);
            } else {
                return removeDoisFilhos(atual, pai);
            }

        }

    }

    public V removeFolha(NoArvore atual, NoArvore pai) {
        if (atual != raiz) {
            if (pai.getEsq() == atual) {
                pai.setEsq(null);
            } else {
                pai.setDir(null);
            }

        } else {
            raiz = null;
        }
        return (V) atual.getInfo();
    }

    public V removeUmFilho(NoArvore atual, NoArvore pai) {
        if (atual == raiz) {
            if (atual.getEsq() == null) {
                raiz = atual.getDir();

            } else {
                raiz = atual.getEsq();
            }

        } else {
            if (pai.getEsq() == atual) {
                if (atual.getEsq() != null) {
                    pai.setEsq(atual.getEsq());
                } else {
                    pai.setEsq(atual.getDir());
                }
            } else {
                if (atual.getEsq() != null) {
                    pai.setDir(atual.getEsq());
                } else {
                    pai.setDir(atual.getDir());
                }
            }
        }
        return (V) atual.getInfo();

    }

    private V removeDoisFilhos(NoArvore atual, NoArvore pai) {
        NoArvore sucessor = atual.getDir();
        NoArvore paiSucessor = atual;
        while (sucessor.getEsq() != null) {
            paiSucessor = sucessor;
            sucessor = sucessor.getEsq();
        }
        if (sucessor == atual.getDir()) {
            sucessor.setEsq(atual.getEsq());

            if (atual == raiz) {
                raiz = sucessor;

            } else {
                if (pai.getEsq() == atual) {
                    pai.setEsq(sucessor);
                } else {
                    pai.setDir(sucessor);
                }
            }
        } else {
            paiSucessor.setEsq(sucessor.getDir());
            sucessor.setDir(atual.getDir());
            sucessor.setEsq(atual.getEsq());
            if (atual == raiz) {
                raiz = sucessor;
            } else {
                if (pai.getEsq() == atual) {
                    pai.setEsq(sucessor);
                } else {
                    pai.setDir(sucessor);
                }
            }
        }
        return (V) atual.getInfo();
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

    public String toString() {
        return toString(this.raiz);
    }

    private String toString(NoArvore atual) {
        String s ="";
        if (atual != null) {
               s= toString(atual.getEsq());
              //  System.out.print(atual.getInfo() + " ");
                s+=atual.getInfo();
                s+=toString(atual.getDir());
                
            }
        return s;
        
        
    }
    

}
