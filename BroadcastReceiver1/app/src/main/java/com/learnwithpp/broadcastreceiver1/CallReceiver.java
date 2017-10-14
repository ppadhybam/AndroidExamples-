package com.learnwithpp.broadcastreceiver1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.widget.Toast;

/**
 * Created by Priyabrat on 14-10-2017.
 */

public class CallReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, final Intent intent) {

        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        telephonyManager.listen(new PhoneStateListener(){
            @Override
            public void onCallStateChanged(int state, String incomingNumber) {
                super.onCallStateChanged(state, incomingNumber);
                Intent startIntent = new Intent(context,DisplayActivity.class);
                startIntent.putExtra("mobile_number",incomingNumber);
                context.startActivity(startIntent);
            }
        }, PhoneStateListener.LISTEN_CALL_STATE);
    }
}
