import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_K = 100000;
    
    public static int n;
    public static int[] a = new int[2*MAX_K +1];
    public static int[] cntB = new int[2*MAX_K +1];
    public static int[] cntW = new int[2*MAX_K +1];
    public static int b,w,g;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // 현재 위치
        int cur = MAX_K; 

        for(int i=1; i<=n; i++){
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c == 'L'){
                // x칸 왼쪽 화이트
                while(x-- >0){
                    a[cur] =1;
                    cntW[cur]++;
                    if(x>0) cur--;
                }
            }
            else{
                // x칸 오른쪽 블랙
                while(x-- >0){
                    a[cur] =2;
                    cntB[cur]++;
                    if(x>0) cur++;
                }
            }

        }

        for(int i=0; i<=2*MAX_K; i++){
            if(cntB[i]>=2 && cntW[i]>=2) g++;
            else if(a[i] ==1) w++;
            else if(a[i] ==2) b++;
        } 

        System.out.print(w+" "+b+" "+g);
    }
}