
public enum Setting {
	OFF ("---"),
	LOW ("--+"),
	MEDIUM ("-++"),
	HIGH ("+++");
	
	private String value;
	
	
	Setting (String requestedValue) {
		value = requestedValue;
	}
	
	@Override
	public String toString() {
		return value;
	}
	
}