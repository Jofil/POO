package modelo;

/**
 *
 * @author Jofil
 */
public abstract class ContaBancaria {
    private String nome;
    private int numeroConta;
    private double saldo;

    
/**
 * Construtor da conta bancaria
 */
    public ContaBancaria(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    
/**
 * Construtor vazio da conta bancaria
 */
    public ContaBancaria() {
    }
    
    
/**
 * Metodo que saca valor  uma conta no banco
 */
    public abstract void sacar(double montante);
    
/**
 * Metodo que deposita um valor  numa conta no banco
 */
    public abstract void depositar(double montante);

    
/**
 * Metodo que transfere um valor  duma conta para outra
 */
    public static void transferir(double valor , ContaBancaria conta1,ContaBancaria conta2) {
        conta1.sacar(valor);
        conta2.depositar(valor);
    }
    
    
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
