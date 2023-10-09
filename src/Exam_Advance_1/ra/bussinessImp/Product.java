package Exam_Advance_1.ra.bussinessImp;

import Exam_Advance_1.ra.bussiness.IShop;

import java.util.Scanner;

import static Exam_Advance_1.ra.run.ProductManagement.catalogs;

public class Product implements IShop, Comparable<Product>  {
    private int productId;
    private String productName;
    private String title;
    private String descriptions;
    private Catalog catalog;
    private float importPrice;
    private float exportPrice;
    private boolean productStatus;

    public Product() {
    }

    public Product(int productId, String productName, String title, String descriptions, Catalog catalog, float importPrice, float exportPrice, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.catalog = catalog;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.productStatus = productStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }


    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public void inputData() {
        System.out.println("Nhập vào thông tin sản phẩm");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào Id của sản phẩm");
        this.productId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên sản phẩm ");
        this.productName = scanner.nextLine();
        System.out.println("Nhập vào tiêu đề sản phẩm ");
        this.title = scanner.nextLine();
        System.out.println("Nhập vào mô tả sản phẩm");
        this.descriptions = scanner.nextLine();
        System.out.println("Nhập vào giá nhập ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào trạng thái sản phẩm ");
        this.productStatus = Boolean.valueOf(scanner.nextLine());
        this.exportPrice = this.importPrice*RATE;
        System.out.println("Danh sách danh mục sản phẩm:");
        for (int i = 0; i < catalogs.size(); i++) {
            System.out.println((i + 1) + ". " + catalogs.get(i).getCatalogName());
        }
        // Lựa chọn danh mục sản phẩm
        System.out.print("Chọn số tương ứng với danh mục sản phẩm: ");
        int catalogChoice = Integer.parseInt(scanner.nextLine());
        if (catalogChoice >= 1 && catalogChoice <= catalogs.size()) {
            this.catalog = (catalogs.get(catalogChoice - 1));
        } else {
            System.out.println("Lựa chọn không hợp lệ. Sản phẩm sẽ không thuộc danh mục nào.");
        }

    }
    @Override
    public void displayData() {
        System.out.println("Hiển thị thông tin sản phẩm");
        System.out.println("Mã sản phẩm: " + this.productId);
        System.out.println("Tên sản phẩm: " + this.productName);
        System.out.println("Tiêu đề: " + this.title);
        System.out.println("Mô tả: " + this.descriptions);
        System.out.println("Danh mục sản phẩm: " + this.catalog);
        System.out.println("Giá nhập: " + this.importPrice);
        System.out.println("Giá bán: " + this.exportPrice);
        System.out.println("Trạng thái sản phẩm: " + this.productStatus);

    }


    @Override
    public int compareTo(Product otherProduct) {
        return  Float.compare(this.exportPrice, otherProduct.exportPrice);
    }


}
