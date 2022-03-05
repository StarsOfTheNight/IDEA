package demo8;
/**
 * 客户端
 *
 */
public class demo8 {
	public static void main(String[] args) {
		IFactory operFactory = new AddFactory();		
		Operation oper = operFactory.CreateOperation();
		oper.setNumberA(10);
		oper.setNumberB(7);
		double result = oper.getResult();
		System.out.println(result);
	}
}