import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char array[][] = new char[5][15];
		
		//배열에 넣기
		for( int i=0; i<5; i++ ) {
			String str = br.readLine();
			
			for( int j=0; j<str.length(); j++ ) {				
				array[i][j] = str.charAt(j);
			} //j
			
		} //i
		
		//세로로 읽기
		for( int i=0; i<15; i++ ) {
			for( int j=0; j<5; j++ ) {
				
				if( array[j][i] != '\0' ) {
					System.out.print(array[j][i]);
				}
			}
		} //i
		
	}
}
