package mapstruct.demo1;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author Ryland
 */
@DecoratedWith(UserConverterBasicDecorator.class)
//@MapperConfig(unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy = ReportingPolicy.ERROR)
@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface UserConverterBasic {

    UserConverterBasic INSTANCE = Mappers.getMapper(UserConverterBasic.class);

    UserVo1 convert2Vo1(User source);

    User convert2User(UserVo1 source);

    UserVo2 convert2Vo2(User source);

    List<UserVo2> convert2Vo2List(List<User> source);

    /**
     * 这里的 target = "id" 的 Mapping 可以省略，基本类型会自动转换
     */
    @Mappings({
            @Mapping(target = "id", expression = "java(String.valueOf(source.getId()))"),
            @Mapping(target = "createTime", expression = "java(com.vip.mapstruct.demo1.DateTransform.str2Date(source.getCreateTime()))"),
            @Mapping(target = "updateTime", expression = "java(com.vip.mapstruct.demo1.DateTransform.date2Str(source.getUpdateTime()))")
    })
    UserVo3 convert2Vo3(User source);

    @Mappings({
            @Mapping(target = "userId", source = "id"),
            @Mapping(target = "username", source = "name"),
            @Mapping(target = "updateTime", expression = "java(com.vip.mapstruct.demo1.DateTransform.date2Str(source.getUpdateTime()))")
    })
    UserVo4 convert2Vo4(User source);

    @Mappings({
            @Mapping(target = "type", source = "userTypeEnum")
    })
    UserVo5 convert2Vo5(User2 source);

    @Mappings({
            @Mapping(target = "id", source = "user.id"),
            @Mapping(target = "name", source = "user.name", ignore = true),
            @Mapping(target = "school", source = "school.name"),
            @Mapping(target = "location", source = "school.location", defaultValue = "China")
    })
    UserBo1 convert2Bo1(User user, School school);

    @Mappings({
            @Mapping(target = "phoneNum", source = "phone")
    })
    UserVo6 convert2Vo6(User3 source);

    List<UserVo6> convert2Vo6List(List<User3> source);

}
