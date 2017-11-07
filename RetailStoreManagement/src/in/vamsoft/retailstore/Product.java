package in.vamsoft.retailstore;
/* 
 * @project name:Retail store Management.
 * @Date :
 * @ 
 */
public class Product {
  int productID;
  String productName;
  int quatity;
  double productPrice;

  public Product(int productID, String productName, int quatity, double productPrice) {
    super();
    this.productID = productID;
    this.productName = productName;
    this.quatity = quatity;
    this.productPrice = productPrice;
  }

  public int getProductID() {
    return productID;
  }

  public void setProductID(int productID) {
    this.productID = productID;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public int getQuatity() {
    return quatity;
  }

  public void setQuatity(int quatity) {
    this.quatity = quatity;
  }

  public double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
  }

}
