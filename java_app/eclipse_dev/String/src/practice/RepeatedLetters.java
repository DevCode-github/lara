package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepeatedLetters {
	public static void main(String[] args) {
		String name = "divyanshu kumar";
		String name1[] = name.split("");
		Map<String, Long> result = Stream.of(name1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Set<String> a = new HashSet<>();
		Map<String , String> b = new HashMap<>();		
	}
}
