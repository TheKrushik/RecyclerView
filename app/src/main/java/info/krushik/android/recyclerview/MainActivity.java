package info.krushik.android.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Объявим RecyclerView
    RecyclerView mRecyclerView;
    //И его адаптер
    PersonAdapter mPersonAdapter;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Привяжем его к элементу
        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        //Создадим адаптер
        mPersonAdapter = new PersonAdapter(getPersons());

        //Применим наш адаптер к RecyclerView
        mRecyclerView.setAdapter(mPersonAdapter);

        //И установим LayoutManager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        final ArrayList<Person> persons = getPersons();
        mPersonAdapter = new PersonAdapter(persons);
        //Прикрепим onItemClickListener
        mPersonAdapter.setOnItemClickListener(new PersonAdapter.OnItemClickListener(){
            @Override
            public void onItemClick(View v, int position){
                String name = persons.get(position).firstName;
                Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
            }
        });

    }

    public ArrayList<Person> getPersons(){
        ArrayList<Person> persons = new ArrayList<>();

        Person Ivan = new Person();
        Ivan.firstName = "Иван";
        Ivan.lastName = "Иванов";
        Ivan.id = "1";
        persons.add(Ivan);

        Person Petr = new Person();
        Petr.firstName = "Петр";
        Petr.lastName = "Петров";
        Petr.id="2";
        persons.add(Petr);

        Person Vasya = new Person();
        Vasya.firstName = "Вася";
        Vasya.lastName = "Васильев";
        Vasya.id = "3";
        persons.add(Vasya);

        return persons;
    }
}

