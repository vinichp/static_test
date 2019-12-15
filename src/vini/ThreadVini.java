package vini;

public class ThreadVini implements Runnable {
	
	String name;

	public ThreadVini(String name){
		this.name  =  name;
	}
	
	static void metodoPrint(String nome) {
	
		try {
			
			System.out.print("\nExecutando Thread " + nome);			
			Thread.sleep(1000);
			System.out.print("\nExecutando Thread " + nome);
			Thread.sleep(1000);
			System.out.print("\nExecutando Thread " + nome);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
	
		
		metodoPrint(name);
		
	}

}
