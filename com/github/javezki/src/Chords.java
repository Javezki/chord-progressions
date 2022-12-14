
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

    public int distanceFromFirstAndSecondNote() {
        return (secondNote.getNotePosition() - firstNote.getNotePosition());
    };

    public int distanceFromSecondAndThirdNote() {
        return (thirdNote.getNotePosition() - secondNote.getNotePosition());
    }

    public int distanceFromThirdAndFourthNote() {
        return (fourthNote.getNotePosition() - thirdNote.getNotePosition());
    }



}
