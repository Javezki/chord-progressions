
public class Chords {
    
    private Note firstNote;
    private Note secondNote;
    private Note thirdNote;
    private Note fourthNote;

    private Scale modifiedScale;
    private String[] modifiedScaleStrings;


    /**
     * This constructor first takes the first note to create a modified scale 
     * then sets the actual to a valid point
     * @param notes A string array containing 4 notes
     * 
     */
    public Chords(String[] notes) {

        firstNote = new Note(notes[0]);

        modifiedScale = new Scale(firstNote);
        modifiedScaleStrings = modifiedScale.getModifiedScale();

        firstNote = new Note(notes[0], modifiedScaleStrings);
        secondNote = new Note (notes[1], modifiedScaleStrings);
        thirdNote = new Note(notes[2], modifiedScaleStrings);
        fourthNote = new Note(notes[3], modifiedScaleStrings);
    }

    /**
     * 
     * @return The distance from the first and second note in semitones
     */
    private int distanceFromFirstAndSecondNote() {
        return (secondNote.getNotePosition() - firstNote.getNotePosition());
    };
    /**
     * 
     * @return The distance from the second and third note in semitones
     */
    private int distanceFromSecondAndThirdNote() {
        return (thirdNote.getNotePosition() - secondNote.getNotePosition());
    }

    /**
     * 
     * @return The distance from the third and fourth note in semitones
     */
    private int distanceFromThirdAndFourthNote() {
        return (fourthNote.getNotePosition() - thirdNote.getNotePosition());
    }

    /**
     * Gets the difference in semitones between the 4 notes and checks the distance 
     * for the inversion type
     * @return The progression of the dom seventh
     */
    public Progression getDomProgression() {
        int firstDifference = distanceFromFirstAndSecondNote();
        int secondDifference = distanceFromSecondAndThirdNote();
        int thirdDifference = distanceFromThirdAndFourthNote();

        if (firstDifference == 4 && secondDifference == 3 && thirdDifference == 3) return Progression.ROOT;
        if (firstDifference == 3 && secondDifference == 3 && thirdDifference == 2) return Progression.FIRST;
        if (firstDifference == 3 && secondDifference == 2 && thirdDifference == 4) return Progression.SECOND;
        if (firstDifference == 2 && secondDifference == 4 && thirdDifference == 3) return Progression.THIRD;

        return Progression.INVALID;
    }



}
