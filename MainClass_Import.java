package import_ex;

// import할 때는 클래스 선언부 위에 패키지명을 포함한 전체경로를 적는다.
//import fruit.Apple;
//import fruit.Orange;
import fruit.*;

import java.util.Scanner;

import com.abc.ABC;
import com.def.DEF;


public class MainClass_Import {

	public static void main(String[] args) {
		
// 타입 >"Apple" a = new Apple();
		Orange o = new Orange();
		
		ABC abc = new ABC();
		DEF def = new DEF(); // ctrl + space
		
		Scanner scan = new Scanner(System.in);
		
		int i =1;
		System.out.println(i); // 기본타입
//		System.out.println(a); // 참조타입
		System.out.println(o); // 참조타입
		//jre 안에 jar = 자바 폴더의 묶음
	}
}
