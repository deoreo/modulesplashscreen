package visionet.modulesplashscreen.Activity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import visionet.modulesplashscreen.R;


public class ActivitySplashScreens extends Activity {

	private ImageView mLogo;
	private LinearLayout welcomeText;
	private ProgressBar mProgressBar;
	private int mWaited = 0;
	private Activity mActivity;
	Context ctx;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_NO_TITLE); //Removing ActionBar
		setContentView(R.layout.activity_splash_screen);
		mActivity = this;
		ctx = this;
		mProgressBar = (ProgressBar) findViewById(R.id.splash_progress);
		//mLogo = (ImageView) findViewById(R.id.logo);
		Bundle extras = getIntent().getExtras();


	}

	@Override
	public void onBackPressed() {
		finish();
	}

}
