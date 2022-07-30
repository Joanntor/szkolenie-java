package pl.cyber.trainees.wyjaśnienia;

import java.util.Locale;

public class InstrukcjeWarunkowe {

    public void uruchom() {
        wyswietlSwitch(1);
        zadanie2();
        jakaPlec(Plec.KOBIETA);
        jakaPlec("kobieta");

    }
    /*
    Instrukcja warunkowa if
    Budowa IFa
     condition (boolean) - inaczej warunek sprawdzający, np. i<0, a+b = 2, 2%2 = 0 itp.

    if(condidion) {
    // tu powinien się poawić kod, jeśli warunek jest spełniony (true)
    }

   if(2+2 = 4) { println("dodawanie równe 4"); }  else - potocznie w przeciwnym wypadku  if(CONDITION) {  //pojawić się powinien kod jeśli warunek jest spełniony (true) } else {  //pojawić się powinien kod jeśli warunek nie został spełniony (false) }  a+b = 4 if(2+2 = 4) { println("dodawanie równe 4"); } else { println("dodawanie nie równe 4"); }  if(CONDITION) {  //pojawić się powinien kod jeśli warunek jest spełniony (true) } else if(COUNDITION 2) {  //pojawić się powinien kod jeśli warunek jest spełniony (true) } else {  //pojawić się powinien kod jeśli warunek nie został spełniony (false) }  a+b = 4 if(2+2 = 4) {<- zostanie wyświetlone println("dodawanie równe 4"); } else if(2+1 = 3) { println("dodawanie równe 3");  } else { println("dodawanie nie równe 4"); }   a+b = 4 if 
From Szkolenie Testuj to Everyone: (1:24 PM)
 (2+5 = 4) { <- false println("dodawanie równe 4"); } else if(2+1 = 3) { <- true println("dodawanie równe 3"); <- zostanie wyświetlone  } else { println("dodawanie nie równe 4");  
    if (2+2 = 4) {
    println("dodawanie równe 4")

     a+b = 4 if(2+5 = 4) { <- false println("dodawanie równe 4"); } else if(2+2 = 3) { <- false println("dodawanie równe 3");  } else { println("dodawanie nie równe 4"); <- zostanie wyświetlone }

     */

    //utworzyć metodę, która zwróci true/false, jeśli podana liczba w parametrze nie jest równa 10

    public boolean czyLiczbaTo10(Integer liczba) {
        if (liczba == 10) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;

        }
    }

/*SWITCH
 switch (condition) {
 case "1":
 //  condition == "1"
 println("To jest poniedziałek");
 break;
 case "Poniedziałek":
 println("To jest poniedziałek");
 break;
 case "2":
 //  condition == "2"
 println("To jest wtorek");
 break;
 case "Wtorek":  //  condition == "Wtorek"
 println("To jest wtorek");
 break;
 .

 .
 .
 default:
 println("b/d");      }          switch (condition) {       case "1":  //  condition == "1"       case "Poniedziałek":         println("To jest poniedziałek");         break;       case "2":  //  condition == "2"         break;       case "Wtorek":  //  condition == "Wtorek"         break;         .         .         .       default:         println("b/d");      }               równoznaczne zapisy            case "1":  //  condition == "1"         println("To jest poniedziałek");         break;       case "Poniedziałek":         println("To jest poniedziałek 


From Szkolenie Testuj to Everyone: (10:15 AM)
// równoznaczne zapisy
     case "1":  //  condition == "1"
     println("To jest poniedziałek");
     break;
     case "Poniedziałek":
     println("To jest poniedziałek");
     break;        case "1":  //  condition == "1" 
     case "Poniedziałek": 
     println("To jest poniedziałek"); 
     break;       if(conditon = 1 || conditon = "Poniedziałek") { 
     println("To jest poniedziałek");     }    
     np.     switch (zmienna) { 
     case "ala": 
     println("Tak"); 
      break;     }  
       */

        /*  np.
          switch (zmienna) {
          case "ala":
          println("Tak");
          break;    - ma za zadanie przerwać instrukcję, po tym jak wykona zadanie. jak nie ma breaka, to spełania dalsze warunki

              }
     switch - słowo kluczowe określające instrukcję warunkową

              */

// Zadanie
    // utworzyć metodę, która na podany (String, Integer) parametr wejściowy wyświetli odpowiadający
    //dzień tygodnia

    private void wyswietlSwitch(Integer jakiDzienTygodnia) {

        switch (jakiDzienTygodnia) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;

            default:
                System.out.println("Nieprawidłowy dzień tygodnia");
        }

    }
    /*Zadanie
    Wykonać metodę która będzie iterować od 0 do 50 i wyświetli w konsoli odpowiednie napisy:
    dla 0 → Wyświetlam zero
    dla 5 → Wyświetlam 5
    dla 10 → To jest 10
    dla 30 → To jest liczba 30
    dla 49 → To jest liczba 49
    dla pozostałych → Wskazana liczba jest inna niż oczekiwana
    */


    private void zadanie2() {
        for (int i = 0; i <= 50; i++) {

            switch (i) {
                case 0:
                    System.out.println("0");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 10:
                    System.out.println("10");
                    break;
                case 30:
                    System.out.println("30");
                    break;
                case 39:
                    System.out.println("39");
                    break;

                default:
                    System.out.println("Wskazana liczba jest inna niż oczekiwana");

            }

        }


    }

    enum Plec {KOBIETA, MEZCZYZNA}

    private void jakaPlec(Plec plec) {
        // dla KOBIETA wyświetlić jestem kobietą, dla MEZCZYZNA jestem mężczyzną
        // wykonać przy konstrukcji if, a potem przez switch
        if (plec == Plec.KOBIETA) {
            System.out.println("jestem kobietą");
        } else if (plec == Plec.MEZCZYZNA) {
            System.out.println("jestem meżczyzną");
        } else {
            System.out.println("Nie rozumiem");


        }
        switch (plec) {
            case KOBIETA:
                System.out.println("jestem Kobietą");
                break;
            case MEZCZYZNA:
                System.out.println("Jestem mężczyzną");
                break;
            default:
                System.out.println("nie rozumiem");
        }
    }


    private void jakaPlec(String plec) {

        if ("KOBIETA".equals(plec.toUpperCase())) { // to jest brane przez system dosłownie, więc musi być wpisane tak jak zadeklarowane
            // dlatego albo można zadeklarować każdą spodziewaną wersję albo tak <--
            System.out.println("jestem kobietą");
        } else if ("MĘŻCZYZNA".equals(plec.toUpperCase())){
            System.out.println("jestem meżczyzną");
        } else {
            System.out.println("Nie rozumiem");

            //plec.toUpperCase().equals("KOBIETA")
            // takie sprawdzenie warunku może zwrócić błąd typu NullPointerException
            // w przypadku gdy zmienna plec będzie równa null, ponieważ metoda toUpperCase()
            // prawisłowo nie rozpoznaje z null'a wartości stringowej
            // Aby się przed takim błędem zabezpieczyć warto pisać warunki od rzeczy,
            // które znamy do tych których nie znamy.
            //    tzn jeśli sprawdzamy jakiś Literał/napis/enum to najpierw podajemy wartośc literału/napisu/enuma
            //    a następnie wartość naszej zmiennej.
            //    przykład
            // "KOBIETA".equals(plec.toUpperCase())


        }

        switch (plec) {
            case "KOBIETA":
            case "Kobieta":
            case "kobieta":
                System.out.println("jestem Kobietą");
                break;
            case "MEZCZYZNA":
            case "Mężczyzna":
            case "mężczyzna":
                System.out.println("Jestem mężczyzną");
                break;
            default:
                System.out.println("nie rozumiem");

        }
    }
}

