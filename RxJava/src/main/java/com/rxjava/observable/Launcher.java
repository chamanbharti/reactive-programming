package com.rxjava.observable;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class Launcher {
	
	public static void main(String[] args) {
		
//		Observable<String> myStrings = Observable.just("Alpha", "Beta", "Gamma", "Delta","Epsilon");
//				           myStrings.subscribe(s -> System.out.println(s));
//				           myStrings.map(s -> s.length()).subscribe(s -> System.out.println(s));
				           
				           Observable<Long> secondIntervals = Observable.interval(1, TimeUnit.SECONDS);
				        		   secondIntervals.subscribe(s -> System.out.println(s));
				        		   /* Hold main thread for 5 seconds so Observable above has chance to fire */
								sleep(5000);
								}
								public static void sleep(long millis) {
									try {
									   Thread.sleep(millis);
									} catch (InterruptedException e) {
									   e.printStackTrace();
									 }
								}
				        		    
//		Observable<String> source = Observable.create(emitter ->{	
//			emitter.onNext("Alpha");
//			emitter.onNext("Beta");
//			emitter.onNext("Gamma");
//			emitter.onNext("Delta");
//			emitter.onNext("Epsilon");
//			emitter.onComplete();
//		});
//		
//		source.subscribe(s->System.out.println("Recieved: "+s));
//		
//		Observable<String> source = Observable.create(emitter ->{
//			try {
//				emitter.onNext("Alpha");
//				emitter.onNext("Beta");
//				emitter.onNext("Gamma");
//				emitter.onNext("Delta");
//				emitter.onNext("Epsilon");
//				emitter.onComplete();
//			} catch (Exception e) {
//				emitter.onError(e);
//			}
//		});
//		
//		source.subscribe(s->System.out.println("Recieved: "+s), Throwable::printStackTrace);
//	}

}
