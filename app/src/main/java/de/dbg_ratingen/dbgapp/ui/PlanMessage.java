package de.dbg_ratingen.dbgapp.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import de.dbg_ratingen.dbgapp.R;

public class PlanMessage extends LinearLayout {
    TextView hourText, courseText, infoText;

    public PlanMessage(Context context){ super(context);}
    public PlanMessage(Context context, AttributeSet attributes){ super(context, attributes);}
    public PlanMessage(Context context, AttributeSet attributes, int nr){ super(context, attributes, nr);}

    public PlanMessage(Context context, String hour, String course, String info) {
        super(context);
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        inflater.inflate(R.layout.plan_message, this);

        hourText = findViewById(R.id.message_hour);
        courseText = findViewById(R.id.message_class);
        infoText = findViewById(R.id.message_info);

        setContent(hour, course, info);
    }

    public void setContent(String hour, String course, String info) {
        hourText.setText(hour);
        courseText.setText(course);
        infoText.setText(info);
    }
}
