package com.rxjava.suppressing_operators.take;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class TakeTest {

	public static void main(String[] args) {
		/**
		  const intervalCount  = interval(1000);
		  const takeFive = intervalCount.pipe(take(5));
		  takeFive.subscribe(x => console.log(x));
		
		  const many = range(1,1000);
		  const lastThree = many.pipe(takeLast(3));
		  lastThree.subscribe(x => console.log(x));
		
		  const source = interval(1000);
		  const clicks = fromEvent(document, 'click');
		  const result = source.pipe(takeUntil(clicks));
		  result.subscribe(x => console.log(x));
		
		  const clicks = fromEvent(document, 'click');
		  const result = clicks.pipe(takeWhile(ev => ev.clientX > 200));
		  result.subscribe(x => console.log(x));
		 */
		
		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
		.take(3)
		.subscribe(s -> System.out.println("Received: "+s));
		
		Observable.interval(300, TimeUnit.MILLISECONDS)
		.take(2, TimeUnit.SECONDS)
		.subscribe(i -> System.out.println("Received: "+i));
		sleep(5000);
//		Observable.range(1, 100).takeWhile(i->i<5).subscribe(i->System.out.println("Received:"+i));
	}
	public static void sleep(long millis) {
		try {
			 Thread.sleep(millis);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
