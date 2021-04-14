package day02_streamOrnekler;

import day01_fonksiyonel.Lambda01Kurallar;

import java.util.ArrayList;
import java.util.List;

public class Stream01Integer {
    public static void main(String[] args) {
        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(5);
        rakamlar.add(6);
        rakamlar.add(7);
        rakamlar.add(8);
        rakamlar.add(3);
        rakamlar.add(-1);
        rakamlar.add(8);
        rakamlar.add(-1000);

        System.out.print(rakamlar + "\n");
        System.out.println("\n==========tek sayilar===================");
        rakamlar.stream().filter(x -> x % 2 != 0).forEach(x -> System.out.print(x + " "));
        System.out.println("\n==========2 ile bölünebilme===================");
        rakamlar.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.print(x + " "));
        System.out.println("\n============3 ile bölünebilme=================");
        rakamlar.stream().filter(armut -> armut % 3 == 0).forEach(armut -> System.out.print(armut + " "));

        System.out.println("\n============tek Mi ================");
        rakamlar.stream().filter(Lambda01Kurallar::tekMi).forEach(x -> System.out.print(x + " / "));

        System.out.println("\n===============Çift sayilari yazdir==================");
        çiftleriYazdır(rakamlar);
    }

    public static void çiftleriYazdır(List <Integer> liste){
//        liste.stream().filter(x->x%2==0).forEach(x-> System.out.print(x + " "));
        liste.stream().filter(Stream01Integer::çiftMi).forEach(Stream01Integer::yazdır);
    }

    public static boolean tekMi(int x){
        return x % 2 != 0;
    }

    public static boolean çiftMi(int x){
        return x%2==0;
    }

    public static void yazdır(int x){
        System.out.print( x + " ");
    }


}




