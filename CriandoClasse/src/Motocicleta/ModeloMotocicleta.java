package Motocicleta;

public class ModeloMotocicleta {
    String fabricante;
    String modelo;
    String tipo;
    String cor;
    int cilindrada;
    boolean pilotar;

    void andar() {
        if( this.pilotar == true){
            System.out.println("Vamos dar uma volta!");
        }else {
            System.out.println("Tem que verificar oleo e combustivel");
        }

    }
    void ligar(){

        this.pilotar = true;
    }
    void desligar(){

        this.pilotar = false;
    }
    void status() {
        System.out.println(this.fabricante);
        System.out.println(this.modelo);
        System.out.println(this.tipo);
        System.out.println(this.cor);
        System.out.println(this.cilindrada);
        System.out.println(this.pilotar);
    }


}
