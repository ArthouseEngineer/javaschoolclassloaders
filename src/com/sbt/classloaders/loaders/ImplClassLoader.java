package com.sbt.classloaders.loaders;

public class ImplClassLoader extends ApiClassLoader {
    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        String[] pathName = name.split("\\.");

      /*  System.out.println(pathName.length);
        System.out.println(pathName[3]); // Посмотрим где у нас имя пакета с классами для подргузки.
        */

        if(pathName.length > 1 && pathName[pathName.length - 2].equals("impl")){
            System.out.println("Класс успещно загружен!");
            return super.loadClass(name);
        }

        throw  new ClassNotFoundException("Попытка загрузить класс не находяшийся в пакете impl " + name);
    }
}
