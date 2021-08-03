import java.util.*;

class Main {
    public int solution(int[] arr, int K) {
        int answer = 0;
	ArrayList<Integer> list = new ArrayList<>();	
			
	for(int i=0; i<arr.length-2; i++){
		for(int j=i+1; j<arr.length-1; j++){
			for(int k=j+1; k<arr.length; k++){
				int sum = arr[i] + arr[j] + arr[k];
				if(sum % K == 0){
					list.add(sum);
				}
			}
		}					
	}
	answer = list.size();
			
        return answer;
    }
