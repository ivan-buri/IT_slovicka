package sk.itslovicka;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Edo
 */
public class AnglickeSlovicka {

    private int spravneOdpovede = 0;
    private int otazkyPocet = 0;
    private String[] poleSlov = new String[5];
    private int pocetPokusov = 3;
    Scanner vstupHodnota = new Scanner(System.in);

    public void skusajSlovo(String slovenskeSlovo, String anglSlovo) {

        System.out.print(anglSlovo + " = ");
        otazkyPocet++;

        for (int i = 1; i <= pocetPokusov; i++) {
            String slovo = vstupHodnota.next();

            if (slovo.equalsIgnoreCase("K")) {
                System.out.println(" Spravna odpoved je: " + slovenskeSlovo);
                poleSlov[otazkyPocet] = anglSlovo + " = " + slovenskeSlovo;
                System.out.println("----------------------------------");

                System.exit(0);

            } else if (slovo.equalsIgnoreCase("N")) {
                System.out.println(" Spravna odpoved je: " + slovenskeSlovo);
                poleSlov[otazkyPocet] = anglSlovo + " = " + slovenskeSlovo;
                System.out.println("----------------------------------");

                return;

            } else if (slovo.equalsIgnoreCase(slovenskeSlovo)) {
                spravneOdpovede++;
                System.out.println(spravneOdpovede + " spravna odpoved ");
                poleSlov[otazkyPocet] = "";
                System.out.println("----------------------------------");

                break;

            } else if (!slovo.equalsIgnoreCase(slovenskeSlovo)) {
                System.out.println(i + " Nespravna odpoved ");

            }

            if (i == 3) {
                System.out.println(" Spravna odpoved je: " + slovenskeSlovo);
                poleSlov[otazkyPocet] = anglSlovo + " = " + slovenskeSlovo;
                System.out.println("----------------------------------");

            }

        }

    }

    public void skusajSlovo2(String slovenskeSlovo, String slovenskeSlovo2, String anglSlovo) {

        System.out.print(anglSlovo + " = ");
        otazkyPocet++;

        for (int i = 1; i <= pocetPokusov; i++) {
            String slovo = vstupHodnota.next();

            if (slovo.equalsIgnoreCase("K")) {
                System.out.println(" Spravna odpoved je: " + slovenskeSlovo + ", " + slovenskeSlovo2);
                poleSlov[otazkyPocet] = anglSlovo + " = " + slovenskeSlovo + ", " + slovenskeSlovo2;
                System.out.println("----------------------------------");

                System.exit(0);
            } else if (slovo.equalsIgnoreCase("N")) {
                System.out.println(" Spravna odpoved je: " + slovenskeSlovo + ", " + slovenskeSlovo2);
                poleSlov[otazkyPocet] = anglSlovo + " = " + slovenskeSlovo + ", " + slovenskeSlovo2;
                System.out.println("----------------------------------");

                return;
            } else if (slovo.equalsIgnoreCase(slovenskeSlovo) || slovo.equalsIgnoreCase(slovenskeSlovo2)) {

                spravneOdpovede++;
                System.out.println(spravneOdpovede + " spravna odpoved ");
                poleSlov[otazkyPocet] = "";
                System.out.println(" Spravna odpoved je: " + slovenskeSlovo + ", " + slovenskeSlovo2);

                System.out.println("----------------------------------");

                break;

            } else if (slovo.equalsIgnoreCase(slovenskeSlovo) && slovo.equalsIgnoreCase(slovenskeSlovo2)) {
                spravneOdpovede++;
                System.out.println(spravneOdpovede + " spravna odpoved ");
                poleSlov[otazkyPocet] = "";
                System.out.println("----------------------------------");

                break;
            } else if (!slovo.equalsIgnoreCase(slovenskeSlovo) || !slovo.equalsIgnoreCase(slovenskeSlovo2)) {
                System.out.println(i + " Nespravna odpoved ");

            }

            if (i == 3) {
                System.out.println(" Spravna odpoved je: " + slovenskeSlovo + ", " + slovenskeSlovo2);
                poleSlov[otazkyPocet] = anglSlovo + " = " + slovenskeSlovo + ", " + slovenskeSlovo2;
                System.out.println("----------------------------------");

            }

        }
        System.out.println("----------------------------------");

    }

    public void vyhodnocujTest() {
        System.out.println();

        System.out.println("             ***Vyhodnotenie testu***\n");

        System.out.println("Odpovedal/a si " + spravneOdpovede + " x spravne z " + otazkyPocet + " otazok");
        System.out.println("------------------------------------------");

        System.out.println("Slova ktore si nevedel/a : ");

        for (otazkyPocet = 1; otazkyPocet < poleSlov.length; otazkyPocet++) {
            String nespravnSlovicko = poleSlov[otazkyPocet];

            if (!nespravnSlovicko.equals("")) {
                System.out.println(nespravnSlovicko);
            }
        }
    }

}
