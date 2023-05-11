public class duna1 {
	private String name;
	private potpie1 birthday;

	public duna1(String theName, potpie1 theDate){
		name = theName;
		birthday = theDate;
	}
	public String toString(){
		return String.format("My name is %s, my birthday is %s", name, birthday);
		//object to string is composition refering to obejcts as other members
	}
}