package in.vamsoft.training.employee;

import java.util.Locale;
import java.util.function.*;
import java.time.*;

public class InbuildFnInterfaces {
  public static void main(String[] args) {
    Predicate<Integer> everOrOdd = (x) -> x % 2 == 0 ? true : false;
    System.out.println("Is 10 evern or odd:" + (everOrOdd.test(10) ? "10 is even" : "10 is odd"));

    Consumer<String> upperDisplay = str->System.out.println(str.toUpperCase());
    upperDisplay.accept("Hello Lambdas");

    Function<String, Integer> findLength = (str) -> str.length();
    System.out.println("Length of sudha" + findLength.apply("sudha"));

    Supplier<String> getDayOfWeek = () -> LocalDate.now().getDayOfWeek().name();
    System.out.println("Today id:" + getDayOfWeek.get());

  }

}
