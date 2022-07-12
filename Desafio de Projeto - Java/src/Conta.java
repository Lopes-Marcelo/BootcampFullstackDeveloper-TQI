public abstract class Conta {

    //Atributos 

    protected int numConta;
    protected String tipo;
    private String dono;
    protected float saldo;
    protected boolean status;

    //Método Contrutor

    public Conta(int numConta, String tipo, String dono, boolean status){

        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.status = false;
    }

    //Métodos Especiais

    public int getNumConta(){
        return this.numConta;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String getDono(){
        return this.dono;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public boolean getStatus(){
        return this.status;
    }

    //Métodos Abstratos
    
    @Override
    public String toString(){
        return "Cliente: " + getDono() + "\nConta: " + getNumConta() + "\nTipo: " + getTipo() + "\nSaldo: " + getSaldo() + "\nStatus: " + getStatus();
    }
}
