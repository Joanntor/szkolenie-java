package pl.cyber.trainees.serwis;

import java.util.Scanner;

public class PracaDomowa {
    public String PracaDomowa (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();
        return scanner.nextLine();

    }
}
