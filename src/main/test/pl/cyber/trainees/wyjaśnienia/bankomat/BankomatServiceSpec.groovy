package pl.cyber.trainees.wyjaśnienia.bankomat


import spock.lang.Specification

class BankomatServiceSpec extends Specification {
    private BankomatService underTest = new BankomatService()

    def "Sprawdzam wybraną pozycję nr 0 tj. Przerwij operacje"() {
        when:
        def result = underTest.menu2(0, null)

        then:
        noExceptionThrown()
        //        result == false
        !result
    }
    def "Sprawdzam pozycję 1, tj. wpłatę gotówki" () {
        given:
        def bankomat = new Bankomat()
        bankomat.wplacGotowke(100)
        def karta = new Karta(123456, 1234, 1000)
        odczytDanych.nextInt() >> 50


        when:
        def result = underTest.menu2 (1, karta)
        then:
        noExceptionThrown()
        result
        bankomat.stanKonta() == 150
        karta.stanKonta() == 1050

    }
}

// TDD - test driven development