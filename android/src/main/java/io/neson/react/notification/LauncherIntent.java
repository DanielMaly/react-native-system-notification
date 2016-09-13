package io.neson.react.notification;

import android.content.Context;
import android.content.Intent;

public class LauncherIntent {

    public static Intent get(Context context) {
        Intent intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        intent.setPackage(null);
        intent.setFlags(0);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        return intent;
    }

    private LauncherIntent() {
    }
}
