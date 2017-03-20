/**
 * f(局面 x) ---> 胜负？
 *
 * 边界条件处理。。。
 *
 *
 * for(对我所有可能的走法){
 *     试着走一步  --->  局面y
 *     胜负 t = f(y);
 *     if(t==负){
 *         return 胜
 *     }
 *     return 负
 * }
 */
public class 博弈问题 {
    // 局面 : n 所剩球的数目
    public static boolean f(int n){
        if(n>=1 && f(n-1) == false){
            return true;
        }
        if(n>=3 && f(n-3) == false){
            return true;
        }
        if(n>=7 && f(n-7) == false){
            return true;
        }
        if(n>=8 && f(n-8) == false){
            return true;
        }
        return false;
    }


    /**
     *
     * f(局面x) --> 胜、负、平{
     *     tag = 负;
     *     for(对所有的可走位置){
     *         试走 --> 局面y
     *         结果 t = f(y)
     *         if(t == 负){
     *             return 胜
     *         }
     *         if(t == 平){
     *             tag = 可以走平
     *         }
     *
     *     }
     *
     * }
     *
     */

    // Nim定理公式： 无偏的2人游戏 ==== 尼姆堆
    // 3,4,5  可以从任何一堆拿走任何数量
    // 二进制规律

    /**
     * 11
     * 100
     * 101
     * ------
     * 列向1的数目为偶数： 对方必输
     * 2堆同样的硬币
     *
     *
     *
     * 高僧斗法  ===> 尼姆游戏
     * 把小和尚位置间的空隙：尼姆堆
     *
     * 偶数：两两组合
     * 奇数：在最高阶补充假的
     *
     * 小组是可以跟随操作，不改变尼姆堆的值  a...b
     *
     *
     */


    public static void main(String[] args){
        System.out.println(f(10));

    }
}
