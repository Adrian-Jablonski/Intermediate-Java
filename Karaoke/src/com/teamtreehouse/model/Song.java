package com.teamtreehouse.model;

import java.util.Objects;

public class Song {
  protected String mArtist;
  protected String mTitle;
  protected String mVideoUrl;
  
  public Song(String artist, String title, String videoUrl) {
    mArtist = artist;
    mTitle = title;
    mVideoUrl = videoUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Song song = (Song) o;
    return Objects.equals(mArtist, song.mArtist) &&
            Objects.equals(mTitle, song.mTitle) &&
            Objects.equals(mVideoUrl, song.mVideoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mArtist, mTitle, mVideoUrl);
  }

  public String getTitle() {
    return mTitle;
  }
  
  public String getArtist() {
    return mArtist;
  }
  
  public String getVideoUrl() {
    return mVideoUrl;
  }
  
  
  @Override
  public String toString() {
    return String.format("Song:  %s by %s", mTitle, mArtist);
  }
}