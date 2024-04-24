import Enums.Genre;
import Models.*;
import Menus.Menus;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        List<Song> songs= new ArrayList<>();

        Artist art1= new Artist("Queen", 40, "britanica");

        Album a1= new Album(1975, "at nigh al the opera", art1);

        Song s1= new Song("Bohemian rhapsody", 4, Genre.ROCK, a1, art1);
        songs.add(s1);

        Artist art2= new Artist("Madonna", 65, "estadounidense");
        Album a2= new Album(1984, "like a virgin", art2);

        Song s2= new Song("Material Girl", 4, Genre.POP, a2, art2);
        songs.add(s2);

        Artist art3= new Artist("Maria Becerra", 22, "Argentina");
        Album a3= new Album(2023, "Corazon Vacio", art3);

        Song s3= new Song("Corazon Vacio", 3, Genre.TRAP, a3, art3);
        songs.add(s3);

        String opc="0";
        Menus m= new Menus();

        System.out.println("MENU SPOTIFY");
        while (opc != "3") {
            System.out.println("1 - MENU BASICO");
            System.out.println("2 - MENU PREMIUM");
            System.out.println("3 - salir");
            System.out.println("ingrese opcion deseada: ");
            Scanner cr= new Scanner(System.in);
            opc= cr.nextLine();
            switch (opc) {
                case "1":
                    Stack<Song>stack1=new Stack<>();
                    stack1.push(s1);
                    stack1.push(s2);
                    stack1.push(s3);
                    BasicList b= new BasicList("Mi lista Basica", stack1);
                    m.menuBasico(b);
                    break;
                case "2":
                    PremiumList p = new PremiumList("Mi lista Premium", songs);
                    m.menuPremium(p);
                    break;
                case "3":
                    break;
                default:
                    System.out.println("opcion incorrecta, ingrese nuevamente..");
                    break;
            }



    }
}
}