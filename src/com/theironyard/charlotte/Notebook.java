package com.theironyard.charlotte;

/**
 * Created by Ben on 11/30/16.
 */
public class Notebook {
    String brand;
    int numberOfPages;
    double pageHeight;
    double pageWidth;
    boolean isLined;

    public Notebook(String brand, int numberOfPages, double pageHeight, double pageWidth, boolean isLined) {
        this.brand = brand;
        this.numberOfPages = numberOfPages;
        this.pageHeight = pageHeight;
        this.pageWidth = pageWidth;
        this.isLined = isLined;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getPageHeight() {
        return pageHeight;
    }

    public double getPageWidth() {
        return pageWidth;
    }

    public boolean isLined() {
        return isLined;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages > 0) {
            this.numberOfPages = numberOfPages;
        } else {
            System.out.println("Invalid number of pages");
        }
    }

    public void setPageHeight(double pageHeight) {
        this.pageHeight = pageHeight;
    }

    public void setPageWidth(double pageWidth) {
        this.pageWidth = pageWidth;
    }

    public void setLined(boolean lined) {
        isLined = lined;
    }
}
