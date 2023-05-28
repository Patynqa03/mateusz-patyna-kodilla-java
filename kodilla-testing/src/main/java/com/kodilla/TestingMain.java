package com.kodilla.testing;

        import com.kodilla.testing.user.SimpleUser;
        import com.kodilla.testing.calculator.BasicCalculator;
public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test 0.1 OK");
        } else {
            System.out.println("test 0.1:Error!");
        }

        BasicCalculator basicCalculator = new BasicCalculator(5,10);

        if(basicCalculator.addAtoB() == 15 && basicCalculator.subAfromB() == 5) {
            System.out.println("test 0.2 OK");

        } else {

            System.out.println("test 0.2:Error!");

        }

    }
}
