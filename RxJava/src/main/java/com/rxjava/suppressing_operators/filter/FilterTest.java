package com.rxjava.suppressing_operators.filter;

import io.reactivex.Observable;

public class FilterTest {

	public static void main(String[] args) {
		/*
		 import { fromEvent } from 'rxjs';
		import { filter } from 'rxjs/operators';

		const clicks = fromEvent(document, 'click');
		const clicksOnDivs = clicks.pipe(filter(ev => ev.target.tagName === 'DIV'));
		clicksOnDivs.subscribe(x => console.log(x));
		 */
		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
		.filter(s -> s.length() != 5)
		.subscribe(s -> System.out.println("RECEIVED: "+s));
	}
}
