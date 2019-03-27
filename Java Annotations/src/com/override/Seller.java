package com.override;

import java.awt.Image;
import java.util.List;

public class Seller {
    @Deprecated
    public void placeAdInNewspaper(String adText, int numDays) {
        // Old method here
    }

    public void postInCraigslist(String adText, List<Image> image) {
        // New method here
    }
}
