package org.designePattern.DP1StrategyPattern.behaviour.implementation;

import org.designePattern.DP1StrategyPattern.behaviour.IFlyBehaviour;

public class SimpleFly implements IFlyBehaviour {


	public void fly() {
		System.out.println("Duck fly simple");
	}

}
