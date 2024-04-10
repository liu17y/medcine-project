package com.gzy.handler;

import com.gzy.entity.WMedicine;
import top.javatool.canal.client.annotation.CanalTable;
import top.javatool.canal.client.handler.EntryHandler;

@CanalTable(value = "w_medicine")
public class WMedicineHandler implements EntryHandler<WMedicine> {
    @Override
    public void delete(WMedicine wMedicine) {
        System.out.println("delete=====================》");
    }
}
