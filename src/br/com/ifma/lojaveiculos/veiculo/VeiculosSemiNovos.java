package br.com.ifma.lojaveiculos.veiculo;

import java.math.BigDecimal;
import java.time.LocalDate;
//import java.time.Month;
import java.time.Period;

/**
 * Classe que representa Veículos semi Novos.
 * @author Márcio e Jaqueline
 * @version 1.0
 */
public class VeiculosSemiNovos extends Veiculo {
    private double km;
    private String tempodeUso;
    private LocalDate dataCompra;
    private String proprietario;
    private String placa;
    private BigDecimal porcentagemLoja;
    private BigDecimal lucroLoja;
/**
 * Construtor para a classe Veículos semi Novos.
 * @param km double que repesenta a quilomêntragem do Veículo semi Novo.
 * @param dataCompra String que repesenta a data da compra do Veículo semi Novo.
 * @param proprietario String que repesenta o propriétario do Veículo semi Novo.
 * @param placa String que repesenta a placa do Veículo semi Novo.
 * @param porcentagemLoja BigDecimal que repesenta a porcentagem da loja do Veículo semi Novo.
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
    public VeiculosSemiNovos(double km, LocalDate dataCompra, 
                             String proprietario, String placa, BigDecimal porcentagemLoja,
                             int codigo, String descricao, int modelo, String cor, String fabricante, 
                             int ano, BigDecimal valor, int potencia, double cilindrada, String cambio) {
                super(codigo, descricao, modelo, cor, fabricante, ano, valor, potencia, cilindrada, cambio);
        this.km = km;        
        this.dataCompra = dataCompra;
        this.setTempodeUso();
        this.proprietario = proprietario;
        this.placa = placa;
        this.porcentagemLoja = porcentagemLoja;
        this.setLucroLoja();
    }
    /**
     * Método que retorna a quilômentragem do Veículo semi Novo.
     * @return um double que corresponde a quilômentragem do Veículo Novo.
     */
    public double getKm() {
        return km;
    }
    /**
     * Método que define o km do Veículo semi Novo.
     * @param km double que representa a km do Veículo semi Novo.
     */
    public void setKm(double km) {
        this.km = km;
    }
    /**
     * Método que retorna o tempo de uso do Veículo semi Novo.
     * @return uma String que corresponde ao tempo de uso do Veículo Novo.
     */
    public String getTempodeUso() {
        return tempodeUso;
    }
    /**
     * Calcula o tempo de uso do veículo.
     * Subtraindo a data da compra pela a data atual através da classe periodo. 
     */
    public void setTempodeUso() {
        LocalDate dataAtual = LocalDate.now();
        //LocalDate dataAnterior = LocalDate.of(2013, Month.APRIL, 12);
        Period periodo = Period.between(dataCompra, dataAtual);//between e uma classe da api que recebe duas instancias de LocalDAte
        this.tempodeUso = periodo.getYears()+ " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.";// acessa as datas dias, mes e ano
    
    }
    /**
     * Método que retorna a quilômentragem do Veículo semi Novo.
     * @return um double que corresponde a quilômentragem do Veículo semi Novo.
     */
    public LocalDate getDataCompra() {
        return dataCompra;
    }
    /**
     * Método que define a data da compra do Veículo semi Novo.
     * @param dataCompra LocalDate que representa a data da compra  do Veículo semi Novo.
     */
    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }
    /**
     * Método que retorna o proprietário do Veículo semi Novo.
     * @return uma String que corresponde ao proprietario do Veículo semi Novo.
     */
    public String getProprietario() {
        return proprietario; 
    }
    /**
     * Método que define o proprietário do Veículo semi Novo.
     * @param proprietario String que representa o proprietário do Veículo semi Novo.
     */
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    /**
     * Método que retorna a placa do Veículo semi Novo.
     * @return uma String que corresponde a placa do Veículo semi Novo.
     */
    public String getPlaca() {
        return placa;
    }
    /**
     * Método que define a placa do Veículo semi Novo.
     * @param placa String que representa a placa do Veículo semi Novo.
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    /**
     * Método que retorna a porcentagem da loja do Veículo semi Novo.
     * @return uma BigDecima que corresponde a porcentagem da loja do Veículo semi Novo.
     */
    public BigDecimal getPorcentagemLoja() {
        return porcentagemLoja;
    }
    /**
     * Método que define a porcentagem da loja do Veículo semi Novo.
     * @param porcentagemLoja BigDecimal que representa a  porcentagem da loja do Veículo semi Novo.
     */
    public void setPorcentegemLoja(BigDecimal porcentagemLoja) {
        this.porcentagemLoja = porcentagemLoja;
    }
    /**
     * Método que retorna o lucro da loja do Veículo semi Novo.
     * @return uma BigDecimal que corresponde ao lucro da loja do Veículo semi Novo.
     */
    public BigDecimal getLucroLoja() {
        return lucroLoja;
    }
    /**
     * Calcula  o lucro da loja.
     * Multiplicando o valor com desconto pela porcentagem da loja.
     */
    public void setLucroLoja() {
       //this.lucroLoja = super.getValorcomDesconto() * this.porcentagemLoja;
       this.lucroLoja = this.getValorcomDesconto().multiply(this.getPorcentagemLoja());
    }
}
