/**
 * Created by jcl on 2016/12/30.
 */
public class 整数 {
    public static int gcd(int a ,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    // a的n次幂对 p 取模   (a+b) % p = (a%p+b%p)%p  (a*b) % p = (a%p)*(b%p)%p
    public static int f(int a,int n,int p){
        long x = 1;
        for(int i = 0;i < n;i++){
            x = x*a;
        }
        return (int)(x%p);
    }

    /**
     * 素数就是不能再进行等分的整数，比如：7，11。而9不是素数，因为它可以平分为3等份。
     * 一般为最小的素数是2，接着是3，5
     * 请问，第100002（十万零2）
     */


    /**
     *
     * 所有这类的博弈问题都归结为尼姆游戏 Nimm
     *
     *
     *
     */



    public static void main(String[] args){
        int a = 15;
        int b = 40;
//        for(int i = a;i >= 1;i--){
//            if(a%i==0 && b%i==0){
//                System.out.println(i);
//                break;
//            }
//        }
        for(;;){
            if(a==0){
                System.out.println(b);
                break;
            }
            int t= a;
            a = b%a;
            b = t;

        }

    }
}
