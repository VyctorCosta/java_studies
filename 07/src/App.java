import entities.Post;

public class App {

  public static void main(String[] args) {
    final Post post1 = new Post("2018-06-21T13:05:44Z", "Traveling to New Zealand",
        "I'm going to visit this wonderful country!", 12);
    post1.addComment("Have a nice trip");
    post1.addComment("Wow that's awesome!");
    final Post post2 = new Post("2018-07-28T23:14:19Z", "Good night guys", "See you tomorrow", 5);
    post2.addComment("Good night");
    post2.addComment("May the Force be with you");

    System.out.println(post1);
    System.out.println(post2);
  }

}
