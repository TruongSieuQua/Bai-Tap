package utils;

public class StringUtils {
	
	public final static boolean isNullOrEmpty(String value) {
		if(value==null || value == "") {
			return false;
		}
		return true;
	}
}
