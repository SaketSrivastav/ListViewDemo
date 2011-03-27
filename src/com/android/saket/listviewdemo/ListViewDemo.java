package com.android.saket.listviewdemo;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemClickListener;

public class ListViewDemo extends ListActivity {
	
	private static final String TAG = ListViewDemo.class.getSimpleName();
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(ArrayAdapter.createFromResource(getApplicationContext(),
                R.array.titles, R.layout.list_item));
        
        final String [] links = getResources().getStringArray(R.array.magz_links);
        
        getListView().setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				String content = links[position];
				Intent intent = new Intent(getApplicationContext(), ListItemViewerActivity.class);
				intent.setData(Uri.parse(content));
				startActivity(intent);
			}
		});
    }
}