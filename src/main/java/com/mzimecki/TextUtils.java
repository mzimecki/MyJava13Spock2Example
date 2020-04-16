package com.mzimecki;

public class TextUtils {

    public int getStringLength(final String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }
        return text.length();
    }
}
