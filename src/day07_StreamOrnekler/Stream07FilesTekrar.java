package day07_StreamOrnekler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Stream07FilesTekrar {
    public static void main(String[] args) throws IOException {
        String path="src/day07_StreamOrnekler/marstekrar.txt";
        Stream<String> satirlar = Files.lines(Paths.get("src/day07_StreamOrnekler/marstekrar.txt"));
       satirlar.forEach(System.out::println);

        System.out.println("==============");
       Files.lines(Paths.get(path)).map(t->t.toUpperCase()).forEach(System.out::println);
        System.out.println("==============");
       Files.lines(Path.of(path)).limit(5).map(t->t.toUpperCase()).forEach(System.out::println);
        System.out.println("==============");
        Files.lines(Path.of(path)).skip(2).limit(2).map(r->r.toUpperCase()).forEach(System.out::println);
        System.out.println("==============");
        long say=Files.lines(Path.of(path)).map(r->r.toUpperCase()).filter(t->t.contains("O")).count();
        System.out.printf("say ="+ say);
        System.out.println("==============");

        Files.lines(Path.of(path)).map(t->t.toUpperCase().split(" ")).
                flatMap(Arrays::stream).distinct()
                .forEach(System.out::println);
        System.out.println("==============");
        long kelimeSay=Files.lines(Path.of(path)).map(t->t.toUpperCase().split(" ")).
                flatMap(Arrays::stream).distinct().count();
        System.out.println("kelimeSay = " + kelimeSay);

        //kelimeler içerisinde m harfi var mı
        long mHarfiSayisi=Files.lines(Path.of(path)).map(t->t.toLowerCase().split("")).
                flatMap(Arrays::stream).filter(t->t.equalsIgnoreCase("m")).count();
        System.out.println("mHarfiSayisi = " + mHarfiSayisi);

        //boşluk ve noktalama işaretleri hariç dosyada kaç adet karakter var
        System.out.println("==========================");
       long kacAdetHarfVar= Files.lines(Path.of(path)).
                map(t->t.replace("_","").replaceAll("\\W","").split("")).
                flatMap(Arrays::stream).count();
        System.out.println("kacAdetHarfVar = " + kacAdetHarfVar);


    }
}
