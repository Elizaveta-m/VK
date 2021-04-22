package main.java.domain;

public class Post {
    private int id;
    private boolean registered;
    private PublicInfo publicInfo;
    private PostHeader postHeader;
    private CommentsInfo commentsInfo;
    private MainContent mainContent;
    private Communication communication;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public PublicInfo getPublicInfo() {
        return publicInfo;
    }

    public void setPublicInfo(PublicInfo publicInfo) {
        this.publicInfo = publicInfo;
    }

    public PostHeader getPostHeader() {
        return postHeader;
    }

    public void setPostHeader(PostHeader postHeader) {
        this.postHeader = postHeader;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public MainContent getMainContent() {
        return mainContent;
    }

    public void setMainContent(MainContent mainContent) {
        this.mainContent = mainContent;
    }

    public Communication getCommunication() {
        return communication;
    }

    public void setCommunication(Communication communication) {
        this.communication = communication;
    }
    // ADD LOGIC
}
