public class Person {

        static int ileRazy;

    String name;
    int age;
    boolean isAlive;
    boolean isWorking;


    void przedstawSie() {
        System.out.println("Cześć jestem " + name + " mam " + age + " lat.");
    }

//    // ta metoda nic nie zwraca bo jest VOID
//    void przedstawSie_2(boolean formal) {
//        if (formal) {
//            System.out.println("witam Państwa. Mam na imię " + name + " i mam " + age + " lat.");
//        }
//        else {
//            System.out.println("Cześć jestem " + name + " mam " + age + " lat.");
//        }
//    }

    // ta metoda coś zwraca, bo jest String
    String przedstawSie_2(boolean formal) {
        if (formal) {
           ileRazy++;
           String przywitanie = "witam Państwa. Mam na imię " + name + " i mam " + age + " lat.";
           return przywitanie;
        }
        else {
            return "Cześć jestem " + name + " mam " + age + " lat.";
        }
    }

    static int ileRazyPrzedstawil() {
        return ileRazy;
    }
}
