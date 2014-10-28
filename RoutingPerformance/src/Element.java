import java.awt.Point;


public class Element implements Comparable<Element>{
	public Element(double H, double G, Point a){
		h = H;
		g = G;
		f = H + G;
		p = a;
	}
	public void changeH(int H){
		h = H;
		f = h+g;
	}
	public void changeG(int G){
		g = G;
		f=h+g;
	}
	public double getH(){
		return h;
	}
	public double getG(){
		return g;
	}
	public double getF(){
		return f;
	}
	
	public Point getPoint(){
		return p;
	}
	private double h;
	private double g;
	private double f;
	private Point p;
	@Override
	public int compareTo(Element o) {
		if(getF()>o.getF()) return 1;
		if(getF()<o.getF()) return -1;
		return 0;
	}
	
	@Override
	public boolean equals(Object o) {
		return ((Element) o).getPoint().equals(p);
	}

}
