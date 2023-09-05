package org.function.streamapi;

import java.util.stream.IntStream;

public class Java8Stream_5_1_10 {
    public static void main(String[] args) {
        IntStream.range(1,10).forEach(val -> System.out.print(val+"\t"));
        IntStream.range(0,10).forEach(System.out :: print);
    }
}
