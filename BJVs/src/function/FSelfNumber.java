package function;

// import java.util.Arrays;

// 이문제는 다시 봐야될것 같음 
public class FSelfNumber {
    public static void main(String[] args) {
        // System.out.println(d(33));
        boolean [] check = new boolean[10001];
        for(int i = 1 ; i<10001;i++){
            int n = d(i);
            if(n<10001)
                check[n] = true;
        }
        // System.out.println(Arrays.toString(check));
        for(int i =1 ;i<10001;i++){
            if(check[i]==false)
                System.out.println(i);
        }
    }
    public static int d(int n){
        int sum = n;
        while(n!=0){
            sum+=(n%10);
            n = n/10;
        }
        return sum;
        
    }
}
    //     boolean [] SelfNum = new boolean [10001];
        
    //     for(int i = 1 ; i <=10000; i++){
    //         for(int j = DSelf(i); j < 10001;j=DSelf(j)){
    //             // System.out.println(SelfNum[j]);
    //             if(SelfNum[j]) continue;
    //             SelfNum[j]=true;
    //         }
    //     }
    //     for(int i = 1; i<10001;i++){
    //         if(!SelfNum[i])
    //             System.out.println(i);
    //     }
    // }
    // public static int DSelf(int n){
    //     int total=n;
    //     while(n!=0){
    //         total += (n%10);
    //         n /= 10;
    //     }
    //     total+=n;
    //     return total;
    // }

// }
