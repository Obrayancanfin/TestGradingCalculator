import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ShopTest {

    Product product;
    Shop shop;
    List<Product> products;

    @BeforeAll
    public static void init() {
        Product product= new Product();
        List<Product> products= new ArrayList<>();
        Shop shop = new Shop(new ArrayList<>());

    }

   @Test
   public void testUpdate_When_OutDated_Quality_10_ThenResult_QualityDecreasesTwice_Quality_8(){
       //Arrange
            product.setQuality(10);
            product.setSellIn(0);
            products.add(product);
            shop.setProducts(products);
            shop.update(product);
       //Act
            int await = 8;
       //Assert
            Assertions.assertEquals(await, shop.getProducts().get(0).getQuality());
   }

   @Test
   public void TestUpdate_When_Update_Then_Result_QualityNotNegative(){
       //Arrange
            product.setQuality(10);
            product.setSellIn(0);
            products.add(product);
            shop.setProducts(products);
            shop.update(product);
       //Act
            int await = 0;
       //Assert
            Assertions.assertTrue(shop.getProducts().get(0).getQuality() >= await);
   }

}
