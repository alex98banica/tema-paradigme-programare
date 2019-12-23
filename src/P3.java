import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;



public class P3 {
	public static int maxVal(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	public static int minVal(int a,int b)
	{
		if(a<b)
			return a;
		else
			return b;
	}
	public static class players
	{
		long Tuzgu;
		long Rita;
	}
	public static void main(String[] args) throws FileNotFoundException {
	
			Scanner sc = new Scanner(new File("p3.in"));


			int n = sc.nextInt();
			int i,j,a;
			int suma_Tuzgu=0,suma_Rita=0;
			players[][] mat=new players[n][n];
			long[] arr = new long[n];
			for(i=0; i < n; i++){
	            for(j=0; j < n; j++){
	            	mat[i][j]=new players();
	            	mat[i][j].Tuzgu=0;
	            	mat[i][j].Rita=0;
	            }
	        }
			for(i=0;i<n;i++)
			{
				a=sc.nextInt();
				arr[i]=a;
				mat[i][i].Tuzgu=a;
				mat[i][i].Rita=0;
			}
			i=1;
			int k=n,indx=2;
			while(indx<=n)
			{
				i=n-indx;
	            while(i >=0)
				{
	                j = i+indx-1;
	                if(arr[i] + mat[i+1][j].Rita < mat[i][j-1].Rita + arr[j]){
						mat[i][j].Rita = mat[i][j-1].Tuzgu;
	                    mat[i][j].Tuzgu = arr[j] + mat[i][j-1].Rita;

	                }
					else
					{
						mat[i][j].Rita = mat[i+1][j].Tuzgu;
						mat[i][j].Tuzgu = arr[i] + mat[i+1][j].Rita;
	                }
					i--;
	            }
				indx++;
	        }
			PrintWriter pw = new PrintWriter(new File("p3.out"));
			
	        
			long s=0;
			s=mat[0][n-1].Tuzgu-mat[0][n-1].Rita;
			pw.printf("%d", s);
			sc.close();
			pw.close();

			
	}
}