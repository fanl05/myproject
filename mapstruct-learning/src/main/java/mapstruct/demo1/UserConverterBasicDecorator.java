package mapstruct.demo1;

/**
 * @author Ryland
 */
public abstract class UserConverterBasicDecorator implements UserConverterBasic {

    private final UserConverterBasic delegate;

    public UserConverterBasicDecorator(UserConverterBasic delegate) {
        this.delegate = delegate;
    }

    @Override
    public UserVo6 convert2Vo6(User3 source) {
        System.out.println("decorator...");
        return delegate.convert2Vo6(source);
    }
}
