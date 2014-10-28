
public class RoutingPerformance {
	public static void main(String[] args){
		
		NetworkScheme nScheme;
		RoutingScheme rScheme;
		
		if (args.length > 0) {
		    try {
		    	
		    	//Choose networking scheme
		        if(args[0].equals("CIRCUIT")){
		        	nScheme = new Circuit();
		        } else if(args[0].equals("PACKET")) {
		        	nScheme = new Packet();
		        } else {
		        	//end program
		        }
		        
		        //Choose routing scheme
		        if(args[1].equals("SHP")){
		        	rScheme = new SHP();
		        } else if(args[1].equals("SDP")) {
		        	rScheme = new SDP();
		        } else if(args[1].equals("LLP")) {
		        	rScheme = new LLP();
		        } else {
		        	//end program
		        }
		    } catch (NumberFormatException e) {
		        System.err.println("Argument" + args[0] + " must be an integer.");
		        System.exit(1);
		    }
		}
	}
}

interface NetworkScheme {

}

interface RoutingScheme {
	
}

private class Circuit implements NetworkScheme{
	
}

private class Packet implements NetworkScheme{
	
}

private class SHP implements RoutingScheme {
	
}

private class SDP implements RoutingScheme{
	
}

private class LLP implements RoutingScheme{
	
}