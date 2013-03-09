package classwork.evaluatorExample.evaluators;

import java.util.List;

import classwork.evaluatorExample.Evaluator;

public class AbsoluteSumEvaluator extends Evaluator{

	@Override
	public Double evaluate() {
		double res = 0;
		for(Double value : evaluated) {
			res += value;
		}
		evaluated.removeAll(evaluated);
		evaluated.add(Math.abs(res));
		return Math.abs(res);
	}
	
	public Double evaluate(List<Double> evaluated) {
		double res = 0;
		for(Double value : evaluated) {
			res += value;
		}
		evaluated.removeAll(evaluated);
		evaluated.add(Math.abs(res));
		return Math.abs(res);
	}

}