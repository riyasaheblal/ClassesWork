package test;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Custom {
    public static void main(String[] args) {
        try {
            int value = 30;
            if (value >18) {
                throw new CustomException("Valid age!");
            }
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        }
    }
}

	
			
	

