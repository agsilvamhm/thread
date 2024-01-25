package br.com.alura.lista;

import java.util.List;

public class TarefaAdionarelemento implements Runnable {

    private List<String> lista;
    private int numeroDoThread;

    public TarefaAdionarelemento(List<String> lista, int numeroDoThread) {
        this.lista = lista;
        this.numeroDoThread = numeroDoThread;
    }

    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            lista.add("Thread " + numeroDoThread + " - " + i);
        }
    }
}
