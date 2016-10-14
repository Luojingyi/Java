import java.util.Scanner ;
public class Shape{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean kai = true ;
		while(kai){

		System.out.println("\n"+"请分别输入数字(1)或者(2)选择你要打印的图形(任意键退出程序)");
		String xz =  scanner.next();
		System.out.println("");
		switch(xz){
			case 1+"" :   //选择第一种图形

			mono();

			break;
			case 2+"" :   //选择第二种图形

			two();

			break;
			default:
			System.out.println("程序已退出");
			kai = false ;
			break;

		}


		}



	}

	public static void  mono(){
		for (int i = 0 ;i<9 ; i++) {
			for (int j = 0;j<=i ;j++ ) {
				if((i+j)!=0){
				if((i+j)%7==0){
					System.out.print(" "+"* ");
					continue;
				}
				}
				System.out.print( " "+(i+j)+" ");
			}
			System.out.println("");
		}
    }

    public static void two(){
    	int k = 6 ;
    	for (int i = 0 ;i<k ; i++) {
    		for (int j =i; j<k;j++ ) {
    			System.out.print("-");
    		}
    		for (int j = 0 ; j<=i;j++ ) {
    			if((i+j)!=0){
    			if((i+j)%3==0){
					System.out.print("# ");
					continue;
    			}
    			}
    				System.out.print(i+j+" ");
    		
    			
    		}

    		System.out.println("");
    	}

    }



	






}