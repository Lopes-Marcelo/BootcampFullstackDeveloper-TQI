public abstract class Conta {
    
    //Atributos

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos Especiais

    public Conta(){
        this.setSaldo(0);
        this.setStatus(false);        
    }

    public int getNumConta(){
        return this.numConta;
    }
    
    public void setNumConta(int n){
        this.numConta = n;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean st){
        this.status = st;
    }

    //Métodos Gerais

    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        
        if (this.getTipo() == "CC"){
            System.out.println("Tipo: Conta Corrente");
        }
        if (this.getTipo() == "CP"){
            System.out.println("Tipo: Conta Poupança");
        }

        System.out.println("Saldo: R$" + this.getSaldo());
        if (this.getStatus() == true){
            System.out.println("Status: Ativa");
        }
        else {
            System.out.println("Status: Inativa");
        }
        System.out.println("-----------------------------");
    }   

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50); //Conta Corrente aberta no banco recebe um valor de R$50,00 
        }
        if (tipo == "CP"){
            this.setSaldo(100); ////Conta Poupança aberta no banco recebe um valor de R$100,00 
        }

        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Sua conta ainda possui dinheiro, não é possível o fechamento. Retire a quantia restante primeiro.");
        }
        if (this.getSaldo() < 0){
            System.out.println("Conta em débito, não é posível o fechamento. Realize o pagamento primeiro.");
        }
        if (this.getSaldo() == 0){
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono() + ".");
        }
        else {
            System.out.println("[ERRO] Não é possível realizar o depósito, verifique os dados informados!");
        }
    }

    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono() + "."); 
            }
            else {
                System.out.println("Saldo insuficiente.");
            }
        }
        else {
            System.out.println("[ERRO] Conta inexistente, verifique os dados informados.");
        }
    }

    public void pagarMensalidade(){
        int v2 = 0;
        if (this.getTipo() == "CC"){
            v2 = 12;
        }
        if (this.getTipo() == "CP"){
            v2 = 20;
        }

        if (this.getStatus() == true){
            if (this.getSaldo() > v2){
                this.setSaldo(this.getSaldo() - v2);
                System.out.println("Mensalidade paga com sucesso!"); 
            }
            else {
                System.out.println("Saldo insuficiente para pagamento da mensalidade.");
            }
        }
        else {
            System.out.println("ERRO! Conta não existe.");
        } 
    }
}
