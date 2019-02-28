import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ZadanieKonkurs4developers {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("dane/test_input.txt");
        Scanner in = new Scanner(file);

        ArrayList[] data= new ArrayList[1000];

        int counter = 0;
        while (in.hasNext()) {

            ArrayList<Integer> list = new ArrayList<>();

            String[] split = in.nextLine().split("x");

            list.add(Integer.parseInt(split[0]));
            list.add(Integer.parseInt(split[1]));
            list.add(Integer.parseInt(split[2]));

            list.sort(Integer::compareTo);
            data[counter] = list;
            counter++;

//            //diagnostyka wczytanych danych
//            System.out.print(counter+" =>\t");
//            System.out.print(data[counter-1].get(0));
//            System.out.print("\t");
//            System.out.print(data[counter-1].get(1));
//            System.out.print("\t");
//            System.out.print(data[counter-1].get(2));
//            System.out.println();



        }

    }
}
