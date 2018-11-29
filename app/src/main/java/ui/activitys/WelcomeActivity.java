package ui.activitys;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.administrator.atwelvedemo.R;

import base.BaseMvpActivity;
import butterknife.BindView;
import mvpInterface.WelcomeContract;
import presenter.WelcomePresenter;

/**
 * Description: 开屏页
 * Creator: yxc
 * date: 2017/9/6 14:57
 */
public class WelcomeActivity extends BaseMvpActivity<WelcomePresenter> implements WelcomeContract.View {


   
   
    @BindView(R.id.image_view)
    ImageView imageView;
    @BindView(R.id.bt)
    Button bt;

    @Override
    protected int getLayout() {
        return R.layout.activity_user_guide;
    }


    @Override
    public WelcomePresenter getmPresenter() {
        return new WelcomePresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
   
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.getData("1",WelcomeActivity.this);
            }
        });
    }
    


    @Override
    protected void initInject() {
        mPresenter = new WelcomePresenter();
        
    }

   

    @Override
    public void showContent() {
        
        Glide.with(this).load("http://guolin.tech/book.png").into(imageView);
    }

   
}