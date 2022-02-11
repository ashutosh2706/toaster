package m.ashutosh.toaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import m.ashutosh.toastertoast.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button success,error,normal;
        success = findViewById(R.id.toast_success);
        error = findViewById(R.id.toast_err);
        normal = findViewById(R.id.toast_def);

        Context context = MainActivity.this;

        success.setOnClickListener(view -> Toaster.makeToast(context,"Download Successful", Toaster.LENGTH_LONG,Toaster.SUCCESS));

        normal.setOnClickListener(view -> Toaster.makeToast(context,"Default toast",Toaster.LENGTH_LONG,Toaster.DEFAULT));

        error.setOnClickListener(view -> Toaster.makeToast(context,"Download Failed",Toaster.LENGTH_LONG,Toaster.ERROR));

    }
}