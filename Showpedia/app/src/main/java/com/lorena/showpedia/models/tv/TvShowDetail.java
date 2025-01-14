package com.lorena.showpedia.models.tv;

import com.lorena.showpedia.helper.Genre;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TvShowDetail {

    @SerializedName("name")
    private String title;

    @SerializedName("number_of_episodes")
    private String episodes;

    @SerializedName("number_of_seasons")
    private String seasons;

    private int id;

    @SerializedName("backdrop_path")
    private String backdropImage;

    @SerializedName("poster_path")
    private String posterImage;

    @SerializedName("genres")
    private List<Genre> genres;

    @SerializedName("vote_average")
    private Double voteAverage;

    @SerializedName("first_air_date")
    private String firstAirDate;

    private String overview;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEpisodes() {
        return episodes;
    }

    public void setEpisodes(String episodes) {
        this.episodes = episodes;
    }

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBackdropImage() {
        return backdropImage;
    }

    public void setBackdropImage(String backdropImage) {
        this.backdropImage = backdropImage;
    }

    public String getPosterImage() {
        return posterImage;
    }

    public void setPosterImage(String posterImage) {
        this.posterImage = posterImage;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getFirstAirDate() {
        return firstAirDate;
    }

    public void setFirstAirDate(String firstAirDate) {
        this.firstAirDate = firstAirDate;
    }
}
