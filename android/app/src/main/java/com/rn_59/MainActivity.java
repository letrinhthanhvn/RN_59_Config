package com.rn_59;

import com.facebook.react.ReactActivity;
import com.reactnativecomponent.barcode.RCTCapturePackage; //import RCTCapturePackage
import android.content.Intent;
public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript. This is
     * used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "RN_59";
    }

    @Override
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MainApplication application = (MainApplication) this.getApplication();
        application.setReactNativeHost(new ReactNativeHost(application) {
            @Override
            protected boolean getUseDeveloperSupport() {
                return BuildConfig.DEBUG;
            }

            @Override
            protected List<ReactPackage> getPackages() {
                return Arrays.<ReactPackage>asList(new MainReactPackage(), new RCTCapturePackage(MainActivity.this) // register
                                                                                                                    // Module
                );
            }

        });

        super.onCreate(savedInstanceState);
    }
}
