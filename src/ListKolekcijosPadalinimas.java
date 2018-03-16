import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListKolekcijosPadalinimas {

    public static void main(String[] args) {

        List<String> vardai = Vardai();

        List<String> vardaiPuse = vardai.subList(0, vardai.size()/2);
        List<String> vardaiAntraPuse = vardai.subList(vardai.size()/2, vardai.size());

        System.out.println("\n Pirmasis sarasas");
        System.out.println(vardaiPuse);
        System.out.println("\n Antrasis sarasas");
        System.out.println(vardaiAntraPuse);

    }

    private static List Vardai(){

        List<String> vardai = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        for (int i=0; i <10; i++){

            System.out.println("Iveskite "+(i+1)+"-a "+"varda!");
            vardai.add(sc.next());
        }

        return vardai;
    }
}
