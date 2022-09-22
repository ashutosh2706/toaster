package m.ashutosh.toastertoast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Toaster {
    public static final int LENGTH_SHORT = Toast.LENGTH_SHORT;
    public static final int LENGTH_LONG = Toast.LENGTH_LONG;

    public static final int SUCCESS = 1;
    public static final int ERROR = 2;
    public static final int INFO = 3;
    public static final int WARN = 4;
    public static final int DEFAULT = 5;

    public static void makeToast(Context context, String message, int duration, int type) {
        Toast toast = new Toast(context);
        View layout;
        TextView textView;
        switch (type) {
            case SUCCESS:
                layout = LayoutInflater.from(context).inflate(R.layout.layout_success,null,false);
                textView = layout.findViewById(R.id.textview);
                textView.setText(message);
                toast.setView(layout);
                toast.setDuration(duration);
                toast.show();
                break;
            case ERROR:
                layout = LayoutInflater.from(context).inflate(R.layout.layout_error,null,false);
                textView = layout.findViewById(R.id.textview);
                textView.setText(message);
                toast.setView(layout);
                toast.setDuration(duration);
                toast.show();
                break;
            case INFO:
                layout = LayoutInflater.from(context).inflate(R.layout.layout_info,null,false);
                textView = layout.findViewById(R.id.textview);
                textView.setText(message);
                toast.setView(layout);
                toast.setDuration(duration);
                toast.show();
                break;
            case WARN:
                layout = LayoutInflater.from(context).inflate(R.layout.layout_warn,null,false);
                textView = layout.findViewById(R.id.textview);
                textView.setText(message);
                toast.setView(layout);
                toast.setDuration(duration);
                toast.show();
                break;
            default:
                layout = LayoutInflater.from(context).inflate(R.layout.layout_default,null,false);
                textView = layout.findViewById(R.id.textview);
                textView.setText(message);
                toast.setView(layout);
                toast.setDuration(duration);
                toast.show();
        }
    }

}
