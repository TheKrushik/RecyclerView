package info.krushik.android.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class PersonViewHolder extends RecyclerView.ViewHolder {

    //объявим поля, созданные в файле интерфейса item.xml
    public TextView tvFirstName;
    public TextView tvLastName;
    public TextView tvId;

    //объявляем конструктор
    public PersonViewHolder(View itemView){
        super(itemView);

        //привязываем элементы к полям
        tvId = (TextView)itemView.findViewById(R.id.tvId);
        tvFirstName = (TextView)itemView.findViewById(R.id.tvFirstName);
        tvLastName = (TextView)itemView.findViewById(R.id.tvLastName);
    }
}
