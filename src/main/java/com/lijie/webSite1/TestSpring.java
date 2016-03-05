package com.lijie.webSite1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by lj on 16-3-5.
 */
@Component
public class TestSpring {
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
