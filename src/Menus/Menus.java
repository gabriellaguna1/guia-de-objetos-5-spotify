package Menus;

import Models.BasicList;
import Models.PremiumList;
import Models.Song;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Menus {
    public Menus() {
    }
    public void menuBasico(BasicList b) {
        String opc;
        do {
            System.out.println("1 - reproducir cancion");
            System.out.println("2 - añadir cancion");
            System.out.println("3 - eliminar cancion");
            System.out.println("4 - ver mi lista");
            System.out.println("5 - volver al menu anterior");
            System.out.println("Ingrese la opcion que desea: ");

            Scanner sr = new Scanner(System.in);
            opc = sr.nextLine();
            switch (opc) {
                case "1":
                    System.out.println("PREPRODUCIENDO: "+b.play().toString());;
                    break;
                case "2":
                    System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
                    break;
                case "3":
                    System.out.println("Para acceder a estas opciones compre el paquete PREMIUM");
                    break;
                case "4":
                    b.printMylist(b.getMyList());
                    break;
                default:
                    System.out.println("opcion incorrecta, ingrese nuevamente..");
                    break;
            }
        }while(opc != "5");

    }

    public void menuPremium(PremiumList p) {
        String opc;

        do {

            System.out.println("1 - reproducir cancion");
            System.out.println("2 - añadir cancion");
            System.out.println("3 - eliminar cancion");
            System.out.println("4 - ver mi lista");
            System.out.println("5 - volver al menu anterior");
            System.out.println("Ingrese la opcion que desea: ");
            Scanner sr = new Scanner(System.in);
            opc = sr.nextLine();
            switch (opc) {
                case "1":
                    System.out.println("reproduciendo: "+p.play().toString());
                    break;
                case "2":
                    System.out.println("Ingrese el nombre de la cancion a añadir a su lista: ");
                    Scanner tr= new Scanner(System.in);
                    String cb= tr.nextLine();
                    p.addSong(p.seekSong(cb));
                    break;
                case "3":
                    System.out.println("ingrese el titulo de la cancion a eliminar");
                    Scanner xx= new Scanner(System.in);
                    String xy= xx.nextLine();
                    p.deleteSong(xy);
                    break;
                case "4":
                    p.showList();
                    break;
                case "5":
                    break;
                default:
                    System.out.println("opcion incorrecta, ingrese nuevamente..");
                    break;
            }
        }while(opc != "5");
    }


}
