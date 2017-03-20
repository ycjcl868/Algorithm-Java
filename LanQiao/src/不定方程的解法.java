/**
 * Created by jcl on 2016/12/31.
 */


/**
 * ax+by = c  x,y整数，a,b互质
 *
 * 买不到的数目
 * 小明开了一家糖果店，他别出心裁：把水果糖包成4颗一包和7颗一包的两种。
 * 糖果不能拆包卖
 * 小朋友来买糖时，他就用这两种包装来组合，当然有些糖果数目是无法组合出来的，比如
 * 要买10颗糖
 *
 * 你可以用计算机测试一下，在这种包装情况下，最大不能买到的数量是17，大于17的任何数字都可以用4和7组合出来
 * 本题的要求就是在已知两个包装的数量时，求最大不能组合出的数字
 *
 * 输入：
 * 两个正整数，表示每种包装中糖的颗数（都不多于1000）
 * 要求输出：
 * 一个正整数，表示最大不能买到的糖数
 */

class A{
    static final int N = 1000*100;
    static int se(int[] da,int a){
        int n = 0;
        for(int i = 0;i < da.length;i++){
            if(da[i] == 1){
                n++;
                if(n>=a){
                    return i-a;
                }
            }else{
                n = 0;
            }
        }
        return -1;
    }

    static void f(int a,int b){
        int[] da = new int[N];
        for(int i = 0;i <= N/a;i++){
            for(int j = 0;j <= (N-i*a)/b;j++){
                if(i*a+b*j<N){
                    da[i*a+b*j] = 1;
                }
                
            }
        }
        System.out.println(se(da,a));
    }
}





public class 不定方程的解法 {
    public static void main(String[] args){
        // ax+by = c   a=4,b=-5,c=7
        // ax = c - by
        // 1. 求出一个特殊解  x0  yo
        // 2. 求通解：x = x0+bt,y = y0-at


        // 4*x-5*y = 7
        for(int y = 0;y < 100;y++){
            if((7-(-5*y))%4==0){
                System.out.println("y="+y);
                System.out.println("x="+(7-(-5*y))/4);
                break;
            }
        }




    }
}
