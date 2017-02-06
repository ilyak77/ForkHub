package com.github.mobile.util;

/**
 * Created by apple on 2/5/17.
 */

public class ImageClientFactory {
    public ImageGetterClient init(ImageGetterClient client, String type){
        if(client == null) {
            return null;
        }

        if(type.equals("Http")){
            return new HttpImageGetterClient();
        }else{
            return null;
        }
    }
}
