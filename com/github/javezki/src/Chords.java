
public class Chords {
    
    private Note firstNote;
    private Note secondNote;
    private Note thirdNote;
    private Note fourthNote;

    private Scale modifiedScale;
    private String[] modifiedScaleStrings;



    public Chords(String[] notes) {

        firstNote = new Note(notes[0]);

        modifiedScale = new Scale(firstNote);
        modifiedScaleStrings = modifiedScale.getModifiedScale();

        firstNote = new Note(notes[0], modifiedScaleStrings);
        secondNote = new Note (notes[1], modifiedScaleStrings);
        thirdNote = new Note(notes[2], modifiedScaleStrings);
        fourthNote = new Note(notes[3], modifiedScaleStrings);
    }

    private int distanceFromFirstAndSecondNote() {
        return (secondNote.getNotePosition() - firstNote.getNotePosition());
    };

    private int distanceFromSecondAndThirdNote() {
        return (thirdNote.getNotePosition() - secondNote.getNotePosition());
    }

    private int distanceFromThirdAndFourthNote() {
        return (fourthNote.getNotePosition() - thirdNote.getNotePosition());
    }

    public Progression getProgression() {
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
