package dodatkowe;

public class MirrorString {




    public String mirroringString (String stringToMirror) {

        char tempChar;
        String mirroredString = "";
        char[] charArray = stringToMirror.toCharArray();

        for(int i = 0; i < charArray.length; i++) {


            mirroredString = mirroredString + charArray[charArray.length-i-1];


        }


      /*  for(int i = 1; i <= stringToMirror.length(); i++) {

          tempChar =  stringToMirror.charAt(stringToMirror.length()-i);

          mirroredString = mirroredString + tempChar;


        }*/

        return mirroredString;

    }


}
