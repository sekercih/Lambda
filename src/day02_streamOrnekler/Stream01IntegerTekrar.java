package day02_streamOrnekler;

import java.util.ArrayList;
import java.util.List;

public class Stream01IntegerTekrar {
    public static void main(String[] args) {
        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(5);
        rakamlar.add(11);
        rakamlar.add(6);
        rakamlar.add(7);
        rakamlar.add(7);
        rakamlar.add(8);
        rakamlar.add(12);
        rakamlar.add(-15);
        rakamlar.add(1000);

        rakamlar.forEach(t -> System.out.print(t + " "));
        System.out.println();
        rakamlar.stream().filter(t -> t % 2 != 0).forEach(t -> System.out.print(t + " "));
        System.out.println();
        rakamlar.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }
}
