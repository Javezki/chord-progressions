public class Scale {
    
    private String[] modifiedScale;
    // This is the main scale pattern used to determine positions of keys played for chords
    private static String[] scalePattern = {
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
        for (int i  = 0; i < 12; i++) {
            if (scalePattern[i].equals(startingKey)) {
                keyPosition = i;
                break;
            }
        }
        //Should iterate 11 times for a full scale pattern 
        int i = 0; 
        String[] modifiedScale = new String[12];
        while (i != 12) {
            if (keyPosition == 12) keyPosition = 0;

            modifiedScale[i] = scalePattern[keyPosition];


            i++;
            keyPosition++;

        }

        return modifiedScale;
    }

    /**
     * The modified scale with the first note at 0 of the string array
     * @return The Modified Scale
     */
    public String[] getModifiedScale() {
        return modifiedScale;
    }

    /**
     * This is the default scale pattern that goes from C to B 
     * @return The Default Scale 
     */
    public static String[] defaultScale() {
        return scalePattern;
    }




}
