package Test;

public class Test1 {
	  enum Level {
	    LOW,
	    MEDIUM,
	    HIGH
	  }

	  public static void main(String[] args) {
		  
		  Level my = Level.MEDIUM;

		    switch(my) {
		      case LOW:
		        System.out.println("Low level");
		        break;
		      case MEDIUM:
		         System.out.println("Medium level");
		        break;
		      case HIGH:
		        System.out.println("High level");
		        break;
		    }
			  
		  for(Level m:Level.values()) {
			  System.out.println(m);
		  }
		  
	    Level myVar = Level.MEDIUM; 
	    System.out.println(myVar);
	  }
	  
	  
	  
	}

