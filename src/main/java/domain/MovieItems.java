package domain;

public class MovieItems {
    private int id;
    private String movieName;
    private int releaseDate;

    public void setId(int id) {
        this.id = id;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getId() {

        return id;
    }

    public String getMovieName() {

        return movieName;
    }

    public int getReleaseDate() {

        return releaseDate;

    }

    public MovieItems(int id, String movieName, int releaseDate) {
        this.id = id;
        this.movieName = movieName;
        this.releaseDate = releaseDate;

    }


}
