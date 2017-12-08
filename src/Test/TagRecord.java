package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TagRecord {
	private Map<String, Integer> record;
	
	TagRecord() {
		this.record = new HashMap<String, Integer>();
	}
	
	public void record(Token tagName) {
		String name = tagName.toString().toLowerCase();
		record.put(name, record.getOrDefault(name, 0) + 1);
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("");
		
		for(Entry<String, Integer> entry : record.entrySet()) {
		    String key = entry.getKey();
		    Integer value = entry.getValue();
			
		    sb.append("<").append(key).append("> ").append(value).append("\n");
		}
		
		return sb.toString();
	}
}
