package com.laoduan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


//servlet

/**
 * @author laoduan
 * @create 2020-07-14-18:23
 */
public class BMIAjaxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

//
//        //接收请求参数
//        String strName = request.getParameter("name");
//        String height = request.getParameter("height");
//        String weight = request.getParameter("weight");
//
//
//        //计算BMI：BMI=体重/身高^2
//
//        float w =Float.valueOf(weight);
//        float h =Float.valueOf(height);
//
//        float BMI = w/(h*h);
//
//        //判断BMI范围
//
//        String msg = "";
//        if(BMI <=18.5){
//            msg="您比较瘦";
//        }else if(BMI>18.5&&BMI<=23.9){
//            msg="您的BMI属于正常范围";
//        }else if (BMI>24&&BMI<=27){
//            msg="您的身体有些微胖";
//        }else{
//            msg="您的身体过于肥胖，注意健康";
//        }
//
//        System.out.println("msg="+msg);
//
//        msg="您好："+strName+"先生/女士</br>"+"您的BMI值是："+BMI+"</br>"+msg;
//
//        //使用HttpServletResponse输出数据
//        response.setContentType("text/html;charset=utf-8");
//
//        //获取PrintWriter
//        PrintWriter pw = response.getWriter();
//
//        //输出数据
//        pw.println(msg);
//
//        //清空缓存
//        pw.flush();
//
//        //关闭
//        pw.close();
        System.out.println("-----======接收了ajax请求======-----");




        //接收参数
        String strName = request.getParameter("name");
        String w = request.getParameter("w");
        String h = request.getParameter("h");



//        计算BMI
//计算BMI：BMI=体重/身高^2

        float weight =Float.valueOf(w);
        float height =Float.valueOf(h);

        float BMI = weight/(height*height);

        //判断BMI范围

        String msg = "";
        if(BMI <=18.5){
            msg="您比较瘦";
        }else if(BMI>18.5&&BMI<=23.9){
            msg="您的BMI属于正常范围";
        }else if (BMI>24&&BMI<=27){
            msg="您的身体有些微胖";
        }else{
            msg="您的身体过于肥胖，注意健康";
        }

        System.out.println("msg="+msg);

        msg="您好："+strName+"先生/女士</br>"+"您的BMI值是："+BMI+"</br>"+msg;





        //响应ajax需要的数据，用HttpServletResponse输出数据


        response.setContentType("text/html;charset=utf-8");

        PrintWriter pw = response.getWriter();

        pw.println(msg);
        pw.flush();
        pw.close();
    }
}
