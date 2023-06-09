import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int day = 0;
		
		//하루 올라가는 총 길이로 나누기
		day = (h-up)/(up-down);
		
		if( (h-up)%(up-down) != 0 ) {
			day++;
		}
		
		//몫+1
		day++;
		
		System.out.println(day);
		
	}
}