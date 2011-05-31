package com.android.security.lockscreen;


import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.android.internal.telephony.IccCard.State;
import com.android.lockscreen.LockscreenView;


public class Lockscreen extends LinearLayout implements LockscreenView {

	public Lockscreen(Context context) {
		this(context, null);
		// TODO Auto-generated constructor stub
	}
	
	public Lockscreen(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public void cleanUp() {
		// TODO Auto-generated method stub
		
	}

	public boolean needsInput() {
		// TODO Auto-generated method stub
		return false;
	}

	public void onPause() {
		// TODO Auto-generated method stub
		
	}

	public void onResume() {
		// TODO Auto-generated method stub
		
	}

	public void onMusicChanged() {
		// TODO Auto-generated method stub
		
	}

	public void onPhoneStateChanged(String newState) {
		// TODO Auto-generated method stub
		
	}

	public void onRefreshBatteryInfo(boolean showBatteryInfo,
			boolean pluggedIn, int batteryLevel) {
		// TODO Auto-generated method stub
		
	}

	public void onRefreshCarrierInfo(CharSequence plmn, CharSequence spn) {
		// TODO Auto-generated method stub
		
	}

	public void onRingerModeChanged(int state) {
		// TODO Auto-generated method stub
		
	}

	public void onTimeChanged() {
		// TODO Auto-generated method stub
		
	}

	public void onSimStateChanged(State simState) {
		// TODO Auto-generated method stub
		
	}

}
