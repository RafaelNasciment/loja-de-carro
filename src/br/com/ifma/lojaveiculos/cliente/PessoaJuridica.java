
package br.com.ifma.lojaveiculos.cliente;
/**
 * Classe que represnta uma Pessoa Juridica.
 * @author Márcio e Jaqueline
 * @version 1.0
 */
public class PessoaJuridica extends Cliente{
     private String cnpj;
     private String inscricaoEstadual;
     private String razaoSocial;
     private String proprietario;
/**
 * Construtor  para a classe Pessoa Juridica .
 * @param cnpj String que representa o CNPJ da Pessoa Juridica.
 * @param inscricaoEstadual String que representa Inscrição Estadual da Pessoa Fisica.
 * @param razaoSocial String que representa Razão Social da Pessoa Fisica.
 * @param proprietario String que representa Proprietário da Pessoa Fisica.
 * @param nome String herdada da classe cliente.
 * @param telefone String herdada da classe cliente.
 * @param endereco String herdada da classe cliente.
 * @param bairro String herdada da classe cliente.
 * @param cidade String herdada da classe cliente.
 * @param cep String herdada da classe cliente.
 * @param status String herdada da classe cliente.
 * @param email String herdada da classe cliente.
 */
    public PessoaJuridica(String cnpj, String inscricaoEstadual, String razaoSocial,
            String proprietario, String nome, String telefone, String endereco, String bairro,
                                        String cidade, String cep, String status, String email) {
        
        super(nome, telefone, endereco, bairro, cidade, cep, status, email);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
        this.proprietario = proprietario;
    }
     /**
     * Método que retorna o CNPJ da Pessoa Juridica.
     * @return retorna uma String que corresponde ao CNPJ da Pessoa Juridica.
     */
    public String getCnpj() {
        return cnpj;
    }
     /**
     * Método que define o CNPJ da Pessoa Juridica.
     * @param cnpj String que representa o CNPJ da Pessoa Juridica. 
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    /**
     * Método que retorna Inscrição Estadual da Pessoa Juridica.
     * @return retorna uma String que corresponde a Inscrição Estadual da Pessoa Juridica.
     */
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    /**
     * Método que define a Inscrição Estadual da Pessoa Juridica.
     * @param inscricaoEstadual String que representa a Inscrição Estadual da Pessoa Juridica. 
     */
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
     /**
     * Método que retorna razão social da Pessoa Juridica.
     * @return retorna uma String que corresponde a razão social da Pessoa Juridica.
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }
    /**
     * Método que define a Razão Social da Pessoa Juridica.
     * @param razaoSocial String que representa a Razão Social da Pessoa Juridica. 
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    /**
     * Método que retorna o proprietário da Pessoa Juridica.
     * @return retorna uma String que corresponde ao proprietário da Pessoa Juridica.
     */
    public String getProprietario() {
        return proprietario;
    }
    /**
     * Método que define o Proprietário da Pessoa Juridica.
     * @param proprietario String que representa o Proprietário da Pessoa Juridica. 
     */
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    /**
     *Subescrita Override para status 
     */
    @Override
    public void setStatus() {}
     
}
