package sk.itslovicka;

import sk.itslovicka.AnglickeSlovicka;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Edo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("             ***Test slovicok z IT oblasti***\n ");
        System.out.println("Odpovede napis bez diakritiky ");
        System.out.println("Mozes napisat aj viac spravnych odpovedi, oddelovac slov pouzi medzeru\n ");
        System.out.println("Ak nevies stlac pismeno N ");
        System.out.println("Ukonci program pismenom K ");

        System.out.println("Vela stastia! ");

        System.out.println("----------------------------------");

        AnglickeSlovicka anglickeSlovicka = new AnglickeSlovicka();

        anglickeSlovicka.skusajSlovo("pristup", "acces");
        anglickeSlovicka.skusajSlovo("oramovanie", "border");
        anglickeSlovicka.skusajSlovo("stlpec", "column");
        anglickeSlovicka.skusajSlovo("spolocny", "bezny", "common");
        anglickeSlovicka.skusajSlovo("podmienka", "condition");
        anglickeSlovicka.skusajSlovo("zavisly", "dependent");
        anglickeSlovicka.skusajSlovo("nasadenie", "deployment");
        anglickeSlovicka.skusajSlovo("vyraz", "expression");
        anglickeSlovicka.skusajSlovo("chyba", "porucha", "fault");
        anglickeSlovicka.skusajSlovo("vlakno", "fiber");

        anglickeSlovicka.vyhodnocujTest();

    }

}
