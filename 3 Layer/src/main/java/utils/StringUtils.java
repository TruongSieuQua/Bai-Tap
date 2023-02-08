package utils;

import java.util.Map;

public class StringUtils {
	
	public final static boolean isNullOrEmpty(String value) {
		if(value==null || value.isBlank()) {
			return false;
		}
		return true;
	}
	
	public final static String convertBuildingType(String buildingType) {
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<String, String> entry : Constant.BUILDING_TYPES.entrySet()) {
			String type = buildingType.contains(entry.getKey()) ? entry.getValue() + ", " : "";
			sb.append(type);
		}
		return sb.toString();
	}
}
