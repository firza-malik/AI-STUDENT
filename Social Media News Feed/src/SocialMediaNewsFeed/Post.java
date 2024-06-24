/*o Design a class named Post with properties for author name, content (text), 
timestamp, and number of likes.
o Create a class named SocialMediaFeed that holds an array of Post objects 
representing a user's news feed.
o Implement functionalities in SocialMediaFeed to: 
 Add a new post to the feed, displaying it at the top (most recent).
 Like a post by a specific author and increment its like count (ensure the 
post exists).
 Search for posts by a particular author and display them in reverse 
chronological order (newest first).*/

package SocialMediaNewsFeed;

import java.time.LocalDateTime;

public class Post {
    private String author;
    private String content;
    private LocalDateTime timestamp;
    private int likes;

    public Post(String author, String content) {
        this.author = author;
        this.content = content;
        this.timestamp = LocalDateTime.now();
        this.likes = 0;
    }

    public String getauthor() {
        return author;
    }

    public String getcontent() {
        return content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public int getLikes() {
        return likes;
    }

    public void like() {
        this.likes++;
    }

    @Override
    public String toString() {
        return "Author: " + author + "\nContent: " + content + "\nTimestamp: " + timestamp + "\nLikes: " + likes + "\n";
    }
}
