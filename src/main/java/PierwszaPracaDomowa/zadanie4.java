package PierwszaPracaDomowa;

public class zadanie4 {
    public static void main(String[] args) {
        int godz = 16;
        int min = 31;
        int plusmin = 234;

        int godziny = godz + ((min + plusmin) / 60);
        int minuty = (min + plusmin) % 60;

        String zegar = godziny + ":" + minuty;

        System.out.println("zegar po upływie: " + plusmin + " min wybije czas " + zegar);


    }
}
