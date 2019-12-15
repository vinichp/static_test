package vini;

public class ThreadViniStruct implements Runnable {
	
	ViniStruct vs;

	public ThreadViniStruct(String name, String conexao){
		this.vs = new ViniStruct(name, conexao);
	}
	
	static void metodoPrint(ViniStruct vs) {
	
		try {
			
			System.out.print("\nExecutando Thread " + vs);			
			Thread.sleep(1000);
			System.out.print("\nExecutando Thread " + vs);
			Thread.sleep(1000);
			System.out.print("\nExecutando Thread " + vs);
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