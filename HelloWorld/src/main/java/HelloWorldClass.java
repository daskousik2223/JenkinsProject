import com.myjenkinstest.ShowMessage;

public class HelloWorldClass {

	public static void main(String[] args) {
		System.out.println("Hello World" + " Jenkins is working " + new ShowMessage().returnMessage());

	}

}
