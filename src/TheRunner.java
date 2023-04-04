// boiler code for thread courtesy of 
// https://www.tutorialspoint.com/java/java_multithreading.htm


public class TheRunner extends Thread {
	
	public int start;
	public int end;
	public int array[];
	public int sum = 0;
	public static int total = 0;
	
	TheRunner(int start, int end, int array[]){
		this.start = start;
		this.end = end;
		this.array = array;
	}
	
	@Override
	public void run() {
		for(int i = start; i < end; i++) {
			sum+= array[i];
			
		}
		total+=sum;
	}

}
