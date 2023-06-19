package dodatkowe;

public class MirrorString {




    public String mirroringString (String stringToMirror) {

        char tempChar;
        String mirroredString = "";



        for(int i = 1; i <= stringToMirror.length(); i++) {

          tempChar =  stringToMirror.charAt(stringToMirror.length()-i);

          mirroredString = mirroredString + tempChar;


        }

        return mirroredString;

    }


}
