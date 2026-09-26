<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
  MAINACTIVITY.JAVA

  <?xml version="1.0" encoding="utf-8"?>

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
android:layout_width="match_parent"
android:layout_height="114dp"
android:layout_margin="10dp"
android:background="#FFFFFF"
android:fontFamily="sans-serif-smallcaps"
android:gravity="center"
android:text=""
android:textColor="#000000"
android:textSize="24sp" />

    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>
<?xml version="1.0" encoding="utf-8"?>

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
android:layout_width="match_parent"
android:layout_height="114dp"
android:layout_margin="10dp"
android:background="#FFFFFF"
android:fontFamily="sans-serif-smallcaps"
android:gravity="center"
android:text=""
android:textColor="#000000"
android:textSize="24sp" />

    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>

  
  
