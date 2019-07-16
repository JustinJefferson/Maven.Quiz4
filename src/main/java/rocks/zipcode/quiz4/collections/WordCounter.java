package rocks.zipcode.quiz4.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class WordCounter {
    Map<String, Integer> map;

    public WordCounter(String... strings) {

        map = new LinkedHashMap<>();

        for(String string: strings) {
            if(map.containsKey(string)) {
                map.replace(string, map.get(string) + 1);
            }
            else {
                map.put(string, 1);
            }
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return map;
    }
}
