package model;

import android.content.Context;

import java.util.List;

import bean.HttpResult;
import bean.Subject;
import mvpInterface.WelcomeContract;
import http.RetrofitHelper;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import service.MovieService;

public class ElectronicManualModel  {
    WelcomeContract.Presenter iElectronicManualPresenter;
    public ElectronicManualModel(WelcomeContract.Presenter iElectronicManualPresenter) {
        this.iElectronicManualPresenter = iElectronicManualPresenter;
        
    }
    HttpResult<List<Subject>> a;
    public void  getData(final Context context) {
      
        MovieService movieService = RetrofitHelper.getInstance(context).getmRetrofit().create(MovieService.class);

        movieService.getTopMovie(0, 10)   
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<HttpResult<List<Subject>>>() {
                    @Override
                    public void onCompleted() {
                        
                    }

                    @Override
                    public void onError(Throwable e) {
                        iElectronicManualPresenter.onError();
                    }

                    @Override
                    public void onNext(HttpResult<List<Subject>> listHttpResult) {  //单纯实现rxjava+retrofit 回调P接口,数据无作用
                        iElectronicManualPresenter.onSuccess(listHttpResult.toString());
                    }


                });
        return ;
    }
}
