package net.miwashi.stijdbc;

public class Album {
    private Integer artistId;
    private String title;
    private Integer albumId;

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }
    public void setTitle(String title) {
        this.title = title;
    }
     public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getArtistId() {
        return artistId;
    }
    public String getTitle() {
        return title;
    }
    public Integer getAlbumId() {
        return albumId;
    }

    public Album(Integer artistId, String title, Integer albumId){
        this.artistId = artistId;
        this.title = title;
        this.albumId = albumId;
    }

    public String toString(){
        return artistId + " " + title + " " + albumId;
    }
}
