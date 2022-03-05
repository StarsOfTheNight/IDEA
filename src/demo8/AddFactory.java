package demo8;
/**
 * 具体工厂(Concrete Creator)角色：加法类工厂
 *
 */
public class AddFactory implements IFactory {
	@Override
	public Operation CreateOperation() {
		return new OperationAdd();
	}	
}