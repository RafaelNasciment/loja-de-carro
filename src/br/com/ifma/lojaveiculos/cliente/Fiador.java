
package br.com.ifma.lojaveiculos.cliente;
import java.math.BigDecimal;
import java.time.LocalDate;
/**
 * Classe que representa o Fiador do cliente da loja de veiculos.
 * @author Márcio e Jaqueline
 * @version 1.0
 */
public class Fiador extends Cliente {
    private String cpf;
    private String rg;
    private LocalDate dataNasc;
    private String genero;
    private String profissao;
    private BigDecimal renda;
    private Empregador empregador;
    /**
     * Construtor  para a classe Fiador.
     * @param cpf String que representa o CPF do Fiador.
     * @param rg String que representa o RG do Fiador.
     * @param dataNasc LocalDate que representa a data de nascimento do Fiador.
     * @param genero String que representa o genero do Fiador.
     * @param profissao String que representa a profissão do Fiador.
     * @param renda BigDecimal que representa a renda do Fiador.
     * @param empregador do tipo Empregador que representa o empregador do Fiador.
     * @param nome String herdada da classe cliente.
     * @param telefone String herdada da classe cliente.
     * @param endereco String herdada da classe cliente.
     * @param bairro String herdada da classe cliente.
     * @param cidade String herdada da classe cliente.
     * @param cep String herdada da classe cliente.
     * @param estado String herdada da classe cliente.
     * @param email String herdada da classe cliente.
     */
    public Fiador(String cpf, String rg, LocalDate dataNasc, String genero,
            String profissao, BigDecimal renda, Empregador empregador, String nome, 
            String telefone, String endereco, String bairro, String cidade, String cep, String estado,String email) {
        super(nome, telefone, endereco, bairro, cidade, cep, estado, email);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNasc = dataNasc;
        this.genero = genero;
        this.profissao = profissao;
        this.renda = renda;
        this.empregador = empregador;
    }
    /**
     * Método que retorna o CPF do Fiador.
     * @return retorna uma String que corresponde ao CPF do Fiador.
     */
    public String getCpf() {
        return cpf;
    }
     /**
     * Método que define o CPF do Fiador.
     * @param cpf String que representa o CPF do Fiador. 
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
     /**
     * Método que retorna o RG do Fiador.
     * @return retorna uma String que corresponde ao RG do Fiador.
     */
    public String getRg() {
        return rg;
    }
    /**
     * Método que define o RG do Fiador.
     * @param rg String que representa o RG do Fiador. 
     */
    public void setRg(String rg) {
        this.rg = rg;
    }
     /**
     * Método que retorna a data de nascimento do Fiador.
     * @return retorna uma LocalDate que corresponde a data de nascimento do Fiador.
     */
    public LocalDate getDataNasc() {
        return dataNasc;
    }
    /**
     * Método que define a data de nascimento do Fiador.
     * @param dataNasc LocalDate que representa a data de nascimento do Fiador. 
     */
    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }
     /**
     * Método que retorna o genero do Fiador.
     * @return retorna uma String que corresponde ao genero do Fiador.
     */
    public String getGenero() {
        return genero;
    }
    /**
     * Método que define o genero do Fiador.
     * @param genero String que representa o genero do Fiador. 
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
     /**
     * Método que retorna a Profissão do Fiador.
     * @return retorna uma String que corresponde a Profissão do Fiador.
     */
    public String getProfissao() {
        return profissao;
    }
    /**
     * Método que define a profissão do Fiador.
     * @param profissao String que representa a profissão do Fiador. 
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    /**
     * Método que retorna a Renda do Fiador.
     * @return retorna uma BigDecimal que corresponde a Renda do Fiador.
     */
    public BigDecimal getRenda() {
        return renda;
    }
    /**
     * Método que define a renda do Fiador.
     * @param renda BigDecimal que representa renda do Fiador. 
     */
    public void setRenda(BigDecimal renda) {
        this.renda = renda;
    }
    /**
     * Método que retorna a empregador do Fiador.
     * @return retorna uma String que corresponde ao empregador do Fiador.
     */
    public Empregador getEmpregador() {
        return empregador;
    }
    /**
     * Método que define o empregador do Fiador.
     * @param empregador do tipo Empregador que representa o empregador do Fiador. 
     */
    public void setEmpregador(Empregador empregador) {
        this.empregador = empregador;
    }
    /**
     * Subescrita Override para status
     */
    @Override
    public void setStatus() {
    }
    
}
