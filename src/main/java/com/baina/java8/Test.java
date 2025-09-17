package com.baina.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		List<Employee> employees = EmployeeData.getEmployees();
		
		Map<Double, List<String>> empBySal = employees.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.mapping(Employee::getFirstName, Collectors.toList())));
	

		System.out.println(empBySal);
		
		Entry<Double, List<String>> entry = empBySal.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(2);
	
		System.out.println(entry.getKey()+""+entry.getValue());
		
		
		System.out.println("----------------------------------------");
		//in test comment added
		
		List<String> namesList = List.of("naresh","rajesh123","naresh12345","sukesh123456789");
		
		System.out.println(namesList.stream().reduce((s1,s2)->s1.length()>s2.length()?s1:s2));
		
		System.out.println(namesList.stream().max((s1,s2)->Integer.compare(s2.length(), s1.length())));
		
		System.out.println("-------------------------------------------------------------------");

		Map<String, DoubleSummaryStatistics> stats = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summarizingDouble(Employee::getSalary)));
		
		for(Entry<String,DoubleSummaryStatistics> entry1:stats.entrySet()) {
		
			System.out.println(entry1.getKey()+"------->"+entry1.getValue());
		}
		
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println(namesList);
		List<StringBuilder> reverseNames = namesList.stream().map(str->new StringBuilder(str).reverse()).collect(Collectors.toList());
		System.out.println(reverseNames);
		
		System.out.println("----------------------------------------------------------------------");
		
		Stream<Employee> sorted = employees.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary)).thenComparing(Employee::getFirstName));
	sorted.forEach(emp->System.out.println(emp.getSalary()+"-------"+emp.getFirstName()));
	
	System.out.println("---------------------------------------------------------------------------");
	
	Map<String, DoubleSummaryStatistics> stats3 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summarizingDouble(Employee::getSalary)));
	
	for(Entry<String,DoubleSummaryStatistics> e:stats3.entrySet()) {
		System.out.println(e.getKey()+"_______"+e.getValue().getAverage());
	}
	System.out.println("-------------------------------");
	Entry<String, DoubleSummaryStatistics> entry2 = stats3.entrySet().stream().sorted((e1,e2)->Double.compare(e2.getValue().getAverage(), e1.getValue().getAverage())).collect(Collectors.toList()).get(2);
	System.out.println(entry2.getKey()+"____________"+entry2.getValue().getAverage());
	
	System.out.println("----------------------------------");
	
	String str="@1&%$2@18";
	/* int sum = */str.chars().filter(c->Character.isDigit(c)).map(c->c-'0').forEach(System.out::println);
	/* System.out.println("sum of digits :1,2,8 is "+ sum); */
	
	Pattern p=Pattern.compile("\\d+");
	Matcher m = p.matcher(str);
	  int sum = 0;
      while (m.find()) {
          sum += Integer.parseInt(m.group()); // convert matched number to int
      }

      System.out.println("Sum = " + sum);
	}
	
	
	
}
