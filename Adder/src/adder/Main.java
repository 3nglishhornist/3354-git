package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        }
	catch(ArrayIndexOutOfBoundsException e){
		System.err.println("Not enough arguments");
	}
	catch(IllegalCharacterException e)
     	{
     		System.out.println(e.getMessage());
     	}
	catch(Exception e){
		System.err.println("Please provide two integers to add");
	}
    }

    private static int addArguments(String[] args) {
        return Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
    }
}
