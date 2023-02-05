import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double Armut, Muz, Kivi, Ayva, Portakal;
        double a = 18, m = 27, k = 15, c = 18, p = 19;


        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kaç kg ? ");
        Armut = inp.nextDouble();
        System.out.print("Muz kaç kg ? ");
        Muz = inp.nextDouble();
        System.out.print("Kivi kaç kg ? ");
        Kivi = inp.nextDouble();
        System.out.print("Ayva kaç kg ? ");
        Ayva = inp.nextDouble();
        System.out.print("Portakal kaç kg ? ");
        Portakal = inp.nextDouble();

        double tutar = (Armut*a) + (Muz*m) + (Kivi*k) + (Ayva*c) + (Portakal*p);

        System.out.println("Toplam Ödeyeceğiniz Tutar: " + tutar + "TL");




    }
}