package Aula03;

public class Aula03t {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;


    public void status() {
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Modelo "+ this.modelo);
        System.out.println("Ponta "+this.ponta);
        System.out.println("Carga "+ carga);
        System.out.println("Está tampada? "+ this.tampada);
    }
    public void rabiscar(){
        if (this.tampada == true) {
            System.out.println("ERROR! Não posso Rabiscar!!!");
        }else {
            System.out.println("Estou Rabiscando");
        }


    }
    public void tampar(){
        this.tampada = true;

    }
    public void destampar(){
        this.tampada = false;

    }
}
// 5 atributos e 3 métodos(void).
