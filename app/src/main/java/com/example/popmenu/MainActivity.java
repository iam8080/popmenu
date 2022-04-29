package com.example.popmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showBtn(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener( this);
        popup.inflate((R.menu.pop_menu));
        popup.show();
    }
    public  boolean onMenuItemClick( MenuItem item)
    {
        switch(item.getItemId()) {
            case R.id.o1:
                Toast.makeText(this, "First", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.o2:
                Toast.makeText(this, "Second", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.o3:
                Toast.makeText(this, "Three", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return  false ;
        }


}
}