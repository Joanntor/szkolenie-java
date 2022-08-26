package pl.cyber.trainees.wyjaśnienia.bankomat

import spock.lang.Shared
import spock.lang.Specification

class KartaSpec extends Specification {    // w klasach testowych języka spock, nie ma średników
    private Karta underTest
    static def nrKartyStub = 12345678
    //<-- tworzenie zmiennych.  statyczna definicja czegos // Stub - przyjęło się tak oznaczać, żeby odróżnić od tego w Karcie
    // w języku spock nie ma typu danych, daf jest na zasadzie var, spock domyśla się na podstawie danych jaki jest to typ zmiennych
// alternatywnie można zrobić tak:
    @Shared
    // zmienna dla całej klasy testowej
    def pinKartyStub = 1234
    // ale bardziej polecane jest to pierwsze, czyli:
    static def saldoStub = 0

    void setup() {         // konstrukcja do zapamiętania. Tu powołujemy do życia nową kartę.
    }
    // underTest = new Karta(1234, 123, 12)
    def "Subject"() {
        // w "" opis co nasz test będzie sprawddzał
        given:                                                  // sekcja testowa, w której np. mokowanie obiektów, inicjalizujemy zmienne lokalne dla przypadku testowego.
        // sekcja given jest sekcją nieobowiązkową.

        when:                                                   // sekcja, w której wykonujemy nasz przypadek testowy i zazwyczaj powinniśmy deklarować
        def result = "test"                                                     // w tym miejscu parametr, który będzie naszym wynikiem

        then:                                                   // w tej sekcji weryfikujemy nasze założenia w ramach przypadku testowego

        noExceptionThrown()                                    // metoda, którą stosuje się, kiedy przypadek nie powinien rzucać Exceptiona
        result == "test"
    }
    /*
    where:   // sekcja, w której będziemy deklarowali wiele parametrów wejściowych oraz przewidywane ich wyniki.
   --------------------------------------------------------
    struktura:
    where:
    parametr1 | parametr2 || wynik
    123       | 151361    || 988651
     */

    def "Przykład nie związany z obiektem Karta"() {

        given:
        def zmienna1 = 2
        def zmienna2 = 5

        when:
        def result = zmienna1 + zmienna2
        printf(result as String)        // printf() to metoda, która ma za zadanie wyświetllanie wartości na konsole
        //result as String -> przez określenie as Sring mówimy, że nasz wynik ma być castowany na String

        then:

        noExceptionThrown()
        result != null
        result == 7

    }


    def "Przykład nie związany z obiektem Karta z wykorzystaniem where"() {

        when:
        def result = zmienna1 + zmienna2
        printf(result as String + "\n")

        then:

        noExceptionThrown()
        result == expectedResult

        where:
        zmienna1 | zmienna2 || expectedResult
        1        | 1        || 2
        10       | 100      || 110
        -10      | 10       || 0
        -100     | -100     || -200

    }

    def "Powinien prawidłowo utworzyć obiekt karta przez konstruktor oraz zweryfikować jego parametry"() {
        when:
        def result = new Karta(nrKartyStub, pinKartyStub, saldoStub)

        then:

        noExceptionThrown()
        result != null
        result.nrKarty == nrKartyStub
        result.pinKarty == pinKartyStub
        result.saldo == saldoStub

    }

    def "Powinien prawidłowo utworzyć object Karta przez konstruktor oraz zweryfikować czy użytkownik podał prawidłowo nr Pin. Happy Path"() {
        given:
        def pinFromUser = 1234
        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)
        when:
        underTest.sprawdzNrPin(pinFromUser)
        then:
        noExceptionThrown()
    }

    def "Powinien prawidłowo utworzyć object Karta przez konstruktor oraz zweryfikować czy użytkownik podał prawidłowo nr Pin. Not Happy Path"() {
        given:

        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)

        when:
        underTest.sprawdzNrPin(pinFromUser)

        then:
        def err = thrown(expected)
        err.message == expectedMessage

        where:
        pinFromUser || expected       | expectedMessage
        8888        || KartaException | "Niepoprawny PIN dla karty"
        9999        || KartaException | "Niepoprawny PIN dla karty"
        1010        || KartaException | "Niepoprawny PIN dla karty"
        7567        || KartaException | "Niepoprawny PIN dla karty"


    }

    def "Powinno wyświetlić saldo karty"() {
        given:
        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)
        when:
        def result = underTest.stanKonta()
        then:
        noExceptionThrown()
        result == saldoStub
    }

//    def "Powinno wyświetlić saldo karty"() {
//        given:
//        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)
//        when:
//        def result = underTest.stanKonta()
//        then:
//        noExceptionThrown()
//        result == saldoStub
//    }

    def "Powinno wpłacić i wypłacić gotówkę oraz wyświetlić saldo karty"() {
        given:
        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)
        when:
        underTest.wplacGotowke(100)

        def result = underTest.stanKonta()
        then:
        noExceptionThrown()
        result == 100
    }


    def "Powinno wpłacić gotówkę następnie wyświetlić saldo karty"() {
        given:
        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)
        when:
        underTest.wplacGotowke(100)
        underTest.wyplacGotowke(100)
        def result = underTest.stanKonta()
        then:
        noExceptionThrown()
        result == 0
    }

// sprawdż wypłatę - spr exceptiona i happy paff

    }
// TDD - test driven development