/**
 * 
 */
package com.android.saket.listviewdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

/**
 * @author saket
 *
 */
public class ListItemViewerActivity extends Activity {

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_item_view);
		
		Intent launchingIntent = getIntent();
        String content = launchingIntent.getData().toString();
        Log.v(ListItemViewerActivity.class.getSimpleName(), "Content: "+content);
        WebView viewer = (WebView) findViewById(R.id.itemView);
        viewer.getSettings().setJavaScriptEnabled(true);
        viewer.loadUrl(content);
	}
}
