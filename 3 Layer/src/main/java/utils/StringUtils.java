package utils;

public class StringUtils {
	
	public final static boolean isNullOrEmpty(String value) {
		if(value==null || value.isBlank()) {
			return false;
		}
		return true;
	}
}
