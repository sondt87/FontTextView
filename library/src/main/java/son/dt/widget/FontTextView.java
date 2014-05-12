package son.dt.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;


/**
 * TODO: document your custom view class.
 */
public class FontTextView extends TextView {
    private String font;

    public FontTextView(Context context) {
        super(context);
        init(null, 0);
    }

    public FontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public FontTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
       setFont(new FontHelper().loadFont(this,attrs,defStyle));
    }


    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }
}
