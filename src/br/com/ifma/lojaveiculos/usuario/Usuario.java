
package br.com.ifma.lojaveiculos.usuario;

import javax.swing.JOptionPane;
/**
 * Classe que representa um Usuário.
 * @author Márcio e Jaqueline
 * @version 1.0
 */
public class Usuario {
    private String login;
    private String senha;
    private int nivelAcesso;
    /**
     * Construtor para a classe Usuário.
     * @param login String que representa o login do Usuário.
     * @param senha String que representa a senha do Usuário.
     * @param nivelAcesso inteiro que representa o nível de acesso do Usuário.
     */
    public Usuario(String login, String senha, int nivelAcesso) {
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }
    /**
     * Método que retorna o login do Usuário.
     * @return uma String que corresponde ao login do Usuário.
     */    
    public String getLogin() {
        return login;
    }
    /**
     * Método que define o login do Usuário.
     * @param login String que representa o login do Usuário.
     */
    public void setLogin(String login) {
        this.login = login;
    }
    /**
     * Método que retorna a senha do Usuário.
     * @return uma String que corresponde a senha do Usuário.
     */ 
    public String getSenha() {
        return senha;
    }
    /**
     * Método que define a senha do Usuário.
     * @param senha String que representa a senha do Usuário.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    /**
     * Método que retorna o nível de acesso do Usuário.
     * @return um inteiro que corresponde ao nível de acesse do Usuário.
     */ 
    public int getNivelAcesso() {
        return nivelAcesso;
    }
    /**
     * Método que define o nível de acesso do Usuário.
     * @param nivelAcesso inteiro que representa o nível de acesso do Usuário.
     */
    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    /**
     * Método que testa a válidade da senha e do login.
     * @param login testa o login digitado para saber se é igual ao login.
     * @param senha testa a senha digitada para saber se é igual a senha.
     */
    public void efetuarLogin(String login, String senha){
        if(!login.equals(this.login)){
            JOptionPane.showMessageDialog(null, "Usuario Invalido!!!");
        }else if(!senha.equals(this.senha)){
            JOptionPane.showMessageDialog(null, "Senha Invalida!!!");
        }else{
             JOptionPane.showMessageDialog(null, "Login realizado com sucesso!!!");
            }
        }
    }

