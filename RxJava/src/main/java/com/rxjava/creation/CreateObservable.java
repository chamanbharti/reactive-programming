package com.rxjava.creation;

import io.reactivex.Observable;

public class CreateObservable {
	public static void main(String[] args) {
 /**
  	// RxJS v6+
		import { Observable } from 'rxjs';
		
		  //Create an observable that emits 'Hello' and 'World' on subscription.
		
		const hello = Observable.create(function(observer) {
		  observer.next('Hello');
		  observer.next('World');
		  observer.complete();
		});
		
		//output: 'Hello'...'World'
		const subscribe = hello.subscribe(val => console.log(val));
  */
	//using rxjava
		Observable<String>hello = Observable.create(observer->{
			observer.onNext("Hello");
			observer.onNext("World");
			//observer.onError();
			observer.onComplete();
		});
		hello.subscribe(s->System.out.print(s+"..."));
		
	}
}
