public class tuna3 {
	private String girlName;
	public  void setName(String name){
		girlName = name;
	}
	public String getlName(){
		return girlName;
	}
	public void saying(){
		System.out.printf("Your first girlfriend was %s", getlName());
	}
}