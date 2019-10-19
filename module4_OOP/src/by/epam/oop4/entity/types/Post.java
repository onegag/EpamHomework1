package by.epam.oop4.entity.types;

public enum Post {
    DEVELOPER("developer"), TESTER("tester"), PM("project manager");

    private String post;


    Post(String post) {
        this.post=post.toLowerCase();
    }
}
