package com.sinoangel.saz_alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.lidroid.xutils.exception.DbException;
import com.sinoangel.saz_alarm.bean.AlarmBean;

import java.util.List;

/**
 * Created by Z on 2017/2/15.
 */

public class BootCompletedReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO Auto-generated method stub
        AlarmUtils.getAU().nOFSoundService(true);
    }
}
