package 递归方法;

/*
* 有如下一个数列
* f(0)=1
* f(1)=4
* f(n+2)=2*f(n+1)+f(n)
* 其中n是大于0的整数，求f(10)的值
* */

/*
* 方法中调用它自身就是方法递归
* */


/*
* 问题二
* 有如下一个序列
* f(20)=1
* f(21)=4
* f(n+2)=2*f(n+1)+f(n)
* 求取 f()
* */


public class DGshow {

    public int  geetFn(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
         return  2*geetFn(n-1)+geetFn(n-2);
        }
    }

    public int  geetFn2(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            return geetFn(n+2)-2*geetFn(n+1);
        }
    }

}
