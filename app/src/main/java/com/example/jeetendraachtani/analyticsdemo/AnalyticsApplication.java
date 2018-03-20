package com.example.jeetendraachtani.analyticsdemo;

import android.app.Application;

import com.crashlytics.android.Crashlytics;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

import io.fabric.sdk.android.Fabric;


/**
     * This is a subclass of {@link Application} used to provide shared objects for this app, such as
     * the {@link Tracker}.
     */
    public class AnalyticsApplication extends Application {

        private static GoogleAnalytics sAnalytics;
        private static Tracker sTracker;

        @Override
        public void onCreate() {
            super.onCreate();

            sAnalytics = GoogleAnalytics.getInstance(this);



            Fabric.with(getApplicationContext(), new Crashlytics());


        }

        /**
         * Gets the default {@link Tracker} for this {@link Application}.
         * @return tracker
         */
        synchronized public Tracker getDefaultTracker() {
            // To enable debug logging use: adb shell setprop log.tag.GAv4 DEBUG
            if (sTracker == null) {
                sTracker = sAnalytics.newTracker(R.xml.global_tracker);
            }

            return sTracker;
        }
    }

