package br.com.ifma.lojaveiculos.veiculo;

import java.math.BigDecimal;
/**
 * Classe que representa um Veículo.
 * @author Márcio e Jaqueline
 * @version 1.0
 */
public abstract class Veiculo  {
        private int codigo;
        private String descricao;
        private int modelo;
        private String cor;
        private String fabricante;
        private int ano;
        private BigDecimal valor;
        private BigDecimal valorcomDesconto ;
        private int potencia;
        private double cilindrada;
        private String cambio;
        private BigDecimal limiteDesconto;
    /**
     * Construtor para a classe abstrata Veículo.
     * @param codigo inteiro que repesenta o codigo do Veículo.
     * @param descricao String que repesenta a descrição do Veículo.
     * @param modelo inteiro que repesenta o modelo do Veículo.
     * @param cor String que repesenta cor do Veículo.
     * @param fabricante String que repesenta o fabricante do Veículo.
     * @param ano inteiro que repesenta o ano do Veículo.
     * @param valor BigDecimal que repesenta o valor do Veículo.
     * @param potencia inteiro que repesenta a potência do Veículo.
     * @param cilindrada double que repesenta a cilindrada do Veículo.
     * @param cambio String que repesenta o câmbio do Veículo.
     */
    public Veiculo(int codigo, String descricao, int modelo, 
                   String cor,String fabricante, int ano, BigDecimal valor, 
                   int potencia, double cilindrada, String cambio) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.modelo = modelo;
        this.cor = cor;
        this.fabricante = fabricante;
        this.ano = ano;
        this.valor = valor;
        this.valorcomDesconto =  valor;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.cambio = cambio;
    }
    /**
     * Método que retorna o código do Veículo.
     * @return um inteiro que corresponde ao código do Veículo.
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * Método que define o código do Veículo.
     * @param codigo inteiro que representa o código do Veículo.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }    
    /**
     * Método que retorna a descrição do Veículo.
     * @return uma String que corresponde a descrição do Veículo.
     */
    public String getDescricao() {
        return descricao;
    }
    /**
     * Método que define a descrição do Veículo.
     * @param descricao String que representa a definiçao do Veículo.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    /**
     * Método que retorna o modelo do Veículo.
     * @return um inteiro que corresponde ao modelo do Veículo.
     */
    public int getModelo() {
        return modelo;
    }
    /**
     * Método que define o modelo do Veículo.
     * @param modelo inteiro que representa o modelo do Veículo.
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    /**
     * Método que retorna a cor do Veículo.
     * @return uma String que corresponde a cor do Veículo.
     */
    public String getCor() {
        return cor;
    }
    /**
     * Método que define a cor do Veículo.
     * @param cor String que representa a cor do Veículo.
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    /**
     * Método que retorna o fabricante do Veículo.
     * @return uma String que corresponde ao fabricante do Veículo.
     */
    public String getFabricante() {
        return fabricante;
    }
    /**
     * Método que define o fabricante do Veículo.
     * @param fabricante String que representa o fabricante do Veículo.
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    /**
     * Método que retorna o ano do Veículo.
     * @return um inteiro que corresponde ao ano do Veículo.
     */
    public int getAno() {
        return ano;
    }
    /**
     * Método que define o ano do Veículo.
     * @param ano inteiro que representa o ano do Veículo.
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
    /**
     * Método que retorna o valor do Veículo.
     * @return uma BigDecimal que corresponde ao valor do Veículo.
     */
    public BigDecimal getValor() {
        return valor;
    }
    /**
     * Método que define o valor do Veículo.
     * @param valor BigDecimal que representa o valor do Veículo.
     */
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    /**
     * Método que retorna o valor com desconto do Veículo.
     * @return uma BigDecimal que corresponde ao valor com desconto do Veículo.
     */
    public BigDecimal getValorcomDesconto() {
        return valorcomDesconto;
    }
    /**
     * Método que define o valor com desconto do Veículo.
     * @param valorcomDesconto inteiro que representa o valor com desconto do Veículo.
     */
    public void setValorcomDesconto(BigDecimal valorcomDesconto) {
        this.valorcomDesconto = valorcomDesconto;
    } 
    /**
     * Método que retorna a potencia do Veículo.
     * @return um inteiro que corresponde a potência do Veículo.
     */
    public int getPotencia() {
        return potencia;
    }
    /**
     * Método que define a potência do Veículo.
     * @param potencia inteiro que representa a potência do Veículo.
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    /**
     * Método que retorna cilindrada do Veículo.
     * @return um double que corresponde a  cilindrada do Veículo.
     */
    public double getCilindrada() {
        return cilindrada;
    }
    /**
     * Método que define a cilindrada do Veículo.
     * @param cilindrada double que representa a cilindrada do Veículo.
     */
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    /**
     * Método que retorna o câmbio do Veículo.
     * @return uma String que corresponde ao câmbio do Veículo.
     */
    public String getCambio() {
        return cambio;
    }
    /**
     * Método que define o câmbio do Veículo.
     * @param cambio String que representa o câmbio do Veículo.
     */
    public void setCambio(String cambio) {
        this.cambio = cambio;
    }
    /**
     * Método que retorna o limite de desconto do Veículo.
     * @return uma BigDecimal que corresponde ao limite de desconto do Veículo.
     */
    public BigDecimal getLimiteDesconto() {
        return limiteDesconto;
    }
    /**
     * Método que define o limite de desconto do Veículo.
     * @param limiteDesconto BigDecimal que representa o limite de desconto do Veículo.
     */
    public void setLimiteDesconto(BigDecimal limiteDesconto) {
        this.limiteDesconto = limiteDesconto;
    }
} 