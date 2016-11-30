package com.theironyard.charlotte;

/**
 * Created by Ben on 11/30/16.
 */
public class HardDrive {
    String brand;
    String formatType;
    Double hardDriveSize;
    Double hardDriveDimensions;
    Boolean isSSD;

    public HardDrive(String brand, String formatType, Double hardDriveSize, Double hardDriveDimensions, Boolean isSSD) {
        this.brand = brand;
        this.formatType = formatType;
        this.hardDriveSize = hardDriveSize;
        this.hardDriveDimensions = hardDriveDimensions;
        this.isSSD = isSSD;
    }

    public String getBrand() {
        return brand;
    }

    public String getFormatType() {
        return formatType;
    }

    public Double getHardDriveSize() {
        return hardDriveSize;
    }

    public Double getHardDriveDimensions() {
        return hardDriveDimensions;
    }

    public Boolean getSSD() {
        return isSSD;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }

    public void setHardDriveSize(Double hardDriveSize) {
        if (hardDriveSize >= 0) {
            this.hardDriveSize = hardDriveSize;
        } else {
            System.out.println("Size Invalid");
        }
    }

    public void setHardDriveDimensions(Double hardDriveDimensions) {
        this.hardDriveDimensions = hardDriveDimensions;
    }

    public void setSSD(Boolean SSD) {
        isSSD = SSD;
    }
}
