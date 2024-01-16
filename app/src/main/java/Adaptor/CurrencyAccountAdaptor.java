package Adaptor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.noura.androidrecycleview.Currency;
import com.noura.androidrecycleview.R;

import java.util.ArrayList;

public class CurrencyAccountAdaptor extends RecyclerView.Adapter<CurrencyAccountAdaptor.CurrencyViewHolder> {
    private ArrayList<Currency> accountlist;

    public CurrencyAccountAdaptor(ArrayList<Currency> accountlist) {

        this.accountlist = accountlist;
    }

    @NonNull
    @Override
    public CurrencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.currencyaccountitem, parent, false);

        return new CurrencyViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyViewHolder holder, int position) {
        Currency currency = accountlist.get(position);
        holder.nametextview.setText(currency.getCurrencyName());
        holder.currencycodetextview.setText(currency.getCurrrencyCode());
        holder.ratetextview.setText(String.valueOf(currency.getExchangeRate()));

    }

    @Override
    public int getItemCount() {
        return accountlist.size();
    }

    public static class CurrencyViewHolder extends RecyclerView.ViewHolder {
        TextView nametextview;
        TextView currencycodetextview;
        TextView ratetextview;

        public CurrencyViewHolder(@NonNull View itemView) {
            super(itemView);
            nametextview = itemView.findViewById(R.id.accountnametextview);
            currencycodetextview = itemView.findViewById(R.id.currencycodetextview);
            ratetextview = itemView.findViewById(R.id.ratetextview);
        }
    }

}

