package com.cenyol.study.designPartner.P02_DecoratorPattern.MyJavaIoDecorator;


import java.io.*;

/**
 * Created by cenyol on 12/04/2017.
 */
public class Client {
    public static void main(String[] args){
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("/Users/cenyol/tmp/test.txt")
                    )
            );

            while ((c = in.read()) >= 0){
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
