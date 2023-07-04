import java.util.*;

public class Solution
{
    public static void printInKeyValuePair(Map<Integer, Integer> dict){
        // StringBuffer Class is used to show the desired output
        StringBuffer outputDict = new StringBuffer();
        outputDict.append("{");
        for(Map.Entry<Integer, Integer> entry : dict.entrySet()){
            outputDict.append(entry.getKey()).append(" : ").append(entry.getValue()).append(", ");
        }
        outputDict.delete(outputDict.length() - 2, outputDict.length()); //Remove the "," at the end
        outputDict.append("}");
        System.out.println(outputDict);
    }
    
    
    public static Map multipleCount(int[] arr){
        Map<Integer, Integer> dict = new HashMap<>();
        for(int i=1;i<=9;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]%i == 0){
                    count++;
                }
            }
            dict.put(i, count);  // to store the value into the Map object
        }
        return dict;
    }
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();  // length of array;
		int[] arr = new int[n];
		// for taking input
		for(int i=0;i<n;i++){
		    arr[i] = s.nextInt(); 
		}
		Map<Integer, Integer> dict = multipleCount(arr);
		//print the output in the desired format
		printInKeyValuePair(dict);
	}
}
