package home.samples;

interface Display {

	void print(String o);

}

public class LambdaBasic {
	public static void main(String [] args){

		Display thisDisplay = thisObject -> System.out.println(thisObject);
		
		thisDisplay.print("Hello World!");
		
		Thread thisThread = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("Run from Inner Class");
				
			}
			
		});
		
		thisThread.run();
		
		Thread anotherThread = new Thread(()->System.out.println("Run from Lambda Thread"));
		
		Thread thisOne = new Thread(()->{});

		anotherThread.run();
		
		thisOne.run();
	}
	
	
}
