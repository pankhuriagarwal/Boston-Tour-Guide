package com.example.android.bostontourguide;

/**
 * Created by pankhuriagarwal on 11/7/16.
 */

public class properties {


    // String value
    private int mMainHeader;
    private int mBottomRight;
    private int mImage;
    private int mBottomLeft;


    /**
     * Constructs a new TextView with initial values for text and text color.
     */
    public properties(int image, int mainHeader, int bottomRight, int bottomLeft) {
        mImage = image;
        mMainHeader = mainHeader;
        mBottomLeft = bottomLeft;
        mBottomRight = bottomRight;


    }

    public properties(int mainHeader, int bottomRight, int bottomLeft) {

        mMainHeader = mainHeader;
        mBottomLeft = bottomLeft;
        mBottomRight = bottomRight;
        mImage = 0;


    }

    /**
     * Gets the string value in the TextView.
     *
     * @return current text in the TextView.
     */
    public int getImage() {
        return mImage;
    }

    /**
     * Sets the string value in the TextView.
     * <p>
     * oe image is the updated string to be displayed.
     */


    public int getMainHeader() {
        return mMainHeader;
    }


    public int getBottomLeft() {
        return mBottomLeft;
    }


    public int getBottomRight() {
        return mBottomRight;
    }


}



