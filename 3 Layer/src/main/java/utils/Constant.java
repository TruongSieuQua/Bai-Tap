package utils;

import java.util.HashMap;
import java.util.Map;

public class Constant {
	public static Map<String, String> BUILDING_TYPES = new HashMap<>();
	
	static {
		BUILDING_TYPES.put("tang-tret", "tầng trệt");
		BUILDING_TYPES.put("nguyen-can", "nguyên căn");
		BUILDING_TYPES.put("noi-that", "nội thất");
	}
	
}
