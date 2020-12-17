package App;

import java.lang.reflect.Array;
import java.util.Collections;

import Classes.Vetor;
import Estudante.Estudante;

public class Main {
    public static void main(String[] args) {
        Vetor v = new Vetor();
        Estudante e = new Estudante();
        Vetor teste = new Vetor();
        
        
        System.out.println(v.adicionarEstudante(e));
        System.out.println(v.contadorEs(e));
        


    }
}
