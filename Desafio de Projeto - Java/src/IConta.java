public interface IConta {
    
    //Métodos 

    public abstract void depositar(float valor);
    public abstract void sacar(float valor);
    public abstract void mudarTipo();
    public abstract void extrato();
    public abstract void pagarAnuidade();
    public abstract void fecharConta();
    public abstract void transferirCP(float valor, ContaPoupanca contaDestino); //Transferir para conta poupança
    public abstract void transferirCC(float valor, ContaCorrente contaDestino); //Trnaferir para conta corrente

}
