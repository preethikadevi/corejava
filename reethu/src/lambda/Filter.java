package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		List<String> strList=Arrays.asList("sde","","def","","");
		long count=strList.stream().filter(x-> x.isEmpty()).count();
		long count1=strList.stream().filter(x-> x.length ()> 3).count();
		
		System.out.println("count:"+count);
		System.out.println("count:"+count1);
		
	
	List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
	 List<Integer> distinct = numbers.stream() .map( i -> i*i) .distinct().collect(Collectors.toList());
	 System.out.println("distinct:"+distinct);
	}

}
