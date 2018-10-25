package org.dingue.ticketing.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DiAB {

    private A a;
    private B b;

    @Autowired
    public void setDi(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public String pushAB() {
        System.out.println("aa");
        return a.returnA()+b.returnB();
    }
}
