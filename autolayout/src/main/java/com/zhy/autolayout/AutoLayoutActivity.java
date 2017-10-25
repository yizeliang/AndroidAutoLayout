package com.zhy.autolayout;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;

import com.zhy.autolayout.widget.AutoCardView;
import com.zhy.autolayout.widget.AutoRadioGroup;
import com.zhy.autolayout.widget.AutoTabLayout;
import com.zhy.autolayout.widget.AutoTableLayout;
import com.zhy.autolayout.widget.AutoTableRow;

/**
 * Created by zhy on 15/11/19.
 */
public class AutoLayoutActivity extends AppCompatActivity {
    private static final String LAYOUT_LINEARLAYOUT = "LinearLayout";
    private static final String LAYOUT_FRAMELAYOUT = "FrameLayout";
    private static final String LAYOUT_RELATIVELAYOUT = "RelativeLayout";
    private static final String LAYOUT_CONSTRAINTLAYOUT = "android.support.constraint.ConstraintLayout";
    private static final String LAYOUT_TABLEROW = "TableRow";
    private static final String LAYOUT_TABLELAYOUT = "TableLayout";
    private static final String LAYOUT_TABLAYOUT = "android.support.design.widget.TabLayout";
    private static final String LAYOUT_RADIOGROUP = "RadioGroup";
    private static final String LAYOUT_CARDVIEW = "android.support.v7.widget.CardView";


    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        View view = null;
        if (name.equals(LAYOUT_FRAMELAYOUT)) {
            view = new AutoFrameLayout(context, attrs);
        }

        if (name.equals(LAYOUT_LINEARLAYOUT)) {
            view = new AutoLinearLayout(context, attrs);
        }

        if (name.equals(LAYOUT_RELATIVELAYOUT)) {
            view = new AutoRelativeLayout(context, attrs);
        }
        if (name.equals(LAYOUT_CONSTRAINTLAYOUT)) {
            view = new AutoConstraintLayout(context, attrs);
        }

        if (name.equals(LAYOUT_TABLEROW)) {
            view = new AutoTableRow(context, attrs);
        }
        if (name.equals(LAYOUT_TABLELAYOUT)) {
            view = new AutoTableLayout(context, attrs);
        }

        if (name.equals(LAYOUT_RADIOGROUP)) {
            view = new AutoRadioGroup(context, attrs);
        }

        if (name.equals(LAYOUT_TABLAYOUT)) {
            view = new AutoTabLayout(context, attrs);
        }

        if (name.equals(LAYOUT_CARDVIEW)) {
            view = new AutoCardView(context, attrs);
        }


        if (view != null) return view;
        return super.onCreateView(name, context, attrs);
    }

}
