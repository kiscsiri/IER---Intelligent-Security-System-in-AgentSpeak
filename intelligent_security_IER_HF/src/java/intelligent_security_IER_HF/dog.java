package intelligent_security_IER_HF;

import jason.architecture.AgArch;

public class dog extends AgArch
{

	public static void main(String[] a) {
	       
	       dog ag = new dog();
	       ag.run();
	    }
	
	 public void run() {
	        while (isRunning()) {
	          // calls the Jason engine to perform one reasoning cycle
	        	print( "hello");
	          getTS().reasoningCycle();
	        }
	    }
}
