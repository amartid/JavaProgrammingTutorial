public class e16elseIfStatement {
    //works with tuna4
    public static void main(String []args) {

        int age = 55;
        if (age>60){
            System.out.println("You are senior citizen ");

        } else if (age>=50) {
            System.out.println("You are in your 50s");
        } else if (age>=40) {
            System.out.println("You are in your 40s");
        }else{
            System.out.println("You are a young buck");
        }
    }
}
