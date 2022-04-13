

public class Toplama extends top{
	
	public static void main(String args []) {
		int x=a,y=b;

		carp(x, y);
		
	}
	
	public static int carp(int x,int y) {
		int son=0;
		
		for(int i=0;i<x;i++) {
			son += y; 
		}
		
		System.out.println(son);
		return son;
	}
}

class top {
	static int a=5;
	public static int b=3;
	
	public static int topla(int a, int b) {
		int toplam;
		
		toplam = a+b;
		
		
		return toplam;
	}
}