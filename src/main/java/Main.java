import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.setNome("Banquito");

        Cliente eliseu = new Cliente();
        eliseu.setNome("Eliseu");
        Cliente lucas = new Cliente();
        lucas.setNome("Lucas");
        Cliente davi = new Cliente();
        davi.setNome("Davi");
        List<Cliente> clienteList = new ArrayList<>();
        clienteList.add(eliseu);
        clienteList.add(davi);
        clienteList.add(lucas);
        banco.setClientes(clienteList);

        Conta cc = new ContaCorrente(eliseu, banco);
        Conta cp = new ContaPoupanca(eliseu, banco);

        cc.depositar(100);
        cc.transferir(90, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println(banco.clientesDoBanco());
    }

}
