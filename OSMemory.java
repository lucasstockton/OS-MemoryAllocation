
public class OSMemory {
	
	
	private  int OSSize = 2;
	
	private String[] jobName;
	private int[] jobSize;
	private int[] jobState;
	
	private String lasterror;
	
	private int memoryType;	
	private int memorySize;
	
	private int _partitionSize;
	
	public String[] _memoryNames = {"Not Allocated Yet","Single-user systems", "Fixed partitions", "Dynamic partitions", "Relocatable dynamic partitions"};
	public String[] _memoryAllocationSchemes = {"First-Fit","Best-Fit", "Next-Fit", "Worst-Fit"};	

	
	/*
	 * Not Allocated Yet
	 * 
	 * 	This state means nothing was setup! 
	 * 
	 * Single-user systems
	 * 
	 * 	Not Implemented
	 * 
	 * Fixed partitions
	 * 
	 * 	Not Implemented
	 *  
	 * Dynamic partitions
	 * 
	 * 	Not Implemented
	 * 
	 * Relocatable dynamic partitions
	 * 
	 * 	Not Implemented	 * 
	 * 
	 */
	
	
	// This is the job list we will be using to simulate memory
	
	
	Object[][] jobList = {
		    {"Job 1.exe", new Integer(5)},
		    {"Job 2.exe", new Integer(30)},
		    {"Job 3.exe", new Integer(15)},
		    {"Job 4.exe", new Integer(18)},
		    {"Job 5.exe", new Integer(200)},
		    {"Job 6.exe", new Integer(50)},
		    {"Job 7.exe", new Integer(20)},
		    {"Job 8.exe", new Integer(50)}
		};		

	
	
	
	/*
	 *  Display the type of Memory we are using
	 */
	
	

	// Setup the memory return true if successful 
	
	public boolean initMemory(int _implementation)
	{
		if (memoryType == 0)
		{
			
			switch (_implementation) {
				case 2 : 
					//Fixed partitions", 
					int _intMaxProgram = 0;
					
					for (Object[] o : jobList)
					{
						if ((int)o[1] > _partitionSize)
							_partitionSize = (int)o[1];
						
						
						
						
					}
					System.out.println("Setting parition size to largest program " + _partitionSize);
					
					
					
					return true;
				
				case 3 : 
					//"Dynamic partitions
					
					
					
					return true;
				
				
				
				default : 
					lasterror = "ALERT! That simulation is not accessable to a normal users! Select again peasant!";
					return false;
				
			}
			
			
			
			
//			return true;
		} else	
		
		return false;
	}
	
	// Single-user systems configuartion
	
	public String[] _singleUserStates = {"active","waiting"};
	
	
	public String getLastError()
	{
		return lasterror;
		
	}
	
	public String getMemoryType()
	{		
		
	return 	_memoryNames[memoryType];
		
	}
	
	
	public String getOSSize()
	{
		
		return Integer.toString(OSSize) + "k";
		
	}
	
	/*
	 *  Constructor for the Memory Object
	 * 
	 */
	
	public OSMemory()
	{
		lasterror = "No errors found";
		memoryType = 0; // No memory selected yet. 
		memorySize = 64;
	
	}

	
	public OSMemory(int _memorysize)
	{
		lasterror = "No errors found";
		memoryType = 0; // No memory selected yet. 
		memorySize = _memorysize;
	
	}
	
	
}
