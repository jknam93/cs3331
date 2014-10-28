import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class RoutingPerformance {
	public static void main(String[] args){
		NetworkingScheme nScheme;
		RoutingScheme rScheme;
		Integer packetRate;
		
		
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


