<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <LinearLayout
        android:id="@+id/viewContainerUi"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#C10000"
        android:gravity="center"
        android:orientation="vertical"
        android:padding="10dp">

        <!-- Button used to display text -->
        <Button
            android:id="@+id/viewTextUi"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:backgroundTint="#FFFFFF"
            android:fontFamily="sans-serif-smallcaps"
            android:text="View"
            android:textColor="#000000"
            android:textSize="24sp" />

        <!-- Button used to clear the TextView -->
        <Button
            android:id="@+id/clearTextUi"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:backgroundTint="#FFFFFF"
            android:fontFamily="sans-serif-smallcaps"
            android:text="Clear"
            android:textColor="#000000"
            android:textSize="24sp" />

        <!-- Displays the text set from Java -->
        <TextView
            android:id="@+id/textContainerUi"
            android:layout_width="378dp"
            android:layout_height="114dp"
            android:fontFamily="sans-serif-smallcaps"
            android:gravity="center"
            android:textColor="#F4F4F4"
            android:textSize="34sp"
            android:textStyle="bold"/>

    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>

    MAINACTIVITY.JAVA

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.pr1.R;

public class MainActivity extends AppCompatActivity {

    TextView textContainer;
    Button viewBtn;
    Button clearBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(
                findViewById(R.id.main),
                (v, insets) -> {
                    Insets systemBars = insets.getInsets(
                            WindowInsetsCompat.Type.systemBars()
                    );

                    v.setPadding(
                            systemBars.left,
                            systemBars.top,
                            systemBars.right,
                            systemBars.bottom
                    );

                    return insets;
                }
        );

        // Connect Java variables with XML views
        textContainer = findViewById(R.id.textContainerUi);
        viewBtn = findViewById(R.id.viewTextUi);
        clearBtn = findViewById(R.id.clearTextUi);

        // Runs when View button is clicked
        viewBtn.setOnClickListener(v -> {
            textContainer.setText("Davangere University");
        });

        // Runs when Clear button is clicked
        clearBtn.setOnClickListener(v -> {
            textContainer.setText("");
        });
    }
}
