import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        long res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                res = res + arr[i];
            }
        }
        return res;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        int j = arr.length;
        for (int i = 0; i < arr.length; i++) {
            arr2[j-1] = arr[i];
            j = j - 1;
        }
        return arr2;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        int rows1 = m1.length;
        int cols1 = m1[0].length;
        int rows2 = m2.length;
        int cols2 = m2[0].length;

        double[][] res = new double[m1.length][m2.length];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    res[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
       return res;
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {

        return null;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        List<Integer> facts = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (!facts.contains(i)){
                    facts.add(i);
                }
                n = n / i;
            }
        }
        return facts;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        line = line.replaceAll("[^a-zA-Z0-9]", " ");
        List<String> words = new ArrayList<>();
        for (String val: line.split(" ")){
            words.add(val);
        }
        return words;
    }
}
