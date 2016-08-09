
public class Application {//here we will look at while loops!

	public static void main(String[] args) {
		int value = 0;
		boolean protoLoop = value < 20;//this will eventually control the while loop- but read below!
		System.out.println(protoLoop);
		while (value < 20) {//cannot place protoLoop in here as protoLoop has been assigned to true until assigned otherwise, and inside the loop that does not happen!
			value = value + 1;
			System.out.println("The value is now " + value);
		}//this will print integers 1-20!
	}

}
