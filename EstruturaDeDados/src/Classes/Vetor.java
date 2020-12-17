package Classes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import Estudante.Estudante;

public class Vetor {

    private Estudante e;
    private int quantidade = 0;
    private Map<Integer, Estudante> vetor = new HashMap<Integer, Estudante>();

    public Vetor() {
        quantidade = 0;
        vetor = new HashMap<>();
    }

    public String adicionarEstudante(Estudante e) {
        
        for (int i = 0; i < 100000; i++) {
            Estudante a = new Estudante();
            int matricula = a.getMatricula();
            vetor.put( matricula, a);   
        }
        return vetor.toString();
    }
/*
    public Map<Integer, Estudante> ordenar(Estudante e) {
        for (int i = 0; i < vetor.size(); i++) {
            for (int j = 0; j < vetor.size()- 1; j++) {
                Map a;
                if (vetor[i] < vetor[j]) {
                    a = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = a;
                }
            }
            
        }
        return vetor;
    }
*/

    public int contadorEs(Estudante e) {

        int cont = 0;
        for (int i = 0; i < vetor.size(); i++) {
            if (e.isCursoES()) {
                cont++;
            }
            return cont;
        }
        return -1;
    }

/*
    public boolean removerEstudante() {

        int id = indiceMatricula();
        if (e.getMatricula() <= 202050000) {

            if (id > 0) {

                for (int k = id; k < (quantidade - 1); k++) {
                    vetor[k] = vetor[k + 1];
                }

                quantidade--;
                return true;
            }

        }
        return false;
    }

    public int indiceMatricula() {
        for (int k = 0; k < quantidade; k++) {
            if (vetor[k].get(e.getMatricula()).equals(e.getMatricula())) {
                return e.getMatricula();
            }
        }
        return 0;
    }
*/
}
