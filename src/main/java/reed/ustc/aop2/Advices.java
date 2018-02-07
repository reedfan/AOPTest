package reed.ustc.aop2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/*created by fanqunsong
    Date : 2018/2/7
    Time : 16:42
    */
@Component
@Aspect
public class Advices {
    @Before("execution(* reed.ustc.aop2.Math.*(..))")
    public void before(JoinPoint jp){
        System.out.println("----------前置通知----------");
        System.out.println(jp.getSignature().getName());
    }

    @After("execution(* reed.ustc.aop2.Math.*(..))")
    public void after(JoinPoint jp){
        System.out.println("----------最终通知----------");
    }
}