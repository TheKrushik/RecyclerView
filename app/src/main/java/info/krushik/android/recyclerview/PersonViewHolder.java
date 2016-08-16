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
    public PersonViewHolder(final View itemView){
        super(itemView);

        //привязываем элементы к полям
        tvId = (TextView)itemView.findViewById(R.id.tvId);
        tvFirstName = (TextView)itemView.findViewById(R.id.tvFirstName);
        tvLastName = (TextView)itemView.findViewById(R.id.tvLastName);

        //Как и прежде, мы привязываемся из ViewHolder, но вызываем метод адаптера.
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PersonAdapter.listener!=null){
                    PersonAdapter.listener.onItemClick(itemView, getLayoutPosition());
                }
            }
        });
    }
}
