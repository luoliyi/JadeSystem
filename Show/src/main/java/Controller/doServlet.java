package Controller;
import MyUtils.JSONUtil;
import MyUtils.Standard;
import com.jadesystem.dao.*;
import com.jadesystem.entities.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;

@WebServlet("/doServlet")
public class doServlet extends BaseServlet {
    /*访问层*/
    BrandDAO brandDAO=new BrandDAO();
    ColorDAO colorDAO=new ColorDAO();
    HangtypeDAO hangtypeDAO=new HangtypeDAO();
    IcetypeDAO icetypeDAO=new IcetypeDAO();
    InlayDAO inlayDAO=new InlayDAO();
    MoralDAO moralDAO=new MoralDAO();
    ProductsDAO productsDAO=new ProductsDAO();

    Standard standard=new Standard();

    /*每个实体的样例*/
    BrandExample brandExample=new BrandExample();
    ColorExample colorExample=new ColorExample();
    HangtypeExample hangtypeExample=new HangtypeExample();
    IcetypeExample icetypeExample=new IcetypeExample();
    InlayExample inlayExample=new InlayExample();
    MoralExample moralExample=new MoralExample();


    /*用一个方法返回所有数据*/
    public void getAllDetails(HttpServletRequest request, HttpServletResponse response){
        standard.succData("brand",brandDAO.selectByExample(brandExample)).succData("color",colorDAO.selectByExample(colorExample))
               .succData("hangtype",hangtypeDAO.selectByExample(hangtypeExample)).succData("icetype",icetypeDAO.selectByExample(icetypeExample))
                .succData("inlay",inlayDAO.selectByExample(inlayExample)).succData("moral",moralDAO.selectByExample(moralExample));
        try {
            response.getWriter().print(JSONUtil.toJson(standard));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /*查询总数*/
    public void getAllCount(HttpServletRequest request,HttpServletResponse response){
        ProductsExample productsExample=new ProductsExample();
        try {
            response.getWriter().print(JSONUtil.toJson(productsDAO.countByExample(productsExample)));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /*分页查询*/
    public void  getAllProductsByPage(HttpServletRequest request,HttpServletResponse response){
        ProductsExample productsExample=new ProductsExample();
        int pageno=Integer.parseInt(request.getParameter("pageno"));
        int size=Integer.parseInt(request.getParameter("size"));
        int truepageno=(pageno-1)*size;
        productsExample.setOffset(truepageno);
        productsExample.setLimit(size);
        try {
            response.getWriter().print(JSONUtil.toJson(productsDAO.selectByExample(productsExample)));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void getAllProductsLimitByPageCount(HttpServletRequest request,HttpServletResponse response){
        int hangtype=Integer.parseInt(request.getParameter("hangtype"));
        int moral=Integer.parseInt(request.getParameter("moral"));
        int icetype=Integer.parseInt(request.getParameter("icetype"));

        String price=request.getParameter("price");
        System.out.println("传过来的价格："+price);
        BigDecimal beginprice=BigDecimal.valueOf(2.0);
        BigDecimal endprice=BigDecimal.valueOf(99999999999.0);
        if(price!=""||!price.equals("")){
            String[]prices=price.split("-");
            //开始价格
            beginprice= BigDecimal.valueOf(Double.parseDouble(prices[0]));
            //结束价格
            endprice=BigDecimal.valueOf(Double.parseDouble(prices[1]));
        }

        int inlay=Integer.parseInt(request.getParameter("inlay"));
        int color=Integer.parseInt(request.getParameter("color"));
        int brand=Integer.parseInt(request.getParameter("brand"));
        ProductsExample productsExample=new ProductsExample();
        productsExample.createCriteria().andPcidEqualTo(color).andPbidEqualTo(brand)
                .andPhtidEqualTo(hangtype).andPiidEqualTo(inlay).andPitidEqualTo(icetype).
                andPmidEqualTo(moral).andPmarketpriceBetween(beginprice,endprice);
        try {
            //返回结果集与总数
            response.getWriter().print(JSONUtil.toJson(productsDAO.countByExample(productsExample)));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /*组合查询*/
    public void  getAllProductsLimit(HttpServletRequest request,HttpServletResponse response){
        int hangtype=Integer.parseInt(request.getParameter("hangtype"));
        int moral=Integer.parseInt(request.getParameter("moral"));
        int icetype=Integer.parseInt(request.getParameter("icetype"));
        String price=request.getParameter("price");
        System.out.println("传过来的价格："+price);
        BigDecimal beginprice=BigDecimal.valueOf(2.0);
        BigDecimal endprice=BigDecimal.valueOf(99999999999.0);
        if(price!=""||!price.equals("")){
            String[]prices=price.split("-");
            //开始价格
            beginprice= BigDecimal.valueOf(Double.parseDouble(prices[0]));
            //结束价格
            endprice=BigDecimal.valueOf(Double.parseDouble(prices[1]));
        }

        int inlay=Integer.parseInt(request.getParameter("inlay"));
        int color=Integer.parseInt(request.getParameter("color"));
        int brand=Integer.parseInt(request.getParameter("brand"));

        ProductsExample productsExample=new ProductsExample();

        int pageno=Integer.parseInt(request.getParameter("pageno"));
        int size=Integer.parseInt(request.getParameter("size"));
        int truepageno=(pageno-1)*size;
        productsExample.setOffset(truepageno);
        productsExample.setLimit(size);

        productsExample.createCriteria().andPcidEqualTo(color).andPbidEqualTo(brand)
                .andPhtidEqualTo(hangtype).andPiidEqualTo(inlay).andPitidEqualTo(icetype).andPmidEqualTo(moral)
               .andPmarketpriceBetween(beginprice,endprice);

        try {
            //返回结果集与总数
            response.getWriter().print(JSONUtil.toJson(productsDAO.selectByExample(productsExample)));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
