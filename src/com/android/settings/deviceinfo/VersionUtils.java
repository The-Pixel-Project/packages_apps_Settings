
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getPixelProjectVersion(){
        return SystemProperties.get("org.pixelproject.version","");
    }
}
