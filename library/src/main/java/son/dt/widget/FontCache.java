package son.dt.widget;

import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mountain on 5/12/14.
 */
public class FontCache {

    Map<String,Typeface> fonts;

    private static FontCache cache;
    public static FontCache getInstance(){
        if(cache == null){
            cache = new FontCache();
        }
        return cache;
    }

    private FontCache() {
        fonts = new HashMap<String, Typeface>();
    }

    public Typeface getTypeface(String font, Context context){
        if(fonts.containsKey(font)) return fonts.get(font);
        Typeface typeface = null;
        try {
            typeface = Typeface.createFromAsset(context.getAssets(), font);
            fonts.put(font,typeface);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return typeface;
    }

}
