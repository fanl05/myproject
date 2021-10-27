package mapstruct.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ryland
 */
public abstract class StuConverterBasicDecorator implements StuConverterBasic {

    private final StuConverterBasic delegate;

    public StuConverterBasicDecorator(StuConverterBasic delegate) {
        this.delegate = delegate;
    }

    @Override
    public StuVo convert2Vo(Stu stu, String pn) {
        return delegate.convert2Vo(stu, pn);
    }

    @Override
    public ArrayList<StuVo> convert2Vos(List<Stu> stus, String pn) {
        return (ArrayList<StuVo>)stus.stream().map(stu -> delegate.convert2Vo(stu, pn)).collect(Collectors.toList());
    }
}
