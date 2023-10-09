package Exam_Advance_1.ra.run;

import Exam_Advance_1.ra.bussinessImp.Catalog;
import Exam_Advance_1.ra.bussinessImp.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    public static  List<Catalog> catalogs = new ArrayList<>();
    public static  List<Product> products = new ArrayList<>();
    public static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("**************** MENU ****************");
            System.out.println("1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục");
            System.out.println("2. Nhập số sản phẩm và nhập thông tin các sản phẩm");
            System.out.println("3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần (Comparable/Comparator)");
            System.out.println("4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm");
            System.out.println("5. Thoát");
            System.out.print("Chọn 1, 2, 3, 4, hoặc 5: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Nhập số danh mục sản phẩm bạn muốn thêm:");
                    int numberOfCatalogs = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numberOfCatalogs; i++) {
                        System.out.println("Nhập thông tin danh mục sản phẩm thứ " + (i + 1) + ":");
                        Catalog newCatalog = new Catalog();
                        newCatalog.inputData();
                        catalogs.add(newCatalog);
                        System.out.println("Danh mục sản phẩm đã được thêm thành công.");
                    }
                    break;
                case 2:
                    System.out.println("Nhập số sản phẩm bạn muốn thêm:");
                    int numberOfProducts = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < numberOfProducts; i++) {
                        System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
                        Product newProduct = new Product();
                        newProduct.inputData();
                        products.add(newProduct);
                        System.out.println("Sản phẩm đã được thêm thành công.");
                    }
                    break;
                case 3:
                    Collections.sort(products); // Sử dụng Comparable để sắp xếp
                    System.out.println("Danh sách sản phẩm đã được sắp xếp theo giá bán tăng dần:");
                    for (Product product : products) {
                        product.displayData();
                    }
                    break;

                case 4:

                    System.out.println("Nhập tên danh mục sản phẩm bạn muốn tìm kiếm:");
                    String categoryNameToSearch = scanner.nextLine();
                    System.out.println("Kết quả tìm kiếm theo danh mục \"" + categoryNameToSearch + "\":");
                    boolean found = false;
                    for (Product product : products) {
                        if (product.getCatalog().getCatalogName().equalsIgnoreCase(categoryNameToSearch)) {
                            product.displayData();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy sản phẩm nào thuộc danh mục \"" + categoryNameToSearch + "\".");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}