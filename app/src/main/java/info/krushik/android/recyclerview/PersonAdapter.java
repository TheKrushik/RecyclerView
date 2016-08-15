package info.krushik.android.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonViewHolder> {

    //Здесь мы будем хранить набор наших данных
    private ArrayList<Person> persons;

    //Простенький конструктор
    public PersonAdapter(ArrayList<Person> persons){
        this.persons = persons;
    }

    //Прикрепление нового элемента к RecyclerView
    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i){
        //Получаем элемент набора данных для заполнения
        Person currentPerson = persons.get(i);

        //Заполняем поля viewHolder'а данными из элемента набора данных
        personViewHolder.tvId.setText(currentPerson.id);
        personViewHolder.tvFirstName.setText(currentPerson.firstName);
        personViewHolder.tvLastName.setText(currentPerson.lastName);

    }

    //Создание нового ViewHolder'а
    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){

        //Создаём новый view при помощи LayoutInflater
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);

        return new PersonViewHolder(itemView);
    }

    //Возвращает количество элементов списка
    @Override
    public int getItemCount(){
        // вернём размер списка
        return persons.size();
    }

}
