package ru.pdl.codewards;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;

public class FibonacciTestJMH {

  public static void main(String[] args) throws IOException, RunnerException {
    org.openjdk.jmh.Main.main(args);
  }

  @Benchmark
  public void init() {

  }

}