package sayisirala;

import java.util.Scanner;

public class SayiSirala {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen Birinci Sayıyı Girin : ");
        double sayi1 = scanner.nextDouble();
        
        System.out.print("Lütfen İkinci Sayıyı Girin : ");
        double sayi2 = scanner.nextDouble();
        
        System.out.print("Lütfen Üçüncü Sayıyı Girin : ");
        double sayi3 = scanner.nextDouble();
        
        // En küçük sayıyı bulma
        double enKucuk = sayi1;
        if (sayi2 < enKucuk) {
            enKucuk = sayi2;
        }
        if (sayi3 < enKucuk) {
            enKucuk = sayi3;
        }

        // En büyük sayıyı bulma
        double enBuyuk = sayi1;
        if (sayi2 > enBuyuk) {
            enBuyuk = sayi2;
        }
        if (sayi3 > enBuyuk) {
            enBuyuk = sayi3;
        }

        // Orta sayıyı bulma
        double ortanca = sayi1;
        if (sayi1 > enKucuk && sayi1 < enBuyuk) {
            ortanca = sayi1;
        } else if (sayi2 > enKucuk && sayi2 < enBuyuk) {
            ortanca = sayi2;
        } else {
           ortanca = sayi3;
        }

    }
    
}
