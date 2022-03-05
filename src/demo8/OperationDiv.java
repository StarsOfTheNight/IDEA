package demo8;
/**
 * 具体产品(Concrete Product)角色：除法类
 *
 */
public class OperationDiv extends Operation {
	@Override
	public double getResult() {
		double result = 0;
		if (super.getNumberB() == 0)			
			throw new ArithmeticException("除数不能为0.");			
		result = super.getNumberA() / super.getNumberB();
		return result;
	}
}