package com.qilinxx.kuding.aop;

/**
 * @Auther: 余小北
 * @Date: 2018/9/27 11:59
 * @Description:
 */
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Created by wuwf on 17/4/27.
 * 日志切面
 */
@Aspect
@Component
public class LogAspect {
    Logger logger=LoggerFactory.getLogger(getClass());

    @Pointcut("execution(* com.qilinxx.kuding.controller.*.*(..))")// 定义切点表达式
    public void webLog(){}
    //后置异常通知
    @AfterThrowing("webLog()")
    public void throwss(JoinPoint jp){
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        System.out.println("方法异常时执行.....");
        logger.error("    出现异常!!!!!:"+"  访问的URL : " + request.getRequestURL().toString()+"  请求的类型 : " + request.getMethod()+"  访问者的IP地址 : " + request.getRemoteAddr()+"  方法名 : " +
                jp.getSignature().getDeclaringTypeName() + "." + jp.getSignature().getName());

    }

    //环绕通知,环绕增强，相当于MethodInterceptor
    @Around("webLog()")
    public Object arround(ProceedingJoinPoint pjp) {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        try {
            Object o =  pjp.proceed();
            logger.info("   访问的URL: " + request.getRequestURL().toString()+
                        "    请求的类型 : " + request.getMethod()+
                         "    访问者的IP地址 : " + request.getRemoteAddr()+"   方法名 : " + pjp.getSignature().getDeclaringTypeName() +
                        "." + pjp.getSignature().getName()+
                        "    该方法的返回值是："+o

            );
            return o;
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        }
    }
}