package com.jixin;

public class PlusExpression extends Expression {
    public void interpreter(Context context) {
        //提示信息
        System.out.println("自动递增");
        //获取上下文环境
        String inPut = context.getInPut();
        //进行类型转换
        int intInPut = Integer.parseInt(inPut);
        //进行递增
        ++ intInPut;
        //对上下文环境进行赋值
        context.setInPut(String.valueOf(intInPut));
        context.setOutPut(intInPut);
    }
}
