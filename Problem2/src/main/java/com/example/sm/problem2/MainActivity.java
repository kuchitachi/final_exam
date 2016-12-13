package com.example.sm.problem2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;

import static java.lang.Integer.decode;
import static java.lang.Integer.parseInt;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    MyBaseAdapter adapter;
    ListView listview;


    ArrayList<Employee> emp_list = new ArrayList<Employee>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // need something here
        Employee ea = new Employee("Employee0", 20, 0);
        Employee eb = new Employee("Employee1", 21, 10000);
        Employee ec = new Employee("Employee2", 22, 20000);
        Employee ed = new Employee("Employee3", 23, 30000);
        /*
        Manager manager = new Manager();

            Customer customer = new Customer("Customer" + i);
            CustomerThread ct = new CustomerThread(customer);
            list.add(ct);
            manager.add_customer(customer);

        adapter.add(eb);
        adapter.add(ec);
        adapter.add(ed);


        adapter.add(ea);
     */

        adapter = new MyBaseAdapter(this, emp_list);
        listview = (ListView) findViewById(R.id.listView1) ;
        listview.setAdapter(adapter);
        listview.setOnItemClickListener((AdapterView.OnItemClickListener)adapter);

    }

    @Override
    public void onClick(View v){
        EditText edit_name = (EditText) findViewById(R.id.edit_name);
        EditText edit_age = (EditText) findViewById(R.id.edit_age);
        EditText edit_salary = (EditText) findViewById(R.id.edit_salary);

        String name = edit_name.getText().toString();
        String age = edit_age.getText().toString();
        String salary = edit_salary.getText().toString();

        int ag = parseInt(age);
        int sal = parseInt(salary);

        Employee employee = new Employee(name, ag, sal);

        switch (v.getId()){
            case R.id.btn_inc: {

                break;
            }
            case R.id.btn_dec:
                // need something here
                break;

            case R.id.btn_store:
                // need something here
                break;

            case R.id.btn_modify:
                // need something here
                break;

            case R.id.btn_delete:
                // need something here
                break;
        }
    }
}

interface Payment {
    void increase();
    void decrease();
}
