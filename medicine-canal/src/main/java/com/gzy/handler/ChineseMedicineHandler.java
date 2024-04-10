package com.gzy.handler;

import com.gzy.entity.ChinesePatentDrug;
import org.springframework.stereotype.Component;
import top.javatool.canal.client.annotation.CanalTable;
import top.javatool.canal.client.handler.EntryHandler;

@Component
@CanalTable(value = "chinese_patent_drug")
public class ChineseMedicineHandler implements EntryHandler<ChinesePatentDrug> {
    @Override
    public void delete(ChinesePatentDrug chinesePatentDrug) {
        System.out.println(chinesePatentDrug);
        System.out.println("删除");
    }

    @Override
    public void insert(ChinesePatentDrug chinesePatentDrug) {
        System.out.println(chinesePatentDrug);
        System.out.println("add");
    }

    @Override
    public void update(ChinesePatentDrug before, ChinesePatentDrug after) {
        System.out.println(after);
        System.out.println("delete");
    }
}
