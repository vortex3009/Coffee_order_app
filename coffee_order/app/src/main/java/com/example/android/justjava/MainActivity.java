package com.example.android.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
int quantity =0;
    public void submitOrder(View view) {
      int price =5;
        EditText edit= (EditText) findViewById(R.id.edit_text_view);
        String name = (edit.getText()).toString();


        CheckBox whipped= (CheckBox) findViewById(R.id.whipped_checkobx_view);
        boolean w= whipped.isChecked();
        CheckBox chocolate= (CheckBox) findViewById(R.id.chocolate_checkbox_view);
        boolean c= chocolate.isChecked();
     if(w)
     {
         price = price +1;
     }
if(c)
{
    price=price+2;
}

        displaymessage(name , w , c , price);


    }

    private void display(int number) {
       TextView qt = (TextView) findViewById(R.id.quantity_text_view);
        qt.setText(" "+ number);


    }


public void increament(View view)
{
    quantity+=1;

    display(quantity);
}

public void decreament(View view)
{
    quantity-=1;

    if (quantity<0)
    {
        quantity=0;
    }

display(quantity);
}


private void displaymessage( String value , boolean w1 , boolean w2 , int p )

{
    TextView t1 = (TextView) findViewById(R.id.name_text_view);
    t1.setText("Name :  "+ value);


    TextView t2 =(TextView) findViewById(R.id.whipped_text_view);
    t2.setText("want whippedCream topping?  " + w1);

    TextView t3 =(TextView) findViewById(R.id.chocolate_text_view);
    t3.setText("want chocolate topping?  " + w2);

    TextView t4 =(TextView) findViewById(R.id.total_text_view);
    t4.setText("total price is :  " + (p*quantity));



}






}