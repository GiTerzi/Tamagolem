package fiEulero;
import it.unibs.fp.mylib.*;

public class Main {
	static final int MIN=1;
	static final int MAX=20;
	
	public static int mcd(int a, int b) {
		  if (b == 0) return a;  
		  else return mcd(b, a % b); 
	}
	
	public static boolean isPrime(int x){
	    if (x==2) {
	        return true;
	    } else{
	    for(int i=2;i<=Math.sqrt(x);i++){
	    	if(x%i==0) return false;          
	    }
	    return true;
	    }
	}
	
	public double fiEulero(double n) {
		int p=0, a=0, b=0, k, i, j;
		int pi=(int) (Math.random()%(MAX-MIN+1)+MIN);
		if(isPrime(pi)) p=pi;
		
		for(k=0;k<p;k++) {
			if(Math.pow(p, k)==n) {return (p-1)*(Math.pow(p, k-1));}
			break; 
		}
		
		
		for(i=0;i<b;i++) {
			for(j=0;j<b;j++) {
				
			}
		}
		
		
		
		if(isPrime(p) && (n==Math.pow(p, k))) return (p-1)*(Math.pow(p, k-1));
		else if((mcd(a,b)==1) && (n==a*b)) return ((fiEulero(a))*(fiEulero(b)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int) (Math.random()%(MAX-MIN+1)+MIN);
		int b=(int) (Math.random()%(MAX-MIN+1)+MIN);
	 	
		
		if(isPrime(p) && (n==Math.pow(p, k))) return (p-1)*(Math.pow(p, k-1));
		else if((mcd(a,b)==1) && (n==a*b)) fiEulero(a)*fieulero(b);
	}

}
