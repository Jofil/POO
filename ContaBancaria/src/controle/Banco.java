package controle;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import modelo.ContaBancaria;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

/**
 *
 * @author Jofil
 */
public class Banco implements Imprimivel {

    static ArrayList<ContaBancaria> contas = new ArrayList<>();

    
/**
 * Metodo que insere uma conta no banco
 */
    public boolean inserir(ContaBancaria conta) {
        conta.setNumeroConta(contas.size());
        if (contas.add(conta)) {
            JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao gravar");
            return false;
        }
    }

/**
 * Metodo que remove uma conta no banco
 */
    public boolean remover(ContaBancaria conta) {
        if (contas.remove(conta)) {
            JOptionPane.showMessageDialog(null, "Removido com sucesso!");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao tentar remover!");
            return false;
        }
    }

    
/**
 * Metodo que retorna uma conta bancaria
 */
    public ContaBancaria procurarConta(int i) {
//        if(contas.contains(i)) {
        return contas.get(i);
//        }else{
//            return null;
//        }
    }

    
/**
 * Metodo que mostra dados do banco
 */
    public void mostraDados() {
//        Iterator i = contas.iterator();
//        while(i.hasNext()) {
//            continhas.concat(i.next().toString() + "\n");
//        }
        for (ContaBancaria c : contas) {
            if (c instanceof ContaCorrente) {
                JOptionPane.showMessageDialog(null, ((ContaCorrente) c).mostrarDados());
            } else if (c instanceof ContaPoupanca) {
                JOptionPane.showMessageDialog(null, ((ContaPoupanca) c).mostrarDados());
            }
        }
    }

    
/**
 * Metodo que verifica se a conta existe no banco
 */
    public boolean myContains(int i) {
        return contas.contains(contas.get(i));
    }

    @Override
    public String mostrarDados() {
        return "";
    }

}
