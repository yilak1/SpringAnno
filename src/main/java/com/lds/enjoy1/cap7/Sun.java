package com.lds.enjoy1.cap7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sun {
    private Moon moon;

    @Autowired
    public Sun(Moon moon){
        this.moon = moon;
        System.out.println("Sun-Constructor...");
    }

    public Moon getMoon() {
        return moon;
    }
    public void setMoon(Moon moon) {
        this.moon = moon;
    }

    @Override
    public String toString() {
        return "Sun{" +
                "moon=" + moon +
                '}';
    }
}
