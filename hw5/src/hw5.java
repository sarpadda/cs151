import java.awt.Rectangle;

public class hw5 {
	
	public static void dumpArray(Object[] a) {
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i].toString());	
		}
	}
	
	public static void main(String[] args) {
        Object[] example =  { 6, "hi", 12, new Rectangle(10, 20) };
        dumpArray(example);
}

}
