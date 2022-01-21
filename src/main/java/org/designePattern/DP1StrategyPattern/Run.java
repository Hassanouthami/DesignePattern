package org.designePattern.DP1StrategyPattern;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

import org.designePattern.DP1StrategyPattern.behaviour.IFlyBehaviour;
import org.designePattern.DP1StrategyPattern.behaviour.IDisplayBehaviour;
import org.designePattern.DP1StrategyPattern.behaviour.IEatBehaviour;
import org.designePattern.DP1StrategyPattern.Duck.Duck;



public class Run {

	public static void main(String[] args) {
		try {
			Scanner scanner=new Scanner(new File("config.txt"));
			String flyClassName=scanner.next();
			String eatClassName=scanner.next();
			String displayClassName=scanner.next();
			System.out.println(flyClassName);
			System.out.println(eatClassName);
			System.out.println(displayClassName);
			Class flyClass=Class.forName(flyClassName);
			IFlyBehaviour flyBehaviour=(IFlyBehaviour) flyClass.newInstance();
			flyBehaviour.fly();
			Class eatClass=Class.forName(eatClassName);
			IEatBehaviour eatBehaviour=(IEatBehaviour) eatClass.newInstance();
			eatBehaviour.eat();
			Class displayClass=Class.forName(displayClassName);
			IDisplayBehaviour displayBehaviour=(IDisplayBehaviour) displayClass.newInstance();
			displayBehaviour.display();
			Duck duckSimple=new Duck(flyBehaviour,eatBehaviour,displayBehaviour);
			duckSimple.getEatBehaviour().eat();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
