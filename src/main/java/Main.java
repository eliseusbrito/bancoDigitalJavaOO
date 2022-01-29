public class Main {

    public static void main(String[] args) {

        Cliente eliseu = new Cliente();
        eliseu.setNome("Eliseu");

        Conta cc = new ContaCorrente(eliseu);
        Conta cp = new ContaPoupanca(eliseu);

        cc.depositar(100);
        cc.transferir(90, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }

}
