import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Uzdavinys1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Andrius");
        names.add("Anduinas");
        names.add("Zanas");
        names.add("Gintaras");
        names.add("Virgis");
        names.add("Andrius");

        Collections.sort(names); //surikiavimas pagal alfabeta

        for (String name : names){

            if (name.length() >=6){

                System.out.println(name);
            }else{

                System.out.println("Vardas per trumpas");
            }
        }

        System.out.println("pirmas vardas ->" +getFirstElement(names));
        System.out.println("paskutinis vardas ->" +getLastElement(names));

    }


    //pirmas elementas is listo
    private static String getFirstElement(List<String> names){

        String firstName = names.get(0);
        return  firstName;

    }

    private static String getLastElement(List<String> names){

        String lastName = names.get(names.size()-1); //paima paskutini elem
        return lastName;
    }

}
