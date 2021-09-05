package com.study.javabasic.desginmode.factorymode;

/**
 * 剪头发的工厂
 */
public class HairFactory {
    public static HairInterface makeHair(String className){
        try {
            Class c = Class.forName(className);
            return (HairInterface) c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
