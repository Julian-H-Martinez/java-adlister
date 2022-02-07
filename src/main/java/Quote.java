import java.io.Serializable;

public class Quote implements Serializable {
    private Author author;
    private String content;

    //  CONSTRUCTORS
    public Quote(){}
    public Quote(Author author, String content){
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

    @Override
    public String toString() {
        return "Quote{" +
                "author=" + author.toString() +
                ", content='" + content + '\'' +
                '}';
    }
}
