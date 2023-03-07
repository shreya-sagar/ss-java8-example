package com.example.lambdaExpression;

public class RunnableDemo {

    public static void main(String[] args) throws InterruptedException {
        withoutLambdaExpression();
        withLambdaExpression();
    }

    private static void withoutLambdaExpression() throws InterruptedException {
        System.out.println("Calling withoutLambdaExpression");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Current Thread [" + Thread.currentThread().getName() + "]");
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();
    }

    private static void withLambdaExpression() throws InterruptedException {
        System.out.println("Calling withLambdaExpression");
        Runnable runnableLambda = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Current Thread [" + Thread.currentThread().getName() + "]");
            }
        };

        Thread thread = new Thread(runnableLambda);
        thread.start();
        thread.join();
    }
}
