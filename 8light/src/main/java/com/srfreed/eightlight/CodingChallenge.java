package com.srfreed.eightlight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CodingChallenge {

	public static String filterNonNumericVals(String input){		
		StringBuilder retval = new StringBuilder();

		Arrays.asList(input.split("(?!^)")).forEach(c -> {
			if(isNumeric(c)) {
				retval.append(c);	
			}
		});
		
		return retval.toString();		
	}
	
	
	public static <T> T[] removeDuplicatesFromArray(T[] input) {
		List<T> retval = Arrays.asList(input).stream().distinct().collect(Collectors.toList());
		
		return genericListToArray(retval);
	}
	
	public static String[] getSpecialties(String[] input) {
		Map<String, String> specialties = Map.of("1381", "front-end web development", "8235", "data engineering", "3434", "API design","7623", "security","9153", "UX");
		
		List<String> cleaned = Arrays.asList(input).stream().map(id -> filterNonNumericVals(id)).collect(Collectors.toList());
		
		String[] deduped = removeDuplicatesFromArray(genericListToArray(cleaned));
		
		List<String> retval = new ArrayList<>();
		
		Arrays.asList(deduped).stream().forEach(id -> retval.add(specialties.get(id)));
		
		return genericListToArray(retval);	
	}
	
	
	
	
	private static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    
	    try {
	        int d = Integer.parseInt(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    
	    return true;
	}
	
	public static <T> T[] genericListToArray(List<T> list) {
	    @SuppressWarnings("unchecked")
		T[] toR = (T[]) java.lang.reflect.Array.newInstance(list.get(0).getClass(), list.size());
	    for (int i = 0; i < list.size(); i++) {
	        toR[i] = list.get(i);
	    }
	    return toR;
	}
}
