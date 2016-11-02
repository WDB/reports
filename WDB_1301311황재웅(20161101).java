import java.util.Stack;
import java.util.Scanner;

public class WDB
{
	public static void main( String [] args) {
		Stack stack = new Stack(); // 스택
		Scanner scanner = new Scanner(System.in); // 사용자 입력
  
		System.out.print("값을입력하시오 :");
		String word = scanner.next();
  
  
		// word push
		for ( int i = 0 ; i < word.length() ; i++ )
		{
			stack.push(word.charAt(i));
		}
  
		// word pop
		System.out.print("뒤바뀐값 : ");
		while ( !stack.isEmpty() )
		{
			System.out.print(stack.pop());   
		}	  
	}
}
