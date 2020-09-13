package highmath;
        /*实现 int sqrt(int x) 函数。---牛顿迭代法

        计算并返回 x 的平方根，其中 x 是非负整数。
        由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
                示例 1:
                输入: 4
                输出: 2
                示例 2:

                输入: 8
                输出: 2
                说明: 8 的平方根是 2.82842.由于返回类型是整数，小数部分将被舍去。*/
        public class Sqrt {
            static int number;
            public static void main(String[] args) {
                System.out.println(mySqrt(8));
            }
            public static int mySqrt(int x) {
              number=x;
              if(x==0)return 0;
              return (int)sqrts(x);
            }
            public static double sqrts(double x){
                double res=(x+number/x)/2;
                if(res==x){
                    return res;
                }else{
                    return sqrts(res);
                }
            }
        }
