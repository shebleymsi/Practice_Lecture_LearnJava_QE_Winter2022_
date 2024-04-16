package basic;

public class LearnBlock {

    {
        // this is a block
        System.out.println("yahoo");
        System.out.println("yahoo");
    }

    static {
        System.out.println("Twitter");
        System.out.println("Twitter");
    }

    public static void main(String[] args) {
        System.out.println("Facebook");
//		{
//			// this is a block
//			System.out.println("yahoo");
//			System.out.println("yahoo");
//		}
        display(); // here, call display method to execute
    }

    static {
        System.out.println("Twitter & Google");
        System.out.println("Twitter & Google");
    }

    public static void display() {
        System.out.println("This is a Display, its call in main method");
    }
}
