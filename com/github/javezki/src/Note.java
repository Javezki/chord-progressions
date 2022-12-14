import java.security.InvalidParameterException;

public class Note {

    private String noteCharacter;

    private String[] scale;

    private int notePosition = 0;

    public Note(String noteValue) {
         this.noteCharacter = noteValue;

    }

    public Note(String noteValue, String[] scale){
        this.noteCharacter = noteValue;
        this.scale = scale;
        this.notePosition = notePosition();
    }


    public String getNote() {
        return noteCharacter;
    }

    private int notePosition() {
        for (int i = 0; i < 12; i++) {
            if (noteCharacter.equals(scale[i])) return i;
        }

        throw new InvalidParameterException("The note is not a real note!");
    }

    public int getNotePosition() {
        return notePosition;
    }



}
