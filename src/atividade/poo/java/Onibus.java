package atividade.poo.java;

public class Onibus extends Transporte{

    public Onibus(String id, int numeroPassageiros) {
        super(id, numeroPassageiros);
    }

    @Override
    public void realizarViagem(int numeroPassageiros) {
        System.out.println("Onibus em viagem");
    }
}
