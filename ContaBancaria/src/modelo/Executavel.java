package modelo;

import controle.Relatorio;

/**
 *
 * @author Jofil
 */
public class Executavel {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        Relatorio relatorio = new Relatorio();
        
        contaCorrente.sacar(10);
        contaPoupanca.sacar(3000);
        System.out.println(relatorio.gerarRelatorio(contaPoupanca));
        System.out.println(relatorio.gerarRelatorio(contaCorrente));
    }
}
