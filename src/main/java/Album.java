import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {
    private long id;
    private String artist;
    private String name;
    private Date releaseDate;
    private float sales;
    private String genre;

    //  CONSTRUCTORS

    public Album() {
    }

    public Album(long id, String artist, String name, Date releaseDate, float sales, String genre) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.releaseDate = releaseDate;
        this.sales = sales;
        this.genre = genre;
    }

    //  GETTERS/SETTERS

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    public float getSales() {
        return sales;
    }
    public void setSales(float sales) {
        this.sales = sales;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
