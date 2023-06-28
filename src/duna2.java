public enum duna2 {
	bucky("nice", "22"),
	kelsey("cutie", "10"),
	julia("bigmistake", "12");
	//3 objects

	private final String desc;

	private final String year;
	//3 sets of 2 variables

	duna2(String description, String birthday){
		desc=description;
		year=birthday;
	}
	// constructor !

	public String getDesc() {
		return desc;
	}
	public String getYear() {
		return year;
	}
}