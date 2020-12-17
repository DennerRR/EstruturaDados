package App;

import Classes.Arvore;
import Classes.Lista;

import Estudante.Estudante;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Arvore<Integer, Estudante> arv = new Arvore<Integer, Estudante>();
        Lista<Integer, Estudante> list = new Lista<Integer, Estudante>();

        /*
         * LISTA
         */
        long inicio = System.nanoTime();
//        int cont = 0;
//        
//
        for (int i = 0; i < 100000; i++) {

            Estudante e = new Estudante();
            list.put(e.getMatricula(), e);
//            if (e.isCursoES()) {
//                cont++;
//              } 
//            if((int)e.getMatricula()<202050000){
//                list.remove(e);
//            }
        }
        
        list.insertionSort();
        long fim = System.nanoTime();

        long tempo = fim - inicio;

        // 1 second = 1_000_000_000 nano seconds
        double tempoEmSegundos = (double) tempo / 1_000_000_000;
        

        
//        System.out.println(list.toString());
        System.out.println(tempoEmSegundos + " segundos");
//        System.out.println("quantidade de estudantes de Engenharia de Software: " +cont);



        /*
* ARVORE
//         */
//        long inicio = System.nanoTime();
//        //int cont = 0;
//        for (int i = 0; i < 100000; i++) {
//            Estudante ee = new Estudante();
//            arv.put(ee.getMatricula(), ee);
////            if(ee.isCursoES()){
////                cont++;
////            }
////            if(ee.getMatricula( )< 202050000){
////                arv.remove(ee.getMatricula());
////            }
//        }
//        long fim = System.nanoTime();
//        long tempo = fim - inicio;
//        double tempoEmSegundos = (double) tempo / 1_000_000_000;
//        System.out.println(arv.toString());
//        System.out.println(tempoEmSegundos + " segundos");
//         //System.out.println("quantidade de estudantes de Engenharia de Software: " +cont);
    }
}
