package org.designePattern.dP2ObserverPattern.Observevable;

import org.designePattern.dP2ObserverPattern.Observever.IObserverClient;

public interface IObservableSubject {
void addObserver(IObserverClient observer);
void removeObserver(IObserverClient observer);
void notifyObservers();
}
