package Aula5b;

public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("----------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: "+ this.getTipoConta());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
        System.out.println("----------------------------------------");
    }
    public ContaBanco (){
        this.setSaldo(0);
        this.setStatus(false);

    }
    public void abrirConta(String tc){
        this.setTipoConta(tc);
        this.setStatus(true);
        if (tc == "CC"){
            this.setSaldo(50);
        }else if(tc =="CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso! ");

    }
    public void fecharConta(){
        if (this.getSaldo()> 0){
            System.out.println("Faça a retirada do saldo positivo");
        } else if (this.getSaldo() <0) {
            System.out.println("Saldo devedor! Não é possivel fechar conta.");

        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if (this.getStatus()) {
            this.saldo = this.saldo +v;
            //this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de "+getDono());
        }else{
            System.out.println("Impossivel realizar o deposito em um conta fechada!");
        }


    }
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                //this.setSaldo(this.getSaldo() - v);
                this.saldo = this.saldo - v;
                System.out.println("Saque realizado na conta de "+ this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque ");
            }
        }else {
            System.out.println("Impossivel sacar de uma conta fechada! ");
        }

    }
    public void pagarMensal(){
        int v =0;
        if (this.getTipoConta() == "CC"){
            v = 12;
        }else if (this.getTipoConta() == "CP"){
            v = 20;
        }if(this.getStatus()){
            //this.setSaldo(this.getSaldo() - v);
            this.saldo = this.saldo - v ;
            System.out.println("Mensalidade paga com sucesso por "+ this.getDono());
        }else{
            System.out.println("Impossivel pagar uma conta fechada! ");
        }
    }

    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tc) {
        this.tipoConta = tc;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(float sd) {
        this.saldo = sd;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
