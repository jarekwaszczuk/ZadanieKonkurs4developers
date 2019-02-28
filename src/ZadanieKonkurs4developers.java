import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ZadanieKonkurs4developers {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("dane/test_input.txt");
        Scanner in = new Scanner(file);

        ArrayList<ArrayList<Integer>> data = new ArrayList<>();

        int counter = 0;
        while (in.hasNext()) {

            ArrayList<Integer> list = new ArrayList<>();

            String[] split = in.nextLine().split("x");

            list.add(Integer.parseInt(split[0]));
            list.add(Integer.parseInt(split[1]));
            list.add(Integer.parseInt(split[2]));

            list.sort(Integer::compareTo);
            data.add(list);
            counter++;

//            //diagnostyka wczytanych danych
//            System.out.print(counter+" =>\t");
//            System.out.print(data.get(counter-1).get(0));
//            System.out.print("\t");
//            System.out.print(data.get(counter-1).get(1));
//            System.out.print("\t");
//            System.out.print(data.get(counter-1).get(2));
//            System.out.println();
        }

        System.out.println("Wyliczone pole: " + calculateAreaWithAddition(data) +" dm2");
    }

    public static int calculateAreaWithAddition(ArrayList<ArrayList<Integer>> data) {
        int area = 0;

        for (ArrayList<Integer> list : data) {

//            System.out.println(list.toString());
            int currentArea = 0;
            int dimensionA = Integer.valueOf(list.get(0).toString());
            int dimensionB = Integer.valueOf(list.get(1).toString());
            int dimensionC = Integer.valueOf(list.get(2).toString());

            currentArea = 2 * (dimensionA * dimensionB) +
                    2 * (dimensionB * dimensionC) +
                    2 * (dimensionC * dimensionA) +
                    dimensionA * dimensionB
            ;

            area += currentArea;
        }

        return area;
    }
}
