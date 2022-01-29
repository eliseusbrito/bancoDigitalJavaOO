import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Banco {

    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes;

    public String clientesDoBanco() {
        return "Banco{" +
                "clientes=" + clientes +
                '}';
    }
}
