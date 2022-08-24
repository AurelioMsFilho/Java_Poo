package Aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Compacta";
        c1.cor= "Azul";
        c1.ponta = 0.5f;
        c1.carga = 85;
        c1.destampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "preta";
        c2.ponta = 1.0f;
        c2.carga = 100;
        c2.tampar();
        c2.status();
        c2.rabiscar();

        Caneta c3 = new Caneta();
        c3.modelo = "Quilometrica";
        c3.cor = "Vermelha";
        c3.ponta = 0.05f;
        c3.carga = 90;
        c3.tampar();
        c3.status();
        c3.rabiscar();

        Caneta c4 = new Caneta();
        c4.modelo = "Cis";
        c4.cor = "Verde";
        c4.ponta = 0.7f;
        c4.carga = 40;
        c4.tampar();
        c4.status();
        c4.rabiscar();

        Caneta c5 = new Caneta();
        c5.modelo = "Faber-Castel";
        c5.cor = "Amarelo";
        c5.ponta = 1.6f;
        c5.carga = 10;
        c5.destampar();
        c5.status();
        c5.rabiscar();



    }

}
