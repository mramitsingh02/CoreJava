package com.tester.java8.collection.lambda;

import java.time.Instant;
import java.util.stream.Stream;

public class ParallelismTest {
    public static void main(String[] args) {
        Instant start = Instant.now();
        Stream.generate(App::slow)
                .parallel()
                .limit(4);

//                var duration =
//
    }


  public static class App{

      public static int slow() {
          try {
              Thread.sleep(1000);
          }catch (Exception e){
              e.printStackTrace();
          }

          return 1;
      }
  }
}
