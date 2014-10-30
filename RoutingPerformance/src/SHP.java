import java.util.*;


public class SHP implements RoutingScheme {
	boolean complete = false;
	int size = 0;
	ArrayList<Node> paths = new ArrayList<Node>();
	
	public static Comparator<Node> comp = new Comparator<Node>() {
		public int compare (Node one, Node two){
			if(one.getWeight(<E>) > two.getWeight(<E>)){
				return 1;
			} else {
				return -1;
			}
			
		}
	};
}

