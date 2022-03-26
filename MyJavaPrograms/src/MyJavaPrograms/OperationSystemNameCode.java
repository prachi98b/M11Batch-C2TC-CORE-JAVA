package MyJavaPrograms;

public class OperationSystemNameCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String osname = System.getProperty("os.name");
		System.out.println("Name of Operating System: " + osname);
	    
		String osversion = System.getProperty("os.version");
		System.out.println("Version of Operating System: " + osversion);
	    
	}

}
