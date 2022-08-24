package Aula5b;

public class Aula05b {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(1234);
        c1.setDono("Aurélio");
        c1.abrirConta("CC");
        c1.depositar(450);

        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(1223);
        c2.setDono("Aurélio Filho");
        c2.abrirConta("CP");
        c2.depositar(900);
        c2.sacar(320);

        c1.estadoAtual();
        c2.estadoAtual();



        

    }
}
