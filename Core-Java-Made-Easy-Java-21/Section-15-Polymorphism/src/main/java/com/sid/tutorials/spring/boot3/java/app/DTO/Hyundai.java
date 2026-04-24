package com.sid.tutorials.spring.boot3.java.app.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kunmu On 24-04-2026
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hyundai implements IVehicle {
    private String vehicleType;
    private String brand;
    private String transmissionType;
    private Integer gearBox;

    @Override
    public void vaichelType() {
        System.out.println("Vaichel Type: " + this.vehicleType);
    }

    @Override
    public void brand() {
        System.out.println("Brand: " + this.brand);
    }

    @Override
    public void transmissionType() {
        System.out.println("Transmission Type: " + this.transmissionType);
    }

    @Override
    public void gearBox() {
        System.out.println("Gear Box: " + this.gearBox);
    }

    @Override
    public void start() {
        System.out.println("Hyundai is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Hyundai is stopping...");
    }
}
