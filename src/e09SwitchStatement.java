public class e09SwitchStatement {
    public static void main(String args[]) {
        int age;
        age = 2;
        
        switch(age) {
//			find the variable value in the parameter
//	case 1: if the value of age is equal to 1 what should i do ?
        case 1:
            System.out.println("You can crawl");
            break;
        case 2:
            System.out.println("You can talk");
            break;
        case 3:
            System.out.println("You can toruble");
            break;
//			if none of the values is true you ve got a default
        default :
            System.out.println("I dont know how old you are");
            break;
        }
    }
}