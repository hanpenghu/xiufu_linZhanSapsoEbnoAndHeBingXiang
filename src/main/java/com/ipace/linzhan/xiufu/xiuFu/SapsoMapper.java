package com.ipace.linzhan.xiufu.xiuFu;

import java.util.List;
import com.ipace.linzhan.xiufu.xiuFu.Sapso;
import com.ipace.linzhan.xiufu.xiuFu.SapsoExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SapsoMapper {
    long countByExample(SapsoExample example);

    int deleteByExample(SapsoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sapso record);

    int insertSelective(Sapso record);

    List<Sapso> selectByExample(SapsoExample example);

    Sapso selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sapso record, @Param("example") SapsoExample example);

    int updateByExample(@Param("record") Sapso record, @Param("example") SapsoExample example);

    int updateByPrimaryKeySelective(Sapso record);

    int updateByPrimaryKey(Sapso record);

    @Update({"UPDATE SAPSO SET osno='' WHERE osno IS NULL"
            ,"UPDATE SAPSO SET prdno='' WHERE prdno IS NULL"
            ,"UPDATE SAPSO SET chengfendaima='' WHERE chengfendaima IS NULL"})
    Integer updateOsNoAndPrdNoAndChengFenDaiMaNullToSpace();
@Select("select osno from sapso group by osno")
    List<String> deDaoSuoYouDanHao();


    @Select({"select id,timesamebatch,uuid,osno,ebno,caigouno\n" +
            "prdno,saphh,sapph,sapwlm,maitouno,luohao,ganghao,\n" +
            "realwidth,reallength,chengfendaima\n" +
            "from sapso\n" +
            "where \n" +
            "isnull(prdno,'')=#{prdno}\n" +
            "and\n" +
            " isnull(osno,'')=#{osno}\n" +
            "and\n" +
            "isnull(chengfendaima,'')=#{chengfendaima}\n" +
            "and \n" +
            "isnull(saphh,'')=#{saphh}\n" +
            "and\n" +
            "isnull(sapwlm,'')=#{sapwlm}\n" +
            "and\n" +
            "isnull(maitouno,'')=#{maitouno}\n" +
            "and\n" +
            "isnull(sapph,'')=#{sapph}\n" +
            "and\n" +
            "isnull(ebno,'')=#{ebno}\n" +
            "and\n" +
            "isnull(caigouno,'')=#{caigouno}"})
    List<Sapso> selectSapso(@Param("prdno") String prdno,@Param("osno") String osno,
                            @Param("chengfendaima")String chengfendaima,
                            @Param("saphh") String saphh,@Param("sapwlm") String sapwlm,
                            @Param("maitouno") String maitouno,
                            @Param("sapph") String sapph,@Param("ebno") String ebno,
                            @Param("caigouno")String caigouno);

























}