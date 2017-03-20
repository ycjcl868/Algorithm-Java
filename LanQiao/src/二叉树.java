/**
 * 线性结构、数组，vector stack
 * 树形结构
 * 图
 *
 * 二叉树有畸形的可能
 * 改进方法一：平衡二叉树
 * 定义：
 * 左右子树的高度相差不超过1
 *
 * 调整方法：
 * LL型：右旋
 * RR型：左旋
 * LR型：先左旋，再右旋
 * RL型：先右旋，再左旋
 */

// 递归定义
class BiTree{
    private int v;
    private BiTree l;
    private BiTree r;

    public BiTree(int x){
        v = x;
    }
    public void add(BiTree the){
        if(the.v < v){
            if(l == null){
                l = the;
            }else {
                l.add(the);
            }
        }else{
            if(r == null){
                r = the;
            }else{
                r.add(the);
            }
        }
    }

    // 中序遍历
    public void mid_trav(){
        if(l!=null){
            l.mid_trav();
        }
        System.out.println(v);
        if (r!=null){
            r.mid_trav();
        }
    }
}


/**
 * 哈夫曼树
 * 考虑字母的编码问题：
 * 假设一篇文章中含有如下字母：a,b,c,d,e,f
 * 每个字母出现的频度如下：
 * a:45  b:13  c:12  d:16  e:9  f:5
 *
 *
 *
 */

/**
 * 数据结构：
 * 线性结构  列表，数组，栈
 * 非线性：树  图
 * 二叉树  二叉排序
 *
 */

public class 二叉树 {
    public static void main(String[] args){
        BiTree root = new BiTree(100);
        root.add(new BiTree(50));
        root.add(new BiTree(80));
        root.add(new BiTree(40));
        root.add(new BiTree(35));

        root.mid_trav();

    }
}
