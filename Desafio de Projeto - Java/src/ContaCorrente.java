public final class ContaCorrente extends Conta implements IConta{

    //Método Construtor

    private static int SEQUENCIAL = 1;

    public ContaCorrente(String dono, boolean status){
        super(dono, status);
        this.tipo = "CC";
        this.status = true;
        this.saldo = getSaldo() + 50; //Conta Corrente aberta no banco recebe um valor de R$50,00
        super.numConta = SEQUENCIAL ++;
    }

    //Métodos Especiais saldo status tipo
    
    private void setSaldo(float n){
        this.saldo = n;
    }

    private void setTipo(String t){
        this.tipo = t;
    }

    private void setStatus(boolean s){
        this.status = s;
    }

    //Métodos Abstratos

    @Override
    public String toString(){
        return "Conta corrente aberta com sucesso! Aproveite os R$50,00 de bônus!" + "\nCliente: " + getDono() + "\nConta: " + getNumConta() + "\nAgência: 0001 " + "\nTipo: " + getTipo() + "\nSaldo: " + getSaldo() + "\nStatus: " + getStatus();
    }

    @Override
    public float getSaldo() {
        return super.getSaldo();
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public boolean getStatus() {
        return super.getStatus();
    }

    //Métodos Públicos da Interface

    public void depositar(float valor){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado na conta corrente de " + this.getDono() + ".");
        }
        else {
            System.out.println("[ERRO] Não é possível realizar o depósito, verifique os dados informados!");
        }
    }

    public void sacar(float valor){
        if (this.getStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta corrente de " + this.getDono() + "."); 
            }
            else {
                System.out.println("Saldo insuficiente. Verifique o saldo atual.");
            }
        }
        else {
            System.out.println("[ERRO] Conta inexistente, verifique os dados informados.");
        }
    }

    public void mudarTipo(){ //A mudança no tipo da conta é possível mediante pagamento de taxa no valor de R$5,00
        if (this.getStatus() == true){
            System.out.println("-----------------------------------------------");
            System.out.println("Procedimento de troca de tipo de conta iniciado");
            System.out.println("-----------------------------------------------");
            System.out.println("Conta: " + this.getNumConta());
            System.out.println("Agência: 0001");
            System.out.println("Dono: " + this.getDono());
            System.out.println("Tipo: " + this.getTipo());
            System.out.println("Saldo: R$" + this.getSaldo());
            System.out.println("Status: Ativa");
            System.out.println("-----------------------------------------------");
            System.out.println(" ");

            setTipo("CP");

            System.out.println("-----------------------------------------------");
            System.out.println("Conta: " + this.getNumConta());
            System.out.println("Agência: 0001");
            System.out.println("Dono: " + this.getDono());
            System.out.println("Tipo: " + this.getTipo());
            System.out.println("Saldo: R$" + this.getSaldo());
            System.out.println("Status: Ativa");
            System.out.println("-----------------------------------------------");

        } else {
            System.out.println("[ERRO] Conta inexistente, favor verificar os dados informados.");
        }
    }

    public void extrato(){
        if (this.getStatus() == true){
            System.out.println("-----------------------------");
            System.out.println("Conta: " + this.getNumConta());
            System.out.println("Agência: 0001");
            System.out.println("Dono: " + this.getDono());
            System.out.println("Tipo: " + this.getTipo());
            System.out.println("Saldo: R$" + this.getSaldo());
            System.out.println("Status: Ativa");
            System.out.println("-----------------------------");
        } else {
            System.out.println("[ERRO] Conta inexistente, favor verificar os dados informados.");
        }
    }

    public void pagarAnuidade(){ //Tarifa cobrada por mês, R$2,50 da conta corrente
        float taxa = 2.5f;

        if (this.getStatus() == true){
            if (this.getSaldo() > taxa){
                this.setSaldo(this.getSaldo() - taxa);
                System.out.println("Tarifa paga com sucesso!"); 
            }
            else {
                System.out.println("Saldo insuficiente para pagamento da tarifa.");
            }
        }
        else {
            System.out.println("[ERRO] Conta não existe, favor verificar dados informados.");
        }
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Sua conta corrente ainda possui saldo, não é possível realizar o fechamento. Por favor, retire a quantia restante primeiro.");
        }
        if (this.getSaldo() < 0){
            System.out.println("Conta em débito, não é posível realizar o fechamento. Debite o pagamento primeiro.");
        }
        if (this.getSaldo() == 0){
            this.setStatus(false);
            System.out.println("Conta corrente fechada com sucesso.");
        }
    }

    public void transferirCC(float valor, ContaCorrente contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void transferirCP(float valor, ContaPoupanca contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
