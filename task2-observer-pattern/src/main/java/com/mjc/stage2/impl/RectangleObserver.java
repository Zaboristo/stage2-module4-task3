package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver implements Observer {
    @Override
    public void handleEvent(RectangleEvent event) {
        Rectangle rect = event.getSource();
        RectangleWarehouse wh = RectangleWarehouse.getInstance();
        RectangleValues old = wh.get(rect.getId());
        RectangleValues values = new RectangleValues(rect.square(), rect.perimeter());
        wh.remove(rect.getId(), old);
        wh.put(rect.getId(), values);
    }
    // Write your code here!
}
