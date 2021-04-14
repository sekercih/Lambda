package day01_fonksiyonel;

import java.util.Arrays;
import java.util.List;

public class Lambda01KurallarTekrar {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.forEach(x -> System.out.print(x + " "));
        System.out.println();
        list.forEach(eleman -> System.out.print(eleman + 2));
        System.out.println();
        list.forEach(eleman -> {
            int miktar = 10;

            System.out.print(eleman + miktar + " ");
        });


        System.out.println("\nVeri tipi kullanılırsa Excplicit");
        list.forEach((Integer x) -> System.out.print(x * x + " "));

        System.out.println("\nBir dış değişken kullanalım");
        int degisken = 5;
        list.forEach(t -> System.out.print(t + degisken   ));
        System.out.println();
        list.forEach(System.out::print);

        System.out.println();

        list.forEach(Lambda01KurallarTekrar::tekMi);
    }
    public static void yazdir(int x){
        System.out.println(x);
    }
    public static boolean tekMi(int x){
        return x%2!=0;
    }
}
