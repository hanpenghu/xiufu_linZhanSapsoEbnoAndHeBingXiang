package com.ipace.linzhan.xiufu.xiuFu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
@Component
@Transactional
public class 根据单号删除sapso中的重复数据 {

    @Autowired
   private SapsoMapper sapsoMapper;
    /**
     *我曹,原来的sapso中居然后重复的数据
     * */
//凌晨一点触发
    @Scheduled(cron="0 0 01 * * ?")
    public void 修复sapso中所有重复的数据(){
        List<String> strings = sapsoMapper.deDaoSuoYouDanHao();
        for(String osno:strings){
            根据货号单号成分代码和saphh找到相同的记录的id后删除重复的第一个(osno);
        }
    }



    public void 根据货号单号成分代码和saphh找到相同的记录的id后删除重复的第一个(String 修复单号){
        System.out.println("删除重复数据开始");
        SapsoExample se=new SapsoExample();
//        se.createCriteria().andOsnoEqualTo("1701505JY19214");
                se.createCriteria().andOsnoEqualTo(修复单号);
        List<Sapso> sapsos = sapsoMapper.selectByExample(se);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验1~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(sapsos.size());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验1~~~~~~~~~~~~~~~~~~~~~~~~");
        for(Sapso s:sapsos){
            String prdno = s.getPrdno();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(prdno);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
            String osno = s.getOsno();
            String chengfendaima = s.getChengfendaima();
            String saphh = s.getSaphh();
            String sapwlm = s.getSapwlm();
            String maitouno = s.getMaitouno();
            String sapph = s.getSapph();
            BigDecimal qty = s.getQty();
            String ebno = s.getEbno();
            String caigouno = s.getCaigouno();
            SapsoExample se1=new SapsoExample();
            se1.createCriteria().andPrdnoEqualTo(prdno)
                    .andOsnoEqualTo(osno)
                    .andChengfendaimaEqualTo(chengfendaima)
                    .andSaphhEqualTo(saphh)
                    .andSapwlmEqualTo(sapwlm)
                    .andMaitounoEqualTo(maitouno)
                    .andSapphEqualTo(sapph)
                    .andQtyEqualTo(qty)
            .andEbnoEqualTo(ebno).andCaigounoEqualTo(caigouno)
            ;
           List<Sapso> sapsos1 = sapsoMapper.selectByExample(se1);
           //2个删掉一个就行了
            if(sapsos1.size()==2){
                //删掉第一个
                Integer id = sapsos1.get(0).getId();
                sapsoMapper.deleteByPrimaryKey(id);
            }

        }


        System.out.println("删除重复数据完成");

    }





}
