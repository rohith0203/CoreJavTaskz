package com.Task5Final;

public class Demo {
private static Demo s=null;
public  String str;
private Demo()
{
    str = "Hello I am a string part of Singleton class";
}
public static Demo getInstance()
{
    if (s == null)
        s = new Demo();

    return s;
}
}
