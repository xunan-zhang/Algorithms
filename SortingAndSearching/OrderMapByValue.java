//http://www.java2novice.com/java-interview-programs/
package SortingAndSearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OrderMapByValue {

	public static void main(String a[]) {
		Map<String, Integer> map = new HashMap<String, Integer>() {{
			put("java", 20);
			put("C++", 45);
			put("Java2Novice", 2);
			put("Unix", 67);
			put("MAC", 26);
			put("Why this kolavari", 93);
		}};

		OrderMapByValue sort = new OrderMapByValue();
		
		sort.sortMapByValue(map);
	}

	private void sortMapByValue(Map<String, Integer> map) {
		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
	}
}
