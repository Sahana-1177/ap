<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <application
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
        android:fullBackupContent="@xml/backup_rules"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.Pr5">
        <activity
            android:name=".MainActivity"
            android:exported="true"
            android:windowSoftInputMode="adjustResize">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>

 MAINACTIVITY.JAVA

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lst;
    ArrayList<String> dataList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect ListView with XML
        lst = findViewById(R.id.lst);

        // Write data into internal storage
        writeData();

        // Read data from internal storage
        readData();

        // Display data in ListView
        displayData();
    }

    // Function to write data
    void writeData() {

        String data = "Hello Android\n"
                + "Internal Storage\n"
                + "Array Adapter";

        try {
            FileOutputStream fos =
                    openFileOutput("data.txt", MODE_PRIVATE);

            fos.write(data.getBytes());
            fos.close();

            Toast.makeText(
                    this,
                    "Data Written Successfully",
                    Toast.LENGTH_SHORT
            ).show();

        } catch (Exception e) {
            e.printStackTrace();

            Toast.makeText(
                    this,
                    "Error Writing Data",
                    Toast.LENGTH_SHORT
            ).show();
        }
    }

    // Function to read data
    void readData() {

        dataList = new ArrayList<>();

        try {
            FileInputStream fis =
                    openFileInput("data.txt");

            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(fis)
                    );

            String line;

            while ((line = br.readLine()) != null) {
                dataList.add(line);
            }

            br.close();
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();

            Toast.makeText(
                    this,
                    "Error Reading Data",
                    Toast.LENGTH_SHORT
            ).show();
        }
    }

    // Function to display data
    void displayData() {

        adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dataList
        );

        lst.setAdapter(adapter);
    }
}
