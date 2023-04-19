import java.util.Random;

public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        final String chars = "abcdefghijklmnopqrstuvwxyz";

        Random random = new Random();
        StringBuilder pass = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(chars.length());
            pass.append(chars.charAt(randomIndex));
        }
        return pass.toString();
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public String strongPassword(int length) throws Exception { //***********

        final String specialChars = "!@#$%^&*()_-+=[]{}:;,.?<>";
        final String nums = "0123456789";
        final String allChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=[]{}:;,.?<>";

        Random random = new Random();
        StringBuilder pass = new StringBuilder();
        pass.append(nums.charAt(random.nextInt(nums.length())));
        pass.append(specialChars.charAt(random.nextInt(specialChars.length())));

        for (int i = 2; i < length; i++) {
            int randomIndex = random.nextInt(allChars.length());
            pass.append(allChars.charAt(randomIndex));
        }
        return pass.toString();
    }

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */
    public boolean isFiboBin(int n) {//**********************

        return false;
    }
}
