package controle;

/**
 *
 * @author Jofil
 */
public class Relatorio {
    
    
/**
 * Metodo que que gera relatorio do banco
 */
    public String gerarRelatorio(Imprimivel i) {
        return i.mostrarDados();
    }
}
