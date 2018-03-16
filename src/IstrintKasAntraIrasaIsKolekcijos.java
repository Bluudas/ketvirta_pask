import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IstrintKasAntraIrasaIsKolekcijos {

    public static void main(String[] args) {

        List<String> kazkas = new ArrayList<>();

        kazkas.add("ass");
        kazkas.add("dwqdq");
        kazkas.add("qweqwe");
        kazkas.add("qweqwe");
        kazkas.add("q");
        kazkas.add("qww");
        kazkas.add("nnnn");
        kazkas.add("mmmmmmmmmmmmm");
        kazkas.add("mmmmmmmmmmmmmmmmmmm");
        kazkas.add("mm");

        //kazkas.remove(4); istrina is kolekcijos palei indeksa

        //iteratorius klase dazniausiai naudojama kai ismetineti irasus ciklo metu
        //ciklo viduj reik konvertuoti i iteratoriu ir td galima ismetineti ciklo metu

        Iterator<String> iterator = kazkas.iterator();

        int i =1;

        while (iterator.hasNext()){

            iterator.next(); //kad paimti sekanti irasa

            if (i%2 == 0){
                iterator.remove();
            }
            i++;
        }

        System.out.println(kazkas);
    }
}
