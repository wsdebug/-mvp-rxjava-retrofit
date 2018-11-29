package base;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.SupportActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;


import app.App;
import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * Description: Activity基类
 * Creator: yxc
 * date: 17/9/14
 */
public abstract class BaseActivity extends Activity {

    protected Activity mContext;
    private Unbinder mUnBinder;

  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        init();

        setContentView(getLayout());
        getIntentData();
        mContext = this;
        mUnBinder = ButterKnife.bind(this);
        initView();
        initEvent();
    }

    protected void init() {
        setTranslucentStatus(true);
        
        App.getInstance().registerActivity(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
     
     
    }

    @Override
    protected void onRestart() {
        super.onRestart();
      
    }

    @Override
    protected void onResume() {
        super.onResume();
       
    }

    @Override
    protected void onPause() {
        super.onPause();
       
    }

    @Override
    protected void onStop() {
        super.onStop();
       
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (mUnBinder != null)
            mUnBinder.unbind();
        App.getInstance().unregisterActivity(this);
    }
   

   

    /**
     * 设置沉浸式
     *
     * @param on
     */
    protected void setTranslucentStatus(boolean on) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window win = getWindow();
            WindowManager.LayoutParams winParams = win.getAttributes();
            final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
            if (on) {
                winParams.flags |= bits;
            } else {
                winParams.flags &= ~bits;
            }
            win.setAttributes(winParams);
        }
    }

    

    protected static View getRootView(Activity context) {
        return ((ViewGroup) context.findViewById(android.R.id.content)).getChildAt(0);
    }

    protected abstract int getLayout();

    protected void initView() {
    }

    protected void initEvent() {
    }

    protected void getIntentData() {
    }
}
