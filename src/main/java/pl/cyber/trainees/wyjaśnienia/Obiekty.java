package pl.cyber.trainees.wyjaśnienia;

import java.util.ArrayList;
import java.util.List;

public class Obiekty {

    private void wyswietlTalkDTO(){
        List <String> list = new ArrayList<>();
        list.add ("przyklad1");
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
    public void uruchom(){
        wyswietlTalkDTO();



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
}
