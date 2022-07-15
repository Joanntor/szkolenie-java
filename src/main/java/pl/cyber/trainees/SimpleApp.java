package pl.cyber.trainees;
// określa w ramach jakiej struktury katalogów opiera się nasza klasa javova

import java.math.BigDecimal;

public class SimpleApp { //nazwa klasy. Modyfikatorem klasy jest public - co znaczy, że klasa jest dostępna dla całego projektu

    enum Stan {on, off};
    public static void main(String[] args) {

        /*
        1. Klasa - Class
        2. Obiekt - Object
        3. Zmienna - Variables
            typy, deklaracja zmiennych
         */

        int wartoscBoolean = 0; //Ta zmienna może przyjmować wartość 0 lub 1

 //    Ctr + lewy przycisk myszy na "String" - wywołuje komentarz dokumentujący
        String tekst = ""; // -> var string = "" -> string s = ""
        BigDecimal value = BigDecimal.valueOf(1);
        BigDecimal value1 = BigDecimal.ONE;

        //program wyświetlający
        // w terminalu przykładowy tekst


        System.out.println("My first Application");
        //system.out oznacza, że będziemy coś lokowali na zewnątrz
        // println, że będzie to do terminala
        // ln na końcu oznacza, że będzie to z enterem na końcu. Samo print - bez ln to bez entera na końcu

        int intValue = 4000000;
        int intValueB = intValue + 1000;

        System.out.println(intValue);
        System.out.println(intValue + 100);
        System.out.println(intValueB);

        double doubleValue = 2.0;
        System.out.println(doubleValue);

        char znak = 'a';
        char[] tabZnakow = {'\u0043', 'a'};

        System.out.println("add: " + add(1, 3));
        System.out.println("concat: " + concat("Jan ", "Nowak"));

        System.out.println("\nLiterały i \tznaki specjalne");

        int intValue5 = 4000000;
        Integer integerValue3 = Integer.valueOf( i: 4000000);
       Integer integerValue2 = Integer.valueOf( s: "4000000");

       //czemu i i s na czerowno? Nawias??

       System.out.println("Integer value: " + integerValue3);
        System.out.println("Integer value: " + integerValue2);

        boolean booleanValue = false;
        Boolean boolVal = Boolean.FALSE; // Boolean.TRUE
        Boolean boolVal2 = Boolean.valueOf(s: "true");

        System.out.println("Boolean value: " + boolVal);
        System.out.println("Boolean value: " + boolVal2);

        boolean boolValue4;
        if (wartoscBoolean ==1) {
            boolValue4 = true;
        } else {
            boolValue4 = false;
        }
System.out.println(boolValue4);

        Double cenaDouble = 12.3;
        Long cenaInt = Math.round(cenaDouble);

        System.out.println(cenaInt);
  //     można też zaokrąglać w inny sposób

    }


    public static int add(int l1, int l2) {
      var result = l1 + l2;
       return result;

        }
        public static String concat(String l1, String l2) {
         var result = l1 + l2;
         return result;
       }


}







