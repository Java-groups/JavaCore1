package HW10;

/* Enter a sentence that contains the words between more than one space.
 Convert all spaces, consecutive, one. For example,
 if we introduce the sentence "I    am      learning     Java     Core»,
  we have to get the "I'm learning Java Core»

 */

public class Task2 {
    public static void main(String[] args) {

        String sentence = "I  am  learning       Java   Core";
        String spaceRemoving = sentence.replaceAll("[\\s]+", " ");
        System.out.println(spaceRemoving.replace("I am", "I`m"));

    }
}
