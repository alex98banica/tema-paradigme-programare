import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class P1 {
	public static void main(String[] args) throws FileNotFoundException {
			Scanner sc = new Scanner(new File("p1.in"));
			
			ArrayList<Integer> arr = new ArrayList<Integer>();
			int n = sc.nextInt();
			int i,a;
			int suma_Tuzgu=0,suma_Rita=0;
			for(i=0;i<n;i++)
			{
				a=sc.nextInt();
				arr.add(a);
			}
			Collections.sort(arr);
			int r=(n-1)%2;
			for(i=(n-1);i>=0;i--)
			{
				if(i%2==r)
					suma_Tuzgu+=arr.get(i);
				else
					suma_Rita+=arr.get(i);
			}
			n=(suma_Tuzgu-suma_Rita);
			PrintWriter pw = new PrintWriter(new File("p1.out"));
			pw.printf("%d", n);
			sc.close();
			pw.close();
	}
}