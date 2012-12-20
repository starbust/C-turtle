package classwork.evaluatorExample;

import classwork.evaluatorExample.evaluators.AbsoluteFibunacciEvaluator;
import classwork.evaluatorExample.evaluators.AbsolutePowerOnEvaluator;
import classwork.evaluatorExample.evaluators.AbsoluteSumEvaluator;

public class AbsoluteEvaluatorFactory implements IEvaluatorFactory {

	@Override
	public IEvaluator createSumEvaluator() {
		return new AbsoluteSumEvaluator();
	}

	@Override
	public IEvaluator createPowerOnEvaluator() {
		return new AbsolutePowerOnEvaluator();
	}

	@Override
	public IEvaluator createPowerOnEvaluator(double power) {
		return new AbsolutePowerOnEvaluator(power);
	}

	@Override
	public IEvaluator createFibonaciEvaluator() {
		return new AbsoluteFibunacciEvaluator();
	}
}
