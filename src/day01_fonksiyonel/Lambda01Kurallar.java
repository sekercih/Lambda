package day01_fonksiyonel;

import java.util.Arrays;
import java.util.List;
// Javada Lambda fonksiyonları sadece Fonksiyonel interface'ler ile kullanılabilir.
// Sadece bir adet abstract metodu olan interface'lere fonksiyonel interface denilir.
// Kullanıcı isterse kendi fonksiyonel interface'ini yazabilir. Ama Javada hali hazırda
// Consumer, Function, Supplier, Predicate gibi tanımlanmış interfaceler bulunmaktadır.
// Ayrıca bu interface'leri parametre olarak alabilen High Order Function (HOF)'lar da bulunmaktadır.
// foreEach(), map(), filter(), reduce() gibi HOF'lar fonksiyonel interfaceler ile çalıştığı için
// içerisinde Lambda fonksiyonları yazmak mümkündür.
// Javada genelde bu gibi fonksiyonlar üzerinden Lambda ifadeleri kullanılmaktadır.

public class Lambda01Kurallar {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // forEach() bir collection'nın iterasyonu için kullanılan HOF'dur.
        // Parametre olarak bir lambda fonksiyonu alabilir.

        list.forEach(x -> System.out.print(x));
        System.out.println();

        list.forEach(x -> System.out.print(x + 2));
        System.out.println();
        list.forEach(a -> System.out.print(a * a + " "));
        System.out.println("\nSatir sayisi 1 den fazlaysa {} kullanmalıyız");
        list.forEach(x -> {
            int miktar = 2;
            System.out.print(x + miktar);
        });
        System.out.println("\nVeri tipi kullanılırsa Explicit:");

        list.forEach((Integer x) -> System.out.print(x * 2 + " "));
        System.out.println("\nBir dış değişken kullanalım");
        int deger = 5;
        list.forEach(t -> System.out.print(t + deger));
        System.out.println("\nmethot referansı kullanımı");
        //Methot referansı===>Class adı: Methot adı çağırabiliriz
        list.forEach(System.out::print);
        System.out.println("\nmethot referansı kullanımı");
        list.forEach(Lambda01Kurallar::yazdir);
    }

    public static void yazdir(int x) {
        System.out.print(x + " / ");

    }
    public static boolean tekMi(int x){
        return x%2!=0;
    }
}
