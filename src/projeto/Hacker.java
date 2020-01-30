package projeto;

/**
 *
 * @author Simon
 */
public class Hacker extends Pessoa {

// Atributos do Hacker
    private String nivel;
    private String email;
    private String senha; 
    
// Construtor do objeto Hacker
    public Hacker() {
        
    }
    
    public Hacker(String nome){
        this.nome = nome;
    }

// Retorna o nível de um objeto Hacker
    public String getNivel() {
        return nivel;
    }

// Atribui o nível para um objeto Hacker    
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

// Retorna o email de um objeto Hacker
    public String getEmail() {
        return email;
    }

// Atribui o email para um objeto Hacker    
    public void setEmail(String email) {
        this.email = email;
    }

// Retorna a senha de um objeto Hacker
    public String getSenha() {
        return senha;
    }

// Atribui senha para um objeto Hacker    
    public void setSenha(String senha) {
        this.senha = senha;
    }   
}