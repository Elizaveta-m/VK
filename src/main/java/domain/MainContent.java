package main.java.domain;

public class MainContent {
    private int id;

    private String text;
    private String pictureUrl;
    private String videoUrl;

    private String questionnaire;
    private String questionnaireId;
    private String questionnaireUrl;

    private int referenceId;
    private String referenceUrl;

    private String addToFavoriteUrl;
    private String addToFavoritePicUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(String questionnaire) {
        this.questionnaire = questionnaire;
    }

    public String getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(String questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    public String getQuestionnaireUrl() {
        return questionnaireUrl;
    }

    public void setQuestionnaireUrl(String questionnaireUrl) {
        this.questionnaireUrl = questionnaireUrl;
    }

    public int getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(int referenceId) {
        this.referenceId = referenceId;
    }

    public String getReferenceUrl() {
        return referenceUrl;
    }

    public void setReferenceUrl(String referenceUrl) {
        this.referenceUrl = referenceUrl;
    }

    public String getAddToFavoriteUrl() {
        return addToFavoriteUrl;
    }

    public void setAddToFavoriteUrl(String addToFavoriteUrl) {
        this.addToFavoriteUrl = addToFavoriteUrl;
    }

    public String getAddToFavoritePicUrl() {
        return addToFavoritePicUrl;
    }

    public void setAddToFavoritePicUrl(String addToFavoritePicUrl) {
        this.addToFavoritePicUrl = addToFavoritePicUrl;
    }
}
