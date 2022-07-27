package pl.cyber.trainees.przykłady;

import static org.apache.coyote.http11.Constants.a;

public class Homework {
  //  1. Napisz metodę, która zwróci Twój aktualny wiek.
    public void podajWiek (){
        int a = 2022;
        int b = 1984;

        System.out.println("Mój wiek to: " + (a - b) + "lat");
    }
    // 2. Napisz metodę, która zwróci Twoje imię,

public String imie () {

    return "Joanna";

}
// 3. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,
 //   parzystość sprawdzamy przez znak % 2 inaczej sprawdzamy jej podzielność przez 2
//    np. 2 % 2

    public static void czyLiczbajestParzysta () {
        int a = 3;
        int b = 34;
        int c = 1234567;

        boolean result1 = a == a %2;
        boolean result2 = b == b %2;
        boolean result3 = c == c %2;

        // System.out.println(result1, result2, result3); // method java.io.PrintStream.println() is not applicable

/*
 chciałam też zrobić w taki sposób, ale wychodziło jeszcze więcej błędów niż w powyższym przypadku

      boolean result = a == a % 2;
      System.out.println(a = 3);
      System.out.println(a = 14);
      System.out.println(a = 345788);
*/
    }

 // 4. Napisz metodę, która jako argument przyjmuje liczbę
    // i zwraca true jeśli liczba jest podzielna przez 3 i przez 5,

    public static void czyLiczbaDzieliSięPrzez3i5 (){
        var a = 33495;
        var b = 5;
        var c = 5677;

        boolean result1 = a == % 3 && % 5;
        boolean result2 = b == % 3 && % 5;
        boolean result3 = c == % 3 && % 5;



    }

 }
 /*




5. Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi,
podniesienie do potęgi realizujemy przez bibliotekę Math i jej metodę pow(liczba, doJakiejPotęgi)
np. Math.pow(2,3)
6. Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy
pierwiastek kwadratowy realizujemy przez bibliotekę Math i jej metodę sqrt(number)
Math.sqrt(number)
  */