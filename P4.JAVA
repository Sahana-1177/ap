<?xml version="1.0" encoding="utf-8"?>

<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#B60707"
    android:padding="10dp"
    tools:context=".MainActivity">

    <Spinner
        android:id="@+id/spinnerUi"
        android:layout_width="368dp"
        android:layout_height="74dp"
        android:backgroundTint="#FFFEFE"
        android:paddingLeft="5dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.478"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.032" />

</androidx.constraintlayout.widget.ConstraintLayout>
MAINACTIVITY.JAVA
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    String[] courses = {
            "Select the course",
            "BCA",
            "BBA",
            "B.Com",
            "B.Sc",
            "BA",
            "MCA",
            "MBA"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Connect Java variable with XML Spinner
        spinner = findViewById(R.id.spinnerUi);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                courses
        ) {

            // Controls the Spinner when it is CLOSED
            @Override
            public View getView(
                    int position,
                    View convertView,
                    ViewGroup parent
            ) {
                View view = super.getView(
                        position,
                        convertView,
                        parent
                );

                TextView textView = (TextView) view;

                // Selected/displayed text
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(24);

                return view;
            }

            // Disable first item
            @Override
            public boolean isEnabled(int position) {
                return position != 0;
            }

            // Controls the Spinner when it is OPENED
            @Override
            public View getDropDownView(
                    int position,
                    View convertView,
                    ViewGroup parent
            ) {
                View view = super.getDropDownView(
                        position,
                        convertView,
                        parent
                );

                // Make first item slightly transparent
                if (position == 0) {
                    view.setAlpha(0.6f);
                } else {
                    view.setAlpha(1.0f);
                }

                return view;
            }
        };

        // Attach adapter to Spinner
        spinner.setAdapter(adapter);
    }
}
