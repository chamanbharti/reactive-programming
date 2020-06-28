package com.rxjava.chap2.observable;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.observables.ConnectableObservable;

public class ObservableCreate1 {

	public static void main(String[] args) {
//		Observable<String> source = Observable.create( emitter -> {
//			emitter.onNext("Alpha");
//			emitter.onNext("Beta");
//			emitter.onNext("Gamma");
//			emitter.onNext("Delta");
//			emitter.onNext("Epsilon");
//			//emitter.onError(error -> System.out.println(error));
//			emitter.onComplete();
//		});
//		source.subscribe(s -> System.out.println("Recieved:" +s));
		
//		Observable<String> source = Observable.create( emitter -> {
//			try {
//			emitter.onNext("Alpha");
//			emitter.onNext("Beta");
//			emitter.onNext("Gamma");
//			emitter.onNext("Delta");
//			emitter.onNext("Epsilon");
//			emitter.onComplete();
//			}catch (Throwable e) {
//				emitter.onError(e);
//			}
//		});
//		source.subscribe(s -> System.out.println("Recieved:" +s), Throwable::printStackTrace);
//		Observable<String> source = Observable.create( emitter -> {
//			try {
//			emitter.onNext("Alpha");
//			emitter.onNext("Beta");
//			emitter.onNext("Gamma");
//			emitter.onNext("Delta");
//			emitter.onNext("Epsilon");
//			emitter.onComplete();
//			}catch (Throwable e) {
//				emitter.onError(e);
//			}
//		});
//		Observable<Integer>lengths = source.map(String::length);
//		Observable<Integer>filtered = lengths.filter(i -> i >= 5);
//		filtered.subscribe(s -> System.out.println("Recieved:" +s));
//	}
//		Observable<String> source = Observable.create( emitter -> {
//			try {
//			emitter.onNext("Alpha");
//			emitter.onNext("Beta");
//			emitter.onNext("Gamma");
//			emitter.onNext("Delta");
//			emitter.onNext("Epsilon");
//			emitter.onComplete();
//			}catch (Throwable e) {
//				emitter.onError(e);
//			}
//		});
//		source.map(String::length)
//		.filter(i -> i >= 5)
//		.subscribe(s -> System.out.println("Recieved:" +s));

//		Observable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta","Epsilon");
//		source.map(String::length)
//		.filter(i -> i >= 5)
//		.subscribe(s -> System.out.println("Recieved:" +s));
		
//		List<String> items = Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
//		Observable<String> source = Observable.fromIterable(items);
//		source.map(String::length)
//		.filter(i -> i >= 5)
//		.subscribe(s -> System.out.println("Recieved:" +s));

//		Observable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta","Epsilon");
//		Observer<Integer>myObserver = new Observer<Integer>() {
//
//			@Override
//			public void onSubscribe(Disposable d) {
//				//do nothing with Disposable, disregard for now
//			}
//
//			@Override
//			public void onNext(Integer value) {
//				System.out.println("RECEIVED: " + value);
//			}
//
//			@Override
//			public void onError(Throwable e) {
//				e.printStackTrace();	
//			}
//
//			@Override
//			public void onComplete() {
//				System.out.println("Done!");
//			}
//		};
//		source.map(String::length).filter(i -> i >= 5).subscribe(myObserver);
		
//		Observable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta","Epsilon");
//		source.map(String::length).filter(i -> i >= 5)
//		.subscribe(
//					i -> System.out.println("RECIEVED:"+i),
//					Throwable::printStackTrace,
//					() -> System.out.println("Done!")
//				);
		
//		Observable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta","Epsilon");
//		source.map(String::length).filter(i -> i >= 5)
//		.subscribe(
//					i -> System.out.println("RECIEVED:"+i),
//					Throwable::printStackTrace
//				);
//		Observable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta","Epsilon");
//		source.map(String::length).filter(i -> i >= 5)
//		.subscribe(
//					i -> System.out.println("RECIEVED:"+i)
//				);
		
		//Cold Observables
//		Observable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta","Epsilon");
//		//first observer
//		source.subscribe(s -> System.out.println("Observer 1 Recieved:"+s));
//		//second observer
//		source.subscribe(s -> System.out.println("Observer 2 Recieved:"+s));
		
//		//Cold Observables using operator
//		Observable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta","Epsilon");
//		//first observer
//		source.subscribe(s -> System.out.println("Observer 1 Recieved:"+s));
//		//second observer
//		source.map(String::length).filter(i -> i >=5)
//		.subscribe(s -> System.out.println("Observer 2 Recieved:"+s));
		
		//Hot Observables using ConnectableObservable
//		ConnectableObservable<String> source = 
//				Observable.just("Alpha", "Beta", "Gamma", "Delta","Epsilon")
//				.publish();
//		//set up observer 1
//		source.subscribe(s -> System.out.println("Observer 1: "+s));
//		//set up observer 2
//		source.map(String::length)
//		.subscribe(s -> System.out.println("Observer 2: "+s));
//		//Fire!
//		source.connect();
		
		// ConnectableObservable
		ConnectableObservable<String> source = Observable.just("Alpha","Beta","Gamma","Delta","Epsilon").publish();
		//set up observer 1
		source.subscribe(s->System.out.println("Observer 1: "+s));
		//set up observer 2
		source.map(String::length)
		.subscribe(i->System.out.println("Observer 2: "+i));
		//Fire!
		source.connect();
	}
		
		
}
