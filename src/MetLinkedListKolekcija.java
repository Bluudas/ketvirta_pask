import java.util.LinkedList;
import java.util.Scanner;

public class MetLinkedListKolekcija {

    public static void main(String[] args) {

        MetLinkedListKolekcija a = new MetLinkedListKolekcija();

        LinkedList<String> vardai = a.Vardai();

        vardai.addFirst("Naujokas");
        vardai.addLast("Seniokas");

        System.out.println(vardai);
    }

    private  LinkedList Vardai(){

        LinkedList<String> vardai = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        for (int i=0; i <5; i++){

            System.out.println("Iveskite varda!");
            vardai.add(sc.next());
        }

        return vardai;
    }
}
