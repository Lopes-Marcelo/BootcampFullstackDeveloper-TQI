public class Principal {
    public static void main(String[] args) {
    Conta p1 = new Conta();
    p1.abrirConta("CC");
    p1.setNumConta(1111);
    p1.setDono("Marcelo");
    p1.depositar(300);
    p1.estadoAtual(); 
    
    Conta p2 = new Conta();
    p2.abrirConta("CP");
    p2.setNumConta(2222);
    p2.setDono("Nathaly");
    p2.depositar(500);
    p2.sacar(100);
    p2.estadoAtual();
    }
}