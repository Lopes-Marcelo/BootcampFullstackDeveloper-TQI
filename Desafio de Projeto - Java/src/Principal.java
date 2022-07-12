public class Principal {
    public static void main(String[] args) throws Exception {

        ContaCorrente a[] = new ContaCorrente[2];
        a[0] = new ContaCorrente("Marcelo", false);
        a[1] = new ContaCorrente("Nathaly", false);

        ContaPoupanca b[] = new ContaPoupanca[2];
        b[0] = new ContaPoupanca("Celo" , false);
        b[1] = new ContaPoupanca("Nath" , false);

        System.out.println(a[0].toString());
        System.out.println(a[1].toString());

        System.out.println(b[0].toString());
        System.out.println(b[1].toString());

        a[0].extrato();
        a[1].extrato();

        b[0].extrato();
        b[1].extrato();
    }
}
