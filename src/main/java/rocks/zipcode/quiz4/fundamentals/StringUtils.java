package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {

        char[] chars = str.toCharArray();
        chars[str.length()/2] = Character.toUpperCase(chars[str.length()/2]);
        return String.valueOf(chars);
    }

    public static String lowerCaseMiddleCharacter(String str) {

        char[] chars = str.toCharArray();
        chars[str.length()/2] = Character.toLowerCase(chars[str.length()/2]);
        return String.valueOf(chars);
    }

    public static Boolean isIsogram(String str) {

        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i ++) {
            int count = 0;
            char check = chars[i];
            for(char other : chars) {
                if(check == other) count++;
            }
            if(count > 1) return false;
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {

        for(int i = 0; i < str.length() - 1; i++) {
            Character value1 = str.charAt(i);
            Character value2 = str.charAt(i + 1);
            if(value1.equals(value2)) return true;
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {

        char[] chars = str.toCharArray();
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < chars.length; i++) {

            Character check = chars[i];

            Boolean duplicate = false;
            if(i - 1 >= 0 && check.equals(chars[i-1])) duplicate = true;
            if(i + 1 < chars.length && check.equals(chars[i+1])) duplicate = true;

            if(!duplicate) builder.append(check);
        }

        return builder.toString();
    }

    public static String invertCasing(String str) {

        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
            else {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        return String.valueOf(chars);
    }
}