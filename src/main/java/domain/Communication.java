package main.java.domain;

public class Communication {
    private int postId;

    private String like;
    private int likeNumber;
    private String likeUrl;
    private String likePicUrl;

    private String repost;
    private int repostNumber;
    private String repostUrl;
    private String repostPicUrl;

    private String commentsInfo;
    private String commentsUrl;
    private String commentsPicUrl;
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public int getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(int likeNumber) {
        this.likeNumber = likeNumber;
    }

    public String getLikeUrl() {
        return likeUrl;
    }

    public void setLikeUrl(String likeUrl) {
        this.likeUrl = likeUrl;
    }

    public String getLikePicUrl() {
        return likePicUrl;
    }

    public void setLikePicUrl(String likePicUrl) {
        this.likePicUrl = likePicUrl;
    }

    public String getRepost() {
        return repost;
    }

    public void setRepost(String repost) {
        this.repost = repost;
    }

    public int getRepostNumber() {
        return repostNumber;
    }

    public void setRepostNumber(int repostNumber) {
        this.repostNumber = repostNumber;
    }

    public String getRepostUrl() {
        return repostUrl;
    }

    public void setRepostUrl(String repostUrl) {
        this.repostUrl = repostUrl;
    }

    public String getRepostPicUrl() {
        return repostPicUrl;
    }

    public void setRepostPicUrl(repostPicUrl) {
        this.repostPicUrl = repostPicUrl;
    }

    public String getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(String commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public String getCommentsPicUrl() {
        return commentsPicUrl;
    }

    public void setCommentsPicUrl(String commentsPicUrl) {
        this.commentsPicUrl = commentsPicUrl;
    }

}
