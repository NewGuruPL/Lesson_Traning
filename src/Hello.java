import java.util.Random;
import java.util.Scanner;


// lekcja 01
//public class Hello {
//    public static void main(String[] args) {
//        String b = "jesień";
//        String c = "dupa";
//        System.out.println("String B to " + b + " i liczy " + b.length() + " znaków." + " Ilość znaków w Stringu ukrytym to " + c.length() + ". Łączna ilość znaków w String a + b  to " + (b.length()+c.length()));
//        System.out.println("String A podzielony przez B to wartość " + (b.length() / c.length()));
//        int a = b.length()*c.length();
//        System.out.println("String A * B = " + a);
//        new Random().nextInt();
//        Random i = new Random();
//        Random j = new Random();
//        System.out.println(i);
//        System.out.println(j);
//        System.out.println("----------------------------------------------");
//        Scanner odczyt = new Scanner(System.in);
//        System.out.println("podaj swoje imię ");
//        imie =  odczyt.nextLine();
//        new Random().nextInt();
//        Random test = new Random();
//        System.out.println(test.nextInt());
//        System.out.println(test.nextInt());
//        System.out.println(test.nextInt()+test.nextInt());
//        int n = 0b1001;
//        System.out.println(n);
//        new Random().nextDouble();
//        Random slowo = new Random();
//        System.out.println(slowo.nextDouble());
//        System.out.println(slowo.nextDouble());
//        Scanner in = new Scanner(System.in);
//        System.out.println("ile mmasz lat?");
//        int age = in.nextInt();
//            if (age !=42) {
//                if (age >=100 || age >=90)
//                    System.out.println("nie możesz tyle życ");
//                else
//                    System.out.println("kłamiesz");
//            }
//            else
//                System.out.println("zgadza się ");
//        System.out.println("masz " + age + " lat.");
//    }
//}
//
//------ cwiczenie A
//public class Hello{
//    public static void main(String[] args){
//        System.out.println("Oliwia");
//        System.out.println("Mateusz");
//        System.out.println("coś tam");
//        System.out.println("kjdngkdjngkdfnbgdfkj");
//        int mateusz,oliwia;;
//        oliwia=2;
//        mateusz=3;
//        System.out.println(mateusz+oliwia);
//        System.out.println(mateusz*oliwia);
//        System.out.println(mateusz/oliwia);
//        System.out.println(mateusz-oliwia);
//        if (oliwia==2){
//            oliwia++;
//            System.out.println(oliwia);
//        }
//    }
//}
//
//------ cwiczenie B
//public class Hello {
//    public static void main(String[] args){
//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//    }
//}
//
//public class Hello {
//    public static void main(String[] args){
//        String hello = "Witaj ";
//        String world = "Świecie!";
//        String powitanie = hello+world; //łączenie Stringów
//        System.out.println(powitanie);
//
//        String czesc = powitanie.substring(0, 6)+"uczniu";
//        System.out.println(czesc);
//    }
//}
//
//  deklarowanie zmiennych i wyrzucanie na ekran
//public class Hello {
//    public static void main (String[] args) {
//        int a = 2;
//        int test1, test2, test3;
//            test1 = 5;
//            test2 = 10;
//            test3 = 15;
//        final int stulecie = 100;
//        int v = stulecie+test2;
//        char znak =  'A';
//        String rodzaj = " Recycler ";
//        String ID = "A8100666 ";
//        String cale_zdanie = "test blablabla";
//        String A = cale_zdanie.substring(0,8)+stulecie;
//        String B = cale_zdanie.substring(0,8)+cale_zdanie.substring(19,24);
//
//        System.out.println(a + " " + (test1 * test2) + " " + test3 + " " + znak + " " + stulecie + rodzaj + ID + "to są moje śmieci");
//        System.out.println(stulecie + test1);
//        System.out.println(v);
//        System.out.println(cale_zdanie);
//        System.out.println(A + " tralalala");
//        System.out.println(B);
//        System.out.println(A + " " + B + " całe zdanie: " + cale_zdanie);
//        System.out.println(cale_zdanie.substring(0,8));
//    }
//}
//
//
//public class Hello{
//    public static void main (String[] args){
//        double A = 1;
//        double B = 1;
//        double C = 5;
//
//
//        boolean porownanie1 = (A+B)>C;
//        System.out.println("A=" + A + " " +"B=" + B + " " + "C=" + C + " ");
//        System.out.println("wynik (A+B)*C = " + (A+B)*C);
//        System.out.println("wynik (A-B)/C = " + (A-B)/C);
//        System.out.println("porownanie z boolean (A+B)>C " + porownanie1);
//        System.out.println("porownanie (A+B)>C " + ((A+B)>C));
//
//        A++;
//        B++;
//        C++;
//
//        String wartosc = A + " " + B + " " + C;
//        System.out.println(wartosc);
//        boolean porownanie2 = (A+B)>C;
//        System.out.println("porownanie (A+B)>C = " + porownanie2);
//        System.out.println("porownanie czy A = B - " + (A==B));
//    }
//}
//
//import java.lang.Math.*;
//
//public class Hello{
//    public static void main(String[] args){
//        double liczba =9;
//        int b = 4;
//        double pierwiastek = Math.sqrt(liczba);
//        double potega = Math.pow(liczba, b);
//
//        System.out.println("Pierwiastek z "+liczba+" wynosi: "+pierwiastek);
//        System.out.println("Liczba "+liczba+" podniesiona do potegi "+b+" to "+potega);
//    }
//}
//
//
//public class Hello {
//    public static void main(String[] args) {
//        String imie;
//        int wiek;
//        Scanner odczyt = new Scanner(System.in);
//        System.out.println("podaj swoje imię ");
//        imie = odczyt.nextLine();
//        System.out.println("podaj swój wiek ");
//        wiek = odczyt.nextInt();
//        System.out.println("masz na imie: " + imie + " i masz " + wiek + " lat");
//        if (wiek <= 18)
//            System.out.println("MLODY");
//        else System.out.println("STARY");
//    }
//}
//}
//
//import java.math.BigInteger;
//import java.lang.Math;
//
//public class Hello{
//    public static void main (String[] args){
//        BigInteger a = new BigInteger("1111111111111111111111111");
//        BigInteger b = new BigInteger("2222222222222222222222222");
//        BigInteger fa = a.add(b);
//        System.out.println(fa);
//        System.out.println("a+b= "+a.add(b).toString());
//
//    }
//}
//
//import static java.lang.Math.*;
//
//public class Hello{
//    public static void main (String[] args){
//      int a,b;
//      a=-3;
//      b=2;
//      double potega = pow(a, b);
//      double pierwiastek = sqrt(a);
//      System.out.println(potega);
//      System.out.println(pow(pierwiastek, b));
//    }
//}
//import java.util.Scanner;
//public class Hello{
//    public static void main (String[] args){
//        double a;
//        double b;
//        Scanner odczyt = new Scanner(System.in);
//        System.out.println("podaj wartość 'A' do obliczeń");
//        a = odczyt.nextDouble();
//        System.out.println("podałeś wartość "+a);
//        System.out.println("podaj wartość 'B' do obliczeń");
//        b = odczyt.nextDouble();
//        System.out.println("podałeś wartość "+b);
//        System.out.println(" wynik dodawania podanych wartości to "+(a+b));
//        System.out.println(" wynik odejmowania podanych wartości to "+(a-b));
//        System.out.println(" wynik mnożenia podanych wartości to "+(a*b));
//        System.out.println(" wynik dzielenia podanych wartości to "+(a/b));
//    }
//}
//
//import com.kitfox.svg.Stop;
//
//import static java.lang.Math.*;
//import static org.codehaus.groovy.scriptom.tlb.office.word.Word.Break;
//
//import java.util.Scanner;
//
//public class Hello{
//    public static void main (String[] args){
//
//        int a;
//        Scanner odczytLiczba = new Scanner(System.in);
//        System.out.println("podaj watrość w przedziale 1-100: ");
//        a = odczytLiczba.nextInt();
//        System.out.println("podaleś watrość "+a);
//        if (a >0 && a <=100)
//            System.out.println("podałeś dobrą wartość");
//        else
//            System.out.println("podałeś watość spoza wymaganego przedziału");
//
//        int zmienna = a;
//        if(zmienna%2 == 0)
//            System.out.println("Liczba parzysta");
//        else
//            System.out.println("Liczba nieparzysta");
//
//        if(zmienna>10)
//            System.out.println("Liczba większa od 10");
//        else if(zmienna>0 && zmienna<=10)
//            System.out.println("Liczba dodatnia mniejsza, lub równa 10");
//        else
//            System.out.println("Liczba ujemna");
//    }
//}
//
//import java.util.Scanner;
//
//public class Hello{
//    public static void main(String[] args){
//        Scanner odczyt = new Scanner(System.in);
//
//        System.out.println("Podaj jakieś imię: ");
//        String imie = odczyt.nextLine();
//
//        if("Maciek".equals(imie))
//            System.out.println("Cześć "+imie);
//        else if("Kasia".equals(imie))
//            System.out.println("Cześć "+imie);
//        else
//            System.out.println("Przykro mi, ale Cię nie znam");
//    }
//}
//
//import java.util.Scanner;
//
//public class Hello{
//    public static void main(String[] args){
//        Scanner odczyt = new Scanner(System.in);
//
//        System.out.println("Podaj 1 liczbę: ");
//        int a = odczyt.nextInt();
//        System.out.println("Podaj 2 liczbę: ");
//        int b = odczyt.nextInt();
//
//        if(a==b)
//            System.out.println("Podane liczby są równe");
//        else if(a > b)
//            System.out.println("Pierwsza liczba jest większa");
//        else
//            System.out.println("Druga liczba jest większa");
//    }
//}
//
// ----------------------- Pętla WHILE
// Dobrze jest sobie zapamiętać ją jako: "dopóki warunek jest spełniony to wykonuj instrukcje"
//
//public class Hello{
//    public static void main(String[] args){
//        int licznik = 0;
//
//        while(licznik<10){
//            System.out.println("To jest petla");
//            licznik++;
//        }
//        System.out.println("Koniec pętli");
//    }
//}
//
// ----------------------- Pętla DO ... WHILE
// Tą pętlę można zapamiętać następująco "wykonuj instrukcje dopóki warunek jest prawdziwy"
//
//public class Hello{
//    public static void main(String[] args){
//        int licznik = 0;
//
//        do{
//            System.out.println("To jest petla");
//            licznik++;
//        }
//        while(licznik<10);
//        System.out.println("Koniec pętli");
//    }
//}
//
// ----------------------- FOR
//Pętlę for od dwóch poprzednich odróżnia przede wszystkim rodzaj zastosowań. W jej przypadku zazwyczaj wiemy dokładnie
// ile razy ma się jakaś czynność powtórzyć. Wyrażenie początkowe służy do zainicjowania jakiegoś licznika, którym
// zazwyczaj jest w tym samym miejscu zadeklarowana zmienna typu całkowitego - najczęściej oznacza się je przy pomocy
// liter od "i" wzwyż, jest to przydatne przy zagnieżdżonych pętlach, gdzie przy długich nazwach ciężko by się było
// połapać. Warunek sprawdza, czy ma się wykonać instrukcja z wnętrza pętli, natomiast modyfikator zmienia licznik -
// zazwyczaj jest to instrukcja inkrementacji.
//
//public class Hello{
//    public static void main(String[] args){
//        for(int i=0; i<10; i++){
//            System.out.println("To jest pętla");
//        }
//        System.out.println("Koniec pętli");
//    }
//}
//
//import java.util.Scanner;
//
//public class Hello{
//    public static void main(String[] args){
//        Scanner odczyt = new Scanner(System.in);
//        int zegar;
//
//        System.out.println("Podaj czas bomby: ");
//        zegar = odczyt.nextInt();
//
//        //wersja z while
//        while(zegar>0){
//            System.out.println("Bomba wybuchnie za "+zegar);
//            zegar--;
//
//        }
//        System.out.println("BUM!");
//    }
//}
//
//public class Hello {
//    public static void main(String[] args) {
//        int[] tablica = new int[20];
//        String[] tablica2 = new String [5];
//
//        for (int i=1; i<20; i=i+2)
//            tablica[i] = (i*10)+0;
//
//        int zmienna = tablica[14];
//        tablica[15]=666;
//        tablica2[0]="Grzgorz";
//        tablica2[1]="Jacek";
//        tablica2[2]="Marek";
//        tablica2[3]="Test test test";
//
//        for (int i=0; i<20; i++)
//            System.out.println("komórka " + i + " to: " + tablica[i]);
//        for (int i=0; i<5; i++)
//            System.out.println(tablica2[i]);
//
//        System.out.println(zmienna + " sprawdzam: powinno być 0");
//        System.out.println(tablica2[0]+" to "+tablica2[2]);
//    }
//}
//
//public class Hello {
//    public static void main(String[] args) {
//        int[][] tablica = new int[3][1];
//        tablica[0] = new int[1];
//        tablica[0][1] = 2;
//        tablica[0][2] = 3;
//        tablica[1][0] = 4;
//        tablica[1][1] = 5;
//        tablica[1][2] = 6;
//        for (int i = 0; i < tablica.length; i++) {
//            for (int j = 0; j < tablica[i].length; j++)
//                System.out.print(tablica[i][j]);
//
//
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//public class Hello {
//    public static void main(String[] args) {
//
//
//        /* odzczyt liczb i proste działania wraz z prezentacją wyniku ----------------------------------------------- */
//        new Random().nextInt();
//        Random liczba = new Random();
//        int Liczba1 = liczba.nextInt();
//        int Liczba2 = liczba.nextInt();
//        System.out.println(Liczba1 +" "+ Liczba2);
//        System.out.println((Liczba1)-(Liczba2));
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("ile masz lat?");
//        int wiek = in.nextInt();
//        System.out.println("Twój wiek to "+wiek);
//
//        /* dzielenie 2 liczb calkowitych wraz z podaniem reszty z dzielenia, o ile taka wystepuje ------------------- */
//        int a=15;
//        int b=2;
//        System.out.println(a/b + "." + a%b);
//
//        /* inkrementacja i przypisywanie zmiennych do innych zmiennych ---------------------------------------------- */
//        int wiek = 0;
//        int testowy = wiek;
//        testowy++;
//        int v=wiek+5;
//        Scanner in = new Scanner(System.in);
//        System.out.println(wiek+""+testowy+""+v);
//        System.out.println("podaj 1 liczbę do obliczeń:");
//        int LiczbaDoObliczen1=in.nextInt();
//        System.out.println("podaj 2 liczbe do obliczeń:");
//        int LiczbaDoObliczen2=in.nextInt();
//        int n = LiczbaDoObliczen1+LiczbaDoObliczen2;
//        n -= 5; // n = n-5
//        System.out.println("Wynik dodawania liczy 1 i liczby 2 zwiekszone o 1 = "+n);
//
//        /* potęgowanie - 2 wartości 1-podstawa, 2-wykładnik --------------------------------------------------------- */
//        double x = Math.pow(2,3);
//        System.out.println(x);
//
//        /* pierwiastek kwadratowy ----------------------------------------------------------------------------------- */
//        double y = Math.sqrt(16);
//        System.out.println(y);
//
//        /* do wartości stalej dodajemy zmiennoprzecinkową poprzez przypisanie int do double ------------------------- */
//        int z = 42;
//        double s = z;
//        s=s+50.50;
//        System.out.println(s);
//        System.out.println(z+" "+s);
//        System.out.println(z+s);
//
//        /* rzutowanie ----------------------------------------------------------------------------------------------- */
//        double p = 4.99;
//        int l = (int) p;
//        System.out.println(l);
//
//        /* rzutowanie wraz z zaokrągleniem -------------------------------------------------------------------------- */
//        double m = 3.5000000006;
//        int k = (int) Math.round(m);
//        System.out.println(k);
//
//        /* wynik to H */
//        int h = -2;
//        char next = (char)('J' + h);
//        System.out.println(next);
//
//        /* wynik to 76 */
//        char next2 = 'J';
//        int nextLiczba2 = (int) next2 + 2;
//        System.out.println(nextLiczba2);
//
//        /* zwróci true, true, false, false, true -------------------------------------------------------------------- */
//        int f=5, g=5;
//        String next3 = "Test1";
//        System.out.println(0<=f && f==g);
//        System.out.println(0<=f && f==next3.length());
//        System.out.println(0==f || f!=next3.length());
//        System.out.println(next3.equals("test1"));
//        System.out.println(next3.equalsIgnoreCase("test1"));
//
//        double e = 999999;
//        double q = 999999;
//        double u = e*2+q;
//        System.out.println(u);
//
//        /* łączenie ciągów znaków ----------------------------------------------------------------------------------- */
//        int age = 30;
//        String output = age + " lata";
//        String output2 = "Za rok bedziesz miał " + age + 1 + " lat";
//        String output3 = "Za rok bedziesz miał " + (age + 1) + " lat";
//        System.out.println(output);
//        System.out.println(output2);
//        System.out.println(output3);
//        String names = String.join("@ ", "string_01" , "string_02" , "string_03");
//        System.out.println(names);
//
//        /* konwersja liczby int na String, dodatkowo łączenie stringów ---------------------------------------------- */
//        int licz1 = 33;
//        int licz2 = 666;
//        String greenApp = "green applications";
//        String String01 = Integer.toString(licz1);
//        System.out.println(String01+greenApp+licz2);
//        String names1 = String.join("# ", String01, "end");
//        System.out.println(names1);
//
//        /* konwersja innym sposobem int na String, gdzie wynik to 101100 -------------------------------------------- */
//        int xo = 44;
//        String names2 = Integer.toString(xo, 2);
//        System.out.println(names2);
//
//        /* konwersja Stringa na wartość int (string zawiera liczbe) - metoda Integer.parseInt ----------------------- */
//        String names3 = "111";
//        int xv = 10;
//        int xc = Integer.parseInt(names3);
//        System.out.println(xc+" "+(xc+xv));;
//
//        /* zamiana znaków ------------------------------------------------------------------------------------------- */
//        String imie = "Grzegorz";
//        System.out.println("string = " + imie);
//        CharSequence s1 = "r";
//        CharSequence s2 = "z";
//        String noweImie = imie.replace(s1,s2);
//        System.out.println("new string = " + noweImie);
//        String noweImie2 = noweImie.replace(s2,s1);
//        System.out.println(noweImie2);
//
//        /* porównuje stringi zwracajac true or false ---------------------------------------------------------------- */
//        String G1 = "chciałam zadzwonić";
//        String G2 = "chciałam zadzwonić";
//        boolean weryfikacjaCalosci = G1.contains(G2); // porównuje 2 stringi
//        boolean weryfikacjaSlowa = G1.contains("cia"); // sprawdza ciąg znaków
//        boolean checkLastChar = G1.endsWith("ć"); // sprawdza ostatni znak
//        String gEnd = G1.concat("ć"); // dodaje znak
//        System.out.println(weryfikacjaCalosci);
//        System.out.println(weryfikacjaSlowa);
//        System.out.println(checkLastChar);
//        System.out.println(gEnd);
//
//        /* zamiana z małych  na duże -------------------------------------------------------------------------------- */
//        String G1A = "coś tam sobie pisze";
//        String replace = G1A.toUpperCase();
//        System.out.println(replace);
//        System.out.printf("%8.2f", 1000.0 / 3,"\n"); // printf wynik obliczen  - długość obliczeń 8 znaków z dokładnościa do 2
//
//        /* printf z uzupełnianiem danych (można rownież zdefiniować string w żądanym formace) ----------------------- */
//        String myName="Grzeorz";
//        String myLivingPlace = "Bytom";
//        int year = 42;
//        System.out.println();
//        String message = String.format("Hello, %s. Za rok bedziesz mieć %d lat, Twoje miejsce zamieszkania to %s \n", myName, year, myLivingPlace);
//        System.out.println(message);
//        //System.out.printf("Hello, %s. Za rok bedziesz mieć %d lat, Twoje miejsce zamieszkania to %s \n", myName, year, myLivingPlace);
//
//        /* weryfikacja czy nie występuje dzielenie przez 0 ---------------------------------------------------------- */
//        int dzielnik = -1;
//        int eenum = 10;
//        if (dzielnik > 0){
//            double averange = eenum / dzielnik;
//            System.out.println(averange);
//        }
//        else if (dzielnik==0){
//            System.out.println("no 0");
//        }
//        else {
//            System.out.println("huh");
//        }
//
//        /* kalkulator ----------------------------------------------------------------------------------------------- */
//        Scanner wprowadz = new Scanner(System.in);
//        System.out.print("podaj 1 wartośc do obliczeń: ");
//        double wartoscPierwsza = wprowadz.nextDouble();
//        System.out.print("podaj 2 wartosc do obliczeń: ");
//        double wartoscDruga = wprowadz.nextDouble();
//        System.out.println("mnożenie    - 1");
//        System.out.println("dzielenie   - 2");
//        System.out.println("dodawanie   - 3");
//        System.out.println("odejmowanie - 4");
//        System.out.print("wybierz rodzaj działania do wykonania: ");
//        int wybraneDzialanie = in.nextInt();
//        if (wybraneDzialanie >=1 && wybraneDzialanie <=4){
//            switch (wybraneDzialanie){
//                case 1:
//                        System.out.println("wynik: "+(wartoscPierwsza*wartoscDruga));
//                        break;
//                case 2:
//                    if (wartoscDruga ==0) {
//                        System.out.println("nie dzieli sie przez 0!");
//                    }
//                    else {
//                        System.out.println("wynik: " + (wartoscPierwsza / wartoscDruga));
//                    }
//                        break;
//                case 3:
//                        System.out.println("wynik: "+(wartoscPierwsza+wartoscDruga));
//                        break;
//                case 4:
//                        System.out.println("wynik: "+(wartoscPierwsza-wartoscDruga));
//                        break;
//                default:
//                    break;
//            }
//        }
//        else
//            System.out.println("huh?");
//
//        /* pętla - 10 losowych liczb double z przycieciem do całości (bez przecinka) w przedziale do 100) ----------- */
//        Random liczby = new Random();
//        int cos = 0;
//        while (cos<10){
//            double losowaLiczba = liczby.nextInt(100);
//            System.out.println(losowaLiczba);
//            cos++;
//        }
//
//        /* pętla while - losowe liczby calkowite, oraz zmiennoprzecinkowe, dodawanie obu ---------------------------- */
//        Random liczby2 = new Random();
//        int count2 = 1;
//        int aLiczbCa = 0;
//        double bLiczbZm = 0;
//        while (count2<5){
//            int losowaLiczba0 = liczby2.nextInt(10);
//            double losowaLiczba1 = liczby2.nextDouble();
//            aLiczbCa = losowaLiczba0+aLiczbCa;
//            bLiczbZm = losowaLiczba1+bLiczbZm;
//            System.out.println((count2)+" losowa liczba calkowita: "+losowaLiczba0);
//            System.out.println((count2)+" losowa liczba zmiennoprzecinkowa: "+losowaLiczba1);
//            System.out.println("suma obu liczb: "+(losowaLiczba0+losowaLiczba1));
//            count2++;
//        }
//        System.out.println("suma liczb calkowitych to: "+aLiczbCa);
//        System.out.println("suma liczb zmiennoprzecinkowych to: "+bLiczbZm);
//        System.out.println("suma liczb to: "+(aLiczbCa+bLiczbZm));
//
//        /* pętla while/do -  kasa na emeryturze --------------------------------------------------------------------- */
//        Scanner wprowadzoneDane = new Scanner(System.in);
//
//        System.out.print("Ile pieniedzy bedziesz rocznie wpłacać? ");
//        double paymentN = wprowadzoneDane.nextDouble();
//        System.out.print("Stopa oprocentownia w %:");
//        double interestRateN = wprowadzoneDane.nextDouble();
//
//        double interestN;
//        double balanceN = 0;
//        double balanceY = 0;
//        int yearN = 0;
//        String input;
//        boolean check;
//
//        do{
//            balanceN += paymentN;
//            interestN = balanceN * interestRateN / 100;
//            balanceN = balanceN+interestN;
//            balanceY += interestN;
//            yearN++;
//
//            System.out.printf("Po upływie %d lat stan twojego konta wyniesie %,.2f%n",yearN, balanceN);
//            do {
//                System.out.print("Czy chcesz przejść na emeryture? (T/N) ");
//                input = wprowadzoneDane.next();
//                check = ((input.equals("N")) || (input.equals("n")) || (input.equals("T")) || (input.equals("t")));
//            }
//            while (check==false);
//        }
//        while ((input.equals("N"))||(input.equals("n")));
//
//        System.out.printf("Oszczędzałeś przez %d lat. Stan Twoich oszczędności wraz z odsetkami to %,.2f%n",yearN, balanceN);
//        System.out.printf("Twoje środki to kwota %,.2f%n , a środki z odsetek to %,.2f%n",(paymentN*yearN), balanceY);
//        System.out.println("przez ile lat będziesz żył na emeryturze? ");
//        int yearL = wprowadzoneDane.nextInt();
//        System.out.println("Twoje miesięczne środki na życie to: "+(balanceN/yearL/12));
//
//        /* jakaś tam pętla  - 10 liczb ------------------------------------------------------------------------------ */
//        Random losoweLiczby = new Random();
//        int Wartosc7 = 0;
//        int Wartosc8 = 10;
//        while (Wartosc7<Wartosc8){
//            int nextNumericValue = losoweLiczby.nextInt(10);
//            System.out.println(nextNumericValue);
//            Wartosc7++;
//        }
//
//        /* petla for - generuje liczby od 1 do 10 w 5 cyklach, a następnie je sumuje -------------------------------- */
//        Random randomValue1 = new Random();
//        int sumOfValue1 = 0;
//        int numericValue1 = 0;
//        for (int i = 1; i<=5; i++) {
//            int nextRandomValue1 = randomValue1.nextInt(10);
//            sumOfValue1 += nextRandomValue1;
//            numericValue1++;
//            System.out.println((numericValue1)+" liczba to: "+(nextRandomValue1));
//        }
//        System.out.println("Suma liczb to: "+(sumOfValue1));
//
//        /* pętla while ---------------------------------------------------------------------------------------------- */
//        Random randomValue2 = new Random();
//        int sumOfValue2 = 0;
//        int numericValue2 = 0;
//        int whileValue2 = 0;
//        while (whileValue2 <=6 ) {
//            int nextRandomValue2 = randomValue2.nextInt(10);
//            sumOfValue2 += nextRandomValue2;
//            numericValue2++;
//            System.out.println((numericValue2)+" liczba to: "+(nextRandomValue2));
//            whileValue2++;
//        }
//        System.out.println("Suma liczb to: "+(sumOfValue2));
//
//        /* pętla while (ucieczka z pętli przez znak Q) i BOOLEAN - zlicza ilość znaków z wprowadzonych słów --------- */
//        boolean done = false;
//        Scanner inodczyt = new Scanner(System.in);
//        while (!done) {
//            System.out.println("podaj dane do przetwarzania (Naciśnij Q jęsli chcesz zakończyć) : ");
//            String input0 = in.nextLine();//next - przetwarza ciąg znaków, spacja oddziela (dzieli zdanie na kilka stringów, natomiast nextLine sumuje wszystkie)
//            if ("Q".equals(input0)) {
//                System.out.println("BREAK");
//                done = true;
//            }
//            else{
//                if (input0.length() == 1)
//                    System.out.println("przetwarzanie... podane słowo zawiera "+(input0.length())+" znak.");
//                if (input0.length() >1 && input0.length() <=4)
//                    System.out.println("przetwarzanie... podane słowo zawiera "+(input0.length())+" znaki.");
//                if (input0.length() >=5)
//                    System.out.println("przetwarzanie... podane słowo zawiera "+(input0.length())+" znaków.");
//            }
//        }
//
//
//
//        /* pętla while (ucieczka z pętli przez znak Q) i BREAK - zlicza ilość znaków z wprowadzonych słów ----------- */
//        Scanner in2 = new Scanner(System.in);
//        while (true) {
//            System.out.println("podaj dane do przetwarzania (Naciśnij Q jęsli chcesz zakończyć) : ");
//            String input1 = in2.nextLine();
//            if (input1.equals("Q")) {
//                System.out.println("BREAK");
//                break;
//            }
//            else {
//                if (input1.length() == 1)
//                    System.out.println("przetwarzanie... podane słowo zawiera "+(input1.length())+" znak.");
//                if (input1.length() >1 && input1.length() <=4)
//                    System.out.println("przetwarzanie... podane słowo zawiera "+(input1.length())+" znaki.");
//                if (input1.length() >=5)
//                    System.out.println("przetwarzanie... podane słowo zawiera "+(input1.length())+" znaków.");
//            }
//        }
//
//        /* Pętla while - jeśli wprowadzona liczba = 0 kontynuuje petle od nowa, inna liczba przerywa pętle ---------- */
//        Scanner in3 = new Scanner(System.in);
//        while (in3.hasNextInt()){
//            int nowaLicz1 = in3.nextInt();
//            if (nowaLicz1==0) continue;
//            break;
//        }
//
//        /* TABLICE -------------------------------------------------------------------------------------------------- */
//        String [] knajpaMenu = {"Grochówka", "Zupa Pomidorowa", "Kotlet Schabowy", "Kotleciki z cieleciny" };
//        int [] knajpaCennik = {10, 20, 30, 50};
//        System.out.println((knajpaMenu[2])+" "+(knajpaCennik[2]));
//
//        /* Menu Knajpy - podawanie nazwy produktu i ceny -------------------------------------------------------------*/
//        Scanner podajDane = new Scanner(System.in);
//
//        String[] barMenu = new String[4];
//        double[] barCennik = new double[4];
//        String wybor_klienta;
//        boolean check;
//
//        for (int i = 1; i <= 4; i++) {
//            System.out.println("podaj nazwę: ");
//            barMenu[i] = podajDane.next();
//            System.out.println("podaj cene: "+barMenu[i]+" :");
//            barCennik[i] = podajDane.nextDouble();
//            System.out.println((barMenu[i])+" "+(barCennik[i]));
//
//            do{
//                System.out.println("Czy chcesz dodać kolejną pozycję? (T/N)");
//                wybor_klienta = podajDane.next();
//                check = ((wybor_klienta.equals("N")) || (wybor_klienta.equals("n")) || (wybor_klienta.equals("T")) || (wybor_klienta.equals("t")));
//            }
//            while (check==false);
//
//            if (wybor_klienta.equals("N") || (wybor_klienta.equals("n")) || (i==3)) {
//                System.out.println("BREAK");
//
//                for (int z=1 ; z < barMenu.length ; z++){
//                    System.out.println(z+". "+barMenu[z]+" "+barCennik[z]);
//                }
//                break;
//            }
//
//            else
//                System.out.println("wprowadz kolejną pozycje - pozostało pozycji: "+(3-i));
//        }
//
//        String[] primes = {"zupa","buraki","troglodyci","ćwieki"};
//        for (int i = 0; i<=3; i++) {
//            System.out.println(primes[i]);
//        }
//
//        /* TABLICA Klasa ArrayList -----------------------------------------------------------------------------------*/
//        ArrayList<Integer> values;
//        values = new ArrayList<>();
//        ArrayList<Float> values2;
//        values2 = new ArrayList<>();
//        ArrayList<Integer> copiedvalues = new ArrayList<>(values);
//        values2.add((float)2.88);
//        values2.add((float)1.44);
//        values.add(2);
//        values.add(4);
//        values.add(2,10);
//        values.add(100);
//        values.add(5);
//        values.add(values.get(3)+values.get(4));
//        int zapamietana = values.get(5);
//        values.add(values.get(5));
//        System.out.println(values);
//        System.out.println(values.get(0)+values.get(1));
//        values.remove(0);
//        values.add(0, 3);
//        System.out.println(values);
//        values.set(0, 17);
//        System.out.println(values);
//        System.out.println("Wartości z tabeli");
//        for (int i=0; i<values.size(); i++) {
//            System.out.println("wartość " + i + " " + values.get(i));
//        }
//        for (int i=0; i<values2.size(); i++){
//            System.out.println("wartość " + i + " " + values2.get(i));
//        }
//        System.out.println("zapamiętana "+zapamietana*2);
//
//        int sum = 0;
//        for (int n : values){
//            sum += n;
//        }
//        System.out.println("suma liczb w tablicy " + sum);
//
//        int sum2 = 0;
//        for (int m : copiedvalues){
//            sum += m;
//        }
//        System.out.println("suma liczb w tablicy " + sum);
//
//        /* Losowanie, zapisywanie do tablicy -------------------------------------------------------------------------*/
//        Scanner in = new Scanner(System.in);
//        System.out.println("Ile liczb musisz wylosować? ");
//        int k = in.nextInt();
//        System.out.println("Jaka jest najwieksza liczba? ");
//        int n = in.nextInt();
//
//        //zapełnienie tablicy liczbami 1 2 3... n
//        int[] numbers = new int[n];
//        for (int i=0 ; i<numbers.length; i++)
//            numbers[i] = i + 1;
//
//        //losowanie k liczb i zapisanie ich do 2 tablicy
//        int[] result = new int[k];
//        for (int i=0; i<result.length; i++){
//            int random = (int) (Math.random() * n); //losowanie indeksu z zakresu od 0 do n-1
//            result[i] = numbers[random]; //pobranie elementu z losowej lokalizacji
//            numbers[random] = numbers[n - 1]; //przeniesienie ostatniego elementu do losowej lokalizacji
//            n--;
//        }
//        Arrays.sort(result);
//        System.out.println("wylosowano: ");
//        for (int r : result)
//            System.out.println(r);
//        }
//
//        ------------------------------------------------- zadanie z kursu javastart - obiekty - utworzona klasa Person
//
//        Person pawel = new Person(); // tworzenie nowego obiektu: Person(obiekt) pawel(nazwa obiektu) = new Person(klasa)
//        pawel.name = "Paweł"; // pawel(nazwia obiektu).name(z klasy Person 'String name;' przypisz wartosc "Paweł")
//        pawel.age = 18;
//        pawel.isAlive = true;
//        pawel.isWorking = true;
//
//        Person mietek = new Person();
//        mietek.name = "Mietek"; // pawel(nazwia obiektu).name(z klasy Person 'String name;' przypisz wartosc "Paweł")
//        mietek.age = 99;
//        mietek.isAlive = false;
//        pawel.isWorking = false;
//
//        pawel.przedstawSie_2(true); // tutaj nic sie nie wyswietli, poniewaz trzeba przechwycic stringa z klasy person, jak poniżej:
//
//        String przywitanie = pawel.przedstawSie_2(true);
//        System.out.println(przywitanie);
//        mietek.przedstawSie();
//
//        int ileRazy = Person.ileRazyPrzedstawil();
//        System.out.println("Osoby przedstawiły się " + ileRazy + " razy.");
//
//
//
//  ---------------------------------------------------------------------------------------------------------- zadanie 008
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("podaj 1 wartość");
//        int A = in.nextInt();
//        System.out.println("podaj 2 wartość");
//        int B = in.nextInt();
//        boolean checking = (A-B==0);
//        if (checking==true)
//            System.out.println("OK!");
//        if ((A+B)%2==0)
//            System.out.println("podana liczba jest parzysta");
//        else System.out.println("warunek niespełniony");
//
//  ---------------------------------------------------------------------------------------------------------- zadanie 010
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("podaj liczbę");
//        int liczba = in.nextInt();
//        if (liczba > 4)
//            System.out.println("podana liczba jest wieksza od 4");
//        if ((liczba >0)&&(liczba<5))
//            System.out.println("podana przez Ciebie liczba jest mniejsza od 4 i większa od 1");
//
//  ----------------------------------------------------------------------------------------------------------- zadanie 11
//
//       Scanner in = new Scanner(System.in);
//       System.out.println("podaj liczbę");
//       int liczba_uzytkownika = in.nextInt();
//       int liczba_suma = 0;
//       for (int i=0; i<=liczba_uzytkownika; i++) {
//           liczba_suma += i;
//           System.out.println(i + ". " + liczba_suma);
//       }
//       System.out.println(liczba_suma);
//
//  ---------------------------------------------------------------------------------------------------------- zadanie 012
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("podaj liczbę z przedziału od 0 do 100");
//        int liczba_uzytkownia = in.nextInt();
//        while ((liczba_uzytkownia > 100)||(liczba_uzytkownia < 0)) {
//            System.out.println("podaleś liczbę spoza przedziału 0-100. ");
//            if (liczba_uzytkownia < 0 )
//                System.out.println("Liczba jest zbyt niska");
//            if (liczba_uzytkownia > 100)
//                System.out.println("Liczbę zbyt wysoka");
//            liczba_uzytkownia = in.nextInt();
//            }
//         System.out.println("Dobrze! podałeś liczbę z przedziału 0-100 : " + liczba_uzytkownia);
//
//  ---------------------------------------------------------------------------------------------------------- zadanie 013
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("podaj liczbę");
//        int liczna_uzytkownika = in.nextInt();
//        int licznik = 0;
//        while (licznik <= liczna_uzytkownika) {
//            System.out.println(licznik);
//            licznik++;
//        }
//
//  ---------------------------------------------------------------------------------------------------------- zadanie 014
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("podaj liczbę");
//        int liczna_uzytkownika = in.nextInt();
//        for (int licznik = 0; licznik <= liczna_uzytkownika; licznik++)
//            System.out.println(licznik);
//
//  ------------------------------------------------------------------------ ( utworzona klasa ArrayFactory )- zadanie 015;016;017
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("podaj zakres tablicy: ");
//        int dlugosc = in.nextInt();
//
//        ArrayFactory grzegorz1 = new ArrayFactory();
//        grzegorz1.dlugosc = dlugosc;
//
//        grzegorz1.tablicaJednowymiarowa();
//        grzegorz1.tablicaDwuwymiarowa();
//
//  ---------------------------------------------------------------------------------------------------------- zadanie 018
//
//        Scanner wejscie = new Scanner(System.in);
//        System.out.println("podaj wartość cyfrową dodatnią (wartość zostanie przekonwertowana na String - odwrócona i wyświetlona w pionie");
//        int liczba = wejscie.nextInt();
//
//        Temp integerToString = new Temp();
//        integerToString.integerToString=liczba;
//
//        integerToString.cyfryNaZnaki();
//
//  ---------------------------------------------------------------------------------------------------------- zadanie 020
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("hello world!");
//        int liczba = in.nextInt();
//            if (liczba%2==0)
//                System.out.println("podana liczba jest parzysta");
//            else
//                System.out.println("ppodana liczba nie jest parzysta");
//        System.out.println(liczba);
//        boolean porowanie = (liczba%2==0);
//        System.out.println("Czy liczba jest parzysta? : " + porowanie);
//
//  ---------------------------------------------------------------------------------------------- zadanie -- internet 001
//
//
//        Scanner in = new Scanner(System.in);
//        String questions;
//
//        do {
//            System.out.println("podaj 1 wartość");
//            int a = in.nextInt();
//            System.out.println("podaj 2 wartość");
//            int b = in.nextInt();
//
//            WynikDodawanie dodawanie = new WynikDodawanie();
//            dodawanie.pierwszaWartosc = a;
//            dodawanie.drugaWartosc = b;
//
//            dodawanie.sumaDodawania();
//            System.out.println(WynikDodawanie.wynik);
//
//            System.out.println("czy chcesz zmienić wartości? (t/n)");
//            questions = in.next();
//        }
//        while ((questions.equals("T"))||questions.equals("t"));
//        System.out.println("do widzenia");
//
//  ----------------------------------------------------------------------------------------------- udemy - obiekty -- 28
//  /* Obiekty:
//    Pojemniki do przechowywania zmiennych i funkcji tematycznie ze sobą powiązanych do dalszego łatwiejszego
//    ponownego użycia, opisanie przez:
//    Properties (właściwości) ; Metody (co może wykonywać obiekt) - funkcje, metoty coś opisujące, np. wł/wył monitor
//     Klasy:
//    Foremki/ formy do tworzenia egzemplarzy obiektów */
//
//        Monitor abc = new Monitor();  // 1 obiekt
//        abc.szerokość = 123;
//        Monitor abc2 = new Monitor(); // 2 obiekt
//        abc2.szerokość = 250;
//
//        System.out.println(abc.szerokość);
//        System.out.println(abc2.szerokość);
//
//        String Name = "Paweł";
//        System.out.println(Name.length());
//
//    }
//}
//
//class Monitor {  //forma do tworzenia obiektu
//    int szerokość;
//    int wysokość;
//
//    void wlacz() // metoda / funkcja
//    {
//
//    }
//
//    void wylacz()
//    {
//
//    }
//
//}
//
//  ----------------------------------------------------------------------------------------- udemy -- konstruktory -- 29
//
//        Punkt p = new Punkt(); // <- wywołanie konstruktora - w tej formie wywoła Punkt(), ale jesli wpiszemy
//                               // new Punkt(2, 4); <- (argumenty) zostanie wywołany konstruktor
//                               // Punkt(int pierwszy, int drugi)
////        p.x = 5;
////        p.y = 10;
//
//        System.out.println("p.x " + p.x);
//        System.out.println("p.y " + p.y);
//    }
//}
//
//class Punkt {
//
//    int x;
//    int y;
//
//    Punkt() { // w nawiasie metody () sa parametry
//        System.out.println("wywołanie konstruktora domyślnego");
//        x = 20;
//        y = 20;
//    }
//
//    Punkt(int pierwszy, int drugi) {
//        System.out.println("wywołanie konstruktora z dwoma parametrami");
//        x = pierwszy;
//        y = drugi;
//    }
//}
//
//  ------------------------------------------------------------------------------- udemy -- słowo kluczowe this -- 30/31
//
//        Punkt p = new Punkt(50, 100); // <- wywołanie konstruktora - w tej formie wywoła Punkt(), ale jesli wpiszemy
//                               // new Punkt(2, 4); <- (argumenty) zostanie wywołany konstruktor
//                               // Punkt(int pierwszy, int drugi)
//
//        System.out.println("p.x " + p.x);
//        System.out.println("p.y " + p.y);
//    }
//}
//
//class Punkt {
//
//    int x;
//    int y;
//
//    Punkt(){ // w nawiasie metody () sa parametry
//    System.out.println("wywołanie konstruktora domyślnego");
//    x = 20;
//    y = 20;
//    }
//
//    Punkt(int x, int y){
//    System.out.println("wywołanie konstruktora z dwoma parametrami");
//    this.x = x;
//    this.y = y;
//    // this to z ang. 'ten'. W programowaniu lepiej brzmi coś w stylu: 'z tego (obiektu)'
//
//    /* Gdy wpiszesz 'this.' i skorzystasz ze skrótu CTRL + SPACE to dostaniesz dostęp do wszystkiego na czym możesz
//    operować z pomocą this. A będą to wszystkie metody/właściwości, które można wywołać/zmienić, gdy pracujesz na jakimś
//    konkretnym obiektem. Przypominam, że klasa to forma do tworzenia obiektów. Możesz stworzyć z jednej klasy 100
//    różnych obiektów.
//
//    Gdy masz np. klasę Samochod i zrobisz:
//    Samochod samochody[] = new Samochod[3];
//
//    I teraz napiszesz:
//    samochody[0] =  new Samochod("Ford");
//    samochody[1] = new Samochod("Audi");
//    samochody[2] = new Samochod("Fiat");
//
//    To samochody[0] i samochody[1] oraz samochody[2] to są trzy różne obiekty z tej samej formy. Każdy z nich ma te
//    same właściwości (zmienne), ale ich wartości są różne.
//
//    Kiedy wywołujesz powiedzmy metodę:
//    String getNazwaSamochod(){  return this.nazwaSamochodu;}
//    w taki sposób:
//    samochody[0].getNazwaSamochod();
//
//    To Twoje 'this' to w tym momencie jest: samochody[0]
//
//    Kiedy wywołasz:
//    samochody[1].getNazwaSamochod();
//    To Twoje 'this' to w tym momencie jest samochody[1]
//
//    samochody[2].getNazwaSamochod();
//    To Twoje 'this' to w tym momencie jest samochody[2]
//
//    tzn. 'this' zmienia swoją postać w zależności od tego na jakim obiekcie operujesz. 'this' to obiekt na którym
//    aktualnie operujesz. */
// 
//    }
//}
//
//  ----------------------------------------------------------------------------------------------- udemy -- metody -- 32
//
//        Test a = new Test();
//        a.x = "jaś";
//        a.y = " małgosia";
//
//        a.wypisz();
//
//    }
//}
