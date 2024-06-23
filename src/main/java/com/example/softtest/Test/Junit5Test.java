package com.example.softtest.Test;

import org.springframework.stereotype.Component;

/**
 * 被测对象
 */
@Component
public class Junit5Test {


    public int add(int a, int b) {
        return a + b;
    }

    public int doAdd(int i,int j){
        System.out.println("------------doAdd被执行了--------------");
        //被mock的函数会先执行，且只会执行一次
        System.out.println(add(i,j));
        return add(i,j);
    }

}
