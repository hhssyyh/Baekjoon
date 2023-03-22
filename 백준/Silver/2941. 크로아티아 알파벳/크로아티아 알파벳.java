import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		int sum = 0;
		
		for( int i=0; i<a.length(); i++ ) {
			
			sum++;
			
			if( i<a.length()-1 ) {
				
				if( (a.charAt(i)=='c') || (a.charAt(i)=='s') || (a.charAt(i)=='z') ) {
					if( a.charAt(i+1)=='=' ) {
						sum--;
					}
				}
				
				if( (a.charAt(i)=='c') || (a.charAt(i)=='d') ) {
					if( a.charAt(i+1)=='-' ) {
						
						sum--;
					}
				}
				
				if( (a.charAt(i)=='l' && a.charAt(i+1)=='j') || (a.charAt(i)=='n' && a.charAt(i+1)=='j') ) {
					
					sum--;
				}
				
			}
			
			if( i<a.length()-2 ) {
				if( a.charAt(i)=='d' && a.charAt(i+1)=='z' && a.charAt(i+2)=='=' ) {
					sum --;
				}
			}
			
		}
		
		System.out.println( sum );
		
	}
}