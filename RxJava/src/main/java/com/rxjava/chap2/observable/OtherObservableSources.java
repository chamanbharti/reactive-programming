package com.rxjava.chap2.observable;

import io.reactivex.Observable;

public class OtherObservableSources {
	public static void main(String[] args) {
//		Observable.range(1, 10)
		Observable.rangeLong(0, 121588)
		.subscribe( 
				 s-> System.out.println("Recieved: "+s)
				);
	}

}
