package demo8;
/**
 * 具体产品(Concrete Product)角色：乘法类
 *
 */
public class OperationMul extends Operation {
	@Override
	public double getResult() {
		double result = 0;
		result = super.getNumberA() * super.getNumberB();
		return result;
	}
}