
public class Two经典的递归问题 {

    /**
        n 开头 + 电灯： 试探和回溯

     */


    /**
     求两个串的最大公共子序列的长度
     算法： 可解，优化

     */
    public static int f3(String s1,String s2){
        if(s1.length() == 0 || s2.length() == 0){
            return 0;
        }
        if(s1.charAt(0) == s2.charAt(0)){
            return f3(s1.substring(1),s2.substring(1)) + 1;
        }else {
            return Math.max(f3(s1.substring(1),s2),f3(s1,s2.substring(1)));
        }
    }











    /**
     在 n 个球中，任意取出m 个（不放回），求有多少种不同取法
     平地起风雷

     */
    public static int f(int n,int m){
        // a b c  ...  ab ac bc
        if(n<m){
            return 0;
        }
        if(n==m){
            return 1;
        }
        if(m==0){
            return 1;
        }
        // n 个里有个特殊球x ，把所有的取法分为两部分，包不包含这个 x
        return f(n-1,m-1) + f(n-1,m);
    }
    /**
     求 n 个元素的全排列
        abc acb bac bca cab cba
     */
    public static void f2(char[] a,int k){
        // 0 与后面每个元素交换
        // 1 与后面每个元素交换
        // k：当前交换位置，从第 k 个从最后一个

        if(k == a.length){
            for(int i = 0;i < a.length;i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        for(int i = k;i < a.length;i++){
            // 试探
            {char t = a[k];a[k] = a[i];a[i] = t;}
            f2(a,k+1);
            // 再进行回溯
            {char t = a[k];a[k] = a[i];a[i] = t;}
        }
    }

    public static void main(String[] args){
//        int k = f(10,3);
//        System.out.println(k);


        // 全排列
//        char[] data = "ABC".toCharArray();
//        f2(data,0);
        int k = f3("abcd","xbacabcwefewd");
        System.out.println(k);




    }
}
