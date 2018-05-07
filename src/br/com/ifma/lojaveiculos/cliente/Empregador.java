
package br.com.ifma.lojaveiculos.cliente;
/**
 * Classe que representa o empregador do cliente da loja de veiculos
 * @author Márcio e Jaqueline
 * @version 1.0
 */
public class Empregador {
    private String nome;
    private String telefone;
    private String endereco;
    private String email;
/**
 * Construtor  para a classe Empregador.
 * @param nome String que representa o nome do Empregador.
 * @param telefone String que representa o telefone do Empregador.
 * @param endereco String que representa o endereço do Empregador.
 * @param email String que representa o e-mail do empregador.
 */
    public Empregador(String nome, String telefone, String endereco, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }
    /**
     * Método que retorna o nome do Empregador.
     * @return retorna uma String que representa o nome do Empregador.
     */
    public String getNome() {
        return nome;
    }
    /**
     * Método que define o nome do Empregador.
     * @param nome String que representa o nome do Empregador.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Método que retorna o telefone do Empregador.
     * @return retorna uma String que representa o telefone do Empregador.
     */
    public String getTelefone() {
        return telefone;
    }
    /**
     * Método que define o telefone do Empregador.
     * @param telefone String que representa o telefone do Empregador.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    /**
     * Método que retorna o endereço do Empregador.
     * @return retorna uma String que representa o endereço do Empregador.
     */
    public String getEndereco() {
        return endereco;
    }
    /**
     * Método que define o endereço do Empregador.
     * @param endereco String que representa o endereço do Empregador.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    /**
     * Método que retorna o e-mail do Empregador.
     * @return retorna uma String que representa o e-mail do Empregador.
     */
    public String getEmail() {
        return email;
    }
    /**
     * Método que define o e-mail do Empregador.
     * @param email String que representa o e-mail do Empregador.
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
