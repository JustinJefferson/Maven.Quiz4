package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length / 2];
    }

    public static String[] removeMiddleElement(String[] values) {

        String[] result = new String[values.length - 1];
        int index = 0;
        for(int i = 0; i < values.length; i++) {
            if(i != values.length / 2) {
                result[index] = values[i];
                index++;
            }
        }
        return result;
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        List<String> list = new LinkedList<>(Arrays.asList(values));
        list.remove(list.size() - 1);
        return list.toArray(new String[0]);
    }
}