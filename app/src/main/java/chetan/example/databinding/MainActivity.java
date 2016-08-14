package chetan.example.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import chetan.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity  implements MainActivityContract{

    private Data mData;
    private MainActivityPresenter mMainActivityPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main );

        mMainActivityPresenter = new MainActivityPresenter(this);
        mData = new Data();
        mData.setWelcomeText("Ram is My God");
        binding.setData( mData );
        binding.setPresenter( mMainActivityPresenter );
    }

    @Override
    public void changeText(Data data) {
        Toast.makeText( getApplicationContext(), "The Change Text Is:"+data.getWelcomeText(), Toast.LENGTH_LONG ).show();
    }
}
