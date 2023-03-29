package entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
  private Instant moment;
  private String title;
  private String content;
  private Integer likes;
  private List<Comment> comments = new ArrayList<>();

  public Post(String moment, String title, String content, Integer likes) {
    this.moment = Instant.parse(moment);
    this.title = title;
    this.content = content;
    this.likes = likes;
  }

  public void addComment(String comment) {
    comments.add(new Comment(comment));
  }

  @Override
  public String toString() {
    final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
    final StringBuilder sb = new StringBuilder();
    sb.append(title + "\n");
    sb.append(likes + " Likes - " + fmt.format(moment) + "\n");
    sb.append(content + "\n");
    sb.append("Comments:\n");
    for (Comment comment : comments) {
      sb.append(comment.getText() + "\n");
    }

    return sb.toString();
  }
}
