/**
 * Created by jcl on 16/11/7.
 * X老板脾气古怪，他们公司的电话分机号都是3位数，老板规定，所有号码必须是降序排列，且不能有重复的数位。比如：

 751,520,321 都满足要求，而，
 766,918,201 就不符合要求。

 现在请你计算一下，按照这样的规定，一共有多少个可用的3位分机号码？
 */
public class One{
    public static void main(String[] args){
        String num;
        int count=0;
        for(int i = 0;i < 10;i++){
            for(int j = 0;j < 10;j++){
                for(int k = 0;k < 10;k++){
                    num = String.format("%d%d%d",i,j,k);
                    if(i>j && j>k && i!=j &&j!=k){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

    }
}
