package mapstruct.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ryland
 */
public class Test {

    public static void main(String[] args) {
        Stu stu1 = new Stu("a", 10);
        Stu stu2 = new Stu("b", 11);
        List<Stu> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        List<StuVo> stuVos = StuConverterBasic.INSTANCE.convert2Vos(list,"12345");
        System.out.println(stuVos);
    }

}
