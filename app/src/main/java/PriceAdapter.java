import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.fgw.tracker.R;

import java.util.List;

public class PriceAdapter extends ArrayAdapter<Price> {
    private Activity context;
    private List<Price> PriceList;


    public PriceAdapter(Activity context,List<Price> PriceList){
        super(context, R.layout.list_view,PriceList);
        this.context =context;
        this.PriceList =PriceList;



    }

@NonNull
@Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater  = context.getLayoutInflater();
        View listView =inflater.inflate(R.layout.list_view, null,true );
        TextView price = (TextView)listView.findViewById(R.id.textView2);
        float price1 =Price.getPrice();
        price.setText(Float.toString(price1));
        return convertView;




    }
}
