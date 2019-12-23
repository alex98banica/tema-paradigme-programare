import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class P2 {
	public static void main(String[] args) throws FileNotFoundException {
			Scanner sc = new Scanner(new File("p2.in"));
			
			ArrayList<Integer> arr = new ArrayList<Integer>();
			int n = sc.nextInt();
			int k = sc.nextInt();
			int i,a;
			int q;
			int suma_Tuzgu=0,suma_Rita=0;
			for(i=0;i<n;i++)
			{
				a=sc.nextInt();
				arr.add(a);
			}
			Collections.sort(arr);

			if(k<n)
			for(q=n-1;q>n-k-1;q--)
				arr.remove(q-1);
			int r=(n-1)%2;
			for(i=0;i<arr.size();i++)
			{
				if(i%2==r)
					suma_Tuzgu+=arr.get(i);
				else
					suma_Rita+=arr.get(i);
			}
			int s=(suma_Tuzgu-suma_Rita);
			PrintWriter pw = new PrintWriter(new File("p2.out"));
			if(n==k)
			{
				n=0;
				pw.printf("0");
			}
			else
				pw.printf("%d", s);
			sc.close();
			pw.close();
	}
}