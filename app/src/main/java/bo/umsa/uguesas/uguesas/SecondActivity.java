package bo.umsa.uguesas.uguesas;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class SecondActivity extends ActionBarActivity {
    int hamburguesas [] = {
            R.drawable.hconfideitos, R.drawable.hconhuevo, R.drawable.hdoble,
            R.drawable.hgemelas,R.drawable.hmariajuana, R.drawable.hmediokilo,
            R.drawable.hnormal, R.drawable.hpollo, R.drawable.hvegetal};
    String id[] ={
            "b1", "b2", "b3", "b2", "b4", "b5", "b6", "b7", "b8", "b9"
    };
    int precios[] = {
            15, 14, 18, 21, 25, 18, 12, 12, 15
    };
    String parametros;
    ImageView img;
    TextView title;
    Button agregar;
    Button quitar;
    int cantidad;
    int pr;
    int precioham;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent in = getIntent();

        Bundle b = in.getExtras();

        parametros = b.getString("parametro");
        hamburguesa(parametros);

        cantidad = 0;
        pr = 0;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
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

    public void hamburguesa(String parametros){

        img = (ImageView) findViewById(R.id.imageView);
        title = (TextView) findViewById(R.id.title);
        TextView precio = (TextView) findViewById(R.id.textView15);

        switch(parametros) {
            case "Button B1":
                img.setImageResource(hamburguesas[0]);
                precio.setText("PRECIO : Bs."+ precios[0]);
                title.setText("HAMBURGUESA CON FIDEO");
                precioham = 15;
                break;
            case "Button B2":
                img.setImageResource(hamburguesas[1]);
                precio.setText("PRECIO : Bs."+ precios[1]);
                title.setText("HAMBURGUESA CON HUEVO");
                precioham = 14;
                break;
            case "Button B3":
                img.setImageResource(hamburguesas[2]);
                precio.setText("PRECIO : Bs. "+ precios[2]);
                title.setText("HAMBURGUESA DOBLE");
                precioham = 18;
                break;
            case "Button B4":
                img.setImageResource(hamburguesas[3]);
                precio.setText("PRECIO : Bs. "+ precios[3]);
                title.setText("HAMBURGUESA GEMELAS");
                precioham = 21;
                break;
            case "Button B5":
                img.setImageResource(hamburguesas[4]);
                precio.setText("PRECIO : Bs. "+ precios[4]);
                title.setText("HAMBURGUESA MARIJUANA");
                precioham = 25;
                break;
            case "Button B6":
                img.setImageResource(hamburguesas[5]);
                precio.setText("PRECIO : Bs. "+ precios[5]);
                title.setText("HAMBURGUESA 1/2 CARNE");
                precioham = 18;
                break;
            case "Button B7":
                img.setImageResource(hamburguesas[6]);
                precio.setText("PRECIO : Bs. "+ precios[6]);
                title.setText("HAMBURGUESA NORMAL");
                precioham = 12;
                break;
            case "Button B8":
                img.setImageResource(hamburguesas[7]);
                precio.setText("PRECIO : Bs. "+ precios[7]);
                title.setText("HAMBURGUESA DE POLLO");
                precioham = 12;
                break;
            case "Button B9":
                img.setImageResource(hamburguesas[8]);
                precio.setText("PRECIO : Bs. "+ precios[8]);
                title.setText("HAMBURGUESA VEGETARIANA");
                precioham = 15;
                break;
            default:
                break;
        }
    }

    public void agregar(View view){
        TextView can = (TextView) findViewById(R.id.cantidad);
        TextView precio = (TextView) findViewById(R.id.precio);

//        int nc = Integer.parseInt((String) cantidad.getText());
//        nc = nc +1;

        cantidad +=1;

        pr = pr + precioham;

        can.setText(String.valueOf(cantidad));
        precio.setText(String.valueOf(pr));

    }
}
