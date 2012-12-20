package classwork.evaluatorExample.evaluators;

import classwork.evaluatorExample.Evaluator;

public final class DirectPowerOnEvaluator extends Evaluator {

	private double power;
	
	public DirectPowerOnEvaluator() {
		this.power = 0;
	}
	
	public DirectPowerOnEvaluator(double power) {
		this.power = power;
	}
	
	@Override
	public Double evaluate() {
		double res = 0;
		for (Double val : evaluated) {
			if (power != 0) {
				res = res + (val * power);
			} else {
				res = res + (val * 2);
			}
		}
		evaluated.removeAll(evaluated);
		evaluated.add(res);
		return res;
	}

}
