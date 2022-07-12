public interface IConta {
    
    //Métodos 

    public abstract void depositar(float valor);
    public abstract void sacar(float valor);
    public abstract void mudarTipo();
    public abstract void extrato();
    public abstract void pagarAnuidade();
    public abstract void fecharConta();

}
