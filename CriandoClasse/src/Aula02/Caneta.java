package Aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;


    void status() {
        System.out.println("Modelo "+ this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Ponta "+this.ponta);
        System.out.println("Carga "+ carga);
        System.out.println("Está tampada? "+ this.tampada);
    }
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERROR! Não posso Rabiscar!!!");
        }else {
            System.out.println("Estou Rabiscando");
        }


    }
    void tampar() {
        this.tampada = true;

    }
    void destampar() {
        this.tampada = false;

    }
}
// 5 atributos e 3 métodos(void).