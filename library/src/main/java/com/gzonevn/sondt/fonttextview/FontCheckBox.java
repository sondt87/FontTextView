package com.gzonevn.sondt.fonttextview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;


/**
 * TODO: document your custom view class.
 */
public class FontCheckBox extends TextView {
    private String font;

    public FontCheckBox(Context context) {
        super(context);
        init(null, 0);
    }

    public FontCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public FontCheckBox(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
       setFont(new FontHelper().loadFont(this, attrs, defStyle));
    }


    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }
}
