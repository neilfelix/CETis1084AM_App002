package mx.edu.cetis108.cetis1084am_app002;

import android.content.Context;
import android.content.res.ColorStateList;
import android.provider.CalendarContract;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnOperar_click(View v)
    {
        Button btn=(Button)v;
        TextView lblResult = (TextView) findViewById(R.id.lblResult);
        EditText txtNum1 = (EditText) findViewById(R.id.txtNum1);
        EditText txtNum2 = (EditText) findViewById(R.id.txtNum2);
        lblResult.setTextColor(getResources().getColor(R.color.colorCorrecto));
        if(txtNum1.getText().length()>0&&txtNum2.getText().length()>0) {
            final float result;
            switch (btn.getText().toString()) {
                case "Sumar":
                    result = Float.parseFloat(txtNum1.getText().toString()) + Float.parseFloat(txtNum2.getText().toString());
                    lblResult.setText(txtNum1.getText().toString() + "+" + txtNum2.getText().toString() + "= " + Float.toString(result));
                    break;
                case "Restar":
                    result = Float.parseFloat(txtNum1.getText().toString()) - Float.parseFloat(txtNum2.getText().toString());
                    lblResult.setText(txtNum1.getText().toString() + "-" + txtNum2.getText().toString() + "= " + Float.toString(result));
                    break;
                case "Multiplicar":
                    result = Float.parseFloat(txtNum1.getText().toString()) * Float.parseFloat(txtNum2.getText().toString());
                    lblResult.setText(txtNum1.getText().toString() + "x" + txtNum2.getText().toString() + "= " + Float.toString(result));
                    break;
                case "Dividir":
                    result = Float.parseFloat(txtNum1.getText().toString()) / Float.parseFloat(txtNum2.getText().toString());
                    lblResult.setText(txtNum1.getText().toString() + "/" + txtNum2.getText().toString() + "= " + Float.toString(result));
                    break;
            }
        }
        else {
            lblResult.setTextColor(getResources().getColor(R.color.colorError));
            lblResult.setText("INTRODUCE NUMEROS VÁLIDOS");
        }
        InputMethodManager inputMethodManager=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(txtNum2.getWindowToken(), 0);

    }
}
