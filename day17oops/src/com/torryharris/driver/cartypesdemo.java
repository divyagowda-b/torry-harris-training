package com.torryharris.driver;

import com.torryharris.model.Hatchback;
import com.torryharris.model.Tyre;
import com.torryharris.model.sedan;
import com.torryharris.model.suv;

public class cartypesdemo {
    public static void main(String[] args) {
        Tyre mrf = new Tyre("mrf",17);
        Hatchback swift = new Hatchback("swift","petrol",1200,66.7f,
                6,mrf,"power");
        swift.displayHatchbackFeatures();
        sedan dzire = new sedan("dezire","petrol",1000,
                85.5f,6,mrf,30);
        dzire.displaysedanFeatures();
        suv kia = new suv("kia","petrol",2200,78.8f,6,
                mrf,"sport",true);
        kia.displaysuvFeatures();



    }
}
