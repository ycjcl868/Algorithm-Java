/**
 * Created by jcl on 2016/11/30.
 */
public class Three经典的递归问题 {
    /**
     反转串
     把“ cba”称为"abc"的反转串。

     */
    public static String reverseString(String x){
        if(x == null || x.length() < 2){
            return x;
        }
        return reverseString(x.substring(1))+x.charAt(0);
    }
    public static String reverseString2(String x){
        return new StringBuffer(x).reverse().toString();
    }

    /**
     杨辉三角
     (a+b)的n次幂的展开式中各项的系数很有规律，对于n=2,3,4时分别是：1 2 1， 1 3 3 1，
     1 4 6 4 1，这些系数构成了著名的杨辉三角
     */
    public static int f(int m, int n){
        if(m == 0){
            return 1;
        }
        if( n == 0 || n == m){
            return 1;
        }
        return f(m-1,n-1) + f(m-1,n);
    }

    /**
     计算3个A，2个 B 可以组成多少种排列的问题（如：AAABB, AABBA）是组合数学
     计算 m 个 A，n 个 B 可以组合成多少个不同排列


     */

    public static int f2(int m,int n){
        if(m == 0 || n == 0){
            return 1;
        }
        return f2(m-1,n) + f2(m,n-1);
    }

    /**
     对于正整数n=6，可以分划为：
     6
     5+1
     4+2,4+1+1
     3+3,3+2+1,3+1+1+1
     2+2+2,2+2+1+1,2+1+1+1+1
     1+1+1+1+1+1

     对 n 进行加法划分
     a 缓冲，k：当前的位置
     */
    public static void f3(int n,int[] a,int k){
        if(n<=0){
            for(int i = 0;i < k;i++){
                System.out.print(a[i]+ " ");
            }
            System.out.println();

            return;
        }
        for(int i = n;i > 0;i--){
            if(k>0 && i>a[k-1]){
                continue;
            }
            a[k] = i;
            f3(n-i,a,k+1);
        }
    }

    /**
    某财务部门结账时发现总金额不对头，很可能是从明细上漏掉了某1笔或几笔，如果已知明细账目清单，能通过编程搭到漏掉的是哪1笔或几笔吗？

     */

    // err_um：有错的和
    // a：明细
    // k：当前处理的位置
    // cur_sum：前边的元素累加和
    // b: 记录取舍
    public static void f4(int err_sum,int[] a, int k,int cur_sum,boolean[] b){

        if(cur_sum > err_sum){
            return;
        }
        if(err_sum == cur_sum){
            for(int i = 0;i < b.length;i++){
                if(b[i] == false){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            return;
        }
        if(k >= a.length){
            return;
        }

        b[k] = false;
        f4(err_sum,a,k+1,cur_sum,b);
        b[k] = true;
        cur_sum += a[k];
        f4(err_sum,a,k+1,cur_sum,b);

        // 回溯 !!!
        b[k] = false;



    }


    public static void main(String[] args){
//        System.out.println(reverseString("abcd"));

//        int level = 2;
//        for(int i = 0;i <= level;i++){
//            System.out.print(f(level,i) + " ");
//        }
//        System.out.println();
//        System.out.println(f2(2,1));


//        int[] a = new int[1000];
//        f3(6,a,0);

        int sum = 6;
        int[] a= {3,2,4,3,1};
        boolean[] b = new boolean[a.length];
        f4(6,a,0,0,b);

    }

}
