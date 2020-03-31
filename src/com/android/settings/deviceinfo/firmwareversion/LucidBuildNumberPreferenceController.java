/*
 * Copyright (C) 2020 Lucid Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.settings.deviceinfo.firmwareversion;

import android.content.Context;
import android.os.SystemProperties;
import androidx.annotation.VisibleForTesting;

import com.android.settings.R;
import com.android.settings.core.BasePreferenceController;

public class LucidBuildNumberPreferenceController extends BasePreferenceController {

    @VisibleForTesting
    private static final String LUCID_BUILD_NUMBER_PROP = "ro.lucid.build";

    public LucidBuildNumberPreferenceController(Context context, String preferenceKey) {
        super(context, preferenceKey);
    }

    @Override
    public int getAvailabilityStatus() {
        return AVAILABLE;
    }

    @Override
    public CharSequence getSummary() {
        String lucidBuildNumber = SystemProperties.get(LUCID_BUILD_NUMBER_PROP,
                mContext.getString(R.string.device_info_default));
        return lucidBuildNumber;
    }
}
