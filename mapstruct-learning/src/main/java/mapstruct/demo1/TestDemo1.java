package mapstruct.demo1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ryland
 */
public class TestDemo1 {

    public static void main(String[] args) {

        // -Djps.track.ap.dependencies=false

        User user = User.builder()
                .id(22)
                .name("ryland")
                .createTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
                .updateTime(LocalDateTime.now())
                .build();

        UserVo1 userVo1 = UserConverterBasic.INSTANCE.convert2Vo1(user);
        UserVo2 userVo2 = UserConverterBasic.INSTANCE.convert2Vo2(user);
        User user1 = UserConverterBasic.INSTANCE.convert2User(userVo1);
        List<UserVo2> userVo2List = UserConverterBasic.INSTANCE.convert2Vo2List(Collections.singletonList(user));

        System.out.println("UserVo1: " + userVo1);
        System.out.println("UserVo2: " + userVo2);
        System.out.println("User: " + user1);
        System.out.println("UserVo2List: " + userVo2List);

        UserVo3 userVo3 = UserConverterBasic.INSTANCE.convert2Vo3(user);
        System.out.println("UserVo3: " + userVo3);

        UserVo4 userVo4 = UserConverterBasic.INSTANCE.convert2Vo4(user);
        System.out.println("UserVo4: " + userVo4);

        User2 user2 = User2.builder()
                .id(22)
                .name("ryland")
                .userTypeEnum(UserTypeEnum.Java)
                .build();
        UserVo5 userVo5 = UserConverterBasic.INSTANCE.convert2Vo5(user2);
        System.out.println("UserVo5: " + userVo5);

        School school = School.builder()
                .name("NJUPT")
                .build();
        UserBo1 userBo1 = UserConverterBasic.INSTANCE.convert2Bo1(user, school);
        System.out.println("UserBo1: " + userBo1);

        User3 user3 = User3.builder()
                .id(22)
                .name("ryland")
                .phone("17768112160")
                .build();
        UserVo6 userVo6 = UserConverterBasic.INSTANCE.convert2Vo6(user3);
        System.out.println("UserVo6: "+userVo6);

        System.out.println("============================");

        User u1 = User.builder().id(1).name("ryland").createTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))).updateTime(LocalDateTime.now()).build();
        User u2 = User.builder().id(2).name("ryland").createTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))).updateTime(LocalDateTime.now()).build();
        User u3 = User.builder().id(3).name("ryland").createTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))).updateTime(LocalDateTime.now()).build();
        List<User> users = Arrays.asList(u1, u2, u3);
        List<UserVo1> list = users.stream().map(UserConverterBasic.INSTANCE::convert2Vo1).collect(Collectors.toList());
        System.out.println(list);

        System.out.println("============================");

        List<User3> ul = new ArrayList<>();
        ul.add(user3);
        ul.add(user3);
        ul.add(user3);
        List<UserVo6> userVo6s = UserConverterBasic.INSTANCE.convert2Vo6List(ul);
        System.out.println(userVo6s);

    }

}