package Interfaces;

import Models.Song;

import java.util.List;

public interface Reproduction {

    public Song play();
    public void addSong(Song s);
    public void deleteSong(String tittle);
    public void showMyList(List<Song> songs);


}
