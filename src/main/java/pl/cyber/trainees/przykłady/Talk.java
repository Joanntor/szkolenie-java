package pl.cyber.trainees.przykłady;

//        double -> Double -> 2.55500000000000000  //<- taka jest reprezentacja liczby w systemie //        BigDecimal warotsc = new BigDecimal(BigInteger.ONE, 2); //Ctrl + P  // deklaracja zmiennej zalecana przy systemach księgowych 

//        BigDecimal value = BigDecimal.valueOf(Double.parseDouble(number));        var roundHalfUp = value;
//        roundHalfUp = roundHalfUp.setScale(scale, RoundingMode.UP); // 0.5 1.5 -> 1, 2          var roundHalfDown = value;         roundHalfDown = roundHalfDown.setScale(scale, RoundingMode.DOWN); // 0.5, 1.5 -> 0 ,1           var roundHalfFloor = value;         roundHalfUp = roundHalfUp.setScale(scale, RoundingMode.FLOOR); // 2.5 -> 2;     2.9 -> 2          System.out.println("Round Half up: " + roundHalfUp);         System.out.println("Round Half down: " + roundHalfDown);         System.out.println("Round Half floor: " + roundHalfFloor);     } 


import java.math.BigDecimal;

public class Talk { // tu zaczyna się klasa
    private final String SPACJA = " ";  // parametr klasy

    public String nazwa_metody(String parametr) { // tu zaczyna się klasa nr 1
        //Metoda coś wykonuje
        return "zwracamy napis" + SPACJA;
    }// tu kończy się klasa nr 1

    private BigDecimal nazwa_metody2(BigDecimal parametr) {// tu zaczyna się klasa nr 2
        //Metoda coś wykonuje
        //    return BigDecimal.ONE;
        String liczba1 = "1";
        String liczba2 = "12";
        return new BigDecimal(liczba1 + liczba2); // 112
    }// tu kończy się klasa nr 1
} // tu kończy się nasza klasa