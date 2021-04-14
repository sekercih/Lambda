package day03_streamOrnekler;

import day02_streamOrnekler.Stream01Integer;

import java.util.*;

public class Stream02Integer {

    public static void main(String[] args) {

        List<Integer> listem = new ArrayList<>();
        listem.add(12);
        listem.add(9);
        listem.add(13);
        listem.add(4);
        listem.add(9);
        listem.add(2);
        listem.add(4);
        listem.add(12);
        listem.add(15);
        System.out.println("=====teklerin karesini yazdır====");
        tekKareYazdir(listem);
        System.out.println("=====teklerin kup yazdır====");
        System.out.println("tekKupToplami(listem) = " + tekKupToplami(listem));
        ;

    }

    public static void tekKareYazdir(List<Integer> l) {
        l.stream().filter(Stream01Integer::tekMi).distinct().map(t -> t * t).forEach(Stream01Integer::yazdır);
    }

    public static Integer tekKupToplami(List<Integer> lis) {
        // return  lis.stream().filter(Stream01Integer::tekMi).map(t->t*t*t).reduce(0,(x,y)->(x+y));
      //  return lis.stream().filter(Stream01Integer::tekMi).map(t -> t * t * t).reduce(Math::addExact);
      //  return lis.stream().filter(Stream01Integer::tekMi).map(t -> t * t * t).reduce(Integer::sum);
        return lis.stream().filter(Stream01Integer::tekMi).map(t -> t * t * t).reduce(0,Integer::sum);

    }

}