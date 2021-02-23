package ru.pdl.codewards;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AlphabetPositionSearcher {

  public static String position(char alphabet) {
    return String.format("Position of alphabet: %d", alphabet - 96);
  }

  public static void main(String[] args) throws InterruptedException {
    final var r = new AlphabetPositionSearcher();
    int counter = 337;
    AtomicInteger executionCounter = new AtomicInteger();

    Runnable action = () -> {
      System.out.println(".");
      executionCounter.incrementAndGet();
      try {
        Thread.sleep(1000);
      } catch (InterruptedException exception) {
        System.out.println("baaaaad, " + exception);
      }
    };
    r.execute(action, counter);
  }

  public void execute(Runnable action, int nTimes) throws InterruptedException {
    final var service = Executors.newCachedThreadPool();
    for (int i = 0; i < nTimes; i++) {
      service.submit(action);
    }
    service.shutdown();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {}
  }

}
