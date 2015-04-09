package bo.umsa.uguesas.uguesas;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    int hamburguesas [] = {
            R.drawable.hconfideitos, R.drawable.hconhuevo, R.drawable.hdoble,
            R.drawable.hgemelas,R.drawable.hmariajuana, R.drawable.hmediokilo,
            R.drawable.hnormal, R.drawable.hpollo, R.drawable.hvegetal};
    ImageButton b1, b2, b3,b4,b5,b6,b7,b8,b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (ImageButton) findViewById(R.id.b1);
        b2 = (ImageButton) findViewById(R.id.b2);
        b3 = (ImageButton) findViewById(R.id.b3);
        b4 = (ImageButton) findViewById(R.id.b4);
        b5 = (ImageButton) findViewById(R.id.b5);
        b6 = (ImageButton) findViewById(R.id.b6);
        b7 = (ImageButton) findViewById(R.id.b7);
        b8 = (ImageButton) findViewById(R.id.b8);
        b9 = (ImageButton) findViewById(R.id.b9);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()) {
                    case R.id.b1:
                        // it was the first button
                        Toast.makeText(getApplication(),"R.id.b1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b2:
                        // it was the second button
                        Toast.makeText(getApplication(),"R.id.b2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b3:
                        // it was the second button
                        Toast.makeText(getApplication(),"R.id.b3", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b4:
                        // it was the second button
                        Toast.makeText(getApplication(),"R.id.b4", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b5:
                        // it was the second button
                        Toast.makeText(getApplication(),"R.id.b5", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b6:
                        // it was the second button
                        Toast.makeText(getApplication(),"R.id.b6", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b7:
                        // it was the second button
                        Toast.makeText(getApplication(),"R.id.b7", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b8:
                        // it was the second button
                        Toast.makeText(getApplication(),"R.id.b8", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b9:
                        // it was the second button
                        Toast.makeText(getApplication(),"R.id.b9", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });


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
