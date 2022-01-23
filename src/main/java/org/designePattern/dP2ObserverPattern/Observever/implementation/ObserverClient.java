package org.designePattern.dP2ObserverPattern.Observever.implementation;

import org.designePattern.dP2ObserverPattern.Observevable.IObservableSubject;
import org.designePattern.dP2ObserverPattern.Observevable.implementation.ObservableSubject;
import org.designePattern.dP2ObserverPattern.Observever.IObserverClient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor 
@AllArgsConstructor
@Data
public class ObserverClient implements IObserverClient{
	
	private ObservableSubject observable;
    private int nbrModification;
    private String state;
    public ObserverClient(ObservableSubject observable) {
    	this.observable=observable;
    }
	public void updateObserver() {
		
		this.nbrModification=observable.getI();
		this.state=observable.getState();
	}
	public void operation() {
		System.out.println("just  !!!! :::   "+this.nbrModification+" to observe \n state :::"+this.state);
	}

}
