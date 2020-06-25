package chapterExercises;
//import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LambdaAndStreamTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void sumIntegers() {
		int sum = IntStream.rangeClosed(1, 10).sum();
		
		assertEquals(55, sum);
	}
	
	@Test
	void sumWithMapping() {
//		int sum = IntStream.rangeClosed(1, 10).map((int x) -> {return x * 2;}).sum();
		int sum = IntStream.rangeClosed(1, 10).map((x) ->  x * 2).sum();
//		int sum = IntStream.rangeClosed(1,  10).filter(x -> x % 2 == 0).map((x) -> {return x * 3;}).sum());
		
		assertEquals(110, sum);
	}
	
	@Test
	void summaryStatistics() {
		IntSummaryStatistics stats = IntStream.rangeClosed(1,  10).map((int x) -> {return x * 2;}).summaryStatistics();
		assertEquals(110, stats.getSum());
		assertEquals(11.0, stats.getAverage());
		assertEquals(2, stats.getMin());
		assertEquals(20, stats.getMax());
	}
	
	@Test
	void streamIntegers() {
		Integer[] values = { 2, 9, 5, 0, 3, 7, 1, 4, 8, 6 };
		
		System.out.printf("Sorted values are: %s%n", Arrays.stream(values)
														   .sorted()
														   .collect(Collectors.toList()));
		
	}
	
	void filterIntegers() {
		Integer[] values = { 2, 9, 5, 0, 3, 7, 1, 4, 8, 6 };
		
		System.out.printf("Sorted values are: %s%n", Arrays.stream(values)
														   .filter(value -> value > 4)
														   .collect(Collectors.toList()));
		
	}
	
	@Test
	void employeeStream() {
		Employee[] employees = {
				new Employee("Jimoh", "Ahmed", 5000, "IT"),
				new Employee("Odeku", "Odenson", 7600, "IT"),
				new Employee("Omosare", "Omogbagi", 3587.5, "Sales"),
				new Employee("James", "Jameson", 4700.77, "Marketing"),
				new Employee("Wendy", "Brown", 4356.98, "Marketing"),
		};
		
		List<Employee> employeeList = Arrays.asList(employees);
		System.out.println("Complete list of employee");
		employeeList.parallelStream().forEach(System.out::println);
		
		Predicate<Employee> fourToSixThousand = e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);
		System.out.println("Employees earning between 4,000 and 6,000 per month sorted by salary");
		employeeList.parallelStream().filter(fourToSixThousand).sorted(Comparator.comparing(Employee
				::getSalary)).forEach(System.out::println);
		
		System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n", employeeList.stream()
																			   .filter(fourToSixThousand)
																			   .findFirst()
																			   .get());
		
		Function<Employee, String> byFirstName = Employee::getFirstName;
		Function<Employee, String> byLastName = Employee::getLastName;
		
		Comparator<Employee> lastThenFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);
		
	}
}
