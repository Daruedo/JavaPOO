package videoviewerproject;
public class Video implements ActionVideos {
    private String title;
    private int rating;
    private int views;
    private int likes;
    private boolean playing;
    private float length;

    public Video(String title, float length) {
        this.title = title;
        this.rating = 1;
        this.views = 0;
        this.likes = 0;
        this.playing = false;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        int newRating;
        newRating = (int) ((this.rating + rating)/this.views);
        this.rating = newRating;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public void play(){
        this.playing = true;
    }
    @Override
    public void pause(){
        this.playing = false;
    }
    @Override
    public void like(){
        this.likes ++;
    }

    @Override
    public String toString(){
        return " - " +  title + "\n - Avaliação: " + rating + "\n - Visualizações: " + views + "\n - Curtidas: " + likes + "\n - Reproduzindo: " + playing + "\n - Duração: " + length + " min\n";
    }

}
