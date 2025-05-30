package atividade.poo.java;

public class Trem extends Transporte{
    public Trem(String id, int numeroPassageiros) {
        super(id, numeroPassageiros);
    }

    @Override
    public void realizarViagem() {
        System.out.println("viajando de trem...");
    }
}
