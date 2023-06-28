public class duna6 {
	private int sum;
	private final int NUMBER; //= 2; //this is a constant //we can initialize it here !
	public duna6(int x){
		NUMBER = x;
	}
	public void add(){
		sum+=NUMBER;
	}
	public String toString(){
		return String.format("sum = %d\n",sum);
	}
}