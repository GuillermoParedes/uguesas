package bo.umsa.uguesas.uguesas;

import android.content.Intent;
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
    Intent intent;
    Bundle bundle;
    ImageButton b1;
    ImageButton b2;
    ImageButton b3;
    ImageButton b4;
    ImageButton b5;
    ImageButton b6;
    ImageButton b7;
    ImageButton b8;
    ImageButton b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarHambur(View view){
        b1 = (ImageButton) findViewById(R.id.b1);
        b2 = (ImageButton) findViewById(R.id.b2);
        b3 = (ImageButton) findViewById(R.id.b3);
        b4 = (ImageButton) findViewById(R.id.b4);
        b5 = (ImageButton) findViewById(R.id.b5);
        b6 = (ImageButton) findViewById(R.id.b6);
        b7 = (ImageButton) findViewById(R.id.b7);
        b8 = (ImageButton) findViewById(R.id.b8);
        b9 = (ImageButton) findViewById(R.id.b9);
        bundle = new Bundle();
        switch(view.getId()) {
                    case R.id.b1:
                        intent = new Intent(MainActivity.this, SecondActivity.class);
                        bundle.putString("parametro", "Button B1");
                        intent.putExtras(bundle);
                        startActivity(intent);
//                        Toast.makeText(getApplication(),"R.id.b1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b2:
                        intent = new Intent(MainActivity.this, SecondActivity.class);
                        bundle.putString("parametro", "Button B2");
                        intent.putExtras(bundle);
                        startActivity(intent);
//                        Toast.makeText(getApplication(),"R.id.b2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b3:
                        intent = new Intent(MainActivity.this, SecondActivity.class);
                        bundle.putString("parametro", "Button B3");
                        intent.putExtras(bundle);
                        startActivity(intent);
//                        Toast.makeText(getApplication(),"R.id.b3", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b4:
                        intent = new Intent(MainActivity.this, SecondActivity.class);
                        bundle.putString("parametro", "Button B4");
                        intent.putExtras(bundle);
                        startActivity(intent);
//                        Toast.makeText(getApplication(),"R.id.b4", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b5:
                        intent = new Intent(MainActivity.this, SecondActivity.class);
                        bundle.putString("parametro", "Button B5");
                        intent.putExtras(bundle);
                        startActivity(intent);
//                        Toast.makeText(getApplication(),"R.id.b5", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b6:
                        intent = new Intent(MainActivity.this, SecondActivity.class);
                        bundle.putString("parametro", "Button B6");
                        intent.putExtras(bundle);
                        startActivity(intent);
//                        Toast.makeText(getApplication(),"R.id.b6", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b7:
                        intent = new Intent(MainActivity.this, SecondActivity.class);
                        bundle.putString("parametro", "Button B7");
                        intent.putExtras(bundle);
                        startActivity(intent);
//                        Toast.makeText(getApplication(),"R.id.b7", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b8:
                        intent = new Intent(MainActivity.this, SecondActivity.class);
                        bundle.putString("parametro", "Button B8");
                        intent.putExtras(bundle);
                        startActivity(intent);
//                        Toast.makeText(getApplication(),"R.id.b8", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b9:
                        intent = new Intent(MainActivity.this, SecondActivity.class);
                        bundle.putString("parametro", "Button B9");
                        intent.putExtras(bundle);
                        startActivity(intent);
//                        Toast.makeText(getApplication(),"R.id.b9", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
    }


}
