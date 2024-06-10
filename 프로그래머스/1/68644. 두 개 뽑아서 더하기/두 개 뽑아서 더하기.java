import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        int count = 0;
        int []arr = new int[(numbers.length)*(numbers.length)];
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                arr[count] = numbers[i] + numbers[j];
                count++;
            }
        }
        arr = Arrays.copyOf(arr,count);
        Arrays.sort(arr);
        int num = 0;
        int temp[] = new int[(numbers.length)*(numbers.length-1)/2];
        for(int i = 0; i < arr.length; i++){
            if(i == 0 || arr[i] != arr[i-1]){
                temp[num] = arr[i];
                num++;
            }
        }
        int[] answer = Arrays.copyOfRange(temp,0,num);
        return answer;
    }
}