public enum duna3 {
	bucky("nice", "22"),
	kelsey("cutie", "10"),
	julia("bigmistake", "12"),
	nicole("italian", "13"),
	candy("different", "14"),
	erin("iwish", "16");
	//3 objects

	private final String desc;

	private final String year;
	//3 sets of 2 variables

	duna3(String description, String birthday){
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