package Reposetory;
import com.noura.androidrecycleview.Currency;

import java.util.ArrayList;
import java.util.Random;

public class CurrencyRepo {

    private static CurrencyRepo instance;

    private CurrencyRepo(){}

    public static CurrencyRepo getInstance(){
        if(instance == null)
            instance = new CurrencyRepo();
        return instance;
    }

    public ArrayList<Currency> generateDummyCurrencies(int numberOfItems){
        ArrayList<Currency> currencyList = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < numberOfItems; i++){

            String[] countryCurrencyNames = {"EUR","KWD", "GBP"};

            int randomNameIndex = random.nextInt(countryCurrencyNames.length);

            String[] countryCodes = {"Europe Euro", "kuwaiti dinar", "British Pound"};
            int randomCodeIndex = random.nextInt(countryCodes.length);

        }
        return currencyList;

    }
}
           // currencyList.add(new Currency(countryCurrencyNames[randomNameIndex],countryCodes[randomCodeIndex],
            //0.3*i));