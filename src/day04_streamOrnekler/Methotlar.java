package day04_streamOrnekler;

import day02_streamOrnekler.Stream01Integer;

import java.util.List;

public class Methotlar {

    public static void çiftleriYazdır(List<Integer> liste){
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
