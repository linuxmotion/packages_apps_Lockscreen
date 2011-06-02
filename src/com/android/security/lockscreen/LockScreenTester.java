package com.android.security.lockscreen;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LockScreenTester extends Activity {
	
	
	View mLockscreenView;

	 private ArrayList results = new ArrayList();
	
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
   
		  
		  ListView lView = new ListView(getBaseContext());
		  
		  PackageManager pm = this.getPackageManager();

		  Intent intent = new Intent(Intent.ACTION_MAIN, null);
		  intent.addCategory(Intent.CATEGORY_LAUNCHER);
		  intent.addCategory(Intent.CATEGORY_LOCKSCREEN);

		  List<ResolveInfo> list = pm.queryIntentActivities(intent, 0);
		  
		  for (ResolveInfo rInfo : list) {
    	  Log.w("Installed Applications", rInfo.resolvePackageName.toString());
		  Log.w("Installed Applications", rInfo.activityInfo.applicationInfo.loadLabel(pm).toString());
		  }
    
    
		
    
    
    
    
	View v = new View(this.getBaseContext());
	 setContentView(v);
	
	
    }

}
