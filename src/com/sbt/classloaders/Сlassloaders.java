package com.sbt.classloaders;

import com.sbt.classloaders.impl.*;
import com.sbt.classloaders.loaders.*;

public class Сlassloaders {

    public static void main(String[] args) {

        try {
            CalculatorImpl calculator = (CalculatorImpl) new ImplClassLoader()
                    .loadClass("com.sbt.classloaders.impl.CalculatorImpl")
                    .newInstance();

            AppClassLoader appClassLoader = (AppClassLoader) new AppClassLoader()
                    .loadClass("com.sbt.classloaders.impl.CalculatorImpl")
                    .newInstance(); // Exeption класс не принадлжит пакету app
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
