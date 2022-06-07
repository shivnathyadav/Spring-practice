package aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

//
//    @Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
//    public void beforeAddAccountAdvice() {
//        System.out.println("\n=====>>> Executing @Before advice on method");
//    }

    @Pointcut("execution(* aopdemo.dao.*.*(..))")
    private void forDaoPackage() {}

    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n=====>>> Executing @Before advice on method");
    }

    @Before("forDaoPackage()")
    public void performApiAnalytics() {
        System.out.println("\n=====>>> Performing API analytics");
    }


//
//    @Pointcut("execution(* aopdemo.dao.*.*(..))")
//    private void forDaoPackage() {}
//
//    // create pointcut for getter methods
//    @Pointcut("execution(* aopdemo.dao.*.get*(..))")
//    private void getter() {}
//
//    // create pointcut for setter methods
//    @Pointcut("execution(* aopdemo.dao.*.set*(..))")
//    private void setter() {}
//
//    // create pointcut: include package ... exclude getter/setter
//    @Pointcut("forDaoPackage() && !(getter() || setter())")
//    private void forDaoPackageNoGetterSetter() {}
//
//    @Before("forDaoPackageNoGetterSetter()")
//    public void beforeAddAccountAdvice() {
//        System.out.println("\n=====>>> Executing @Before advice on method");
//    }
//
//    @Before("forDaoPackageNoGetterSetter()")
//    public void performApiAnalytics() {
//        System.out.println("\n=====>>> Performing API analytics");
//    }

}

