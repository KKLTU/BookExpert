package edu.ltu.bookexpert2;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void OnClickFindBeer(View view) {
        Button FindBeer = (Button) findViewById(R.id.find_beer);
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);

        String BeerType = String.valueOf(color.getSelectedItem());

        BookExpert MyExpert = new BookExpert(); // need to initialize
        List<String> BrandList = MyExpert.getBrands(BeerType);

        StringBuilder Result = new StringBuilder();
        for(String i : BrandList)
        {
            Result.append(i).append('\n');
        }
//..
        brands.setText(Result);
    }
}
