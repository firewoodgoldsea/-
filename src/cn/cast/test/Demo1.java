package cn.cast.test;

public class Demo1 {

    public static void main(String[] args) {
        int sum = 1;
        for (int i=1;i<=10;i++){
            sum*=i;
        }
        System.out.println(sum);
        System.out.println(test(10));

    }
    public static int test(int i){
        if(i==1){
            return 1;
        }
        return test(i-1)*i;
    }
}
