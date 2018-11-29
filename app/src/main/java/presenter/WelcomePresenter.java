package presenter;



import android.content.Context;


import base.BaseView;
import bean.DescriptionDetail;
import mvpInterface.WelcomeContract;
import model.ElectronicManualModel;

/**
 * Description: WelcomePresenter
 * Creator: yxc
 * date: 2016/9/22 13:17
 */
public class WelcomePresenter  implements WelcomeContract.Presenter<WelcomeContract.View>,WelcomeContract.Model {

    private static final int COUNT_DOWN_TIME = 2200;
    WelcomeContract.View baseView;
 
    public WelcomePresenter() {
    }
    
    public void getData(String id, Context context) {
          model.getData(context);
    }

    ElectronicManualModel model;


    @Override
    public void initModel() {
        
    }

    @Override
    public void attachView(BaseView baseView) {
        this.baseView = (WelcomeContract.View)baseView;
        model = new ElectronicManualModel(this);
    }




    @Override
    public void detachView() {

    }

    @Override
    public void onSuccess(String dds) {
        baseView.showContent();
    }

    @Override
    public void onError() {
      
    }

    @Override
    public void getData(String id) {

    }
}
