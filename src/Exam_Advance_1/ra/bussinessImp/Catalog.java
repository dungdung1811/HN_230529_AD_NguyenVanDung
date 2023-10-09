package Exam_Advance_1.ra.bussinessImp;

import Exam_Advance_1.ra.bussiness.IShop;

import java.util.Scanner;

public class Catalog implements IShop {

    private int catalogId;
    private String catalogName;
    private  int priority;
    private  String descriptions;
    private boolean catalogStatus;
    private Object catalog;

    public Catalog() {
    }

    public Catalog(int catalogId, String catalogName, int priority, String descriptions, boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.priority = priority;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    @Override
    public void inputData() {
        System.out.println("Nhập vào thông tin sản phẩm");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã danh mục sản phẩm");
        this.catalogId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên danh mục sản phẩm ");
        this.catalogName = scanner.nextLine();
        System.out.println("Nhập vào độ ưu tiên  ");
        this.priority = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào mô tả danh mục");
        this.descriptions = scanner.nextLine();
        System.out.println("Nhập vào trạng thái danh mục True- False");
        this.catalogStatus = Boolean.parseBoolean(scanner.nextLine());




    }

    @Override
    public void displayData() {
        System.out.println("Hiển thị thông tin sách");
        System.out.println("Mã danh mục: " + this.catalogId);
        System.out.println("Tên danh mục: " + this.catalogName);
        System.out.println("Uu tiên: " + this.priority);
        System.out.println("Mô tả: " + this.descriptions);
        System.out.println("Trạng thái: " + this.catalogStatus);

    }

}
