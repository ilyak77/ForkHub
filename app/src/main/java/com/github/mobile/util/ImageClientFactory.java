package com.github.mobile.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by apple on 2/5/17.
 */

public class ImageClientFactory {
    private Map<String, ImageGetterClient> imageGetterClientMap = new HashMap<>();

    public ImageGetterClient init(String imageType) throws Exception {
        ImageGetterClient imageGetter = imageGetterClientMap.get(imageType);
        if (imageGetter != null) {
            return imageGetter;
        } else {
            try {
                String name = ImageGetterClient.class.getPackage().getName();
                imageGetter = (ImageGetterClient) Class.forName(name+imageType).newInstance();
                imageGetterClientMap.put(imageType, imageGetter);
                return imageGetter;
            } catch (Exception e) {
                throw new Exception("The imageGetter type is unknown!");
            }
        }

    }
}
