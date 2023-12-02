package HesapMakinesi;

class Kontrol {

    protected static boolean kontrol(String islem){


        int kontrol1 = islem.compareTo("+");
        int kontrol2 = islem.compareTo("-");
        int kontrol3 = islem.compareTo("*");
        int kontrol4 = islem.compareTo("/");
        boolean kontrolsonucu = (kontrol1 == 0 || kontrol2 == 0 || kontrol3 == 0 || kontrol4 == 0);
        return kontrolsonucu;
    }
}
