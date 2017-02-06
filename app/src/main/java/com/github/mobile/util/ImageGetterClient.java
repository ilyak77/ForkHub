package com.github.mobile.util;

import android.graphics.drawable.Drawable;
import android.text.Html.*;
import android.widget.TextView;

/**
 * Created by apple on 2/5/17.
 */

public interface ImageGetterClient {
    public ImageGetter encode(final Object id, final String html);

    public ImageGetter bind(final TextView view, final String html, final Object id);

    public Drawable getDrawable(final String source);


}
