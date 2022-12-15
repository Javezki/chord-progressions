import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the amount of test cases you need");
        int testCases = sc.nextInt();
        sc.nextLine();

        ArrayList<String> results = new ArrayList<>();


        //Get Chord Progressions
        for (int i = 0; i < testCases; i++) {
            System.out.println("Chord: ");
            String str = sc.nextLine();
            //Split the string into regex 
            String[] splitStr = str.split("\\s+");

            Chords chord = new Chords(splitStr);

            results.add(chord.getDomProgression().name());
        };

        //Print results
        for (String str : results) {
            System.out.println(str);
        }
        sc.close();
    }
}
