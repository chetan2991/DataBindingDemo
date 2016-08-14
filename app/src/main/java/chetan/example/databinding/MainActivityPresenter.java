package chetan.example.databinding;

import java.util.Random;

/**
 * Created by chetan on 14/8/16.
 */
public class MainActivityPresenter
{
    MainActivityContract mMainActivityContract;
    public MainActivityPresenter( MainActivityContract mainActivityContract)
    {
        mMainActivityContract = mainActivityContract;
    }
    public void changeText( Data data )
    {

        data.setWelcomeText("text"+ new Random());
        mMainActivityContract.changeText( data );
    }
}
