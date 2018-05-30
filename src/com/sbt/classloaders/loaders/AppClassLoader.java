package com.sbt.classloaders.loaders;

public class AppClassLoader extends ApiClassLoader {
    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        String[] pathName = name.split("\\.");

        if(pathName.length > 1 && pathName[pathName.length - 2].equals("app")){
            return super.loadClass(name);
        }
        throw new ClassNotFoundException("Указанный для загрузки класс не находится в пакете app : " + name);
    }

}
