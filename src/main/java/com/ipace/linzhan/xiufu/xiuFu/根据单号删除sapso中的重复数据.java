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

    public static void main(String[]args){
            p.p(8*60*60*1000);
    }
    @Autowired
    private Cnst cnst;
    /**
     *我曹,原来的sapso中居然后重复的数据
     * */
//第一次是20秒后触发,以后每30秒循环一次
    @Scheduled(fixedDelay=30*1000,initialDelay=20*1000)
    public void 修复sapso中所有重复的数据(){
        p.p(p.gp().sad(p.dexhx).sad("删除sapso重复开始！！！").sad(p.dexhx).gad());
        int i=0;
        List<String> strings = cnst.sapsoMapper.deDaoSuoYouDanHao();
        for(String osno:strings){
            根据货号单号成分代码和saphh找到相同的记录的id后删除重复的第一个(osno,i);
        }
        p.p(p.gp().sad(p.dexhx).sad("删除sapso重复已经完成！删除了"+i+"个重复数据！！").sad(p.dexhx).gad());
    }



    public void 根据货号单号成分代码和saphh找到相同的记录的id后删除重复的第一个(String 修复单号,int i){

        SapsoExample se=new SapsoExample();
                se.createCriteria().andOsnoEqualTo(修复单号);
        List<Sapso> sapsos = cnst.sapsoMapper.selectByExample(se);
        for(Sapso s:sapsos){
            String prdno = s.getPrdno();
            if(prdno==null)prdno="";
            String osno = s.getOsno();
            if(null==osno)osno="";
            String chengfendaima = s.getChengfendaima();
            if(null==chengfendaima)chengfendaima="";
            String saphh = s.getSaphh();
            if(null==saphh)saphh="";
            String sapwlm = s.getSapwlm();
            if(null==sapwlm)sapwlm="";
            String maitouno = s.getMaitouno();
            if(null==maitouno)maitouno="";
            String sapph = s.getSapph();
            if(sapph==null)sapph="";
            BigDecimal qty = s.getQty();
            String ebno = s.getEbno();
            if(ebno==null)ebno="";
            String caigouno = s.getCaigouno();
            if(caigouno==null)caigouno="";
            List<Sapso> sapsos1 =cnst.sapsoMapper
                    .selectSapso(prdno,osno,chengfendaima,saphh,
                            sapwlm,maitouno,sapph,ebno,caigouno);
           //2个删掉一个就行了
            if(sapsos1.size()>=2){
                //删掉第一个
                Integer id = sapsos1.get(0).getId();
                Sapso sapso = cnst.sapsoMapper.selectByPrimaryKey(id);
                //上面选取的时候没有判断qty是否相等,这里要判断一下,相等了再删除
                if(sapso.getQty().equals(qty)){
                    cnst.sapsoMapper.deleteByPrimaryKey(id);
                }
                i++;
                p.p(p.gp().sad(p.dexhx).sad("删除第")
                        .sad(p.strValeOf(i))
                        .sad("个重复的数据").sad(p.dexhx).gad());
            }

        }

    }





}
