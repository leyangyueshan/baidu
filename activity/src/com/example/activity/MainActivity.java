package com.example.activity;

import com.google.android.maps.MapActivity;
import com.google.android.maps.*;
import android.os.Bundle;


public class MainActivity extends MapActivity {
	static final int INITIAL_ZOOM_LEVEL=12;
	static final int INITIAL_LATITUDE=25040255;
	static final int INITIAL_LONGTITUDE=121512377;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		MapView mapView = (MapView)findViewById(R.id.mapview);
		mapView.setBuiltInZoomControls(true);
		//设置zoom大小和地图中心点
		MapController mc = mapView.getController();
		mc.setZoom(INITIAL_ZOOM_LEVEL);
		mc.setCenter(new GeoPoint(INITIAL_LATITUDE,INITIAL_LONGTITUDE));
	}
	
	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}


/*	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}*/
}



