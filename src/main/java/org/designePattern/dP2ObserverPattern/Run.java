package org.designePattern.dP2ObserverPattern;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

import org.designePattern.dP2ObserverPattern.Observevable.IObservableSubject;
import org.designePattern.dP2ObserverPattern.Observevable.implementation.ObservableSubject;
import org.designePattern.dP2ObserverPattern.Observever.IObserverClient;
import org.designePattern.dP2ObserverPattern.Observever.implementation.ObserverClient;



public class Run {

	public static void main(String[] args) {
		try {
			 ObservableSubject observable=new ObservableSubject();
			 ObserverClient observer1=new ObserverClient(observable);
			 ObserverClient observer2=new ObserverClient(observable);
			 ObserverClient observer3=new ObserverClient(observable);
			 
			 observable.addObserver(observer1);
			 observable.addObserver(observer2);
			 observable.addObserver(observer3);
			 
			 observer1.operation();
			 observer2.operation();
			 observer3.operation();
			 observable.notifyObservers();
			 observer1.operation();
			 observer2.operation();
			 observer3.operation();
			 observable.setState("first state");
			 observer1.operation();
			 observer2.operation();
			 observer3.operation();
			 observable.notifyObservers();
			 observer1.operation();
			 observer2.operation();
			 observer3.operation();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
