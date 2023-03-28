import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str;
		int sum = 0;
		
		//N개 단어
		for( int i=0; i<N; i++ ) {
			str = br.readLine();
			
			if( check(str) == true ) {
				sum++;
			}

		} //i
		
        //결과 출력
		System.out.println(sum);
		
	} //main
	
	
	
	public static boolean check(String str) {
		
		//문자 하나씩 검사
		for( int j=1; j<str.length(); j++ ) {
			char prev = str.charAt(j-1);
			
			//이전문자와 같은지 확인
			if( str.charAt(j) == prev ) {
				//같다면 다음 문자로 넘어감
				continue;
				
			} else {
				//다르다면 앞에 같은 문자가 있었는지 확인
				for( int k=0; k<j; k++ ) {
					if( str.charAt(k) == str.charAt(j) ) {
						//같은 문자 있으면 그룹문자 아님
						//false 반환하고 함수 끝내기
						return false;
					}
					//끝까지 같은 문자 없으면 다음 문자로 넘어가기
				}// k
				
			}
			
		} //j
		
		//끝까지 연속된 문자만 있었다면 true 반환
		return true;
		
	} //check

	
}