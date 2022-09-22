package m.ashutosh.toaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;

import m.ashutosh.toastertoast.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button success,error,normal,info,warn;
        success = findViewById(R.id.toast_success);
        error = findViewById(R.id.toast_err);
        normal = findViewById(R.id.toast_def);
        info = findViewById(R.id.toast_inf);
        warn = findViewById(R.id.toast_warn);

        final Context context = getApplicationContext();

        success.setOnClickListener(view -> Toaster.makeToast(context,"Success Toast", Toaster.LENGTH_SHORT,Toaster.SUCCESS));

        normal.setOnClickListener(view -> Toaster.makeToast(context,"Default toast",Toaster.LENGTH_SHORT,Toaster.DEFAULT));

        error.setOnClickListener(view -> Toaster.makeToast(context,"Error Toast",Toaster.LENGTH_SHORT,Toaster.ERROR));

        info.setOnClickListener(view -> Toaster.makeToast(context,"Info Toast",Toaster.LENGTH_SHORT,Toaster.INFO));

        warn.setOnClickListener(view -> Toaster.makeToast(context,"Warning Toast",Toaster.LENGTH_SHORT,Toaster.WARN));

    }
}