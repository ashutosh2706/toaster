package m.ashutosh.toastertoast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Toaster {
    public static final int LENGTH_SHORT = 0;
    public static final int LENGTH_LONG = 1;


    public static final int SUCCESS = 1;
    public static final int ERROR = 2;
    public static final int DEFAULT = 3;

    public static void makeToast(Context context, String msg, int length, int type) {
        Toast toast = new Toast(context);
        View layout;
        TextView textView;
        switch (type) {
            case SUCCESS:
                layout = LayoutInflater.from(context).inflate(R.layout.layout_success,null,false);
                textView = layout.findViewById(R.id.textview);
                textView.setText(msg);
                toast.setView(layout);
                toast.setDuration(length);
                toast.show();
                break;
            case ERROR:
                layout = LayoutInflater.from(context).inflate(R.layout.layout_error,null,false);
                textView = layout.findViewById(R.id.textview);
                textView.setText(msg);
                toast.setView(layout);
                toast.setDuration(length);
                toast.show();
                break;
            default:
                layout = LayoutInflater.from(context).inflate(R.layout.layout_default,null,false);
                textView = layout.findViewById(R.id.textview);
                textView.setText(msg);
                toast.setView(layout);
                toast.setDuration(length);
                toast.show();
        }
    }

}
