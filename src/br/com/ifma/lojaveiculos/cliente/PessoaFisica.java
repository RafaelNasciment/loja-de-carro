
package br.com.ifma.lojaveiculos.cliente;
import java.math.BigDecimal;
import java.time.LocalDate;
/**
 * Classe que represnta uma Pessoa Fisica.
 * @author Márcio e Jaqueline
 * @version 1.0
 */
public class PessoaFisica extends Cliente{
    private String cpf;
    private String rg;
    private LocalDate dataNasc;
    private String genero;
    private String profissao;
    private BigDecimal renda;
    private Empregador empregador;
    private Fiador fiador;
    /**
     * Construtor  para a classe Pessoa Fisica.
     * @param cpf String que representa o CPF da Pessoa Fisica.
     * @param rg String que representa o RG da Pessoa Fisica.
     * @param dataNasc LocalDate que representa a data de nascimento da Pessoa Fisica.
     * @param genero String que representa o genero da Pessoa Fisica.
     * @param profissao String que representa a profissão da Pessoa Fisica.
     * @param renda BigDecimal que representa a renda da Pessoa Fisica.
     * @param empregador da Classe Empregador que representa o empregador da Pessoa Fisica. 
     * @param fiador da Classe Fiador que representa o fiador da Pessoa Fisica. 
     * @param nome String herdada da classe cliente.
     * @param telefone String herdada da classe cliente.
     * @param endereco String herdada da classe cliente.
     * @param bairro String herdada da classe cliente.
     * @param cidade String herdada da classe cliente.
     * @param cep String herdada da classe cliente.
     * @param estado String herdada da classe cliente.
     * @param email String herdada da classe cliente.
     */
    public PessoaFisica(String cpf, String rg, LocalDate dataNasc, 
            String genero, String profissao, BigDecimal renda, Empregador empregador, 
            Fiador fiador, String nome, String telefone, String endereco, String bairro, 
                                   String cidade, String cep, String estado, String email) {
        
        super(nome, telefone, endereco, bairro, cidade, cep, estado, email);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNasc = dataNasc;
        this.genero = genero;
        this.profissao = profissao;
        this.renda = renda;
        this.empregador = empregador;
        this.fiador = fiador;
    }
    /**
     * Método que retorna o CPF da Pessoa Fisica.
     * @return retorna uma String que corresponde ao CPF da Pessoa Fisica.
     */
    public String getCpf() {
        return cpf;
    }
     /**
     * Método que define o CPF da Pessoa Fisica.
     * @param cpf String que representa o CPF da Pessoa Fisica. 
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
     /**
     * Método que retorna o RG da Pessoa Fisica.
     * @return retorna uma String que corresponde ao RG da Pessoa Fisica.
     */
    public String getRg() {
        return rg;
    }
    /**
     * Método que define o RG da Pessoa Fisica.
     * @param rg String que representa o RG da Pessoa Fisica. 
     */
    public void setRg(String rg) {
        this.rg = rg;
    }
     /**
     * Método que retorna a data de nascimento da Pessoa Fisica.
     * @return retorna uma LocalDate que corresponde a data de nascimento da Pessoa Fisica.
     */
    public LocalDate getDataNasc() {
        return dataNasc;
    }
    /**
     * Método que define a data de nascimento da Pessoa Fisica.
     * @param dataNasc LocalDate que representa a data de nascimento da Pessoa Fisica. 
     */
    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }
     /**
     * Método que retorna o genero da Pessoa Fisica.
     * @return retorna uma String que corresponde ao genero da Pessoa Fisica.
     */
    public String getGenero() {
        return genero;
    }
    /**
     * Método que define o genero da Pessoa Fisica.
     * @param genero String que representa o genero da Pessoa Fisica. 
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
     /**
     * Método que retorna a profissão da Pessoa Fisica.
     * @return retorna uma String que corresponde a profissão da Pessoa Fisica.
     */
    public String getProfissao() {
        return profissao;
    }
    /**
     * Método que define profissão da Pessoa Fisica.
     * @param profissao String que representa a profissão da Pessoa Fisica. 
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
     /**
     * Método que retorna a renda da Pessoa Fisica.
     * @return retorna uma BigDecimal que corresponde a renda da Pessoa Fisica.
     */
    public BigDecimal getRenda() {
        return renda;
    }
    /**
     * Método que define a renda da Pessoa Fisica.
     * @param renda BigDecimal que representa renda da Pessoa Fisica. 
     */
    public void setRenda(BigDecimal renda) {
        this.renda = renda;
    }
     /**
     * Método que retorna os dados do empregador da Pessoa Fisica.
     * @return retorna uma Classe Empregador que corresponde aos dados do empregador da Pessoa Fisica.
     */
    public Empregador getEmpregador() {
        return empregador;
    }
    /**
     * Método que define os dados do empregador da Pessoa Fisica.
     * @param empregador Classe Empregador que representa dados do empregador da Pessoa Fisica. 
     */
    public void setEmpregador(Empregador empregador) {
        this.empregador = empregador;
    }
     /**
     * Método que retorna os dados do Fiador da Pessoa Fisica.
     * @return retorna uma Classe Fiador que corresponde aos dados do fiador da Pessoa Fisica.
     */
    public Fiador getFiador() {
        return fiador;
    }
    /**
     * Método que define os dados do fiador da Pessoa Fisica.
     * @param fiador Classe Fiador que representa dados do fiador da Pessoa Fisica. 
     */
    public void setFiador(Fiador fiador) {
        this.fiador = fiador;
    }
    /**
     * Subescrita Override para status
     */
    @Override
    public void setStatus() {
    }
    
}