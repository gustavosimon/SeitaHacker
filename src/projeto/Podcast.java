package projeto;

/**
 *
 * @author Simon
 */
public class Podcast {

// Atributos de podcast    
    private String titulo;
    private Hacker responsavel;
    private String link;
    
// Construtor de Podcast    
    public Podcast() {
        
    }

// Retorna o título de um objeto Podcast    
    public String getTitulo() {
        return titulo;
    }

// Atribui o titulo para um objeto Podcast
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
// Retorna o responsável pelo podcast
    public Hacker getResponsavel() {
        return responsavel;
    }
// Atribui o responsável ao podcast
    public void setResponsavel(Hacker responsavel) {
        this.responsavel = responsavel;
    }

// Retorna o link de um objeto Podcast    
    public String getLink() {
        return link;
    }

// Atribui o link para um objeto Podcast
    public void setLink(String link) {
        this.link = link;
    }
}
