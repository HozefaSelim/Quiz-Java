package finalodevi;
// soruler dosyaden getitilir ve arraylist içinde saklanır .
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class soru {

    public static ArrayList<String> sorular;
    File f = new File("sorular.txt");
    Scanner scan;

    public soru() throws FileNotFoundException {
        scan = new Scanner(f);
        sorular = new ArrayList<String>();

        while (scan.hasNext()) {
            sorular.add(scan.nextLine());
        }
        scan.close();

    }
}
