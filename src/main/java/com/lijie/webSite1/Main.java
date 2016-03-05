package com.lijie.webSite1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by lj on 16-3-5.
 */
@Anot
public class Main {

    private TestSpring ts;

    public TestSpring getTs() {
        return ts;
    }

    @Autowired
    @Qualifier("theTestSpring")
    public void setTs(TestSpring ts) {
        ts.setVal(1111);
        this.ts = ts;
    }

    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Main mn= (Main) applicationContext.getBean("main");
        System.out.println(mn.getTs().getVal());

    }
}
