public class Scale {
    
    private String[] modifiedScale;
    // This is the main scale pattern used to determine positions of keys played for chords
    private String[] scalePattern = {
        "C", "C#", "D","D#","E","F","F#","G","G#","A","A#","B"
    };

    private String startingKey;

    public Scale(Note startingKey) {
        this.startingKey = startingKey.getNote();
        modifiedScale = generateScale();
    }    

    private String[] generateScale() {
        int keyPosition= 0;
        //Iterates through pattern to find the starting position of the scale
        for (int i  = 0; i < 13; i++) {
            if (scalePattern[i].equals(startingKey)) {
                keyPosition = i;
                break;
            }
        }
        //Should iterate 12 times for a full scale pattern 
        int i = 0; 
        String[] modifiedScale = new String[12];
        while (i != 12) {
            if (keyPosition == 13) keyPosition = 0;

            modifiedScale[i] = scalePattern[keyPosition];

            i++;
            keyPosition++;
        }

        return modifiedScale;
    }

    public String[] getModifiedScale() {
        return modifiedScale;
    }



}