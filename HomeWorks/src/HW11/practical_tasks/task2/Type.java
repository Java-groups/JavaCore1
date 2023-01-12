package HW11.practical_tasks.task2;

public enum Type {
	OAK("Oak"), PINE("Pine"), HORNBEAM("Hornbeam"), ASPEN("Aspen"), MAPLE("Maple"), BIRCH("Birch");
	
	private final String type;
	
	Type(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public static Type fromValue(String inputType) throws TypeException {
		for (Type type : values()) {
			if (type.type.equals(inputType)) {
				return type;
			} 
		}
	    throw new TypeException("You are trying to input wrong type!");
	}
}
