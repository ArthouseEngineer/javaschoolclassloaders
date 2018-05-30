package com.sbt.classloaders.app;

import com.sbt.classloaders.impl.*;

public class MyApp extends  App {
    private CalculatorImpl calc;

    public MyApp(CalculatorImpl calc) {
        this.calc = calc;
    }

    public MyApp() {
        this.calc = null;
    }
}
