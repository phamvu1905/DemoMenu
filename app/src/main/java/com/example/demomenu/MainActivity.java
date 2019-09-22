package com.example.demomenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mnxemds:
                Toast.makeText(this, "Xem danh sach", Toast.LENGTH_LONG).show();
                return true;
            case R.id.mnxemdssv:
                Toast.makeText(this, "Xem danh sach sinh vien", Toast.LENGTH_LONG).show();
                return true;
            case R.id.mnxemdslh:
                Toast.makeText(this, "Xem danh sach lop hoc", Toast.LENGTH_LONG).show();
                return true;
             default:;
                return super.onOptionsItemSelected(item);

        }

    }
}
