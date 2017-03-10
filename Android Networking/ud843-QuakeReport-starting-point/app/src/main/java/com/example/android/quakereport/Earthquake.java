package com.example.android.quakereport;


public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private String mDate;
    private long mTimeInMilliseconds;
    private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude          is the magnitude (size) of the earthquake
     * @param location           is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url                is the website URL to find more details about the earthquake
     */
    public Earthquake(double mMagnitude, String mLocation, long mTimeInMilliseconds, String url) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.mUrl = url;
    }

    /**
     * Return the magnitude of the earthquake
     */
    public double getmMagnitude() {
        return mMagnitude;
    }

    /**
     * Return the location of the earthquake
     */
    public String getmLocation() {
        return mLocation;
    }

    /**
     * Return the date of the earthquake
     */
    public String getmDate() {
        return mDate;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getmUrl() {
        return mUrl;
    }

}
