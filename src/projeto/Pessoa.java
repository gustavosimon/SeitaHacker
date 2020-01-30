package projeto;
/**
 * 
 * @author Simon
 */
public abstract class Pessoa {

    protected String nome;
    
// Contrutor de pessoa
    public Pessoa() {
        
    }

// Retorna o nome de um objeto Pessoa
    public String getNome() {
        return nome;
    }

// Atribui o nome de um objeto Pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }
}
