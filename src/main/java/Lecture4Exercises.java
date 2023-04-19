
public class Lecture4Exercises {

    public long factorial(int n) {
        int x = 1;
        for (int i = 2; i <= n; i++) {
            x = x * i;
        }
        return x;
    }

    public long fibonacci(int n) {
        long result = 0;
        if (n <= 2) {
            result = 1;
        } else {
            result = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return result;
    }

    public String reverse(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result = result + word.charAt(i);
        }
        return result;
    }


    public boolean isPalindrome(String line) {
        line = line.toLowerCase();
        String reversed = "";
        String newLine = "";
        for (int i = 0; i < line.length(); i++) {
            if(!Character.isWhitespace(line.charAt(i))) {
                newLine = newLine + line.charAt(i);
            }
        }
        for (int i = line.length() - 1; i >= 0; i--) {
            if(!Character.isWhitespace(line.charAt(i))) {
                reversed = reversed + line.charAt(i);
            }
        }
        if (newLine.equals(reversed)) {
            return true;
        }
        return false;
    }

    public char[][] dotPlot(String str1, String str2) {
        char[][] chars = new char[str1.length()][str2.length()];
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)){
                    chars[i][j] = '*';
                } else {
                    chars[i][j] = ' ';
                }
            }
        }
        return chars;
    }
}
