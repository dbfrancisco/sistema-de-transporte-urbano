package atividade.poo.java;

public abstract class Transporte {
    private String id;
    private int capacidade;
    private int numeroPassageiros;
    private int consumoCombustivel = 0;
    private int quantidadeDeViagens;
    private double custo;
//Encapsulamento nos atributos, por exemplo private

//Construtor
    public Transporte(String id, int numeroPassageiros){
        this.id = id;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidade = 0;
        this.quantidadeDeViagens = 0;
        this.custo = 0.0;
    }

//métodos Getter e Setter para acessar esses atributos privados
// get e set de id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
//get e set de capacidade

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
//get e set de NumeroPassageiros

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }
//get e set de combustivel
    public int getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(int consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }
//regras da viagem
    public void realizarViagem(int numeroPassageiros){
        quantidadeDeViagens++;
        System.out.println("===========Estatísticas dos veículos ==============");
        if (quantidadeDeViagens >= 4){
            System.out.println("O transporte " + id + " precisa passar por manutenção.");
        }
        else if (numeroPassageiros > capacidade){
            capacidade = numeroPassageiros;
        }
        //se o número de passageiros for maior que a capacidade, capacidade recebe esse número de passageiros, assim evitamos que a capacidade exceda
        System.out.println("Vamos lá ");
    }



    //informações
    public void exibirInformacoes(){
        System.out.println("===========Estatísticas dos veículos ==============");
        System.out.println("Número de viagens: " + quantidadeDeViagens);
        System.out.println("quantidade de passageiros: " + numeroPassageiros);
        System.out.println();
    }

    public double calcularCustos(double valor){
        return valor;
    }

    public abstract void realizarViagem();
}
