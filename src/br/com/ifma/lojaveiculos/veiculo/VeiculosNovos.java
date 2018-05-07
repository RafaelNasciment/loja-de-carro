package br.com.ifma.lojaveiculos.veiculo;

import java.math.BigDecimal;
/**
 * Classe que representa Veículos Novos.
 * @author Márcio e Jaqueline
 * @version 1.0
 */
public class VeiculosNovos extends Veiculo {
        private int garantia;
        private BigDecimal valorEmplacar;
        private final BigDecimal taxaEmplacar = new BigDecimal("0.03");
    /**
     * Construtor para a classe Veículos Novos.
     * @param garantia String que repesenta a garantia do Veículo Novo.
     * @param codigo inteiro herdado da classe Veículo.
     * @param descricao String herdada da classe Veículo.
     * @param modelo inteiro herdado da classe Veículo.
     * @param cor String herdada da classe Veículo.
     * @param fabricante String herdada da classe Veículo.
     * @param ano inteiro herdado da classe Veículo.
     * @param valor BigDecimal herdada da classe Veículo.
     * @param potencia inteiro herdado da classe Veículo.
     * @param cilindrada double herdado da classe Veículo.
     * @param cambio String herdada da classe Veículo.
     */
        public VeiculosNovos(int garantia, int codigo, String descricao,
            int modelo, String cor, String fabricante, int ano,BigDecimal valor,
            int potencia, double cilindrada, String cambio){
        super(codigo, descricao, modelo, cor, fabricante, ano, valor, potencia, cilindrada, cambio);
        this.garantia = garantia;
        this.setValorEmplacar(); 
    }
    /**
     * Método que retorna a garantia do Veículo Novo.
     * @return um inteiro que corresponde a garantia do Veículo Novo.
     */
    public int getGarantia() {
        return garantia;
    }
     /**
     * Método que define a garantia do Veículo Novo.
     * @param garantia inteiro que representa a garantia do Veículo Novo.
     */
    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
     /**
     * Método que retorna o valor de emplacamento do Veículo Novo.
     * @return uma BigDecimal que corresponde ao valor de emplacamento do Veículo Novo.
     */
    public BigDecimal getValorEmplacar() {
        return valorEmplacar;
    }
     /**
      * Calcula o valor do emplacamento, multiplicando o valor pela taxa de emplacamento.
      */
    public void setValorEmplacar() {
        this.valorEmplacar = super.getValor().multiply(taxaEmplacar);         
        
    }
}
