public class ContaPoupanca extends Conta implements IConta{

    //Método Construtor

    public ContaPoupanca(int numConta, String tipo, String dono, boolean status){
        super(numConta, tipo, dono, status);
        this.tipo = "CP";
        this.status = true;
        this.saldo = getSaldo() + 100; //Conta Poupança aberta no banco recebe um valor de R$100,00

    }

    //Métodos Especiais

    private void setSaldo(float n){
        this.saldo = n;
    }
    
    @Override
    public float getSaldo() {
        return super.getSaldo();
    }

    private void setTipo(String t){
        this.tipo = t;
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    private void setStatus(boolean s){
        this.status = s;
    }
    
    @Override
    public boolean getStatus() {
        return super.getStatus();
    }

    //Métodos Abstratos

    @Override
    public String toString(){
        return "Conta corrente aberta com sucesso! Aproveite os R$50,00 de bônus!" + "\nCliente: " + getDono() + "\nConta: " + getNumConta() + "\nTipo: " + getTipo() + "\nSaldo: " + getSaldo() + "\nStatus: " + getStatus();
    }

    //Métodos Públicos 

    public void depositar(float valor){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado na conta poupança de " + this.getDono() + ".");
        }
        else {
            System.out.println("[ERRO] Não é possível realizar o depósito, verifique os dados informados!");
        }
    }

    public void sacar(float valor){
        if (this.getStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta poupança de " + this.getDono() + "."); 
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
            System.out.println("Dono: " + this.getDono());
            System.out.println("Tipo: " + this.getTipo());
            System.out.println("Saldo: R$" + this.getSaldo());
            System.out.println("Status: Ativa");
            System.out.println("-----------------------------------------------");
            System.out.println(" ");

            setTipo("CC");

            System.out.println("-----------------------------------------------");
            System.out.println("Conta: " + this.getNumConta());
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
            System.out.println("Dono: " + this.getDono());
            System.out.println("Tipo: " + this.getTipo());
            System.out.println("Saldo: R$" + this.getSaldo());
            System.out.println("Status: Ativa");
            System.out.println("-----------------------------");
        } else {
            System.out.println("[ERRO] Conta inexistente, favor verificar os dados informados.");
        }
    }

    public void pagarAnuidade(){ //Tarifa cobrada por mês, R$1,20 da conta poupança 
        
        float taxa = 1.2f;

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
            System.out.println("Sua conta poupança ainda possui saldo, não é possível realizar o fechamento.Por favor, retire a quantia restante primeiro.");
        }
        if (this.getSaldo() < 0){
            System.out.println("Conta em débito, não é posível realizar o fechamento. Debite o pagamento primeiro.");
        }
        if (this.getSaldo() == 0){
            this.setStatus(false);
            System.out.println("Conta poupança fechada com sucesso.");
        }
    }
}
