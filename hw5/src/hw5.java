import java.awt.Rectangle;
import java.util.Arrays;

public class hw5 {
	
	public static void dumpArray(Object[] a) {
		System.out.print(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
        Object[] example =  { 6, "hi", 12, new Rectangle(10, 20) };
        dumpArray(example);
}

}
