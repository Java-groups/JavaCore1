package HW11.practical_tasks.task2;

public class TypeException extends Exception {
	private static final long serialVersionUID = 2L;

	public TypeException(String msg) {
		super(msg);
	}

//	public static void validate(String type) throws TypeException {
//		Type type = new Type();
//		if (type.getType().equals(type)) {
//			throw new TypeException("age is not valid to vote");
//		} 
//	}
}
