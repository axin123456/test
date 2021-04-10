package com.jixin;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        String number = "10";
        Context context = new Context(number);

//        Expression plusExpression = new PlusExpression();
//        plusExpression.interpreter(context);
//        System.out.println("转换的数据：" + context.getInPut());

//        Expression minusExpression = new MinusExpession();
//        minusExpression.interpreter(context);
//        System.out.println("转换的数据：" + context.getInPut());

        List<Expression> list = new ArrayList<Expression>();
        list.add(new PlusExpression());
        list.add(new PlusExpression());
        list.add(new MinusExpession());

        for (Expression expression : list) {
            expression.interpreter(context);
            System.out.println("转换的数据：" + context.getInPut());
        }
    }
}
