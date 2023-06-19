package dodatkowe;

public class Potegu{


    public int potegowanie (int podstawa, int potega) {
        int result = podstawa;
        if(podstawa == 0){
            result = 0;
        } else if(potega == 0){

            result = 1;

        }else {

            for (int i = 1; i < potega; i++) {

                result = result * podstawa;
            }



        }
        return result;
    }

}
