import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] array = new int[N];
		
		for( int i=0; i<N; i++ ) {
			array[i] = i+1;
		}
		
		for( int i=0; i<M; i++ ) {
			
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			
			//내림차순으로
			while( a<b ) {
				int temp = array[a];
				array[a] = array[b];
				array[b] = temp;
				
				a++;
				b--;
			}
			
		}
		
		for( int arr : array ) {
			System.out.print( arr + " " );
		}
		
	}
}