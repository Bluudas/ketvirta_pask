import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadNamesFromFile {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        try (BufferedReader skaitymas = new BufferedReader(new FileReader("vardai.txt"))){

            String line;
            while ((line = skaitymas.readLine()) != null){

                names.add(line);
            }

        } catch(IOException e){  //veikia kaip else. eroro tipas ir name. jei nerastu failo isprintintu sita erora

            e.printStackTrace();
        }

        System.out.println(names);
    }
}
