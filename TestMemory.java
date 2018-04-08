import java.util.Scanner;

public class TestMemory {

	
	public static void printError(String s)
	{
		
		System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⠶⣿⣭⡧⡤⣤⣻⣛⣹⣿⣿⣿⣶⣄");
		System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⣼⣊⣤⣶⣷⣶⣧⣤⣽⣿⣿⣿⣿⣿⣿⣷");
		System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇                                " + s);
		System.out.println("⢀⢀⢀⢀⢀⢀⢀⣠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧                     /");
		System.out.println("⢀⢀⢀⢀⢀⢀⠸⠿⣿⣿⠿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣻⣿⣿⣿⣿⣿⡆");
		System.out.println("⢀⢀⢀⢀⢀⢀⢀⢸⣿⣿⡀⠘⣿⡿⢿⣿⣿⡟⣾⣿⣯⣽⣼⣿⣿⣿⣿⡀");
		System.out.println("⢀⢀⢀⢀⢀⢀⡠⠚⢛⣛⣃⢄⡁⢀⢀⢀⠈⠁⠛⠛⠛⠛⠚⠻⣿⣿⣿⣷");
		System.out.println("⢀⢀⣴⣶⣶⣶⣷⡄⠊⠉⢻⣟⠃⢀⢀⢀⢀⡠⠔⠒⢀⢀⢀⢀⢹⣿⣿⣿⣄⣀⣀⣀⣀⣀⣀");
		System.out.println("⢠⣾⣿⣿⣿⣿⣿⣿⣿⣶⣄⣙⠻⠿⠶⠒⠁⢀⢀⣀⣤⣰⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄");
		System.out.println("⢿⠟⠛⠋⣿⣿⣿⣿⣿⣿⣿⣟⡿⠷⣶⣶⣶⢶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄");
		System.out.println("⢀⢀⢀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠉⠙⠻⠿⣿⣿⡿");
		System.out.println("⢀⢀⢀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢀⢀⢀⢀⠈⠁");
		System.out.println("⢀⢀⢀⢀⢸⣿⣿⣿⣿⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⢀⢀⢀⢀⢸⣿⣿⣿⣿⣄⠈⠛⠿⣿⣿⣿⣿⣿⣿⣿⡿⠟⣹⣿⣿⣿⣿⣿⣿⣿⣿⠇");
		System.out.println("⢀⢀⢀⢀⢀⢻⣿⣿⣿⣿⣧⣀⢀⢀⠉⠛⠛⠋⠉⢀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⠏");
	    System.out.println("⢀⢀⢀⢀⢀⢀⢻⣿⣿⣿⣿⣿⣷⣤⣄⣀⣀⣤⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋");
	    System.out.println("⢀⢀⢀⢀⢀⢀⢀⠙⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛");
        System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⢹⣿⡿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁");
	    System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⢸⣿⡇⢀⠈⠙⠛⠛⠛⠛⠛⠛⠻⣿⣿⣿⠇");
        System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⣸⣿⡇⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢨⣿⣿");
        System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⣾⣿⡿⠃⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢸⣿⡏");
        System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⠻⠿⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢠⣿⣿⡇");
        
        
        
        
        System.out.println("……..'|:::::::,': : : : : : :_„„-: : : : : : : : ~--„_: |'");
        System.out.println("………|::::::|: : : „--~~'''~~''''''''-„…_..„~''''''''''''¯|");
        System.out.println("………|:::::,':_„„-|: : :_„---~: : :|''¯¯''''|: ~---„_: ||");
        System.out.println("……..,~-,_/'': : : |: :( ͡° ͜ʖ ͡°) : |: : : :|:( ͡° ͜ʖ ͡°)): \\..|");
        System.out.println("……../,'-,: : : : : ''-,_______,-'': : : : ''-„_____|");
        System.out.println("……..\\: :|: : : : : : : : : : : : : :„: : : : :-,: : : : : : : :\\");
        		System.out.println("………',:': : : : : : : : : : : : :,-'__: : : :_',: : : : ;: ,'");
        		System.out.println("……….'-,-': : : : : :___„-: : :'': : ¯''~~'': ': : ~--|'");
        		System.out.println("………….|: ,: : : : : : : : : : : : : : : : : : : : : :: : :|");
        		System.out.println("………….'|: \\: : : : : : : : -,„_„„-~~--~--„_: :: |");
        		System.out.println("…………..|: \\: : : : : : : : : : : :-------~: : : : : |");
        
        
        
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
//		printError("Do you know the way?");
		
		System.out.println("Creating a OS Memory Simulation Object");
		
		int _setsize = 0; 
		
		
		while (true )
		{
		System.out.println("How much memory do you want to use? ");
		_setsize = scan.nextInt();
		
		
		if (30 <= _setsize && _setsize <= 2000)
			break;
		else
			System.out.println("You need enough memory for your OS and your system capacity between 30k and 2000k");
		
		System.out.println("Your system cannot handle " + _setsize +"k");
		
		
		}
		OSMemory my = new OSMemory(_setsize);		
		
		
		
		while (true)
		{
		System.out.println("Select a simulation type below me : ");
		
		int _tempCount = -1;
		for (String s : my._memoryNames )
		{
			if (_tempCount++ == -1)
				continue; //System.out.print("Exit");
			
				System.out.println(_tempCount + " : " + s);
			
			
		}
		
			int num = scan.nextInt();
			
		// Start up the the memory 	
			if (my.initMemory(num))
				break;
			else System.out.println("Memory set to \"" + my.getMemoryType() + "\" \nError message : " + my.getLastError());
		
		}
		
		System.out.println("Memory is being allocated for " + my.getMemoryType());
		
		//System.out/
		 
		
		System.out.println("Ending simulation, thank you for stopping at Heuman Consulting!");
		

	} // End the Main testing loop!

}
