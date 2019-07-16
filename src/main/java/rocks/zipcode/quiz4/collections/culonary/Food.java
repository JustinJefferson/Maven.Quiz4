package rocks.zipcode.quiz4.collections.culonary;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    List<Spice> spices;

    public Food() {
        spices = new LinkedList<>();
    }

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {

//        Map<, Integer> map = new LinkedHashMap<>();
//
//        for(Spice spice : spices) {
//            if(map.containsKey(spice)
//        }
        return null;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
