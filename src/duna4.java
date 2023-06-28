public class duna4{
	private String first;
	private String last;
	private static int members=0;//what all objects share
	//every object shares the same variable !
	//when changed changes all objects!!!
	public  duna4(String fn,String ln){
		first=fn;
		last=ln;
		members++;
		System.out.printf("Constructor for %s %s, members in the club:%d\n",first,last,members);
	}
}