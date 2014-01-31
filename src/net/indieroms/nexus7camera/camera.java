package net.indieroms.nexus7camera;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

public class camera extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);


				final Intent intent = new Intent(Intent.ACTION_MAIN, null);

				intent.addCategory(Intent.CATEGORY_LAUNCHER);

				final ComponentName cn = new ComponentName(
						"com.google.android.gallery3d",
						"com.android.camera.Camera");

				intent.setComponent(cn);

				intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				
				camera.this.finish();
				
				startActivity(intent);
				finish();
				overridePendingTransition(0, 0);
				System.exit(0);

	}
}
