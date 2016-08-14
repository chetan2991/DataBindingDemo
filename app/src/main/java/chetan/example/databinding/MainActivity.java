package chetan.example.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import chetan.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Data mData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main );
        mData = new Data();
        mData.setWelcomeText("Ram is My God");
        binding.setData( mData );
    }
}
