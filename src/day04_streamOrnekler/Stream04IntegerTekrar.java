package day04_streamOrnekler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;

public class Stream04IntegerTekrar {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(12);
        liste.add(9);
        liste.add(13);
        liste.add(4);
        liste.add(9);
        liste.add(2);
        liste.add(4);
        liste.add(12);
        liste.add(-1);
        liste.add(15);
        liste.add(500);
        liste.add(-15);
        System.out.println("enbuyukSayi = " + enbuyukSayi(liste));
        System.out.println("buyukBul = " + buyukBul(liste));
        System.out.println("enbuyuk sayi = " + liste.stream().reduce(0,(x,y)->x>y?x:y));

        System.out.println("buyukBul 1 = " + buyukBul1(liste));
        System.out.println("KuyukBul 1 = " + kuyukBul1(liste));
        System.out.println("carpimiBul 1 = " + CarpimiBul1(liste));
        System.out.println("dokuzBul  = " + besyuzBul(liste));

        System.out.println("negatifListe  = " + negatifListe(liste));
        System.out.println("tekElemanTekrarsizKaresi  = " + tekElemanTekrarsizKaresi(liste));


    }
    public static int enbuyukSayi(List<Integer>list){
        return list.stream().reduce(1,(x,y)->x>y?x:y);

    }
    public static int buyukBul(List<Integer>list){

        return list.stream().reduce(0,Math::max);
    }
    public static int buyukBul1(List<Integer>list){

        return list.stream().sorted().reduce(0,(x,y)->y);    }

    public static int kuyukBul1(List<Integer>list){

        return list.stream().sorted().reduce(0,(x,y)->x<y?x:y);    }

    public static int CarpimiBul1(List<Integer>list){

        return list.stream().reduce(1,(x,y)->x*y);    }

    public static int besyuzBul(List<Integer>list){

        return (int) list.stream().filter(x->x==500).count();    }

    public static int dokuzBul(List<Integer>list){

        return (int) list.stream().filter(x->x==9).reduce(0,(x,y)->x==9?++x:y);    }

    public static List<Integer> negatifListe(List<Integer>list){

        return  list.stream().filter(x->x<0).collect(Collectors.toList());}

        public static List<Double> tekElemanTekrarsizKaresi(List<Integer>list){

            return list.stream().distinct().
                    filter(Methotlar::tekMi).map(x->Math.pow(x,2)).collect(Collectors.toList());
    }
}
