package mapstruct.demo2;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ryland
 */
@DecoratedWith(StuConverterBasicDecorator.class)
@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface StuConverterBasic {

    StuConverterBasic INSTANCE = Mappers.getMapper(StuConverterBasic.class);

    @Mappings({
            @Mapping(target = "name",source = "stu.name"),
            @Mapping(target = "phoneNum",source = "pn")
    })
    StuVo convert2Vo(Stu stu,String pn);

    ArrayList<StuVo> convert2Vos(List<Stu> stus, String pn);

}
