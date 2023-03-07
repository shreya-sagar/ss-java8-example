package com.example.lambdaExpression;

import java.io.File;
import java.io.FileFilter;

public class FileFilterDemo {

    public static void main(String[] args) {
        withoutLambdaExpression();
        withLambdaExpression();
    }

    private static void withoutLambdaExpression(){
        System.out.println("Calling withoutLambdaExpression");
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".xlsx");
            }
        };

        File directory = new File("C:\\Users\\Shreya Sagar\\Documents\\test");
        File[] files = directory.listFiles(fileFilter);

        for (File file: files) {
            System.out.println("file: "+file);
        }
    }

    private static void withLambdaExpression(){
        System.out.println("Calling withLambdaExpression");
        FileFilter fileFilterLambda = (File pathname) -> pathname.getName().endsWith(".xlsx");

        File directory = new File("C:\\Users\\Shreya Sagar\\Documents\\test");
        File[] files = directory.listFiles(fileFilterLambda);

        for (File file: files) {
            System.out.println("file: "+file);
        }
    }
}
