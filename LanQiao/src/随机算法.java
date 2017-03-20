/**
 * Created by jcl on 2016/12/31.
 */
// 30人的班级，出现生日重复的概率有多大？


public class 随机算法 {

    public static void one() {
        // 概率模拟
        // 0-365随机产生数字，有没有碰撞
        final int N = 1000*100;
        int n = 0;
        for(int i = 0;i < N;i++){
            for(int j = 0;i < 30;i++){
                int[] x = new int[365];
                int p = (int)(Math.random()*365);
                if(x[p] == 1){
                    // 发生碰撞
                    n++;
                    break;
                }else {
                    x[p] = 1;
                }
            }
        }

        double r = (double)n /N;
        System.out.println(r);
    }

    /**
     *
     * 给定4张扑克牌，点数：1~10
     * 用 + - * / 运算，结果正好为24
     */
    public static void f(String[] ss){
        // 随机产生组合序列，计算==24  ok
        // 34 * 5 + 12 * 6
        for(int i = 0;i < 10000;i++){


        }

    }

    public static void main(String[] args){

    }
}
