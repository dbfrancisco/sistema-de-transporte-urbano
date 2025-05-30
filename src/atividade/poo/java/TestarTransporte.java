package atividade.poo.java;

import java.util.ArrayList;
import java.util.List;

public class TestarTransporte {
    public static void main(String[] args) {
        Transporte onibus1 = new Onibus("Bus-1", 30);

        List<Transporte> listaVeiculos = new ArrayList<>();
        listaVeiculos.add(onibus1);

        for (int i = 0; i <= 10; i++){
            for (Transporte veiculos : listaVeiculos){
                veiculos.realizarViagem(40);
                veiculos.exibirInformacoes();
            }
        }
    }
}
