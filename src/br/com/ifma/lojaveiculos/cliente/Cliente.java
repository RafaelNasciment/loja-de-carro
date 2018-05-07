
package br.com.ifma.lojaveiculos.cliente;
/**
 * Classe abstrata que representa o cliente da loja de veiculos
 * @author Márcio e Jaqueline
 * @version 1.0
 */
public abstract class Cliente {
    private int codigo;
    private String nome;
    private String telefone;
    private String endereco;
    private String bairro;
    private String cidade;
    private String cep;
    private String estado;
    private String status;
    private String email;
    /**
     * Construtor para a classe Cliente.
     * @param nome String que representa o nome cliente.
     * @param telefone String que representa o telefone do cliente.
     * @param endereco String que representa o endereço do cliente.
     * @param bairro String que representa o bairro do cliente.
     * @param cidade String que representa a cidade do cliente.
     * @param cep String que representa o CEP do cliente.
     * @param estado String que representa o estado em que o cliente reside.
     * @param email String que representa o E mail do cliente.
     */
    public Cliente(String nome, String telefone, String endereco, String bairro,
                           String cidade, String cep, String estado, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
        this.email = email;
    }
    /**
     * Método que retorna o código do cliente.
     * @return retorna um inteiro que corresponde ao código do cliente.
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * Método que define o codigo do cliente.
     * @param codigo inteiro que representa o código do cliente. 
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * Método que retorna o nome do cliente.
     * @return String que corresponde ao nome do cliente.
     */
    public String getNome() {
        return nome;
    }
    /**
     * Método que define o nome do cliente.
     * @param nome String que representa o nome do cliente. 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Método que retorna o numero do telefone do cliente.
     * @return retorna uma String que corresponde ao numero do telefone do cliente.
     */
    public String getTelefone() {
        return telefone;
    }
     /**
     * Método que define o telefone do cliente.
     * @param telefone String que representa o telefone do cliente. 
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
      /**
     * Método que retorna o endereço do cliente.
     * @return retorna uma String que corresponde ao endereço do cliente.
     */
    public String getEndereco() {
        return endereco;
    }
     /**
     * Método que define o endereço do cliente.
     * @param endereco String que representa o endereço do cliente. 
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
     /**
     * Método que retorna o bairro em que o cliente reside.
     * @return retorna uma String que corresponde ao bairro em que o cliente reside.
     */
    public String getBairro() {
        return bairro;
    }
     /**
     * Método que define o bairro em que o cliente reside.
     * @param bairro String que representa o bairro em que o cliente reside. 
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    /**
     * Método que retorna a cidade em que o cliente reside.
     * @return retorna uma String que corresponde a cidade em que o cliente reside.
     */
    public String getCidade() {
        return cidade;
    }
     /**
     * Método que define a cidade em que o cliente reside.
     * @param cidade String que representa a cidade em que o cliente reside. 
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    /**
     * Método que retorna o CEP da cidade em que o cliente reside.
     * @return retorna uma String que corresponde ao CEP da cidade em que o cliente reside.
     */
    public String getCep() {
        return cep;
    }
     /**
     * Método que define o CEP da cidade em que o cliente reside.
     * @param cep String que representa o CEP da cidade em que o cliente reside. 
     */
    public void setCep(String cep) {
        this.cep = cep;
    }
    /**
     * Método que retorna estado em que o cliente reside.
     * @return retorna uma String que corresponde ao estado em que o cliente reside.
     */
    public String getEstado() {
        return estado;
    }
     /**
     * Método que define o estado em que reside o cliente. 
     * @param estado String que representa o estado em que reside o cliente. 
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * Método que retorna o status do cliente.
     * @return retorna uma String que corresponde ao status cliente.
     */
    public String getStatus() {
        return status;
    }
    /**
     * Classe abstrata que define o status do cliente.
     */
    public abstract void setStatus();
        
    /**
     * Método que retorna o e-mail do cliente.
     * @return retorna uma String que corresponde ao e-mail do cliente.
     */
    public String getEmail() {
        return email;
    }
     /**
     * Método que define o email do cliente.
     * @param email String que representa o email do cliente. 
     */
    public void setEmail(String email) {
        this.email = email;
    }  
}
