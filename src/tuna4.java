public class tuna4 {
	private String girlName;

	public tuna4(String name){
		girlName = name;
	}
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