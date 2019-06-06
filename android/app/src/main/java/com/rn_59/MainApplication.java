package com.rn_59;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.geektime.rnonesignalandroid.ReactNativeOneSignalPackage;
import io.underscope.react.fbak.RNAccountKitPackage;
import com.wix.interactable.Interactable;
import com.BV.LinearGradient.LinearGradientPackage;
import com.babisoft.ReactNativeLocalization.ReactNativeLocalizationPackage;
import com.swmansion.reanimated.ReanimatedPackage;
import com.horcrux.svg.SvgPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.airbnb.android.react.lottie.LottiePackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import com.microsoft.codepush.react.CodePush;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;
import cl.json.RNSharePackage;
import cl.json.ShareApplication;
public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {

        @Override
        protected String getJSBundleFile() {
        return CodePush.getJSBundleFile();
        }
    
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new ReactNativeOneSignalPackage(),
            new RNAccountKitPackage(),
            new Interactable(),
            new LinearGradientPackage(),
            new ReactNativeLocalizationPackage(),
            new ReanimatedPackage(),
            new SvgPackage(),
            new VectorIconsPackage(),
            new LottiePackage(),
            new RNDeviceInfo(),
            new CodePush(getResources().getString(R.string.reactNativeCodePush_androidDeploymentKey), getApplicationContext(), BuildConfig.DEBUG),
            new RNSharePackage(),
            new FIRMessagingPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }

  public void setReactNativeHost(ReactNativeHost reactNativeHost) {
    mReactNativeHost = reactNativeHost;
  }
}
