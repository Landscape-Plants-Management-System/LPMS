package com.lpms;

import com.lpms.controller.AppController;
import com.lpms.dao.*;
import com.lpms.pojo.User;
import com.lpms.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        AppController appController=new AppController();
        appController.appIn();
    }
}
