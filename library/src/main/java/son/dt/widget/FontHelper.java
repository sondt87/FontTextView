package son.dt.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


/**
 * Created by Mountain on 6/24/13.
 */
public class FontHelper {

    public FontHelper(){

    }

    public String loadFont(TextView textView, AttributeSet attrs, int defStyle){
        Context context = textView.getContext();
        final TypedArray a = context.obtainStyledAttributes(
                attrs, R.styleable.FontTextView, defStyle, 0);

        String fontPath = a.getString(R.styleable.FontTextView_font);

        if(fontPath == null || "".equals(fontPath)){
            a.recycle();
            return fontPath;
        }

        Typeface typeface = FontCache.getInstance().getTypeface(fontPath, context);
        int style = Typeface.NORMAL;

        Typeface lastType = textView.getTypeface();
        if(lastType != null) style = lastType.getStyle();

        textView.setTypeface(typeface, style);

        a.recycle();
        return fontPath;
    }


}
