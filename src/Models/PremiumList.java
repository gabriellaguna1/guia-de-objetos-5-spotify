package Models;

import Interfaces.Reproduction;

import java.util.List;
import java.util.Scanner;

public class PremiumList implements Reproduction {
    private String name;
    private List<Song> MyList;

    public PremiumList(String name, List<Song> myList){
        this.name = name;
        MyList = myList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getMyList() {
        return MyList;
    }

    public void setMyList(List<Song> myList) {
        MyList = myList;
    }

    @Override
    public Song play() {
        System.out.println("Mostrando lista de canciones de mi lista premium: ");
        showList();
        System.out.println("seleccione el nombre de la cancion que desea reproducir: ");
        Scanner sr = new Scanner(System.in);
        String n = sr.nextLine();
        return this.seekSong(n);

    }

    public void showList(){
        int cont = 0;
        for (Song s : MyList) {
            cont++;
            System.out.println("Cancion N: " + cont + s.toString());
        }
    }

    public Song seekSong(String tittle){


        for(Song s: MyList){
            if(s.getName().equalsIgnoreCase(tittle)){
                return s;
            }

        }
        return null;
    }



    @Override
    public void addSong(Song s) {
        MyList.add(s);
    }

    @Override
    public void deleteSong(String tittle) {
        System.out.println("mostrando lista de canciones a eliminar");
        showList();
        Song seek = seekSong(tittle);

        if(seek==null){
            System.out.println("cancion no encontrada");
        }
        else {
            int i=0;
            for(Song s: MyList){
                i++;

                if(s.getName().equalsIgnoreCase(tittle)){
                    MyList.remove(i);
                    System.out.println("CANCION "+ s.getName()+ " del artista: "+ s.getArtists().getName()+" fue eliminada");
                    break;
                }
            }
        }

    }

    @Override
    public void showMyList(List<Song> songs) {

    }
}
