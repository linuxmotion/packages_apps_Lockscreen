package com.android.security.lockscreen;





import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.android.security.lockscreen.LockScreenView;
import com.android.internal.policy.impl.KeyguardScreenCallback;
import com.android.internal.policy.impl.KeyguardUpdateMonitor;
import com.android.internal.telephony.IccCard.State;
import com.android.internal.widget.LockPatternUtils;


public class Lockscreen extends LockScreenView {

	/**
	 * 
	 * 
	 * @param context
	 * @param configuration
	 * @param lockPatternUtils
	 * @param updateMonitor
	 * @param callback
	 */
	Lockscreen(Context context, 
			          Configuration configuration,
						LockPatternUtils lockPatternUtils,
							KeyguardUpdateMonitor updateMonitor, 
								KeyguardScreenCallback callback) {
		
		
		super(context, configuration, lockPatternUtils, updateMonitor, callback);
		
		
		
		
		
		
		// TODO Auto-generated constructor stub
	}


}
