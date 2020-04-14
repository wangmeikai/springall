package com.wmk.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**各通知间的逻辑关系
 * try{
 *     try{
 *          //环绕前置
 *         //@Before
 *         method.invoke(..);
 *         //环绕后置
 *     }finally{
 *         //@After
 *     }
 *     //@AfterReturning
 * }catch(){
 *     //@AfterThrowing
 * }
 */
//@Component
//@Aspect
public class MyAspect {
    @Pointcut("execution(* com.wmk..*.cry(..))")
    public void pointCut(){}

    @Before("pointCut()")     //前置通知
    public void beforeAdvice(){
        System.out.println("BeforeAdvice()");
    }

    @After("pointCut()")        //后置通知
    public void afterAdvice(){
        System.out.println("afterAdvice()");
    }

    @Around("pointCut()")     //环绕通知
    public Object aroundAdvice(ProceedingJoinPoint pjp){
        Object rtValue = null;
        try{
            Object[] args = pjp.getArgs();//得到方法执行所需的参数
            System.out.println("环绕前置 ");
            rtValue = pjp.proceed(args);//明确调用业务层方法（切入点方法）
            System.out.println("环绕后置");
            return rtValue;
        }catch (Throwable t){
            throw new RuntimeException(t);
        }
    }

    @AfterReturning("pointCut()")
    public void afterReturningAdvice(){
        System.out.println("afterReturningAdvice()");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowingAdvice(){
        System.out.println("afterThrowingAdvice()");
    }
}
