package com.rxjava.transformation;

import java.util.Arrays;
import java.util.List;

public class MapTest {

	public static void main(String[] args) {
		//map
		
		/**JS code
		 var numbers = [1,2,3,4,5];
			function double(number){
			    return number * 2;
			}
			var doubleNumbers = numbers.map(double);
			console.log(doubleNumbers)//[ 2, 4, 6, 8, 10 ]
		 */
		int numbers[] = {1,2,3,4,5};
		for(int num:numbers) {
			System.out.print(doubleNumber(num)+" ");
		}
		
		System.out.println("\nUsing Streams");
		List<Integer>numList = Arrays.asList(1,2,3,4,5);
		numList
		.stream()
		.map(n->n*2+" ")
		.forEach(System.out::print);
		
		//fitler
		/**
		 //filter
			function greaterThanThree(value) {
			    return value > 3;
			}
			var numbersGreaterThanThree = numbers.filter(greaterThanThree);
			console.log(numbersGreaterThanThree);//[4,5]
		 */
		System.out.println("\nFilter");
		for(int n:numbers) {
			int number = numbersGreaterThanThree(n);
			if(number>0) {
				System.out.print(number+" ");
			}
			
		}
		System.out.println("\nFilter Using Streams");
		numList.stream().filter(f->f>3).forEach(System.out::print);
		//numList.stream().filter(f->f.intValue()>3).forEach(System.out::println);
		
		//reduce
		/**
		 function sum(total,value){
    		return total + value;
		  }
		var total = numbers.reduce(sum,0);
		console.log(total)//15
		 */
		System.out.println("\reduce Using Streams");
		int sum = numList.stream().reduce(0,Integer::sum);
		System.out.println(sum);
	}


	private static int doubleNumber(int num) {
		return num * 2;
	}
	private static int numbersGreaterThanThree(int n) {
		int no = 0;
		if(n>3) {
			no= n;
		}
		return no;
	}
}
