package Models;

import Interfaces.Reproduction;

import java.util.List;
import java.util.Stack;

public class BasicList implements Reproduction {
    private String name;
    private Stack<Song> myList;

    public BasicList(String name, Stack<Song> myList) {
        this.name = name;
        this.myList = myList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stack<Song> getMyList() {
        return myList;
    }

    public void setMyList(Stack<Song> myList) {
        this.myList = myList;
    }

    @Override
    public Song play() {
        Stack<Song> aux= new Stack<>();
        while(!myList.empty()){
            aux.push(myList.pop());
        }
        Song s= aux.pop();
        while(!aux.empty()){
            myList.push(aux.pop());
        }
        myList.push(s);

        return myList.peek();
    }

    @Override
    public void addSong(Song s) {
        myList.push(s);
    }

    @Override
    public void deleteSong(String tittle) {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void showMyList(List<Song> songs) {

    }
    public void printMylist(Stack<Song>s){
        for(Song song:s){
            System.out.println(song.toString());
        }
    }
}
