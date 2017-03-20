/**

 理论上，任何循环都可以重写为递归形式
    有时候，为栈限制，需要“尾递归”
    java 不支持尾递归

 有些语言没有循环语句，只能使用递归


改为递归的关键是发现逻辑的相似性，不要忘记递归的出口


 构造相似性：
 如果没有明显的相似性，需要主动构造
 不能相似的原因很可能是缺少参数
 递归与数学上的递推公式很类似

 大量的练习去找感觉

 递归其实是一种踢皮球的感觉

 递归调用仅仅是被调函数恰为主调函数
 注意每次调用的层次不同
 注意每次分配形参并非同一变量
 注意返回的次序

 f(n=9)
    f(n=8)
        f(n=7)
            f(n=6)
 栈中存在多个 n

 逐层深入，有层次感

 关键： 相似性，出口

 */
public class One递归与循环 {

    public static void main(String[] args){
//        f(10);
//        f2(0,9);


        int[] a = {2,5,3,9,12,7};
        int sum = addAll(a);
//        int sum = f(a);
//        System.out.println(sum);
//        System.out.println(addAll2(a,a.length-1));

        // 求两个子串是否相同
        // System.out.println(isSameString("abc","abcd"));
        // 递归实现
        System.out.println(isSameString2("abcd","abcd"));

    }
    public static void f(int n){
        if(n>0){
            f(n-1);  //打印从0 - (n-1)
        }
        System.out.println(n);
    }

    // 参数设置的不合适 begin - end
    public static void f2(int begin,int end){
        if(begin>end){
            return;
        }
        System.out.println(begin);
        f2(begin + 1, end);
    }

    // 求累加和
    public static int addAll(int[] a){
        int x = 0;
        for(int i = 0;i < a.length;i++){
            x+=a[i];
        }
        return x;
    }

    // 求累加和(递归法)
    // 法二： 折半  mid = (begin + end) /2  [begin,mid) [mid,end)
    public static int addAll2(int[] a,int end){
        // [. [. [........]]]
        if(end == -1){
            return 0;
        }
        int sum = addAll2(a,end-1);
        return sum + a[end];
    }


    // 求两个串是否相同
    public static boolean isSameString(String s1,String s2){
        return s1.equals(s2);
    }

    // 求两个串是否相同(递归)
    public static boolean isSameString2(String s1,String s2){
        if(s1.length() == 0 && s2.length() == 0){
            return true;
        }
        if(s1.length() != s2.length()){
            return false;
        }
        if(s1.charAt(0) != s2.charAt(0)){
            return false;
        };

        return isSameString2(s1.substring(1),s2.substring(1));
    }



}
