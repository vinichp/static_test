package vini;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestStatic{
public static void main(String[] args) throws InterruptedException {
	

	System.out.println("ksjdkas");
	ThreadVini t = new ThreadVini("Vinicius");
	ThreadVini t2 = new ThreadVini("Janine");
	ThreadVini t3 = new ThreadVini("Iume");
	
	
	ExecutorService es = Executors.newFixedThreadPool(5);
	es.submit(t);
	es.submit(t2);
	es.submit(t3);
	
	Thread.sleep(7000);
	
	System.out.println("PARTE 2 ---------------------");
	
	ThreadViniStruct t4 = new ThreadViniStruct("Vinicius", "ConexVini");
	ThreadViniStruct t5 = new ThreadViniStruct("Janine", "ConexJan");
	ThreadViniStruct t6 = new ThreadViniStruct("Iume", "ConexIume");
	
	
	ExecutorService es2 = Executors.newFixedThreadPool(5);
	es2.submit(t4);
	es2.submit(t5);
	es2.submit(t6);
	
}
}