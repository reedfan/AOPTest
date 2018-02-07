package reed.ustc.aop2;

/*created by fanqunsong
    Date : 2018/2/7
    Time : 16:56
    */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop2.xml");
        Math math = ctx.getBean("math", Math.class);
        int n1 = 100, n2 = 5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
    }
}
