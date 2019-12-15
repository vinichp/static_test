package vini;

public class ThreadViniStruct implements Runnable {
	
	ViniStruct vs;
	
	static String staticString = "AAAA";

	public ThreadViniStruct(String name, String conexao){
		this.vs = new ViniStruct(name, conexao);
	}
	
	static void metodoPrint(ViniStruct vs) {
	
		try {
			
			System.out.print("\nExecutando Thread " + vs);	
			System.out.println("\n\n ======" +  staticString);
			staticString = vs.nome;
			Thread.sleep(1000);
			System.out.print("\nExecutando Thread " + vs);
			System.out.println(staticString);
			Thread.sleep(1000);
			System.out.print("\nExecutando Thread " + vs);
			System.out.println(staticString);
			System.out.println("\n\n ======" +  staticString);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
	
		
		metodoPrint(vs);
		
	}

	
}

class ViniStruct{
	
	public ViniStruct(String nome, String conexao){
		this.nome = nome;
		this.conexao = conexao;
	}
	String nome;
	String conexao;
	
	public String toString() {
		return nome + conexao;
	}
}