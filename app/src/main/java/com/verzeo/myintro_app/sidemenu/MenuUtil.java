package com.verzeo.myintro_app.sidemenu;

import com.verzeo.myintro_app.R;

import java.util.ArrayList;
import java.util.List;

public class MenuUtil {

    public static final int HOME_FRAGMENT_CODE = 0;
    public static final int CV_FRAGMENT_CODE = 1;
    public static final int TEAM_FRAGMENT_CODE = 2;
    public static final int PORTFOLIO_FRAGMENT_CODE = 3;
    public static final int CONTACTS_FRAGMENT_CODE = 4;


    public static List<MenuItem> getMenuList() {

        List<MenuItem> list = new ArrayList<>();
        list.add(new MenuItem(R.drawable.ic_baseline_home_24,HOME_FRAGMENT_CODE,true));
        list.add(new MenuItem(R.drawable.ic_baseline_person_24,CV_FRAGMENT_CODE,false));
        list.add(new MenuItem(R.drawable.ic_baseline_school_24,TEAM_FRAGMENT_CODE,false));
        list.add(new MenuItem(R.drawable.ic_baseline_dashboard_24,PORTFOLIO_FRAGMENT_CODE,false));
        list.add(new MenuItem(R.drawable.ic_baseline_phone_24,CONTACTS_FRAGMENT_CODE,false));

        return list;
    }



}
