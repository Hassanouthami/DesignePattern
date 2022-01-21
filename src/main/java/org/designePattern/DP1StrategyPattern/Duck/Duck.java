package org.designePattern.DP1StrategyPattern.Duck;

import org.designePattern.DP1StrategyPattern.behaviour.IFlyBehaviour;
import org.designePattern.DP1StrategyPattern.behaviour.IDisplayBehaviour;
import org.designePattern.DP1StrategyPattern.behaviour.IEatBehaviour;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Duck {
IFlyBehaviour flyBehaviour;
IEatBehaviour eatBehaviour;
IDisplayBehaviour displayBehaviour;
}
