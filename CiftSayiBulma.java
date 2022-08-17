import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        int sayi;

        Scanner input= new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        sayi=input.nextInt();

        double ortalama=0 , toplam=0, adet=0;
        for (int i=0 ; i <= sayi ; i++) {
            if (i%3 == 0 && i%4 == 0) {
                 System.out.println(i);
                 toplam += i;
                 adet++;
            }
        }
        ortalama= toplam/adet;
        System.out.println("Ortalama: " + ortalama);

        }
}

/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */