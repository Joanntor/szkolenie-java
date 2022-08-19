package pl.cyber.trainees.wyjaśnienia.bankomat;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BankomatService {
    Scanner scanUser = new Scanner(System.in);
    Bankomat bankomat = new Bankomat ();


    private boolean menu(final Integer pozycja) {
                Integer kwota = 0;
                try {

                switch (pozycja) {
                    case 1:
                        System.out.println("Wpłacam gotówkę");
                        System.out.println("Proszę podać kwotę wpłaty");
                        kwota = scanUser.nextInt();
                        sprawdzWprowadzaneKwoty(kwota);
                        bankomat.wplacGotowke(kwota);
                        break;
                    case 2:
                        System.out.println("Wypłacam gotówkę");
                        System.out.println("Proszę podać kwotę wypłaty: ");
                        kwota = scanUser.nextInt();
                        sprawdzWprowadzaneKwoty(kwota);

                        bankomat.sprawdzWyplate(kwota);
                        bankomat.wyplacGotowke(kwota);
                        break;
                    case 3:
                        System.out.println("Stan konta");
                        System.out.println("Bankomat posiada: " + bankomat.stanKonta());
                        break;
                }
            } catch (InputMismatchException e){
                    throw new BusinessException("Nie podano prawidłowej liczby odnoszącej się do wpłaty/wypłaty.");

                }

        return pozycja != 4;

    }
    private void sprawdzWprowadzaneKwoty (final Integer kwota) {
        List<Integer> lista = List.of(10, 20, 50, 100, 200, 500);

        if (!lista.contains(kwota)) {
            // "!" co mam robić, jeśli kwota nie zawiera się w liście
            throw new BusinessException("Wprowadż poprawną kwotę z zakresu " + lista);

        }
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
