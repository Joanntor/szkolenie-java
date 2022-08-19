package pl.cyber.trainees.wyjaśnienia;

import pl.cyber.trainees.wyjaśnienia.Wyjatki.MojPierwszyException;
import pl.cyber.trainees.wyjaśnienia.zwierzeta.Kot;
import pl.cyber.trainees.wyjaśnienia.zwierzeta.Pies;
import pl.cyber.trainees.wyjaśnienia.zwierzeta.Zwierze;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Obiekty {

    private void wyswietlTalkDTO() {
        List<String> list = new ArrayList<>();
        list.add("przyklad1");
        TalkDTO talkDTO = new TalkDTO("Obiektowość", "1241235236", list);
        //  System.out.println(talkDTO.toString());
        //System.out.println(talkDTO.toString());
        //  System.out.println("Dzis zajmujemy się tematem" + talkDTO.getTematRozmowy());
        System.out.println(talkDTO.getTematRozmowy());
        System.out.println(talkDTO.getOpis());

        talkDTO.opis = "";

        System.out.println(talkDTO.getTematRozmowy());
        System.out.println(talkDTO.getOpis());

        talkDTO.setOpis("1234521");

        System.out.println(talkDTO.getTematRozmowy());
        System.out.println(talkDTO.opis);

        System.out.println(talkDTO.getPrzyklady());

        // dodawanie do parametru listy nowych wartości wersja 1  -- bardziej polecana

        List<String> wiecej = new ArrayList<>();
        wiecej.add("przykłas2");
        wiecej.add("Przyklad3");

        talkDTO.modifyList(wiecej);

        // dodawanie do parametru listy nowych wartości wersja 2   - bardziej polecaa

        List<String> wiecej2 = new ArrayList<>();
        wiecej2.addAll(talkDTO.getPrzyklady());
        wiecej2.add("przykłas4");

        talkDTO.setPrzyklady(wiecej2);

        System.out.println(talkDTO.getPrzyklady());
        //  talkDTO.setPrzyklady();

        //  // dodawanie do parametru listy nowych wartości wersja 3 -- najmniej polecana

        talkDTO = new TalkDTO(talkDTO.getTematRozmowy(), talkDTO.getOpis(), wiecej2); //od tego miejsca program bazuje na nowyh wartościach
        System.out.println(talkDTO.getPrzyklady());

    }

    public void uruchom() {
        //  wyswietlTalkDTO();
        Kot kot = new Kot("Luca", LocalDate.of(2020, 7, 2), 6.0, "Joanna");
        System.out.println(kot.przedstawSie());
        zadanie2();
        zadanie3();
        zadanie4();
        DateConverter dateConverter = new DateConverter();
        try {
            System.out.println(dateConverter.stringToDate("2022/05/10"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        zadanie5();

    }
    /*
     Utwórz klasę Kot . Klasa ta powinna mieć następujące pola:
       imię (ciąg znaków)
         data urodzenia (data)
            waga (liczba zmiennoprzecinkowa)
              imię opiekuna (ciąg znaków)
               Klasa ta powinna też mieć jedną metodę o nazwie przedstawSie.
               Metoda ta nie przyjmuje żadnych argumentów i zwraca
                   ciąg znaków, który jest zdaniem zawierającym imię kotka,
                    jego datę urodzenia, wagę oraz imię opiekuna.
                      */
    /*
    zadanie nr 2
      utworzyć listę 3 kotów a następnie niech każdy z nich się przedstawi.  */

    private void zadanie2() {
        List<Kot> koty = new ArrayList<>();
        koty.add(new Kot("Luca", LocalDate.of(2012, 8, 15), 6.0, "Joanna"));
        koty.add(new Kot("Luca1", LocalDate.of(2012, 8, 15), 6.0, "Joanna"));
        koty.add(new Kot("Luca2", LocalDate.of(2012, 8, 15), 6.0, "Joanna"));

        for (Kot kot : koty) {
            System.out.println(kot.przedstawSie());
        }
    }

    /*
    zadanie 3
    utworzyć listę 3 kotów dodać je do List<Zwierze> a następnie niech każdy z nich się przedstawi.
     */
    private void zadanie3() {
        List<Zwierze> zwierze = new ArrayList<>();
        zwierze.add(new Kot(20.0, true, "Luca", LocalDate.of(2012, 8, 15), 6.0, "Joanna"));
        zwierze.add(new Kot(30.0, false, "Luca1", LocalDate.of(2012, 8, 15), 6.0, "Joanna"));
        zwierze.add(new Kot(6.0, true, "Luca2", LocalDate.of(2012, 8, 15), 6.0, "Joanna"));

        for (Zwierze zw : zwierze) {
            if (zw instanceof Kot) {
                System.out.println(((Kot) zw).przedstawSie());
                System.out.println(((Kot) zw).isCzyMaSiersc());
            }
        }
    }

    /*
      Firma
      Osoba
       Pracownik
                Sekretarka
                         Programista
                                   Tester
                                           Szef
                                                adres
    class Firma {
    List<Osoba> osoby;
       String adres
         }
           class Osoba {
                String pietroNaKtorymPracuje;
                   }
           class Szef extends Osoba {
           String imie;
             }
          class Sekretarka extends Pracownik {
               String imie;
                  }
           class Pracownik extends Osoba {
                }  */
    /*
    zadanie 4
    Utworzyć klasę Pies, która dziedziczy po klasie Zwierze
    utworzyć listę 3 kotów, 1 psa następnie  dodać je do List<Zwierze>
       a następnie niech każdy z nich się przedstawi.
     Dodatkowo wywołać metodę (skorzystamy z przysłaniania metod) dajGlos()
     */
    private void zadanie4() {
        List<Zwierze> zwierze = new ArrayList<>();
        zwierze.add(new Kot(20.0, true, "Luca", LocalDate.of(2012, 8, 15), 6.0, "Joanna"));
        zwierze.add(new Kot(30.0, false, "Luca1", LocalDate.of(2012, 8, 15), 6.0, "Joanna"));
        zwierze.add(new Pies(6.0, true, "Burek", LocalDate.of(2012, 8, 15), 6.0, "Joanna"));

        for (Zwierze zw : zwierze) {
            if (zw instanceof Kot) {
                System.out.println(((Kot) zw).przedstawSie());
                System.out.println((zw).isCzyMaSiersc());
            } else if (zw instanceof Pies) {
                System.out.println(((Pies) zw).przedstawSie());
                System.out.println((zw).dajGlos());
            }
        }
    }
    /*
    zadanie 4
  Utworzyć Enum o nazwie ZwierzeEnum, w którym będą dostępne opcje:
  - KOT
  - PIES

    utworzyć listę 3 kotów, 1 psa poprzez utworzenie pliku zwierzeta.txt
     następnie odczytaniu pliku przez aplikację.

    a następnie niech każdy z nich się przedstawi.
    Dodatkowo wywołać metodę (skorzystamy z przysłaniania metod) dajGlos()

     */

    private void zadanie5() {
        File file = new File("src/main/resources/zwierzeta.txt");
        List<Zwierze> zwierzeList = pobierzInformacjeZPliku(file);
        for (Zwierze zw : zwierzeList) {
            System.out.println(((Pies) zw).przedstawSie());
        }
    }

    private List<Zwierze> pobierzInformacjeZPliku(File file) {
        Scanner scan = null;

        try
        {
            scan = new Scanner(file);
        } catch(
                FileNotFoundException e){
            throw new RuntimeException("Komunikat naszego błędu!");
        }
        List<Zwierze> zwierzeta = new ArrayList<>();
        while (scan.hasNext()) {
            String rowInFile = scan.nextLine();
            String[] tablicaPliku = rowInFile.split(",");
            if ("PIES".contains(tablicaPliku[0])) {
                Pies pies = new Pies();
                zwierzeta.add(pies.convertFromFile(rowInFile));
            }

        }
        return zwierzeta;
    }
    /*
    Zadanie 6
    utworzenie 2 innych typów zwierząt oraz ich przedstawienie
    proponuje nowy plik w katalogu resources

     */

}
