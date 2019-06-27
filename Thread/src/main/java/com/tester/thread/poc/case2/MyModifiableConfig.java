package com.tester.thread.poc.case2;

public class MyModifiableConfig extends MyConfig {

    private MyConfig myConfig;


    public MyModifiableConfig(String alphabateRange, String numberRange) {
       super(alphabateRange, numberRange);
    }

    public void update(MyConfig myConfig) {
            this.myConfig = myConfig;
        System.out.println("Config Id is updated with " + myConfig.hashCode());
    }

    public String getAlphabateRange() {
        return myConfig.getAlphabateRange();
    }

    public String getNumberRange() {
        return myConfig.getAlphabateRange();
    }

    @Override
    public String toString() {
        return "MyModifiableConfig{" +
                "myConfig=" + myConfig +
                '}';
    }
}
