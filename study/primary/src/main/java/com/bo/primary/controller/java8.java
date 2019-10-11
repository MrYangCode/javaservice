package com.bo.primary.controller;

import java.util.function.Supplier;

/**
 * @Author: supermanYB
 * @Date: 2019/7/3 12:53
 * @Version 1.0
 */
public class java8 {

    public interface Function{
        int opera(int a);
    }

    public static void main(String[] args) {
        Function identity = x ->x;
        Function square = x ->x*x;
        Function cube = x -> x*x*x;
        Function inc = x->x+1;
        System.out.println(sum(identity,1,inc,10));
        System.out.println(sum(square,1,inc,10));
        System.out.println(sum(cube,1,inc,10));
    }

    public static int sum(Function term, int a,Function next, int b){
//        int sum = 0;
//        for(int i=0;i<=b;i++){
//            sum += term.opera(i);
//        }
//        return sum;

        if(a>b){
            return 0;
        }else{
            return term.opera(a) + sum(term, next.opera(a),next,b);
        }
    }

    public static String getString(Supplier<String> function){
        return function.get();
    }
}
