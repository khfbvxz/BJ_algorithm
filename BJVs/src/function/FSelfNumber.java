package function;

public class FSelfNumber {
    public static void main(String[] args) {
        int [] SelfNum = new int [10001];
        int count=1;

        for(int i = 1 ; i <=10000; i++){
            
        }
    }
    public static int DSelf(int n){
        int total=n;
        while(n!=0){
            total += (n%10);
            n /= 10;
        }
        return total;
    }

}
