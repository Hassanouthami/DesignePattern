package org.designePattern.DP1StrategyPattern.Duck;

import org.designePattern.DP1StrategyPattern.behaviour.IFlyBehaviour;
import org.designePattern.DP1StrategyPattern.behaviour.IDisplayBehaviour;
import org.designePattern.DP1StrategyPattern.behaviour.IEatBehaviour;

public class Duck {
IFlyBehaviour flyBehaviour;
IEatBehaviour eatBehaviour;
IDisplayBehaviour displayBehaviour;

public Duck(IFlyBehaviour flyBehaviour,IEatBehaviour eatBehaviour,IDisplayBehaviour displayBehaviour) {
	this.displayBehaviour=displayBehaviour;
	this.eatBehaviour=eatBehaviour;
	this.flyBehaviour=flyBehaviour;
			
}

public IFlyBehaviour getFlyBehaviour() {
	return flyBehaviour;
}

public IEatBehaviour getEatBehaviour() {
	return eatBehaviour;
}

public IDisplayBehaviour getDisplayBehaviour() {
	return displayBehaviour;
}

}
