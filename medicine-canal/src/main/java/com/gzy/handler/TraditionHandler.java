package com.gzy.handler;

import com.gzy.entity.TcMedicine;
import top.javatool.canal.client.annotation.CanalTable;
import top.javatool.canal.client.handler.EntryHandler;

@CanalTable(value = "tc_medicine")
public class TraditionHandler implements EntryHandler<TcMedicine> {//传统

    @Override
    public void delete(TcMedicine tcMedicine) {
        System.out.println("delete");
    }
}
