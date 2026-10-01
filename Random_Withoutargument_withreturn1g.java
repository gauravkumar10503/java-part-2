class Random_Withoutargument_withreturn1g 
	
	{
    public static void main(String[] args) 
		
	{
        System.out.println("Hello World!");
        double randomNumber = getrandomnumber();  
		// Store the result of the method in a variable
        System.out.println("Random number: " + randomNumber);
    }

    public static double getrandomnumber() 
		
	{
        // Generate a random number between 0 and 1, then scale it to 50-51
        return Math.random() + 50;  
		// This generates a value between 50 and 51
    }
}
