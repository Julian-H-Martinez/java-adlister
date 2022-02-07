import java.io.Serializable;
import java.util.Date;

public class Album {
    private long id;
    private String artist;
    private String name;
    private int year;
    private float sales;
    private String genre;

    //  CONSTRUCTORS

    public Album() {
    }

    public Album(long id, String artist, String name, int year, float sales, String genre) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.year = year;
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
    public int getReleaseDate() {
        return year;
    }
    public void setReleaseDate(int releaseDate) {
        this.year = year;
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

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", sales=" + sales +
                ", genre='" + genre + '\'' +
                '}';
    }
}
