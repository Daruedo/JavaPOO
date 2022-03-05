package videoviewerproject;
public class Watch {
    private Padawan spectator;
    private Video video;

    public Watch(Padawan spectator, Video video){
        this.spectator = spectator;
        this.video = video;
        this.spectator.setWatched(this.spectator.getWatched() + 1);
        this.video.setViews(this.video.getViews() + 1);
        this.spectator.setExp(this.spectator.getExp() + (this.video.getLength()* 0.15f));
    }

    public void rate(){
        this.video.setRating(5);
    }
    public void rate(int rating){
        this.video.setRating(rating);
        
    }
    public void rate(float perc){
        int r = 0;
        if (perc <= 20){
            r = 3;
        } else if (perc <= 50) {
            r = 5;
        } else if (perc <= 90) {
            r = 8;
        } else {
            r = 10;
        }
        this.video.setRating(r);
    }

    public Padawan getSpectator() {
        return spectator;
    }

    public void setSpectator(Padawan spectator) {
        this.spectator = spectator;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
    
    @Override
    public String toString(){
        return "Dados do usuário" + spectator + "\nDados do vídeo\n" + video;
    }

}
