package ersteapp.dietzm.de.ersteapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        System.out.println("Test OnCreate");

        setContentView(R.layout.activity_main);
    }




public void knopfGedrueckt(View view){

    View tf = findViewById(R.id.meinTextfeld1);
    EditText editText = (EditText) tf;

    String text = editText.getText().toString();

    Intent i = new Intent(this, DetailActivity.class);
    i.putExtra("USER_INPUT", text);
    startActivity(i);

    /*
    //Webseite Öffnen
    Intent i = new Intent();
    i.setAction(Intent.ACTION_VIEW);
    i.setData(Uri.parse("http://google.de#q=" + text));
    startActivity(i);
    *

/*


    StringBuffer buf = new StringBuffer(text);
    buf.reverse();
    text = buf.toString();

    System.out.println(text);

    Button btn = (Button) view;
    btn.setText(text);

    Toast toast = Toast.makeText(getApplicationContext(),"App meldet: " + text, Toast.LENGTH_LONG);
    toast.show();

    */

}





    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Test OnStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Test OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Test OnStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Test OnDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
