import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int cnt=0;
        while(cnt<n){
            for(int i=1; i<=n; i++){
                System.out.print(i);
            }
            System.out.println();
            cnt++;
        }
    
    }
}