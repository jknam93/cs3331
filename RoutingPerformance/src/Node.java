import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

/**
 * 
 */

/**
 * @author jkna499
 * @param <E> The object of the list
 *
 */
public class Node<E>{
   public Node(E node){
		edges = new HashMap<E, Integer>();
	}
    /**
     * Checks if edge is contained in the note
     * @param edge The edge to be found
     * @return true if edge is in the node, false otherwise
     */
    public boolean contains(E edge){
    	return edges.containsKey(edge);
    }
    /**
     * Removes edge from node
     * @param edge The edge that we want to remove
     * @return True if node contains the edge, false otherwise.
     */
    public boolean remove(E edge){
    	if(!edges.containsKey(edge)){
    		return false;
    	}
    	edges.remove(edge);
		return true;
    	
    }
    /**
     * Adds an edge to node
     * @param edge The edge we want to add
     * @return True if edge is not in the node, false otherwise
     */
    public boolean add(E edge, int weight){
    	if(edges.containsKey(edge)){
    		return false;
    	}
    	edges.put(edge, weight);
    	return true;
    }
    /**
     * Finds the degree of the node
     * @return the size of the node in int
     */
    public int size(){
    	return edges.size();
    }
    /**
     * Returns the list of edges on a node
     * @return edge list
     */
    public List<E> edgeList(){
    	return new LinkedList<E>(edges.keySet());
    }
    public int getWeight(E edge){
    	return edges.get(edge);
    }
    
    private HashMap<E, Integer> edges;
    
}
