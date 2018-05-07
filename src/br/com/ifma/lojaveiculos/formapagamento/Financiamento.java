 
package br.com.ifma.lojaveiculos.formapagamento;

import br.com.ifma.lojaveiculos.cliente.Cliente;
import br.com.ifma.lojaveiculos.cliente.Fiador;
import br.com.ifma.lojaveiculos.veiculo.Veiculo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
/**
 * Classe que representa forma de pagamento Financiamento.
 * @author Márcio e Jaqueline
 * @version 1.0
 */
public class Financiamento extends FormaPagamento {
    private BigDecimal entrada;
    private BigDecimal valorFinanciado;
    private BigDecimal taxaJuros;
    private long numeroParcela;
    private BigDecimal valorParcela;
    private BigDecimal valorFinal;
    private LocalDate dataParcelas[];
    private Fiador fiador;
    /**
     * Construtor para a classe Financiamento.
     * @param entrada Bigdecimal que representa o valor da entrada do Financiamento.
     * @param taxaJuros BigDecimal que representa a taxa de juros do valor Financiado. 
     * @param numeroParcela Long que represnta a quantidade de parcelas do valor Fianciado.
     * @param fiador do tipo Fiador que representa o Fiador do cliente que ira financiar o veiculo.
     * @param codigo inteiro herdado da classe abstrata forma de pagamento.
     * @param cliente do tipo cliente herdado da classe abstrata forma de pagamento.
     * @param valorTotal BigDecimal herdado da classe abstrata forma de pagamento.
     * @param veiculo do tipo veiculo herdado da classe abstrata forma de pagamento.
     */
    public Financiamento(BigDecimal entrada, BigDecimal taxaJuros, 
                            long numeroParcela, Fiador fiador, int codigo, 
                               Cliente cliente, BigDecimal valorTotal, Veiculo veiculo) {
        super(codigo, cliente, valorTotal, veiculo);
           this.entrada = entrada;
           this.taxaJuros = taxaJuros;
           this.numeroParcela = numeroParcela;
           this.fiador = fiador;
           this.setValorFinanciado();
           this.setValorParcela();
           this.setDataParcelas(LocalDate.now());
           this.setValorFinal();
    }
    
     /**
     * Método que retorna o valor da entrada do valor financiado.
     * @return uma BigDecimal que corresponde ao valor da entrada  do valor financiado.
     */
    public BigDecimal getEntrada() {
        return entrada;
    }
    /**
     * Método que define o valor da entrada do valor financiado.
     * @param entrada BigDecimal que representa o valor da entrada do valor financiado.
     */
    public void setEntrada(BigDecimal entrada) {
        this.entrada = entrada;
    }
    /**
     * Método que retorna o valor financiado.
     * @return uma BigDecimal que corresponde ao valor financiado.
     */
    public BigDecimal getValorFinanciado() {
        return valorFinanciado;
    }
     /**
     * Calcula o valor financiado, subtraindo o valor total do veículo pelo valor da entrada.
     */
    public void setValorFinanciado() {
        this.valorFinanciado = super.getValorTotal().subtract(entrada);
    }
    /**
     * Método que retorna o valor da taxa de juros do valor financiado.
     * @return uma BigDecimal que corresponde ao valor da taxa de juros do valor financiado.
     */
    public BigDecimal getTaxaJuros() {
        return taxaJuros;
    }
     /**
     * Método que define o valor da taxa de juros do valor financiado..
     * @param taxaJuros BigDecimal que representa o valor da taxa de juros do valor financiado.
     */
    public void setTaxaJuros(BigDecimal taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    /**
     * Método que retorna o numero de parcelas do valor financiado.
     * @return um inteiro que corresponde ao valor da entrada  do valor financiado.
     */
    public long  getNumeroParcela() {
        return numeroParcela;
    }
    /**
     * Método que define ao valor da entrada  do valor financiado.
     * @param numeroParcela inteiro que representa o valor da entrada  do valor financiado.
     */
    public void setNumeroparcela(int numeroParcela) {
        this.numeroParcela = numeroParcela;
    }
    /**
     * Método que retorna o valor das parcelas referente ao valor financiado.
     * @return uma BigDecimal que corresponde ao valor das parcelas referente ao valor financiado.
     */
    public BigDecimal getValorParcela() {
        return valorParcela;
    }
    /**
     * Método que calcula e determina o valor das parcelas. 
     * Somando valor financiado com valor financiado e
     * multiplicando com a taxa de juros para descobrir o montante.
     * Depois descoberto o montante dividindo pelo número de parcelas.
     */
    public void setValorParcela() {
        BigDecimal montante = this.valorFinanciado.add(
                              this.valorFinanciado.multiply(taxaJuros));
        this.valorParcela = montante.divide(BigDecimal.valueOf(numeroParcela), 2,RoundingMode.UP);
    }
    /**
     * Método que retorna o valor final do valor financiado.
     * @return uma BigDecimal que corresponde ao valor final do valor financiado.
     */
    public BigDecimal getValorFinal() {
        return valorFinal;
    }
    /**
     * Método que calcula e determina o valor final a ser pago.
     * Multiplicando o valor da parcela pelo número de parcelas.
     */
    public void setValorFinal() {
        this.valorFinal = this.valorParcela.multiply(BigDecimal.valueOf(numeroParcela));
    }
    /**
     * Método que retorna a data das parcelas.
     * @return uma LocalDate que corresponde a data das parcelas.
     */
    public LocalDate[] getDataParcelas() {
        return dataParcelas;
    }
    /**
     * Método que a determina a data das parcelas a partir da data da entrada.     * 
     * @param dataEntrada LocalDate que representa a data da entrada.  
     */
    public void setDataParcelas(LocalDate dataEntrada) {
        this.dataParcelas = new LocalDate[(int)numeroParcela];//inicializando arrey
        int i = 0;
        for(LocalDate data : this.dataParcelas){
            this.dataParcelas[i] = dataEntrada.plusMonths(i+1);
            i++;
        }
    }
    /**
     * Método que retorna o fiador do cliente financiador.
     * @return um Fiador que corresponde ao fiador do cliente financiador.
     */
    public Fiador getFiador() {
        return fiador;
    }
    /**
     * Método que define o fiador do cliente financiador.
     * @param fiador do tipo Fiador que representa o fiador do cliente financiador.
     */
    public void setFiador(Fiador fiador) {
        this.fiador = fiador;
    }
    
}
