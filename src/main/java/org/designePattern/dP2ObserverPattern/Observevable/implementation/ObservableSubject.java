package org.designePattern.dP2ObserverPattern.Observevable.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.designePattern.dP2ObserverPattern.Observevable.IObservableSubject;
import org.designePattern.dP2ObserverPattern.Observever.IObserverClient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class ObservableSubject implements IObservableSubject{
	private String state ;
	private static int i=0; 
    private List<IObserverClient> observers=new ArrayList<IObserverClient>();
	public void addObserver(IObserverClient observer) {
		this.observers.add(observer);
		
	}

	public void removeObserver(IObserverClient observer) {
	this.observers.remove(observer);
		
	}

	public void notifyObservers() {
		this.observers.forEach(observer -> {
			observer.updateObserver();
		});
		
	}
	
	public ObservableSubject getInstance() {
		return new ObservableSubject();
	}
	
	public int getI() {
		return i;
	}

	public ObservableSubject() {
		i++;
	}
}
