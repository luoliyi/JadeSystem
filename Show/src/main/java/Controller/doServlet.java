package Controller;
import Log4jUtil.Logging;
import MyUtils.JSONUtil;
import MyUtils.Standard;
import Proxy.CGLIBProxy;
import com.jadesystem.dao.*;
import com.jadesystem.entities.*;
import com.jadesystem.mapper.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;

@WebServlet("/doServlet")
public class doServlet extends BaseServlet {

    /*每个实体的样例*/
    BrandExample brandExample=new BrandExample();
    ColorExample colorExample=new ColorExample();
    HangtypeExample hangtypeExample=new HangtypeExample();
    IcetypeExample icetypeExample=new IcetypeExample();
    InlayExample inlayExample=new InlayExample();
    MoralExample moralExample=new MoralExample();

    /*面向接口编程，访问层，以及动态代理类*/
    BrandMapper brandDAO= (BrandDAO) new CGLIBProxy().getTargetobjec(new BrandDAO());
    ColorMapper colorDAO=(ColorMapper) new CGLIBProxy().getTargetobjec(new ColorDAO());
    HangtypeMapper hangtypeDAO= (HangtypeMapper) new CGLIBProxy().getTargetobjec(new HangtypeDAO());
    IcetypeMapper icetypeDAO= (IcetypeMapper) new CGLIBProxy().getTargetobjec(new IcetypeDAO());
    InlayMapper inlayDAO= (InlayMapper) new CGLIBProxy().getTargetobjec(new InlayDAO());
    MoralMapper moralDAO= (MoralMapper) new CGLIBProxy().getTargetobjec(new MoralDAO());
    ProductsMapper productsDAO= (ProductsMapper) new CGLIBProxy().getTargetobjec(new ProductsDAO());

    Standard standard=new Standard();

    Logging logging=new Logging();
    /*用一个方法返回所有数据*/
    @Readme("查询所有条件")
    public void getAllDetails(HttpServletRequest request, HttpServletResponse response){
        long start = System.currentTimeMillis();
        logging.setInfo("开始执行：getAllDetails(查询总数)方法");
        standard.succData("brand",brandDAO.selectByExample(brandExample))
                .succData("color",colorDAO.selectByExample(colorExample))
                .succData("hangtype",hangtypeDAO.selectByExample(hangtypeExample))
                .succData("icetype",icetypeDAO.selectByExample(icetypeExample))
                .succData("inlay",inlayDAO.selectByExample(inlayExample))
                .succData("moral",moralDAO.selectByExample(moralExample));
        try {
            response.getWriter().print(JSONUtil.toJson(standard));
            Long span = System.currentTimeMillis() - start;
            logging.setInfo("结束执行：getAllDetails(查询总数)方法,共耗时："+span+"毫秒");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /*查询总数*/
    @Readme("查询总数")
    public void getAllCount(HttpServletRequest request,HttpServletResponse response){
        ProductsExample productsExample=new ProductsExample();
        try {
            response.getWriter().print(JSONUtil.toJson(productsDAO.countByExample(productsExample)));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /*分页查询*/
    @Readme("分页查询")
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

    @Readme("多条件组合查询加分页")
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
    @Readme("多条件组合查询")
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
