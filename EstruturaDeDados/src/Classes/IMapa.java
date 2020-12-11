
package Classes;

import Estudante.Estudante;
/**
 *
 * @author Denner Ramiro Ribeiro
 */
interface IMapa {

    public void clear();

    public boolean contemChave(long chave);

    public boolean contemValor(Estudante valor);

    public Estudante get(long chave);

    public boolean isEmpty();

    public Estudante put(long chave, Estudante valor);

}
