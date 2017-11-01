package in.vamsoft.training.employee;

import java.util.Scanner;

public class Threadproducer extends Thread {
  Consumer consumer;
  private int number;

  public void setConsumer(Consumer consumer) {
    this.consumer = consumer;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public Threadproducer(String name) {
    super(name);

  }

  public void run() {
    try {
      Scanner s = new Scanner(System.in);
      int num = 0;
      System.out.println("Please Enter a number:");
      while ((num = s.nextInt()) > 0) {
        System.out.println("Number rad by producer:" + num);
        this.number = num;
        synchronized (consumer) {
          wait();
        }
        synchronized (this) {
          wait();
        }

      }
    } catch (InterruptedException e) {
      System.out.println(e);
    }
  }

}

class Consumer extends Thread {
  Threadproducer producer;

  public Consumer(String name) {
    super(name);
  }

  public void setProducer(Threadproducer producer) {
    this.producer = producer;
  }

public void run() {
  for(int i=0;i<=5;i++) {
    try {
      synchronized (this) {
        wait();
        
      }
    }catch(InterruptedException e)
    {
      System.out.println(e);
    }
    int fact=factorial(producer.getNumber());
    System.out.println("Factorial Calculated for"+producer.getNumber()+":"+fact);
    synchronized (producer) {
      producer.notify();
      
    }
  }
}

  private int factorial(int num) {
    int fact = 1;
    while (num > 0) {
      fact = fact * num;
      num--;
    }
    return fact;
  }

}

class ThreadFactorial {
  public static void main(String[] args) {
    Threadproducer producer = new Threadproducer("producer");
    Consumer consumer = new Consumer("consumer");
    consumer.start();
    producer.start();

  }
}