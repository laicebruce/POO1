import java.util.*;


public class Agencia {
    
    private int numero;
    private Banco banco;
    private List<ContaIF> contas = new ArrayList<ContaIF>();

    public void cadastrarConta(ContaIF conta) {
        contas.add(conta);
    }
    
    public ContaIF pesquisarContaPorNumero(int numero) {
        
        for (ContaIF conta : contas) {
            
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        
        throw new RuntimeException("Conta n�o encontrada: " + numero);
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Banco getBanco() {
        return banco;
    }
    
    
    
    
   
    private String cadastrarCliente;    
    private List<Cliente> CadastroClienteNome = new ArrayList<Cliente>();   
     
    public void cadastrarCliente(Cliente nome) {
    	cadastrarCliente.add(nome);
    }
}