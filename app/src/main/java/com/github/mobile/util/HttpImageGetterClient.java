package com.github.mobile.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

import com.google.inject.Inject;

import org.eclipse.egit.github.core.service.ContentsService;

/**
 * Created by apple on 2/5/17.
 */

public class HttpImageGetterClient implements ImageGetterClient {
    @Inject
    private HttpImageGetter imageGetter;

    @Override
    public HttpImageGetter encode(final Object id, final String html){
        return imageGetter.encode(id, html);
    }
    @Override
    public HttpImageGetter bind(final TextView view, final String html,
                                final Object id){
        return imageGetter.bind(view, html, id);
    }
    @Override
    public Drawable getDrawable(final String source) {
        return imageGetter.getDrawable(source);
    }

}
