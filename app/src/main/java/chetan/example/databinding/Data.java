package chetan.example.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import chetan.example.databinding.BR;
/**
 * Created by chetan on 14/8/16.
 */
public class Data extends BaseObservable
{

    String mWelcomeText;

    @Bindable
    public String getWelcomeText() {
        return mWelcomeText;
    }


    public void setWelcomeText(String welcomeText) {
        mWelcomeText = welcomeText;
        notifyPropertyChanged(BR.welcomeText);

    }
}
