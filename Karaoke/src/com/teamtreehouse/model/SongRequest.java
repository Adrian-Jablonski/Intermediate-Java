package com.teamtreehouse.model;

import java.util.Objects;

public class SongRequest {
    private String mSingerName;
    private Song mSong;

    public SongRequest(String mSingerName, Song mSong) {
        this.mSingerName = mSingerName;
        this.mSong = mSong;
    }

    public String getmSingerName() {
        return mSingerName;
    }

    public void setmSingerName(String mSingerName) {
        this.mSingerName = mSingerName;
    }

    public Song getmSong() {
        return mSong;
    }

    public void setmSong(Song mSong) {
        this.mSong = mSong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SongRequest that = (SongRequest) o;
        return Objects.equals(mSingerName, that.mSingerName) &&
                Objects.equals(mSong, that.mSong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mSingerName, mSong);
    }

    @Override
    public String toString() {
        return "SongRequest{" +
                "mSingerName='" + mSingerName + '\'' +
                ", mSong=" + mSong +
                '}';
    }
}
