package day05_streamString;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stream05String {
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

        aIleBaslayanlar(liste);
        System.out.println("===========");
        buyukHarfeCevir(liste);
        System.out.println("===========");
        uzunlugaGoreYazdir(liste,3);
        System.out.println("TÜM ELEMANLAR BELİRTİLEN DEĞERDEN KÜÇÜK:" + uzunlukKucukMu(liste,7));
        System.out.println("BAŞLAYAN YOK MU:"+ baslamayanHarfVarMi(liste,"M"));
        System.out.println("HERHANGİ BİTEN HARF VAR MI:" + herhangiBitenVarMi(liste,"c"));
        herhangiBirharflebaslayaveBitenVarMi(liste,"C","t");
        elemanUzunlu(liste);
    }

    //********************************************************************************************
    // ORNEK16: Listedeki baş harfi A ile başlayan isimleri yazdıran metodu tanımlayalım..
    //********************************************************************************************
    public static void aIleBaslayanlar(List<String> liste){
        liste.stream().filter(h-> h.startsWith("A")).forEach(System.out::println);
    }

    //********************************************************************************************
    // ORNEK17: Listedeki tüm isimleri büyük harfe çeviren metodu tanımlayalım..
    //********************************************************************************************
    public static void buyukHarfeCevir(List<String> liste){
        liste.stream().map(String::toLowerCase).forEach(System.out::println);
    }

    //********************************************************************************************
    // ORNEK18: Listedeki tüm elemanların uzunlukları belirtilen uzunluktan fazla ise bunları yazdıran
    // metodu tanımlayalım..
    //********************************************************************************************
    public static void uzunlugaGoreYazdir (List <String> liste, int uzunluk){
        liste.stream().filter(t->t.length() > uzunluk).forEach(System.out::println);
    }

    //*****************************************************************************************
    // ÖRNEK20: Listedeki TÜM elemanların uzunlukları belirtilen uzunluktan KÜÇÜK mü
    // diye kontrol eden metodu yazınız.
    //*****************************************************************************************
    //ALLMATCH() Belirtilen şartları tüm elemanlar sağlıyorsa true döndürür. yoksa false
    public static boolean uzunlukKucukMu(List <String> liste,int uzunluk ){
        return liste.stream().allMatch(t->t.length() < uzunluk);
    }
    //****************************************************************************************************
    // ÖRNEK21: Listedeki TÜM elemanların belirtilen harfi ile başlamadığını kontrol eden metodu yazınız.
    //****************************************************************************************************
    //NONEMATCH() Belirtilen sartları tüm elemanlar sağlamıyorsa true döndürür. yoksa false
    public static boolean baslamayanHarfVarMi(List <String> liste, String harf){
        return liste.stream().noneMatch(t->t.startsWith(harf));
    }

    //****************************************************************************************************
    // ÖRNEK22: Listede Herhangi bir elaman belirtilen bir harf ile bitiyor mu diye kontrol eden metodu yazınız.
    //****************************************************************************************************
    public static boolean herhangiBitenVarMi(List <String> liste, String harf){
        return liste.stream().anyMatch(t->t.endsWith(harf));
    }
    //****************************************************************************************************
    public static void herhangiBirharflebaslayaveBitenVarMi(List <String> liste, String harf,String bitenharf){
         liste.stream().filter(t->t.startsWith(harf)&&t.endsWith(bitenharf)).forEach(System.out::println);
    }
    public static void elemanUzunlu(List <String> liste) {
        liste.stream().sorted(Comparator.comparing(String::length)).forEach(t ->
                System.out.print(t + " : " + t.length() + " "));










}}