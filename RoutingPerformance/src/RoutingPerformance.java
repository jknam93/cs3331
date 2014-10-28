import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

<<<<<<< HEAD

public class RoutingPerformance {
	public static void main(String[] args){
		NetworkingScheme nScheme;
		RoutingScheme rScheme;
		Integer packetRate;
		Network network = new Network();
		
		//Choose netowrking scheme
		try {
			if (args[NETWORK_SCHEME].equals("CIRCUIT")){
				nScheme=new Circuit();
			} else if (args[NETWORK_SCHEME].equals("PACKET")){
				nScheme=new Packet();
			} else {
				System.err.println("Network scheme must be CIRCUIT or PACKET");
				System.exit(1);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Please specify a network scheme");
			System.exit(1);
		}
		//Choose routing scheme
		try {
			if (args[TOPOLOGY_FILE].equals("SHP")){
				nScheme=new Circuit();
			} else if (args[TOPOLOGY_FILE].equals("SDP")){
				nScheme=new Packet();
			} else if (args[TOPOLOGY_FILE].equals("LLP")){
				nScheme=new Packet();
			} else {
				System.err.println("Routing scheme must be SHP, SDP or LLP");
				System.exit(1);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Please specify routing scheme");
			System.exit(1);
		}
		//Get topology file
		try {
			Scanner sc = new Scanner(new FileReader(args[TOPOLOGY_FILE]));   
			sc.close();
			//make the network
		} catch (FileNotFoundException e) {
			System.err.println("No such topology file found");
			System.exit(1);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Please specify a topology file");
			System.exit(1);
		}
		
		//Get workload file
		try {
			Scanner sc = new Scanner(new FileReader(args[WORKLOAD_FILE]));
			sc.close();
			//do commands
		} catch (FileNotFoundException e) {
			System.err.println("No such workload file found");
			System.exit(1);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Please specify a workload file");
			System.exit(1);
		}
		
		//Get packet rate
		try {
			packetRate=Integer.parseInt(args[PACKET_RATE]);
		} catch (NumberFormatException e) {
			System.err.println("Argument:" + args[PACKET_RATE] + " must be an integer");
			System.exit(1);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Please specify a packet rate");
			System.exit(1);
		}
		
		//do stuff
	}
	public static final int NETWORK_SCHEME = 0;
	public static final int ROUTTING_SCHEME = 1;
	public static final int TOPOLOGY_FILE = 2;
	public static final int WORKLOAD_FILE = 3;
	public static final int PACKET_RATE = 4;
}


=======
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
>>>>>>> b57f82055ee8c25ba1402ee19bd661896c2333c1
