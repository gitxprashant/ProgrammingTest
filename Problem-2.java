import java.util.Scanner;

public class Solution
{
    public static void generateSeries(int n){
        if(n == 0){
            return;
        }
        int count=1;
        for(int i=1;count<=n;i++){
            if(i%2 != 0){
                System.out.print(i + " ");
                count++;
            }
        }
    }
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		generateSeries(n);
	}
}