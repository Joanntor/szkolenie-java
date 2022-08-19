package pl.cyber.trainees.wyjaśnienia.bankomat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankomatService {
    Scanner scanUser = new Scanner(System.in);
    Bankomat bankomat = new Bankomat ();


    private boolean menu(final Integer pozycja) {
        switch (pozycja){
            case 1:
                System.out.println("Wpłacam gotówkę");
                break;
            case 2:
                System.out.println("Wypłacam gotówkę");
                break;
            case 3:
                System.out.println("Stan konta");
                System.out.println("Bankomat posiada: " + bankomat.stanKonta());
                break;
        }
        return pozycja != 4;

    }


    public void uruchom() {
        boolean czyKontynuowac;

        do {
            System.out.println("Wybierz dostępną opcję:");
            System.out.println("1. Wpłać Gotówkę");
            System.out.println("2. Wypłać Gotówkę");
            System.out.println("3. Sprawdź stan konta");
            System.out.println("4. Przerwij Operację");

            Integer userInfo = 4;
             try {
                 userInfo = scanUser.nextInt();
             } catch (InputMismatchException e) {
                 throw new BusinessException("Nie podano prawidłowej liczby z menu.");
             }
czyKontynuowac = menu(userInfo);

        } while (czyKontynuowac);

    }
}
