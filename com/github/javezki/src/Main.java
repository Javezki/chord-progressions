

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String[] notes = {"G", "B", "D", "F"};

        Chords chord = new Chords(notes);

        System.out.println("The distance from first note and second note: " + chord.distanceFromFirstAndSecondNote());
        System.out.println("The distance from second and third note: " + chord.distanceFromSecondAndThirdNote());
        System.out.println("The distance from third and fourth note: " + chord.distanceFromThirdAndFourthNote());

        
    }
}
