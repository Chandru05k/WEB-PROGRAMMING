<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical">
    <RelativeLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
        <EditText
            android:id="@+id/textview"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Enter your name"
            android:padding="12dp"
            android:inputType="textPersonName"
            android:layout_marginTop="150dp"
            />

        <Button
            android:id="@+id/ok"
            android:layout_width="80dp"
            android:layout_height="40dp"
            android:background="@drawable/rounded_button"
            android:text="OK"
            android:layout_marginLeft="150dp"
            android:layout_marginTop="230dp"
            android:textSize="15dp"
            android:onClick="text" />
    </RelativeLayout>
    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:id="@+id/text"
            android:hint="Text"
            android:layout_marginTop="50dp"
            android:textSize="25dp"
            android:layout_marginLeft="170dp">

        </TextView>
    </RelativeLayout>
    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <Button
            android:id="@+id/font"
            android:layout_width="140dp"
            android:layout_height="50dp"
            android:background="@drawable/rounded_button"
            android:text="Change font"
            android:layout_marginLeft="50dp"
            android:layout_marginTop="30dp"
            android:textSize="15dp"
            android:onClick="font"
            >
        </Button>
        <Button
            android:id="@+id/color"
            android:layout_width="140dp"
            android:layout_height="50dp"
            android:background="@drawable/rounded_button"
            android:text="Change color"
            android:layout_marginLeft="20dp"
            android:layout_marginTop="30dp"
            android:textSize="15dp"
            android:layout_toRightOf="@+id/font"
            android:onClick="color"
            >
        </Button>
    </RelativeLayout>
</LinearLayout>
