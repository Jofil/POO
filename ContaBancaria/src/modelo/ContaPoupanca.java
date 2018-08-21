package modelo;

import controle.Imprimivel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jofil
 */
public class ContaPoupanca extends ContaBancaria implements Imprimivel{

    private static final double LIMITE = 500;

    
/**
 * Construtor da conta poupanca
 */
    public ContaPoupanca(String nome, double saldo) {
        super(nome,  saldo);
    }


    public ContaPoupanca() {
    }
    
    
/**
 * Metodo reescrito para sacar
 */
    @Override
    public void sacar(double montante) {
        if(montante <= this.getSaldo() + LIMITE) {
            this.setSaldo(this.getSaldo() - montante);
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
            this.setSaldo(this.getSaldo() + montante);
            JOptionPane.showMessageDialog(null, "Deposito feito com sucesso.");
        }else
        JOptionPane.showMessageDialog(null, "O deposito deve ser maior de zero..");
    }    

    
/**
 * Metodo reescrito para mostrar dados
 */
    @Override
    public String mostrarDados() {
        return "O numero da conta poupanca e :" + this.getNumeroConta() + " e o seu saldo e :" + this.getSaldo();
    }
}
