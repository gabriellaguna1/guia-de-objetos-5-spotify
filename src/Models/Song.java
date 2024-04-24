package Models;

import Enums.Genre;

import java.util.List;

public class Song {
    private String name;
    private Integer duration;
    private Genre genre;
    private Album album;
    private Artist artists;

    public Song(String name, Integer duration, Genre genre, Album album, Artist artists) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.album = album;
        this.artists = artists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artist getArtists() {
        return artists;
    }

    public void setArtists(Artist artists) {
        this.artists = artists;
    }

    @Override
    public String toString() {
        return "CANCION{" +
                "NOMBRE='" + name + '\'' +
                ", DURACION=" + duration +
                ", GENRE=" + genre +
                ", ALBUM='" + album + '\'' +
                ", ARTISTA/S=" + artists +
                '}';
    }
}
