package HesapMakinesi;


import HesapMakinesiGit.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kontrol kontrol =   new Kontrol();
        Toplama toplama =   new Toplama();
        Cikarma cikarma =   new Cikarma();
        Carpma carpma =   new Carpma();
        Bolme bolme =   new Bolme();
        Scanner     in  =   new Scanner(System.in);



                System.out.println("yapmak istediğiniz işlemi girin(+ , - , * , /)");
                if (in.hasNext()) {
                    String islem = in.next();

                    if (Kontrol.kontrol(islem)) {
                        System.out.println("işlem yapmak istedğiniz sayıyı girin");
                        double a = in.nextDouble();
                        System.out.println("işlem için bir sayı daha girin");
                        double b = in.nextDouble();

                        if (islem.equals("+")) {
                            System.out.println("sonuç: " + Toplama.toplama(a, b));
                        } else if (islem.equals("-")) {
                            System.out.println("sonuç: " + Cikarma.cikarma(a, b));
                        } else if (islem.equals("*")) {
                            System.out.println("sonuç: " + Carpma.carpma(a, b));
                        } else if (islem.equals("/") && b != 0) {
                            System.out.println("sonuç: " + Bolme.bolme(a, b));
                        } else if (islem.equals("/")) {
                            System.out.println("tanımsız işlem");
                        }
                    } else {
                        System.out.println("hatalı işlem girdisi");
                        System.exit(1);
                    }
                } else {
                    System.out.println("yok");
                }




    }
}