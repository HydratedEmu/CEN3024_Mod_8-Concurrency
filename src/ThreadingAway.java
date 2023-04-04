import java.util.*;

public class ThreadingAway {
	
	
	public static void main(String[] args) {
		//2000000000 heap size issue; need help code wont run because of this
		int randomNumbers[] = new int[2000000000];
		Random random = new Random();
		
		for(int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = random.nextInt(10)+1;			
		}
		
		//test
		int sum = 0;
		for(int i = 0; i < randomNumbers.length; i++) {
			sum += randomNumbers[i];		
		}
		System.out.println(sum);
		
		Thread thread1 = new TheRunner(0,66666666, randomNumbers );
		Thread thread2 = new TheRunner(66666666,133333332, randomNumbers );
		Thread thread3 = new TheRunner(133333332,2000000000, randomNumbers );
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			System.out.println(TheRunner.total);
			
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		
	}

}
