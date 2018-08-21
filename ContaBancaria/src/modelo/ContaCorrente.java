package modelo;

import controle.Imprimivel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jofil
 */
public class ContaCorrente extends ContaBancaria implements Imprimivel {

    private static final double TAXA_DE_OPERACAO = 0.1;

/**
 * Construtor da conta corrente
 */
    public ContaCorrente(String nome, double saldo) {
        super(nome , saldo);
    }

    
/**
 * Construtor da conta corrente
 */
    public ContaCorrente() {
    }
    
    
    
/**
 * Metodo reescrito para sacar
 */
    @Override
    public void sacar(double montante) {
        if(this.getSaldo() >= montante + montante * TAXA_DE_OPERACAO) {
            this.setSaldo(this.getSaldo() - montante - (montante * TAXA_DE_OPERACAO));
            JOptionPane.showMessageDialog(null, "Saque executado com sucesso.");
        }else
        JOptionPane.showMessageDialog(null, "Saque sem sucesso.");
    }

    
/**
 * Metodo reescrito para depositar
 */
    @Override
    public void depositar(double montante) {
        if(montante > 0) {
            this.setSaldo(this.getSaldo() + montante - (montante * TAXA_DE_OPERACAO));
            JOptionPane.showMessageDialog(null, "Deposito feito com sucesso.");
        }else
        JOptionPane.showMessageDialog(null, "O deposito deve ser no minimo 1 MT.");
    }

    public static double getTAXA_DE_OPERACAO() {
        return TAXA_DE_OPERACAO;
    }

    
/**
 * Metodo reescrito para mostrar dados
 */
    @Override
    public String mostrarDados() {
        return "O numero da conta corrente e :" + this.getNumeroConta() + " e o seu saldo e :" + this.getSaldo();
    }
    
}
