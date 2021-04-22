import java.util.stream.Stream;

public class FilterWithStreams {

    public static void main(String[] args){

        String message = "I'll send an SOS to the X world, " +
                "I hope that someone gets my X message in a bottle.";

        String result = Stream.of(message.split(" "))
                .filter(word -> !word.equals("X"))
                .map(word -> word.toUpperCase())   // .map(String::toUpperCase)
                .reduce("", (sentence, word) -> sentence + word + " ");

        System.out.println(result);
    }
}