import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double armutKilo=2.14,elmaKilo=3.67,domatesKilo=1.11,muzKilo=0.95,patlicanKilo=5.00;
        double kg,total=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kg ? : ");
        kg= input.nextDouble();
        total+=kg*armutKilo;
        System.out.print("Elma Kaç Kg ? : ");
        kg= input.nextDouble();
        total+=kg*elmaKilo;
        System.out.print("Domates Kaç Kg ? : ");
        kg= input.nextDouble();
        total+=kg*domatesKilo;
        System.out.print("Muz Kaç Kg ? : ");
        kg= input.nextDouble();
        total+=kg*muzKilo;
        System.out.print("Patlıcan Kaç Kg ? : ");
        kg= input.nextDouble();
        total+=kg*patlicanKilo;
        System.out.println("Toplam  Tutar : "+total+" TL");



    }
}
