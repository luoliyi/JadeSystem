package CGLIBProxy;

import Proxy.CGLIBProxy;
import com.jadesystem.dao.ProductsDAO;
import com.jadesystem.entities.Products;
import com.jadesystem.entities.ProductsExample;
import com.jadesystem.mapper.ProductsMapper;

import java.util.List;

public class ProxyTest {

   static ProductsMapper productsMapper= (ProductsMapper) new CGLIBProxy().getTargetobjec(new ProductsDAO());

    public static void main(String[] args) {
        List<Products> productsList=productsMapper.selectByExample(new ProductsExample());
        System.out.println(productsList);
    }
}
