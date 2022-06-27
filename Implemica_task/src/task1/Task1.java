package task1;

public class Task1 {
    public static boolean checkString(String str) { //create method for check
        int CHECK_SYMBOL = 0; //create variable-counter for check
        for (int i = 0; i < str.length(); i++) {
            if (CHECK_SYMBOL < 0){
                return false;
            }
            String str1 = str.substring(i, i + 1);
            if (str1.equals("(")) {
                CHECK_SYMBOL++;
            } else {
                CHECK_SYMBOL--;
            }
            if (CHECK_SYMBOL < 0){
                return false;
            }
        }
        return CHECK_SYMBOL == 0;
    }
}
