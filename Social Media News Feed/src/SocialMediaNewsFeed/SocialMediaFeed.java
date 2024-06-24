package SocialMediaNewsFeed;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaFeed {
    private ArrayList<Post> posts;

    public SocialMediaFeed() {
        posts = new ArrayList<>();
    }

    // Add post
    public void addPost(Post post) {
        posts.add(0, post);
    }

    // Like a post by a specific author and increment its like count (ensure the post exists).
    public boolean likePost(String author) {
        for (Post post : posts) {
            if (post.getauthor().equals(author)) {
                post.like();
                return true;
            }
        }
        return false;
    }

    // Search for posts by a particular author
    public List<Post> searchPost(String author) {
        List<Post> authorPosts = new ArrayList<>();
        for (Post post : posts) {
            if (post.getauthor().equals(author)) {
                authorPosts.add(post);
            }
        }
        return authorPosts;
    }

    // Display posts
    public void displayPosts() {
        for (Post post : posts) {
            System.out.println(post);
        }
    }

    public static void main(String[] args) {
        Post post1 = new Post("jawaria", "Hello, this is my first post!");
        Post post2 = new Post("bushra", "It's a beautiful day!");
        Post post3 = new Post("jawaria", "I love programming!");
        Post post4 = new Post("nabiya", "my favourite language is HTML and CSS :)");

        SocialMediaFeed feed = new SocialMediaFeed();

        feed.addPost(post1);
        feed.addPost(post2);
        feed.addPost(post3);
        feed.addPost(post4);

        System.out.println("Display the feed:");
        feed.displayPosts();

        feed.likePost("jawaria");

        System.out.println("\nDisplay the feed after liking jawaria's post:");
        feed.displayPosts();

        System.out.println("\nSearching posts by jawaria:");
        List<Post> jawariaPosts = feed.searchPost("jawaria");
        for (Post post : jawariaPosts) {
            System.out.println(post);
        }
    }
}
