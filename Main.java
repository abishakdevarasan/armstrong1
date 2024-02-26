import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            int c=0;
            int sum=0;
            int f=a[i];
            int d=a[i];
            while(f!=0){
                f=f/10;
                c=c+1;
            }
            while(d!=0){
            int x=1;
            int r=d%10;
            for(int b=0;b<c;b++){
            x=x*r;
            }
            sum=sum+x;
            d=d/10;
            }
            if(sum==a[i]){
                System.out.println(a[i]);
            }
        }
    }

}
