package day04_streamOrnekler;

import java.util.*;

public class Stream04String {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Jackson");
        liste.add("Amanda");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Christ");
        aHarfineGoreYazdir(liste);
        buyukHarfeCevir(liste);

    }
    public static void aHarfineGoreYazdir(List<String>list){
         list.stream().filter(x->x.startsWith("A")).forEach(System.out::println);

    }
    public static void buyukHarfeCevir(List<String>list){
        list.stream().map(h->h.toUpperCase()).forEach(System.out::println);

}}
