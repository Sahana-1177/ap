package com.example.p1;

package com.darshan.program1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textContainer;
    Button viewBtn;
    Button clearBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Enable edge-to-edge display
        EdgeToEdge.enable(this);

        // Connect Java with XML layout
        setContentView(R.layout.activity_main);

        // Handle system bar insets
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
