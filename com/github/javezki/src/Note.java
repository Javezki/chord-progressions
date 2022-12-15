import java.security.InvalidParameterException;

public class Note {

    private String noteCharacter;

    private String[] scale;

    private int notePosition = 0;

    /**
     * 
     * @param noteValue A valid music note that is not a flat
     * This constructor is used to create modified scales for future manipulation
     */
    public Note(String noteValue) {
         this.noteCharacter = noteValue;

    }

    /**
     * 
     * @param noteValue A valid music note that is not a flat
     * @param scale The modified scale that has the root at 0 of the array
     */
    public Note(String noteValue, String[] scale){
        this.noteCharacter = noteValue;
        this.scale = scale;
        this.notePosition = notePosition();
    }

    
    /**
     * 
     * @return Get the string value of the musical note
     */
    public String getNote() {
        return noteCharacter;
    }

    /**
     * 
     * @return Find the note position within the modified scale
     */
    private int notePosition() {
        for (int i = 0; i < 12; i++) {
            if (noteCharacter.equals(scale[i])) return i;
        }

        throw new InvalidParameterException("The note is not a real note!");
    }

    /**
     * 
     * @return return the int value of the position of the note
     */
    public int getNotePosition() {
        return notePosition;
    }



}
