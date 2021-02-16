public class Lab_2_1_5 {
    public static int f(int n){
        if (n==0) {
            return 0;
        }else{
            if (n == 1) {
                System.out.println(">"+n);
                System.out.println("");
                return 1;
            } else {
                System.out.println(n);
                return f(n - 2) + f(n - 1);
            }
        }
    }
    public static void main(String[]args){
        m(5);
    }
    public static int m(int s){
        for(int j=s;j>0;j--){
            for (int i=j;i>0;i--){
                System.out.println(i);
            }
            System.out.println("");
        }
        return 0;
    }
}
