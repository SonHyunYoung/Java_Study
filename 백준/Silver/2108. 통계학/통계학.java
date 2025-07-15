import java.io.*;
	
public class Main{
	
	public static void main(String [] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int [] arr = new int [8001];
		
		int max = Integer.MIN_VALUE; //범위 구하기용 최솟값
		int min = Integer.MAX_VALUE; //범위 구하기용 최댓값
		int sum = 0; //총합, 평균 구하기 위해 필요.
		int mode = 5000; //최빈값
		int median = 5000; //중앙값
		
		//도수 배열 만듦. 
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num + 4000]++;
			sum += num;
			
			if(max < num) {
				max = num;
			}
			if(min > num) {
				min = num;
			}
		}
		
		int cnt = 0; //중앙값 찾기 위한 변수, 도수 걍 더하면 됨.
		int mode_max = 0; //최빈값 최댓값 저장하는 변수. 
		
		boolean check = false; //이전에 동일한 최빈값이 등장했는지 아닌지 판단.
		
		//정렬 위해서 배열 순회
		for(int i = min + 4000; i <= max + 4000; i++) {
			
			//중앙값 구하는 부분.
			if(arr[i] > 0) {
				if(cnt < (N + 1) / 2) {
					cnt += arr[i];
					median = i - 4000;
				}
			}
			
			//최빈값 구하기
			if(mode_max < arr[i]) {
				mode_max = arr[i];
				mode = i - 4000;
				check = true;
			}
			//만약 check가 true이면서 mode_max도 같을떄
			else if(check && mode_max == arr[i]) {
				mode = i - 4000;
				check = false;
			}
		}
		
		bw.write((int) Math.round((double) sum / N) + "");
		bw.newLine();
		bw.write(median + "");
		bw.newLine();
		bw.write(mode + "");
		bw.newLine();
		bw.write((max - min) + "");
		
		
		br.close();
		bw.close();
	}
}