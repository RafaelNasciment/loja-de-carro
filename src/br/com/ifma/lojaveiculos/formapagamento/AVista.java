
package br.com.ifma.lojaveiculos.formapagamento;

import br.com.ifma.lojaveiculos.cliente.Cliente;
import br.com.ifma.lojaveiculos.interfaces.Promocional;
import br.com.ifma.lojaveiculos.veiculo.Veiculo;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.swing.JOptionPane;
 /**
 * Classe que representa forma de pagamento à vista.
 * @author Márcio e Jaqueline
 * @version 1.0
 */
public class AVista extends FormaPagamento implements Promocional{
    private String modalidade; 
    private LocalDate data;
    /**
     * Construtor da classe à vista.
     * @param modalidade String que repesenta a modalidade da classe à vista.
     * @param data LocalDate que repesenta a data da classe à vista.
     * @param codigo inteiro herdado da classe abstrata forma de pagamento.
     * @param cliente do tipo cliente herdado da classe abstrata forma de pagamento.
     * @param valorTotal BigDecimal herdado da classe abstrata forma de pagamento.
     * @param veiculo do tipo veiculo herdado da classe abstrata forma de pagamento.
     */
    public AVista(int modalidade, LocalDate data, int codigo, Cliente cliente, BigDecimal valorTotal, Veiculo veiculo) {
        super(codigo, cliente, valorTotal, veiculo);
        this.setModalidade(modalidade);
        this.data = data;
    }
    /**
     * Método que retorna a modalidade da compra à vista.
     * @return uma String que corresponde a modalidade da compra à vista.
     */
    public String getModalidade() {
        return modalidade;
    }
    /**
     * Método que define a modalidade da compra à vista.
     * @param modalidade inteiro que representa a modalidade da compra à vista,
     * se em espécie, cheque, trânsferencia bancária ou débito.
     */
    public void setModalidade(int modalidade) {
        switch(modalidade){
            case 1:
               this.modalidade = "Espécie";
               break;
            case 2:
                this.modalidade = "Cheque";
                break;
            case 3:
                this.modalidade = "Trânsferencia Bancária";
                break;
            case 4:
                this.modalidade = "Débito";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Invalida!!!");
        }
        
    }
     /**
     * Método que retorna a data da compra à vista.
     * @return uma LocalDate que corresponde a data da compra à vista.
     */
    public LocalDate getData() {
        return data;
    }
    /**
     * Método que define a data da compra à vista.
     * @param data LocalDate que representa a data da compra à vista.
     */
    public void setData(LocalDate data) {
        this.data = data;
    }    
    /**
     * Subescrita do metodo Override
     * Método que define a porcentagem.
     * @param porcentagem BigDecimal que representa a porcentagem descontada da compra.
     * Se a porcentagem for igual ao limite de desconto que é igual a menos um.
     * Faz o valor do veículo vezes a porcentagem e subtrai o valor do 
     * veículo pelo valor da porentagem descontada.
     */
    @Override
    public void aplicarDesconto(BigDecimal porcentagem){
    if(porcentagem.compareTo(super.getVeiculo().getLimiteDesconto()) == -1){
            super.getVeiculo().setValorcomDesconto(super.getVeiculo().getValor().subtract(super.getVeiculo().
                                                         getValor().multiply(porcentagem)));
            JOptionPane.showMessageDialog(null, "O desconto foi APLICADO com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Desconto não aplicado.\nPorcentagem Invalida.");  
       }      
    }
}