import java.util.Scanner;
public class ququdan {
	public static void main(String[] args){
		
/*		
	while(true){
	System.out.println("���ϴ� ��������?:");
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();
	System.out.println(num+"��");
    int result;
	int i = 1;
	
	while(i<10){
		result =i *num;
				i++;
		System.out.println(result);
	}
	
	}*/
	
	
	while(true){
	System.out.println("���ϴ� ��������?:");
	Scanner scanner = new Scanner(System.in);
	int or = scanner.nextInt();
	System.out.println(or+"��");
	
	
	if(or <2){
		System.out.println("2������ �������� ��µ��� �ʽ��ϴ�");
	}else if(or >9){
		System.out.println("9���̻��� �������� ������� �ʽ��ϴ�");
	}else{
	int ans;
	for(int j=1; j<10; j++){
	ans	= or * j;
	System.out.println(ans);
	}}

	           }
	}
}

