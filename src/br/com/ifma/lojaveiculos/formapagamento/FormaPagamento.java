
package br.com.ifma.lojaveiculos.formapagamento;

import br.com.ifma.lojaveiculos.cliente.Cliente;
import br.com.ifma.lojaveiculos.veiculo.Veiculo;
import java.math.BigDecimal;
/**
 * Classe que representa forma de pagamento.
 * @author Márcio e Jaqueline
 * @version 1.0
 */
public abstract class FormaPagamento {
    private int codigo;
    private Cliente cliente;
    private BigDecimal valorTotal;
    private Veiculo veiculo;
/**
 * Construtor para a classe forma de pagamento.
 * @param codigo inteiro que representa o codigo da forma de pagamento.
 * @param cliente do tipo cliente que representa o cliente que esta fazendo o pagamento.
 * @param valorTotal BigDecimal que representa o valor total que esta sendo pago.
 * @param veiculo do tipo veiculo que representa o veiculo que esta sendo pago.
 */
    public FormaPagamento(int codigo, Cliente cliente, BigDecimal valorTotal, Veiculo veiculo) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.veiculo = veiculo;        
    }  
    /**
     * Método que retorna o código do pagamento.
     * @return um inteiro que corresponde ao código do pagamento.
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * Método que define o código do pagamento.
     * @param codigo inteiro que representa o código do pagamento.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * Método que retorna o cliente que irar fazer o pagamento.
     * @return uma Cliente que corresponde ao cliente que irar fazer o pagamento.
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * Método que define o cliente que irar efetuar o pagamento.
     * @param cliente Cliente que representa o cliente que irar efetuar o pagamento.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * Método que retorna o valor total do veículo a ser pago.
     * @return uma BigDecimal que corresponde ao valor total do veículo a ser pago.
     */
    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    /**
     * Método que define o valor total a ser pago.
     * @param valorTotal BigDecimal que representa o valor total a ser pago.
     */
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    /**
     * Método que retorna o veículo pago.
     * @return um Veículo que corresponde ao veículo pago.
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }
    
    /**
     * Método que define o veículo a ser pago.
     * @param veiculo Veículo que representa o veículo a ser pago.
     */
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }    
    
}

