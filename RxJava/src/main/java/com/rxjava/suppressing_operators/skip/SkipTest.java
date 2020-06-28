package com.rxjava.suppressing_operators.skip;

import io.reactivex.Observable;

public class SkipTest {

	public static void main(String[] args) {
		/**
			import { skip,skipLast } from 'rxjs/operators';
			import { interval, fromEvent,range } from 'rxjs';
			import { skipUntil,skipWhile } from 'rxjs/operators';
			
			const many = range(1, 5);
			const skipLastTwo = many.pipe(skip(2));
			skipLastTwo.subscribe(x => console.log(x));
			// Results in:
			// 3 4 5
			const many = range(1, 5);
			const skipLastTwo = many.pipe(skipLast(2));
			skipLastTwo.subscribe(x => console.log(x));
			// Results in:
			// 1 2 3
			
			const intervalObservable = interval(1000);
			const click = fromEvent(document, 'click');
			 
			const emitAfterClick = intervalObservable.pipe(
			  skipUntil(click)
			);
			// clicked at 4.6s. output: 5...6...7...8........ or
			// clicked at 7.3s. output: 8...9...10..11.......
			const subscribe = emitAfterClick.subscribe(value => console.log(value));
			
			const intervalObservable = interval(1000);
			const click = fromEvent(document, 'click');
			 
			const emitAfterClick = intervalObservable.pipe(
			    skipWhile(x=>x<4)
			);
			const subscribe = emitAfterClick.subscribe(value => console.log(value));

		 */
//		Observable.range(1, 100).skip(90).subscribe(i->System.out.println("Received:"+i));
//		Observable.range(1, 100).skipLast(50).subscribe(i->System.out.println("Received:"+i));
		Observable.range(1, 100).skipWhile(i->i<=95).subscribe(i->System.out.println("Received:"+i));
	}
}
