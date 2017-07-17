import java.util.Scanner;
public class ququdan {
	public static void main(String[] args){
		
/*		
	while(true){
	System.out.println("원하는 구구단은?:");
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();
	System.out.println(num+"단");
    int result;
	int i = 1;
	
	while(i<10){
		result =i *num;
				i++;
		System.out.println(result);
	}
	
	}*/
	
	
	while(true){
	System.out.println("원하는 구구단은?:");
	Scanner scanner = new Scanner(System.in);
	int or = scanner.nextInt();
	System.out.println(or+"단");
	
	
	if(or <2){
		System.out.println("2단이하 구구단은 출력되지 않습니다");
	}else if(or >9){
		System.out.println("9단이상은 구구단은 출려되지 않습니다");
	}else{
	int ans;
	for(int j=1; j<10; j++){
	ans	= or * j;
	System.out.println(ans);
	}}

	           }
	}
}

