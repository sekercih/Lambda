package day05_streamString;

import day04_streamOrnekler.Methotlar;

import java.util.stream.IntStream;

public class Strream05Digerleri {
    public static void main(String[] args) {
        System.out.println("topla(5) = " + topla(5));
        System.out.println("topla(5) = " + topla1(5));
        System.out.println("teksayilarTopla1 ="+teksayilarTopla1(1,7));
    }
    public static int topla(int deger){
        return IntStream.range(1,deger+1).sum();
    }
    public static int topla1(int deger){
        return IntStream.rangeClosed(1,deger).sum();

    }
    public static int teksayilarTopla1(int altdeger,int üstdeger){
      return   IntStream.rangeClosed(altdeger,üstdeger).filter(Methotlar::tekMi).sum();

    }
}
