package com.aoligei.logging.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/3 9:52
 */
@Component
@Slf4j
@Aspect
public class LogAspect {

    @Pointcut("@annotation(com.aoligei.logging.aop.log.Log)")
    public void testPointcut() {
        // 该方法无方法体,主要为了让同类中其他方法使用此切入点
    }

    /**
     * 横切所有service下的public方法
     */
    @Pointcut("execution(public * com.aoligei.logging.service.*.*(..))")
    public void servicePointCut() {

    }


    /**
     * 定义前置通知
     * execution(* biz.UserBiz.*(..)) 表示  所有修饰符的所有返回值类型  biz.UserBiz 包下的所有方法
     * 在方法执行之前执行
     */
    @Before("testPointcut()")
    public void before(JoinPoint joinPoint) {
        //获取方法名
        String name = joinPoint.getSignature().getName();
        /*获取参数列表*/
        List<Object> objects = Arrays.asList(joinPoint.getArgs());
        log.info("前置通知，方法名：" + name + "\t参数列表是" + objects);
    }

    /**
     * 后置通知
     * 在方法返回后执行，无论是否发生异常
     * 不能访问到返回值
     */
    @After("testPointcut()")
    public void after() {
        log.info("后置通知---->after....");
    }

    /**
     * 配置环绕通知,使用在方法logPointcut()上注册的切入点
     *
     * @param joinPoint join point for advice
     */
    @Around("testPointcut()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result;
        long l = System.currentTimeMillis();
        System.out.println(l);
        result = joinPoint.proceed();
        return result;
    }
}
