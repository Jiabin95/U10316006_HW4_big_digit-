import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;

public class BigNumber{
	public static void main(String [] args){
	//预设两个字串a和b
	String a = "567567575674534535436556767889";
	String b = "345465567576454678787989089009";
	
	bignum num1 = new bignum(a);
	bignum num2 = new bignum(b);
	
	int z[];
	//用if else交换位置
	if(a.length() > b.length()){	
	    z = new int[a.length()+1];
	}
	else{
		z = new int[b.length()+1];
	}

	//存入阵列
	int x[] = num1.getarray();
	int	y[] = num2.getarray();
		
	for(int i = 0;i < z.length -1;i++){
		int n = 0;
		int m = 0;
	
		//有發生Exception
		try{
			n = x[i];
			
		}catch(Exception e){
			n = 0;
		}
		try{
			m = y[i];
			
		}catch(Exception e){
			
			m = 0;
		}

		//do add 
		z[i] = z[i] + n + m;
		if(z[i]>=10){//如果超过10进位
			z[i+1]++;
			z[i] = z[i] - 10;		
		}		
	}

	if(z[z.length-1] !=0){
		
		System.out.print(z[z.length-1]);		
	}
	for(int i = 1;i < z.length ;i++){
		
			System.out.print(z[z.length-i-1]);
		}
	}
}

class bignum{
	
	int big[];
	
	bignum(String s){
	big = new int[s.length()]; 
		for(int i = 0;i < s.length() ;i++){
			char c = s.charAt(i);
			String ss = c+"";
			
			big[s.length()-i-1] = Integer.parseInt(ss);//字串转换字元
		}
	
	}
	//Return big
	int[] getarray(){
		return big;	
	}
}
