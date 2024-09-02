package negocio;

import eda.*;

public class SegurancaOperacoes {
    /**
     * Se a quantidade é diferente de 0, a operação é válida.
     * @param q
     * @return 
     */
    public static boolean verificarQuantidade(int q){
        if(q > 0){
            return true;
        }
        return false;
    }
    
    /**
     * 
     * @param q
     * @param valor
     * @return o valor da compra. 
     */
    public static double atualizaValor(int q, double valor){
        return q * valor;
    }
    
    /**
     * Este método verifica se a quantidade no estoque é inferior ou superior a quantidade que será vendida.
     * @param s
     * @param q
     * @return true se a quantidade no estoque é superior.
     */
    public static boolean verificarDisponibilidade(Sorvete s, int q){
        if(s.getQuantidade() >= q){
            return true;
        }
        return false;
    }
    
    
    
}
