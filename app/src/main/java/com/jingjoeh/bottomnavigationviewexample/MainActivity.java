package com.jingjoeh.bottomnavigationviewexample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		textView = findViewById(R.id.text);

		BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_view);
		bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(@NonNull MenuItem item) {
				switch (item.getItemId()) {
					case R.id.item_recent:
						textView.setText("Recent");
						return true;
					case R.id.item_favorite:
						textView.setText("Favorite");
						return true;
					case R.id.item_nearby:
						textView.setText("Nearby");
						return true;
				}
				return false;
			}
		});
		bottomNavigationView.setSelectedItemId(R.id.item_favorite);

	}
}
