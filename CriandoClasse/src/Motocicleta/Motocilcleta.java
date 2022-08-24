package Motocicleta;

public class Motocilcleta {
    public static void main(String[] args) {
        ModeloMotocicleta moto = new ModeloMotocicleta();
        moto.fabricante = "Honda";
        moto.modelo = "Cg Titan";
        moto.tipo = "Street";
        moto.cor = "Roxa";
        moto.cilindrada = 125;
        //moto.ligada = true;

        moto.desligar();
        moto.status();
        moto.andar();


        ModeloMotocicleta moto2 = new ModeloMotocicleta();
        moto2.fabricante = "Yamaha";
        moto2.modelo = "Ybr";
        moto2.tipo = "Street";
        moto2.cor = "Vermelha";
        moto2.cilindrada = 125;
        //moto2.ligada = true;


        moto2.ligar();
        moto2.status();
        moto2.andar();



    }
}
