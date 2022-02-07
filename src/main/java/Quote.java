import java.io.Serializable;

public class Quote implements Serializable {
    private Long id;
    private Author author;
    private String content;

    //  CONSTRUCTORS
    public Quote(){}
    public Quote(Long id, Author author, String content){
        this.id = id;
        this.author = author;
        this.content = content;
    }

    //  GETTERS/SETTERS
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "author=" + author.toString() +
                ", content='" + content + '\'' +
                '}';
    }
}
